package de.fhdo.lemma.model_processing.phases

import de.fhdo.lemma.model_processing.annotations.ConsumesBasicCommandLineOption
import de.fhdo.lemma.model_processing.command_line.BasicCommandLine
import de.fhdo.lemma.model_processing.command_line.BasicOption

private const val ID_REGEX = """[A-Za-z]\w*"""

// Type alias for missing commandline options of a phase. The first list in the pair comprises missing options that
// shall result in the phase to fail (i.e., the failIfNotPresent attribute of the @RequiresBasicCommandLineOption
// annotation was set to true). The second list in the pair comprises missing options that do not cause the phase to
// fail.
internal typealias MissingCommandLineOptions = Pair<List<BasicOption>, List<BasicOption>>

/**
 * Abstract superclass for all model processing phases.
 *
 * @author [Florian Rademacher](mailto:florian.rademacher@fh-dortmund.de)
 */
abstract class AbstractModelProcessingPhase {
    private var isInitialized: Boolean = false

    internal val returnParameters = mutableMapOf<String, PhaseReturnParameter>()
    internal val expectedParameters = mutableMapOf<String, ExpectedPhaseReturnParameter>()

    lateinit var id: String
        private set
    lateinit var predecessors: List<String>
        internal set
    lateinit var successors: List<String>
        internal set
    var isBlocking: Boolean = false
        private set
    var isOmittable: Boolean = true
        private set
    override fun equals(other: Any?) = id == ((other as? AbstractModelProcessingPhase)?.id ?: false)
    override fun hashCode(): Int = id.hashCode()
    override fun toString() = buildString {
        append("$id (isBlocking = $isBlocking, isOmittable = $isOmittable)")
        append(
            if (expectedParameters.isNotEmpty())
                "\n\tExpected parameters:\n" + expectedParameters.values.joinToString("\n") { "\t\t-$it" }
            else
                ""
        )
        append(
            if (returnParameters.isNotEmpty())
                "\n\tReturn parameters:\n" + returnParameters.values.joinToString("\n") { "\t\t-$it" }
            else
                ""
        )
    }

    lateinit var processorImplementationPackage: String
        private set

    /**
     * Encapsulates the phase's processing logic
     */
    abstract fun process(args: Array<String>)

    /**
     * Declare parameter constraints. In Kotlin, this can be used as a DSL construct in the form
     *     `parameters { ... }`
     */
    protected fun parameters(initializer: PhaseParametersScopeBuilder.() -> Unit) : PhaseParametersScopeBuilder
        = PhaseParametersScopeBuilder(this).apply(initializer)

    /**
     * Phase initialization (invoked by [de.fhdo.lemma.model_processing.phases.loadAndInitializeProcessingPhase])
     */
    open fun initialize(id: String, isOmittable: Boolean, isBlocking: Boolean, processorImplementationPackage: String) {
        if (isInitialized)
            throw IllegalArgumentException("Phase has already been initialized")

        this.id = id.apply { checkId(this) }
        this.isOmittable = isOmittable
        this.isBlocking = isBlocking
        this.processorImplementationPackage = processorImplementationPackage

        isInitialized = true
    }

    /**
     * Helper to get all missing commandline options that the phase requires
     */
    internal fun getMissingCommandLineOptions() : MissingCommandLineOptions {
        val missingOptionsCausingError = mutableListOf<BasicOption>()
        val missingOptionsNoError = mutableListOf<BasicOption>()

        this::class.annotations
            .filterIsInstance<ConsumesBasicCommandLineOption>()
            .filter { !BasicCommandLine.hasParsedOption(it.requiredOption) }
            .forEach {
                if (it.errorIfNotPresent)
                    missingOptionsCausingError.add(it.requiredOption)
                else
                    missingOptionsNoError.add(it.requiredOption)
            }

        return missingOptionsCausingError to missingOptionsNoError
    }

    /**
     * Helper to check that the return parameters, promised to be delivered by this phase, exist on the heap (in case
     * they are non-optional) and have the correct type (in case they are not null). Otherwise, the helper will throw a
     * [PhaseException].
     */
    internal fun checkReturnParametersOrException() {
        returnParameters.values.forEach {
            when {
                !it.optional && !PhaseHeap.contains(it.name) ->
                    throw PhaseException("Internal error. Phase promised to return a parameter called " +
                        "\"${it.name}\", but it did not.", exitModelProcessor = true)

                PhaseHeap.contains(it.name) && PhaseHeap.isNotNull(it.name) &&
                !PhaseHeap.isEntryOfType(id, it.name, it.type) ->
                    throw PhaseException("Internal error. Phase return parameter \"${it.name}\" is not of promised " +
                        "type \"${it.type.simpleName}\".", exitModelProcessor = true)
            }

        }
    }

    /**
     * Helper to check that the return parameters from other phases, which are expected by this phase, exist on the heap
     * and have the correct type (in case they are not null). Note, that it is possible for a phase to expect parameters
     * that are only optionally returned by a previous phase. This helper ensures that all expected parameters exist
     * prior to invoking the expecting phase or at least when it executed successfully (depending on the parameter's
     * specification). Otherwise, it will throw a [PhaseException].
     */
    internal fun checkExpectedParametersOrException() {
        expectedParameters.map { (key, value) -> Pair(key, value) }.forEach {
            val expectedFromPhase = it.first
            val phaseExecutedSuccessfully = PhaseExecutionLog.phaseExecutedSuccessfully(expectedFromPhase)

            val expectedParameter = it.second
            val parameterIsExpectedOnSuccess = expectedParameter.onlyExpectedOnSuccessfulExecution
            val heapContainsExpectedParameter = PhaseHeap.contains(expectedFromPhase, expectedParameter.name)

            when {
                !heapContainsExpectedParameter &&
                (parameterIsExpectedOnSuccess && phaseExecutedSuccessfully || !parameterIsExpectedOnSuccess) ->
                    throw PhaseException("Internal error. Phase expects other phase \"$expectedFromPhase\" to " +
                        "return a parameter called " + "\"${expectedParameter.name}\", but it did not",
                        exitModelProcessor = true)

                heapContainsExpectedParameter && PhaseHeap.isNotNull(expectedFromPhase, expectedParameter.name) &&
                    !PhaseHeap.isEntryOfType(expectedFromPhase, expectedParameter.name, expectedParameter.type) ->
                    throw PhaseException("Internal error. The return parameter \"${expectedParameter.name}\" " +
                        "expected from phase \"$expectedFromPhase\" is not of expected type " +
                        "\"${expectedParameter.type.simpleName}\".", exitModelProcessor = true)
            }
        }
    }

    /**
     * Validate the phase's ID
     */
    private fun checkId(value: String) {
        if (!(value matches ID_REGEX.toRegex()))
            throw IllegalArgumentException("Invalid phase ID. Phase IDs must start with a letter and may only " +
                    "consist of letters, numbers, and the underscore.")
    }

    /*
     * The following functions represent convenience, shortcut functions to the heap. They all have their counterparts
     * in the [PhaseHeap] implementation. However, the convenience functions are all executed in the context of this
     * phase's concrete instance.
     */
    protected operator fun PhaseHeap.set(entryKey: String, entryValue: Any?) {
        this[id] = entryKey to entryValue
    }
    protected infix fun String.returns(entryValue: Any?) {
        PhaseHeap[this] = entryValue
    }
    protected infix fun String.fromPhase(phaseId: String) : Any? = PhaseHeap[phaseId, this]
    protected fun PhaseHeap.contains(entryKey: String) = this.contains(id, entryKey)
    protected operator fun <T: Any> PhaseHeap.get(entryKey: String, clazz: Class<T>) = this[id, entryKey, clazz]
    protected fun PhaseHeap.isNull(entryKey: String) = this.isNull(id, entryKey)
    @Suppress("MemberVisibilityCanBePrivate")
    protected fun PhaseHeap.isNotNull(entryKey: String) = this.isNotNull(id, entryKey)
    protected fun <T: Any> PhaseHeap.isEntryOfType(entryKey: String, clazz: Class<T>)
        = this.isEntryOfType(id, entryKey, clazz)
    @Suppress("MemberVisibilityCanBePrivate")
    protected fun PhaseHeap.remove(entryKey: String) {
        this.remove(entryKey)
    }
}

/**
 * A return parameter that can be returned by a phase.
 *
 * @author [Florian Rademacher](mailto:florian.rademacher@fh-dortmund.de)
 */
open class PhaseReturnParameter(val name: String, val type: Class<out Any>, var optional: Boolean = false) {
    override fun toString() = "$name : ${type.simpleName}${if (optional) "?" else ""}"
}

/**
 * A return parameter that is expected by a phase.
 *
 * @author [Florian Rademacher](mailto:florian.rademacher@fh-dortmund.de)
 */
class ExpectedPhaseReturnParameter(name: String, type: Class<out Any>, optional: Boolean = false,
    var onlyExpectedOnSuccessfulExecution: Boolean = true) : PhaseReturnParameter(name, type, optional) {
    override fun toString() = super.toString() +
        if (onlyExpectedOnSuccessfulExecution) " (only expected on successful phase execution)" else ""
}

/**
 * Builder to specify the returned and expected parameters of a phase. In Kotlin, this can be used as a DSL construct in
 * the form
 *     ```
 *     parameters {
 *         returns {...}
 *         expects {...}
 *     }
 *     ```
 *
 * @author [Florian Rademacher](mailto:florian.rademacher@fh-dortmund.de)
 */
class PhaseParametersScopeBuilder(private val phaseInstance: AbstractModelProcessingPhase) {
    fun returns(initializer: PhaseReturnParametersScopeBuilder.() -> Unit) : PhaseReturnParametersScopeBuilder
        = PhaseReturnParametersScopeBuilder(phaseInstance).apply(initializer)

    @Suppress("unused")
    fun expects(initializer: ExpectsPhaseReturnParametersScopeBuilder.() -> Unit)
        : ExpectsPhaseReturnParametersScopeBuilder
        = ExpectsPhaseReturnParametersScopeBuilder(phaseInstance).apply(initializer)
}

/**
 * Builder to specify the returned parameters of a phase. In Kotlin, this can be used as a DSL construct in the form
 *     ```
 *     returns {
 *         "foo" withType String::class.java
 *
 *         optional {
 *             "bar" withType Collection::class.java
 *         }
 *     }
 *     ```
 *
 * @author [Florian Rademacher](mailto:florian.rademacher@fh-dortmund.de)
 */
class PhaseReturnParametersScopeBuilder(private val phaseInstance: AbstractModelProcessingPhase) {
    fun optional(initializer: OptionalPhaseReturnParametersScopeBuilder.() -> Unit)
        : OptionalPhaseReturnParametersScopeBuilder
        = OptionalPhaseReturnParametersScopeBuilder(phaseInstance).apply(initializer)

    infix fun String.withType(type: Class<out Any>) {
        phaseInstance.returnParameters[this] = PhaseReturnParameter(this, type, false)
    }
}

/**
 * Builder to specify the optionally returned parameters of a phase.
 *
 * @author [Florian Rademacher](mailto:florian.rademacher@fh-dortmund.de)
 */
class OptionalPhaseReturnParametersScopeBuilder(private val phaseInstance: AbstractModelProcessingPhase) {
    infix fun String.withType(type: Class<out Any>) {
        phaseInstance.returnParameters[this] = PhaseReturnParameter(this, type, true)
    }
}

/**
 * Builder to specify the expected parameters of a phase. In Kotlin, this can be used as a DSL construct in the form
 *     ```
 *     expects {
 *         from("foo_phase") {
 *             ...
 *         }
 *     }
 *     ```
 *
 * @author [Florian Rademacher](mailto:florian.rademacher@fh-dortmund.de)
 */
class ExpectsPhaseReturnParametersScopeBuilder(private val phaseInstance: AbstractModelProcessingPhase) {
    fun from(expectingFromPhaseId: String, initializer: ExpectsPhaseReturnParametersBuilder.() -> Unit)
        : ExpectsPhaseReturnParametersBuilder {
        if (expectingFromPhaseId == phaseInstance.id)
            throw IllegalArgumentException("Phase \"${phaseInstance.id}\" cannot expect a return parameter from itself")

        return ExpectsPhaseReturnParametersBuilder(expectingFromPhaseId, phaseInstance).apply(initializer)
    }
}

/**
 * Builder to specify an expected parameters of a phase. In Kotlin, this can be used as a DSL construct in the form
 *     ```
 *     expects {
 *         from("foo_phase") {
 *             "bar" withType Collection::class.java
 *         }
 *     }
 *     ```
 *
 * and
 *
 *     ```
 *     expects {
 *         from("foo_phase") {
 *             always("baz" withType String::class.java)
 *         }
 *     }
 *     ```
 *
 * The latter form leads to the parameter being always expected (and checked for existence after the phase's execution),
 * independent of the success state of its returning phase.
 *
 * @author [Florian Rademacher](mailto:florian.rademacher@fh-dortmund.de)
 */
class ExpectsPhaseReturnParametersBuilder(private val expectedFromPhase: String,
    private val callingPhaseInstance: AbstractModelProcessingPhase) {
    @Suppress("unused")
    infix fun String.withType(type: Class<out Any>) : ExpectedPhaseReturnParameter {
        val expectedParameter = ExpectedPhaseReturnParameter(this, type, false)
        callingPhaseInstance.expectedParameters[expectedFromPhase] = expectedParameter
        return expectedParameter
    }

    @Suppress("unused")
    fun always(parameter: ExpectedPhaseReturnParameter) {
        parameter.onlyExpectedOnSuccessfulExecution = false
    }
}
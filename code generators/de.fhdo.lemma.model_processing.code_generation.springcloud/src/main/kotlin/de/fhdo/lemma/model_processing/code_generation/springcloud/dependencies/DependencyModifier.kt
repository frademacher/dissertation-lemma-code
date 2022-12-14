package de.fhdo.lemma.model_processing.code_generation.springcloud.dependencies

import de.fhdo.lemma.model_processing.code_generation.java_base.genlets.DependencyModifier
import de.fhdo.lemma.model_processing.code_generation.java_base.serialization.dependencies.MavenDependencyModifierI
import de.fhdo.lemma.model_processing.code_generation.java_base.serialization.dependencies.addChild
import de.fhdo.lemma.model_processing.code_generation.java_base.serialization.dependencies.addChildIfNotExists
import de.fhdo.lemma.model_processing.code_generation.java_base.serialization.dependencies.elements
import org.redundent.kotlin.xml.Node
import de.fhdo.lemma.model_processing.code_generation.springcloud.Context.NonResettableState as NonResettableState

/**
 * Dependency modifier for Spring Boot.
 *
 * @author [Florian Rademacher](mailto:florian.rademacher@fh-dortmund.de)
 */
@DependencyModifier
internal class DependencyModifier : MavenDependencyModifierI {
    override fun modify(inputDependencyModel: Node) : Node {
        inputDependencyModel.addChildIfNotExists(
            elements {
                "parent" {
                    "groupId" { -"org.springframework.boot" }
                    "artifactId" { -"spring-boot-starter-parent" }
                    "version" { -"2.1.0.RELEASE" }
                }
            }
        )

        // We only add the Spring Boot Maven plugin to the dependency tree when the generation processed a microservice.
        // That is because the plugin requires the @SpringBootApplication annotation to discover the executable main
        // class of the microservice.
        if (NonResettableState.generationInvolvedMicroservices)
            inputDependencyModel.addChild(
                elements {
                    "plugin" {
                        "groupId" { -"org.springframework.boot" }
                        "artifactId" { -"spring-boot-maven-plugin" }
                    }
                },
                elements { "build" { "plugins" { } } }
            )

        return inputDependencyModel
    }
}
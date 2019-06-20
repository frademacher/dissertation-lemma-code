/**
 */
package de.fhdo.ddmm.technology.mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.fhdo.ddmm.technology.mapping.MappingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='de.fhdo.ddmm.technology'"
 * @generated
 */
public interface MappingPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "mapping";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "de.fhdo.ddmm.technology.mapping";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "mapping";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MappingPackage eINSTANCE = de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl.init();

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.TechnologyMappingImpl <em>Technology Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.TechnologyMappingImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getTechnologyMapping()
     * @generated
     */
    int TECHNOLOGY_MAPPING = 0;

    /**
     * The feature id for the '<em><b>Imports</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_MAPPING__IMPORTS = 0;

    /**
     * The feature id for the '<em><b>Type Mappings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_MAPPING__TYPE_MAPPINGS = 1;

    /**
     * The feature id for the '<em><b>Service Mappings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_MAPPING__SERVICE_MAPPINGS = 2;

    /**
     * The number of structural features of the '<em>Technology Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_MAPPING_FEATURE_COUNT = 3;

    /**
     * The operation id for the '<em>Get Mapped Interfaces</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_MAPPING___GET_MAPPED_INTERFACES = 0;

    /**
     * The operation id for the '<em>Get Mapped Operations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_MAPPING___GET_MAPPED_OPERATIONS = 1;

    /**
     * The operation id for the '<em>Get Complex Parameter Mappings</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_MAPPING___GET_COMPLEX_PARAMETER_MAPPINGS = 2;

    /**
     * The operation id for the '<em>Get Mapped Referred Operations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_MAPPING___GET_MAPPED_REFERRED_OPERATIONS = 3;

    /**
     * The number of operations of the '<em>Technology Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_MAPPING_OPERATION_COUNT = 4;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.ComplexTypeMappingImpl <em>Complex Type Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.ComplexTypeMappingImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getComplexTypeMapping()
     * @generated
     */
    int COMPLEX_TYPE_MAPPING = 1;

    /**
     * The feature id for the '<em><b>Tsource Model Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE_MAPPING__TSOURCE_MODEL_URI = 0;

    /**
     * The feature id for the '<em><b>Technologies</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE_MAPPING__TECHNOLOGIES = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE_MAPPING__TYPE = 2;

    /**
     * The feature id for the '<em><b>Field Mappings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE_MAPPING__FIELD_MAPPINGS = 3;

    /**
     * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE_MAPPING__ASPECTS = 4;

    /**
     * The feature id for the '<em><b>Mapping Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE_MAPPING__MAPPING_MODEL = 5;

    /**
     * The number of structural features of the '<em>Complex Type Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE_MAPPING_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Complex Type Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_TYPE_MAPPING_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.ImportedComplexTypeImpl <em>Imported Complex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.ImportedComplexTypeImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getImportedComplexType()
     * @generated
     */
    int IMPORTED_COMPLEX_TYPE = 2;

    /**
     * The feature id for the '<em><b>Service Model Import</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTED_COMPLEX_TYPE__SERVICE_MODEL_IMPORT = 0;

    /**
     * The feature id for the '<em><b>Data Model Import</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTED_COMPLEX_TYPE__DATA_MODEL_IMPORT = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTED_COMPLEX_TYPE__TYPE = 2;

    /**
     * The feature id for the '<em><b>Type Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTED_COMPLEX_TYPE__TYPE_MAPPING = 3;

    /**
     * The number of structural features of the '<em>Imported Complex Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTED_COMPLEX_TYPE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Imported Complex Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTED_COMPLEX_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.MicroserviceMappingImpl <em>Microservice Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.MicroserviceMappingImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getMicroserviceMapping()
     * @generated
     */
    int MICROSERVICE_MAPPING = 3;

    /**
     * The feature id for the '<em><b>Technologies</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING__TECHNOLOGIES = 0;

    /**
     * The feature id for the '<em><b>Microservice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING__MICROSERVICE = 1;

    /**
     * The feature id for the '<em><b>Endpoints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING__ENDPOINTS = 2;

    /**
     * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING__PROTOCOLS = 3;

    /**
     * The feature id for the '<em><b>Interface Mappings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING__INTERFACE_MAPPINGS = 4;

    /**
     * The feature id for the '<em><b>Operation Mappings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING__OPERATION_MAPPINGS = 5;

    /**
     * The feature id for the '<em><b>Referred Operation Mappings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING__REFERRED_OPERATION_MAPPINGS = 6;

    /**
     * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING__ASPECTS = 7;

    /**
     * The feature id for the '<em><b>Mapping Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING__MAPPING_MODEL = 8;

    /**
     * The number of structural features of the '<em>Microservice Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING_FEATURE_COUNT = 9;

    /**
     * The operation id for the '<em>Get Type Definition Technology Imports</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING___GET_TYPE_DEFINITION_TECHNOLOGY_IMPORTS = 0;

    /**
     * The operation id for the '<em>Get Type Definition Technology Import</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING___GET_TYPE_DEFINITION_TECHNOLOGY_IMPORT = 1;

    /**
     * The operation id for the '<em>Get Type Definition Technologies</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING___GET_TYPE_DEFINITION_TECHNOLOGIES = 2;

    /**
     * The operation id for the '<em>Get Type Definition Technology</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING___GET_TYPE_DEFINITION_TECHNOLOGY = 3;

    /**
     * The number of operations of the '<em>Microservice Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MICROSERVICE_MAPPING_OPERATION_COUNT = 4;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.ImportedMicroserviceImpl <em>Imported Microservice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.ImportedMicroserviceImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getImportedMicroservice()
     * @generated
     */
    int IMPORTED_MICROSERVICE = 4;

    /**
     * The feature id for the '<em><b>Import</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTED_MICROSERVICE__IMPORT = 0;

    /**
     * The feature id for the '<em><b>Microservice</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTED_MICROSERVICE__MICROSERVICE = 1;

    /**
     * The feature id for the '<em><b>Microservice Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTED_MICROSERVICE__MICROSERVICE_MAPPING = 2;

    /**
     * The number of structural features of the '<em>Imported Microservice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTED_MICROSERVICE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Imported Microservice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPORTED_MICROSERVICE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.InterfaceMappingImpl <em>Interface Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.InterfaceMappingImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getInterfaceMapping()
     * @generated
     */
    int INTERFACE_MAPPING = 5;

    /**
     * The feature id for the '<em><b>Interface</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_MAPPING__INTERFACE = 0;

    /**
     * The feature id for the '<em><b>Endpoints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_MAPPING__ENDPOINTS = 1;

    /**
     * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_MAPPING__PROTOCOLS = 2;

    /**
     * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_MAPPING__ASPECTS = 3;

    /**
     * The feature id for the '<em><b>Microservice Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_MAPPING__MICROSERVICE_MAPPING = 4;

    /**
     * The number of structural features of the '<em>Interface Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_MAPPING_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Interface Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_MAPPING_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.OperationMappingImpl <em>Operation Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.OperationMappingImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getOperationMapping()
     * @generated
     */
    int OPERATION_MAPPING = 6;

    /**
     * The feature id for the '<em><b>Operation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_MAPPING__OPERATION = 0;

    /**
     * The feature id for the '<em><b>Endpoints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_MAPPING__ENDPOINTS = 1;

    /**
     * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_MAPPING__PROTOCOLS = 2;

    /**
     * The feature id for the '<em><b>Parameter Mappings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_MAPPING__PARAMETER_MAPPINGS = 3;

    /**
     * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_MAPPING__ASPECTS = 4;

    /**
     * The feature id for the '<em><b>Microservice Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_MAPPING__MICROSERVICE_MAPPING = 5;

    /**
     * The number of structural features of the '<em>Operation Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_MAPPING_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Operation Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_MAPPING_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.ReferredOperationMappingImpl <em>Referred Operation Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.ReferredOperationMappingImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getReferredOperationMapping()
     * @generated
     */
    int REFERRED_OPERATION_MAPPING = 7;

    /**
     * The feature id for the '<em><b>Operation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERRED_OPERATION_MAPPING__OPERATION = 0;

    /**
     * The feature id for the '<em><b>Endpoints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERRED_OPERATION_MAPPING__ENDPOINTS = 1;

    /**
     * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERRED_OPERATION_MAPPING__PROTOCOLS = 2;

    /**
     * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERRED_OPERATION_MAPPING__ASPECTS = 3;

    /**
     * The feature id for the '<em><b>Microservice Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERRED_OPERATION_MAPPING__MICROSERVICE_MAPPING = 4;

    /**
     * The number of structural features of the '<em>Referred Operation Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERRED_OPERATION_MAPPING_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Referred Operation Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERRED_OPERATION_MAPPING_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.ParameterMappingImpl <em>Parameter Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.ParameterMappingImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getParameterMapping()
     * @generated
     */
    int PARAMETER_MAPPING = 8;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_MAPPING__PARAMETER = 0;

    /**
     * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_MAPPING__ASPECTS = 1;

    /**
     * The feature id for the '<em><b>Operation Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_MAPPING__OPERATION_MAPPING = 2;

    /**
     * The number of structural features of the '<em>Parameter Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_MAPPING_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Parameter Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_MAPPING_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.PrimitiveParameterMappingImpl <em>Primitive Parameter Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.PrimitiveParameterMappingImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getPrimitiveParameterMapping()
     * @generated
     */
    int PRIMITIVE_PARAMETER_MAPPING = 9;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_PARAMETER_MAPPING__PARAMETER = PARAMETER_MAPPING__PARAMETER;

    /**
     * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_PARAMETER_MAPPING__ASPECTS = PARAMETER_MAPPING__ASPECTS;

    /**
     * The feature id for the '<em><b>Operation Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_PARAMETER_MAPPING__OPERATION_MAPPING = PARAMETER_MAPPING__OPERATION_MAPPING;

    /**
     * The feature id for the '<em><b>Technology</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_PARAMETER_MAPPING__TECHNOLOGY = PARAMETER_MAPPING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Primitive Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_PARAMETER_MAPPING__PRIMITIVE_TYPE = PARAMETER_MAPPING_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Primitive Parameter Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_PARAMETER_MAPPING_FEATURE_COUNT = PARAMETER_MAPPING_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Primitive Parameter Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_PARAMETER_MAPPING_OPERATION_COUNT = PARAMETER_MAPPING_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.ComplexParameterMappingImpl <em>Complex Parameter Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.ComplexParameterMappingImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getComplexParameterMapping()
     * @generated
     */
    int COMPLEX_PARAMETER_MAPPING = 10;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_PARAMETER_MAPPING__PARAMETER = PARAMETER_MAPPING__PARAMETER;

    /**
     * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_PARAMETER_MAPPING__ASPECTS = PARAMETER_MAPPING__ASPECTS;

    /**
     * The feature id for the '<em><b>Operation Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_PARAMETER_MAPPING__OPERATION_MAPPING = PARAMETER_MAPPING__OPERATION_MAPPING;

    /**
     * The feature id for the '<em><b>Technology</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_PARAMETER_MAPPING__TECHNOLOGY = PARAMETER_MAPPING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Technology Specific Complex Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_PARAMETER_MAPPING__TECHNOLOGY_SPECIFIC_COMPLEX_TYPE = PARAMETER_MAPPING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Field Mappings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_PARAMETER_MAPPING__FIELD_MAPPINGS = PARAMETER_MAPPING_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Complex Parameter Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_PARAMETER_MAPPING_FEATURE_COUNT = PARAMETER_MAPPING_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Complex Parameter Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_PARAMETER_MAPPING_OPERATION_COUNT = PARAMETER_MAPPING_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificFieldMappingImpl <em>Technology Specific Field Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificFieldMappingImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getTechnologySpecificFieldMapping()
     * @generated
     */
    int TECHNOLOGY_SPECIFIC_FIELD_MAPPING = 11;

    /**
     * The feature id for the '<em><b>Tsource Model Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_FIELD_MAPPING__TSOURCE_MODEL_URI = 0;

    /**
     * The feature id for the '<em><b>Technology</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_FIELD_MAPPING__TECHNOLOGY = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_FIELD_MAPPING__TYPE = 2;

    /**
     * The feature id for the '<em><b>Enumeration Field</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_FIELD_MAPPING__ENUMERATION_FIELD = 3;

    /**
     * The feature id for the '<em><b>Data Field</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_FIELD_MAPPING__DATA_FIELD = 4;

    /**
     * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_FIELD_MAPPING__ASPECTS = 5;

    /**
     * The feature id for the '<em><b>Type Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_FIELD_MAPPING__TYPE_MAPPING = 6;

    /**
     * The feature id for the '<em><b>Parameter Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_FIELD_MAPPING__PARAMETER_MAPPING = 7;

    /**
     * The number of structural features of the '<em>Technology Specific Field Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_FIELD_MAPPING_FEATURE_COUNT = 8;

    /**
     * The operation id for the '<em>Get Original Type Of Mapped Element</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_FIELD_MAPPING___GET_ORIGINAL_TYPE_OF_MAPPED_ELEMENT = 0;

    /**
     * The number of operations of the '<em>Technology Specific Field Mapping</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_FIELD_MAPPING_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificProtocolSpecificationImpl <em>Technology Specific Protocol Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificProtocolSpecificationImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getTechnologySpecificProtocolSpecification()
     * @generated
     */
    int TECHNOLOGY_SPECIFIC_PROTOCOL_SPECIFICATION = 12;

    /**
     * The feature id for the '<em><b>Communication Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_PROTOCOL_SPECIFICATION__COMMUNICATION_TYPE = 0;

    /**
     * The feature id for the '<em><b>Technology Specific Protocol</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_PROTOCOL_SPECIFICATION__TECHNOLOGY_SPECIFIC_PROTOCOL = 1;

    /**
     * The number of structural features of the '<em>Technology Specific Protocol Specification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_PROTOCOL_SPECIFICATION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Technology Specific Protocol Specification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_PROTOCOL_SPECIFICATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificProtocolImpl <em>Technology Specific Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificProtocolImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getTechnologySpecificProtocol()
     * @generated
     */
    int TECHNOLOGY_SPECIFIC_PROTOCOL = 13;

    /**
     * The feature id for the '<em><b>Technology</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_PROTOCOL__TECHNOLOGY = 0;

    /**
     * The feature id for the '<em><b>Protocol</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_PROTOCOL__PROTOCOL = 1;

    /**
     * The feature id for the '<em><b>Data Format</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_PROTOCOL__DATA_FORMAT = 2;

    /**
     * The feature id for the '<em><b>Protocol Specification</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_PROTOCOL__PROTOCOL_SPECIFICATION = 3;

    /**
     * The feature id for the '<em><b>Endpoint</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_PROTOCOL__ENDPOINT = 4;

    /**
     * The number of structural features of the '<em>Technology Specific Protocol</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_PROTOCOL_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Technology Specific Protocol</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_PROTOCOL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificEndpointImpl <em>Technology Specific Endpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificEndpointImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getTechnologySpecificEndpoint()
     * @generated
     */
    int TECHNOLOGY_SPECIFIC_ENDPOINT = 14;

    /**
     * The feature id for the '<em><b>Addresses</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_ENDPOINT__ADDRESSES = 0;

    /**
     * The feature id for the '<em><b>Technology Specific Protocols</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_ENDPOINT__TECHNOLOGY_SPECIFIC_PROTOCOLS = 1;

    /**
     * The feature id for the '<em><b>Microservice Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_ENDPOINT__MICROSERVICE_MAPPING = 2;

    /**
     * The feature id for the '<em><b>Interface Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_ENDPOINT__INTERFACE_MAPPING = 3;

    /**
     * The feature id for the '<em><b>Operation Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_ENDPOINT__OPERATION_MAPPING = 4;

    /**
     * The feature id for the '<em><b>Referred Operation Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_ENDPOINT__REFERRED_OPERATION_MAPPING = 5;

    /**
     * The number of structural features of the '<em>Technology Specific Endpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_ENDPOINT_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Technology Specific Endpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_ENDPOINT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificImportedServiceAspectImpl <em>Technology Specific Imported Service Aspect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificImportedServiceAspectImpl
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getTechnologySpecificImportedServiceAspect()
     * @generated
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT = 15;

    /**
     * The feature id for the '<em><b>Technology</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__TECHNOLOGY = 0;

    /**
     * The feature id for the '<em><b>Aspect</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__ASPECT = 1;

    /**
     * The feature id for the '<em><b>Single Property Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__SINGLE_PROPERTY_VALUE = 2;

    /**
     * The feature id for the '<em><b>Values</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__VALUES = 3;

    /**
     * The feature id for the '<em><b>Type Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__TYPE_MAPPING = 4;

    /**
     * The feature id for the '<em><b>Microservice Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__MICROSERVICE_MAPPING = 5;

    /**
     * The feature id for the '<em><b>Interface Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__INTERFACE_MAPPING = 6;

    /**
     * The feature id for the '<em><b>Operation Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__OPERATION_MAPPING = 7;

    /**
     * The feature id for the '<em><b>Referred Operation Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__REFERRED_OPERATION_MAPPING = 8;

    /**
     * The feature id for the '<em><b>Parameter Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__PARAMETER_MAPPING = 9;

    /**
     * The feature id for the '<em><b>Field Mapping</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__FIELD_MAPPING = 10;

    /**
     * The number of structural features of the '<em>Technology Specific Imported Service Aspect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT_FEATURE_COUNT = 11;

    /**
     * The number of operations of the '<em>Technology Specific Imported Service Aspect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '<em>Data Field List</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getDataFieldList()
     * @generated
     */
    int DATA_FIELD_LIST = 16;


    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.TechnologyMapping <em>Technology Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Technology Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologyMapping
     * @generated
     */
    EClass getTechnologyMapping();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.TechnologyMapping#getImports <em>Imports</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Imports</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologyMapping#getImports()
     * @see #getTechnologyMapping()
     * @generated
     */
    EReference getTechnologyMapping_Imports();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.TechnologyMapping#getTypeMappings <em>Type Mappings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Type Mappings</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologyMapping#getTypeMappings()
     * @see #getTechnologyMapping()
     * @generated
     */
    EReference getTechnologyMapping_TypeMappings();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.TechnologyMapping#getServiceMappings <em>Service Mappings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Service Mappings</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologyMapping#getServiceMappings()
     * @see #getTechnologyMapping()
     * @generated
     */
    EReference getTechnologyMapping_ServiceMappings();

    /**
     * Returns the meta object for the '{@link de.fhdo.ddmm.technology.mapping.TechnologyMapping#getMappedInterfaces() <em>Get Mapped Interfaces</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Mapped Interfaces</em>' operation.
     * @see de.fhdo.ddmm.technology.mapping.TechnologyMapping#getMappedInterfaces()
     * @generated
     */
    EOperation getTechnologyMapping__GetMappedInterfaces();

    /**
     * Returns the meta object for the '{@link de.fhdo.ddmm.technology.mapping.TechnologyMapping#getMappedOperations() <em>Get Mapped Operations</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Mapped Operations</em>' operation.
     * @see de.fhdo.ddmm.technology.mapping.TechnologyMapping#getMappedOperations()
     * @generated
     */
    EOperation getTechnologyMapping__GetMappedOperations();

    /**
     * Returns the meta object for the '{@link de.fhdo.ddmm.technology.mapping.TechnologyMapping#getComplexParameterMappings() <em>Get Complex Parameter Mappings</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Complex Parameter Mappings</em>' operation.
     * @see de.fhdo.ddmm.technology.mapping.TechnologyMapping#getComplexParameterMappings()
     * @generated
     */
    EOperation getTechnologyMapping__GetComplexParameterMappings();

    /**
     * Returns the meta object for the '{@link de.fhdo.ddmm.technology.mapping.TechnologyMapping#getMappedReferredOperations() <em>Get Mapped Referred Operations</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Mapped Referred Operations</em>' operation.
     * @see de.fhdo.ddmm.technology.mapping.TechnologyMapping#getMappedReferredOperations()
     * @generated
     */
    EOperation getTechnologyMapping__GetMappedReferredOperations();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.ComplexTypeMapping <em>Complex Type Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Type Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ComplexTypeMapping
     * @generated
     */
    EClass getComplexTypeMapping();

    /**
     * Returns the meta object for the attribute '{@link de.fhdo.ddmm.technology.mapping.ComplexTypeMapping#getT_sourceModelUri <em>Tsource Model Uri</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tsource Model Uri</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ComplexTypeMapping#getT_sourceModelUri()
     * @see #getComplexTypeMapping()
     * @generated
     */
    EAttribute getComplexTypeMapping_T_sourceModelUri();

    /**
     * Returns the meta object for the reference list '{@link de.fhdo.ddmm.technology.mapping.ComplexTypeMapping#getTechnologies <em>Technologies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Technologies</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ComplexTypeMapping#getTechnologies()
     * @see #getComplexTypeMapping()
     * @generated
     */
    EReference getComplexTypeMapping_Technologies();

    /**
     * Returns the meta object for the containment reference '{@link de.fhdo.ddmm.technology.mapping.ComplexTypeMapping#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ComplexTypeMapping#getType()
     * @see #getComplexTypeMapping()
     * @generated
     */
    EReference getComplexTypeMapping_Type();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.ComplexTypeMapping#getFieldMappings <em>Field Mappings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Field Mappings</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ComplexTypeMapping#getFieldMappings()
     * @see #getComplexTypeMapping()
     * @generated
     */
    EReference getComplexTypeMapping_FieldMappings();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.ComplexTypeMapping#getAspects <em>Aspects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Aspects</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ComplexTypeMapping#getAspects()
     * @see #getComplexTypeMapping()
     * @generated
     */
    EReference getComplexTypeMapping_Aspects();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.ComplexTypeMapping#getMappingModel <em>Mapping Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Mapping Model</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ComplexTypeMapping#getMappingModel()
     * @see #getComplexTypeMapping()
     * @generated
     */
    EReference getComplexTypeMapping_MappingModel();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.ImportedComplexType <em>Imported Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Imported Complex Type</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ImportedComplexType
     * @generated
     */
    EClass getImportedComplexType();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.ImportedComplexType#getServiceModelImport <em>Service Model Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Service Model Import</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ImportedComplexType#getServiceModelImport()
     * @see #getImportedComplexType()
     * @generated
     */
    EReference getImportedComplexType_ServiceModelImport();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.ImportedComplexType#getDataModelImport <em>Data Model Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Model Import</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ImportedComplexType#getDataModelImport()
     * @see #getImportedComplexType()
     * @generated
     */
    EReference getImportedComplexType_DataModelImport();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.ImportedComplexType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ImportedComplexType#getType()
     * @see #getImportedComplexType()
     * @generated
     */
    EReference getImportedComplexType_Type();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.ImportedComplexType#getTypeMapping <em>Type Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Type Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ImportedComplexType#getTypeMapping()
     * @see #getImportedComplexType()
     * @generated
     */
    EReference getImportedComplexType_TypeMapping();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping <em>Microservice Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Microservice Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping
     * @generated
     */
    EClass getMicroserviceMapping();

    /**
     * Returns the meta object for the reference list '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getTechnologies <em>Technologies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Technologies</em>'.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getTechnologies()
     * @see #getMicroserviceMapping()
     * @generated
     */
    EReference getMicroserviceMapping_Technologies();

    /**
     * Returns the meta object for the containment reference '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getMicroservice <em>Microservice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Microservice</em>'.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getMicroservice()
     * @see #getMicroserviceMapping()
     * @generated
     */
    EReference getMicroserviceMapping_Microservice();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getEndpoints <em>Endpoints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Endpoints</em>'.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getEndpoints()
     * @see #getMicroserviceMapping()
     * @generated
     */
    EReference getMicroserviceMapping_Endpoints();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getProtocols <em>Protocols</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Protocols</em>'.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getProtocols()
     * @see #getMicroserviceMapping()
     * @generated
     */
    EReference getMicroserviceMapping_Protocols();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getInterfaceMappings <em>Interface Mappings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Interface Mappings</em>'.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getInterfaceMappings()
     * @see #getMicroserviceMapping()
     * @generated
     */
    EReference getMicroserviceMapping_InterfaceMappings();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getOperationMappings <em>Operation Mappings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operation Mappings</em>'.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getOperationMappings()
     * @see #getMicroserviceMapping()
     * @generated
     */
    EReference getMicroserviceMapping_OperationMappings();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getReferredOperationMappings <em>Referred Operation Mappings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Referred Operation Mappings</em>'.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getReferredOperationMappings()
     * @see #getMicroserviceMapping()
     * @generated
     */
    EReference getMicroserviceMapping_ReferredOperationMappings();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getAspects <em>Aspects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Aspects</em>'.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getAspects()
     * @see #getMicroserviceMapping()
     * @generated
     */
    EReference getMicroserviceMapping_Aspects();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getMappingModel <em>Mapping Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Mapping Model</em>'.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getMappingModel()
     * @see #getMicroserviceMapping()
     * @generated
     */
    EReference getMicroserviceMapping_MappingModel();

    /**
     * Returns the meta object for the '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getTypeDefinitionTechnologyImports() <em>Get Type Definition Technology Imports</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Type Definition Technology Imports</em>' operation.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getTypeDefinitionTechnologyImports()
     * @generated
     */
    EOperation getMicroserviceMapping__GetTypeDefinitionTechnologyImports();

    /**
     * Returns the meta object for the '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getTypeDefinitionTechnologyImport() <em>Get Type Definition Technology Import</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Type Definition Technology Import</em>' operation.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getTypeDefinitionTechnologyImport()
     * @generated
     */
    EOperation getMicroserviceMapping__GetTypeDefinitionTechnologyImport();

    /**
     * Returns the meta object for the '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getTypeDefinitionTechnologies() <em>Get Type Definition Technologies</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Type Definition Technologies</em>' operation.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getTypeDefinitionTechnologies()
     * @generated
     */
    EOperation getMicroserviceMapping__GetTypeDefinitionTechnologies();

    /**
     * Returns the meta object for the '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getTypeDefinitionTechnology() <em>Get Type Definition Technology</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Type Definition Technology</em>' operation.
     * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping#getTypeDefinitionTechnology()
     * @generated
     */
    EOperation getMicroserviceMapping__GetTypeDefinitionTechnology();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.ImportedMicroservice <em>Imported Microservice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Imported Microservice</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ImportedMicroservice
     * @generated
     */
    EClass getImportedMicroservice();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.ImportedMicroservice#getImport <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Import</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ImportedMicroservice#getImport()
     * @see #getImportedMicroservice()
     * @generated
     */
    EReference getImportedMicroservice_Import();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.ImportedMicroservice#getMicroservice <em>Microservice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Microservice</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ImportedMicroservice#getMicroservice()
     * @see #getImportedMicroservice()
     * @generated
     */
    EReference getImportedMicroservice_Microservice();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.ImportedMicroservice#getMicroserviceMapping <em>Microservice Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Microservice Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ImportedMicroservice#getMicroserviceMapping()
     * @see #getImportedMicroservice()
     * @generated
     */
    EReference getImportedMicroservice_MicroserviceMapping();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.InterfaceMapping <em>Interface Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.InterfaceMapping
     * @generated
     */
    EClass getInterfaceMapping();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.InterfaceMapping#getInterface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Interface</em>'.
     * @see de.fhdo.ddmm.technology.mapping.InterfaceMapping#getInterface()
     * @see #getInterfaceMapping()
     * @generated
     */
    EReference getInterfaceMapping_Interface();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.InterfaceMapping#getEndpoints <em>Endpoints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Endpoints</em>'.
     * @see de.fhdo.ddmm.technology.mapping.InterfaceMapping#getEndpoints()
     * @see #getInterfaceMapping()
     * @generated
     */
    EReference getInterfaceMapping_Endpoints();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.InterfaceMapping#getProtocols <em>Protocols</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Protocols</em>'.
     * @see de.fhdo.ddmm.technology.mapping.InterfaceMapping#getProtocols()
     * @see #getInterfaceMapping()
     * @generated
     */
    EReference getInterfaceMapping_Protocols();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.InterfaceMapping#getAspects <em>Aspects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Aspects</em>'.
     * @see de.fhdo.ddmm.technology.mapping.InterfaceMapping#getAspects()
     * @see #getInterfaceMapping()
     * @generated
     */
    EReference getInterfaceMapping_Aspects();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.InterfaceMapping#getMicroserviceMapping <em>Microservice Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Microservice Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.InterfaceMapping#getMicroserviceMapping()
     * @see #getInterfaceMapping()
     * @generated
     */
    EReference getInterfaceMapping_MicroserviceMapping();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.OperationMapping <em>Operation Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.OperationMapping
     * @generated
     */
    EClass getOperationMapping();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.OperationMapping#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Operation</em>'.
     * @see de.fhdo.ddmm.technology.mapping.OperationMapping#getOperation()
     * @see #getOperationMapping()
     * @generated
     */
    EReference getOperationMapping_Operation();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.OperationMapping#getEndpoints <em>Endpoints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Endpoints</em>'.
     * @see de.fhdo.ddmm.technology.mapping.OperationMapping#getEndpoints()
     * @see #getOperationMapping()
     * @generated
     */
    EReference getOperationMapping_Endpoints();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.OperationMapping#getProtocols <em>Protocols</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Protocols</em>'.
     * @see de.fhdo.ddmm.technology.mapping.OperationMapping#getProtocols()
     * @see #getOperationMapping()
     * @generated
     */
    EReference getOperationMapping_Protocols();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.OperationMapping#getParameterMappings <em>Parameter Mappings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter Mappings</em>'.
     * @see de.fhdo.ddmm.technology.mapping.OperationMapping#getParameterMappings()
     * @see #getOperationMapping()
     * @generated
     */
    EReference getOperationMapping_ParameterMappings();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.OperationMapping#getAspects <em>Aspects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Aspects</em>'.
     * @see de.fhdo.ddmm.technology.mapping.OperationMapping#getAspects()
     * @see #getOperationMapping()
     * @generated
     */
    EReference getOperationMapping_Aspects();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.OperationMapping#getMicroserviceMapping <em>Microservice Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Microservice Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.OperationMapping#getMicroserviceMapping()
     * @see #getOperationMapping()
     * @generated
     */
    EReference getOperationMapping_MicroserviceMapping();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.ReferredOperationMapping <em>Referred Operation Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Referred Operation Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ReferredOperationMapping
     * @generated
     */
    EClass getReferredOperationMapping();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.ReferredOperationMapping#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Operation</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ReferredOperationMapping#getOperation()
     * @see #getReferredOperationMapping()
     * @generated
     */
    EReference getReferredOperationMapping_Operation();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.ReferredOperationMapping#getEndpoints <em>Endpoints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Endpoints</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ReferredOperationMapping#getEndpoints()
     * @see #getReferredOperationMapping()
     * @generated
     */
    EReference getReferredOperationMapping_Endpoints();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.ReferredOperationMapping#getProtocols <em>Protocols</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Protocols</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ReferredOperationMapping#getProtocols()
     * @see #getReferredOperationMapping()
     * @generated
     */
    EReference getReferredOperationMapping_Protocols();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.ReferredOperationMapping#getAspects <em>Aspects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Aspects</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ReferredOperationMapping#getAspects()
     * @see #getReferredOperationMapping()
     * @generated
     */
    EReference getReferredOperationMapping_Aspects();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.ReferredOperationMapping#getMicroserviceMapping <em>Microservice Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Microservice Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ReferredOperationMapping#getMicroserviceMapping()
     * @see #getReferredOperationMapping()
     * @generated
     */
    EReference getReferredOperationMapping_MicroserviceMapping();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.ParameterMapping <em>Parameter Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ParameterMapping
     * @generated
     */
    EClass getParameterMapping();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.ParameterMapping#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Parameter</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ParameterMapping#getParameter()
     * @see #getParameterMapping()
     * @generated
     */
    EReference getParameterMapping_Parameter();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.ParameterMapping#getAspects <em>Aspects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Aspects</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ParameterMapping#getAspects()
     * @see #getParameterMapping()
     * @generated
     */
    EReference getParameterMapping_Aspects();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.ParameterMapping#getOperationMapping <em>Operation Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Operation Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ParameterMapping#getOperationMapping()
     * @see #getParameterMapping()
     * @generated
     */
    EReference getParameterMapping_OperationMapping();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.PrimitiveParameterMapping <em>Primitive Parameter Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Primitive Parameter Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.PrimitiveParameterMapping
     * @generated
     */
    EClass getPrimitiveParameterMapping();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.PrimitiveParameterMapping#getTechnology <em>Technology</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Technology</em>'.
     * @see de.fhdo.ddmm.technology.mapping.PrimitiveParameterMapping#getTechnology()
     * @see #getPrimitiveParameterMapping()
     * @generated
     */
    EReference getPrimitiveParameterMapping_Technology();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.PrimitiveParameterMapping#getPrimitiveType <em>Primitive Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Primitive Type</em>'.
     * @see de.fhdo.ddmm.technology.mapping.PrimitiveParameterMapping#getPrimitiveType()
     * @see #getPrimitiveParameterMapping()
     * @generated
     */
    EReference getPrimitiveParameterMapping_PrimitiveType();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.ComplexParameterMapping <em>Complex Parameter Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Parameter Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ComplexParameterMapping
     * @generated
     */
    EClass getComplexParameterMapping();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.ComplexParameterMapping#getTechnology <em>Technology</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Technology</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ComplexParameterMapping#getTechnology()
     * @see #getComplexParameterMapping()
     * @generated
     */
    EReference getComplexParameterMapping_Technology();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.ComplexParameterMapping#getTechnologySpecificComplexType <em>Technology Specific Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Technology Specific Complex Type</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ComplexParameterMapping#getTechnologySpecificComplexType()
     * @see #getComplexParameterMapping()
     * @generated
     */
    EReference getComplexParameterMapping_TechnologySpecificComplexType();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.ComplexParameterMapping#getFieldMappings <em>Field Mappings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Field Mappings</em>'.
     * @see de.fhdo.ddmm.technology.mapping.ComplexParameterMapping#getFieldMappings()
     * @see #getComplexParameterMapping()
     * @generated
     */
    EReference getComplexParameterMapping_FieldMappings();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping <em>Technology Specific Field Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Technology Specific Field Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping
     * @generated
     */
    EClass getTechnologySpecificFieldMapping();

    /**
     * Returns the meta object for the attribute '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getT_sourceModelUri <em>Tsource Model Uri</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tsource Model Uri</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getT_sourceModelUri()
     * @see #getTechnologySpecificFieldMapping()
     * @generated
     */
    EAttribute getTechnologySpecificFieldMapping_T_sourceModelUri();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getTechnology <em>Technology</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Technology</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getTechnology()
     * @see #getTechnologySpecificFieldMapping()
     * @generated
     */
    EReference getTechnologySpecificFieldMapping_Technology();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getType()
     * @see #getTechnologySpecificFieldMapping()
     * @generated
     */
    EReference getTechnologySpecificFieldMapping_Type();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getEnumerationField <em>Enumeration Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Enumeration Field</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getEnumerationField()
     * @see #getTechnologySpecificFieldMapping()
     * @generated
     */
    EReference getTechnologySpecificFieldMapping_EnumerationField();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getDataField <em>Data Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Field</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getDataField()
     * @see #getTechnologySpecificFieldMapping()
     * @generated
     */
    EReference getTechnologySpecificFieldMapping_DataField();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getAspects <em>Aspects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Aspects</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getAspects()
     * @see #getTechnologySpecificFieldMapping()
     * @generated
     */
    EReference getTechnologySpecificFieldMapping_Aspects();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getTypeMapping <em>Type Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Type Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getTypeMapping()
     * @see #getTechnologySpecificFieldMapping()
     * @generated
     */
    EReference getTechnologySpecificFieldMapping_TypeMapping();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getParameterMapping <em>Parameter Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parameter Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getParameterMapping()
     * @see #getTechnologySpecificFieldMapping()
     * @generated
     */
    EReference getTechnologySpecificFieldMapping_ParameterMapping();

    /**
     * Returns the meta object for the '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getOriginalTypeOfMappedElement() <em>Get Original Type Of Mapped Element</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Original Type Of Mapped Element</em>' operation.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificFieldMapping#getOriginalTypeOfMappedElement()
     * @generated
     */
    EOperation getTechnologySpecificFieldMapping__GetOriginalTypeOfMappedElement();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocolSpecification <em>Technology Specific Protocol Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Technology Specific Protocol Specification</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocolSpecification
     * @generated
     */
    EClass getTechnologySpecificProtocolSpecification();

    /**
     * Returns the meta object for the attribute '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocolSpecification#getCommunicationType <em>Communication Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Communication Type</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocolSpecification#getCommunicationType()
     * @see #getTechnologySpecificProtocolSpecification()
     * @generated
     */
    EAttribute getTechnologySpecificProtocolSpecification_CommunicationType();

    /**
     * Returns the meta object for the containment reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocolSpecification#getTechnologySpecificProtocol <em>Technology Specific Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Technology Specific Protocol</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocolSpecification#getTechnologySpecificProtocol()
     * @see #getTechnologySpecificProtocolSpecification()
     * @generated
     */
    EReference getTechnologySpecificProtocolSpecification_TechnologySpecificProtocol();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol <em>Technology Specific Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Technology Specific Protocol</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol
     * @generated
     */
    EClass getTechnologySpecificProtocol();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol#getTechnology <em>Technology</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Technology</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol#getTechnology()
     * @see #getTechnologySpecificProtocol()
     * @generated
     */
    EReference getTechnologySpecificProtocol_Technology();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol#getProtocol <em>Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Protocol</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol#getProtocol()
     * @see #getTechnologySpecificProtocol()
     * @generated
     */
    EReference getTechnologySpecificProtocol_Protocol();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol#getDataFormat <em>Data Format</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Format</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol#getDataFormat()
     * @see #getTechnologySpecificProtocol()
     * @generated
     */
    EReference getTechnologySpecificProtocol_DataFormat();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol#getProtocolSpecification <em>Protocol Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Protocol Specification</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol#getProtocolSpecification()
     * @see #getTechnologySpecificProtocol()
     * @generated
     */
    EReference getTechnologySpecificProtocol_ProtocolSpecification();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol#getEndpoint <em>Endpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Endpoint</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol#getEndpoint()
     * @see #getTechnologySpecificProtocol()
     * @generated
     */
    EReference getTechnologySpecificProtocol_Endpoint();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint <em>Technology Specific Endpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Technology Specific Endpoint</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint
     * @generated
     */
    EClass getTechnologySpecificEndpoint();

    /**
     * Returns the meta object for the attribute list '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint#getAddresses <em>Addresses</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Addresses</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint#getAddresses()
     * @see #getTechnologySpecificEndpoint()
     * @generated
     */
    EAttribute getTechnologySpecificEndpoint_Addresses();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint#getTechnologySpecificProtocols <em>Technology Specific Protocols</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Technology Specific Protocols</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint#getTechnologySpecificProtocols()
     * @see #getTechnologySpecificEndpoint()
     * @generated
     */
    EReference getTechnologySpecificEndpoint_TechnologySpecificProtocols();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint#getMicroserviceMapping <em>Microservice Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Microservice Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint#getMicroserviceMapping()
     * @see #getTechnologySpecificEndpoint()
     * @generated
     */
    EReference getTechnologySpecificEndpoint_MicroserviceMapping();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint#getInterfaceMapping <em>Interface Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Interface Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint#getInterfaceMapping()
     * @see #getTechnologySpecificEndpoint()
     * @generated
     */
    EReference getTechnologySpecificEndpoint_InterfaceMapping();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint#getOperationMapping <em>Operation Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Operation Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint#getOperationMapping()
     * @see #getTechnologySpecificEndpoint()
     * @generated
     */
    EReference getTechnologySpecificEndpoint_OperationMapping();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint#getReferredOperationMapping <em>Referred Operation Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Referred Operation Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint#getReferredOperationMapping()
     * @see #getTechnologySpecificEndpoint()
     * @generated
     */
    EReference getTechnologySpecificEndpoint_ReferredOperationMapping();

    /**
     * Returns the meta object for class '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect <em>Technology Specific Imported Service Aspect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Technology Specific Imported Service Aspect</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect
     * @generated
     */
    EClass getTechnologySpecificImportedServiceAspect();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getTechnology <em>Technology</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Technology</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getTechnology()
     * @see #getTechnologySpecificImportedServiceAspect()
     * @generated
     */
    EReference getTechnologySpecificImportedServiceAspect_Technology();

    /**
     * Returns the meta object for the reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getAspect <em>Aspect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Aspect</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getAspect()
     * @see #getTechnologySpecificImportedServiceAspect()
     * @generated
     */
    EReference getTechnologySpecificImportedServiceAspect_Aspect();

    /**
     * Returns the meta object for the containment reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getSinglePropertyValue <em>Single Property Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Single Property Value</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getSinglePropertyValue()
     * @see #getTechnologySpecificImportedServiceAspect()
     * @generated
     */
    EReference getTechnologySpecificImportedServiceAspect_SinglePropertyValue();

    /**
     * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getValues <em>Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Values</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getValues()
     * @see #getTechnologySpecificImportedServiceAspect()
     * @generated
     */
    EReference getTechnologySpecificImportedServiceAspect_Values();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getTypeMapping <em>Type Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Type Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getTypeMapping()
     * @see #getTechnologySpecificImportedServiceAspect()
     * @generated
     */
    EReference getTechnologySpecificImportedServiceAspect_TypeMapping();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getMicroserviceMapping <em>Microservice Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Microservice Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getMicroserviceMapping()
     * @see #getTechnologySpecificImportedServiceAspect()
     * @generated
     */
    EReference getTechnologySpecificImportedServiceAspect_MicroserviceMapping();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getInterfaceMapping <em>Interface Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Interface Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getInterfaceMapping()
     * @see #getTechnologySpecificImportedServiceAspect()
     * @generated
     */
    EReference getTechnologySpecificImportedServiceAspect_InterfaceMapping();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getOperationMapping <em>Operation Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Operation Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getOperationMapping()
     * @see #getTechnologySpecificImportedServiceAspect()
     * @generated
     */
    EReference getTechnologySpecificImportedServiceAspect_OperationMapping();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getReferredOperationMapping <em>Referred Operation Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Referred Operation Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getReferredOperationMapping()
     * @see #getTechnologySpecificImportedServiceAspect()
     * @generated
     */
    EReference getTechnologySpecificImportedServiceAspect_ReferredOperationMapping();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getParameterMapping <em>Parameter Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parameter Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getParameterMapping()
     * @see #getTechnologySpecificImportedServiceAspect()
     * @generated
     */
    EReference getTechnologySpecificImportedServiceAspect_ParameterMapping();

    /**
     * Returns the meta object for the container reference '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getFieldMapping <em>Field Mapping</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Field Mapping</em>'.
     * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect#getFieldMapping()
     * @see #getTechnologySpecificImportedServiceAspect()
     * @generated
     */
    EReference getTechnologySpecificImportedServiceAspect_FieldMapping();

    /**
     * Returns the meta object for data type '{@link java.util.List <em>Data Field List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Data Field List</em>'.
     * @see java.util.List
     * @model instanceClass="java.util.List&lt;de.fhdo.ddmm.data.DataField&gt;"
     * @generated
     */
    EDataType getDataFieldList();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MappingFactory getMappingFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.TechnologyMappingImpl <em>Technology Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.TechnologyMappingImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getTechnologyMapping()
         * @generated
         */
        EClass TECHNOLOGY_MAPPING = eINSTANCE.getTechnologyMapping();

        /**
         * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_MAPPING__IMPORTS = eINSTANCE.getTechnologyMapping_Imports();

        /**
         * The meta object literal for the '<em><b>Type Mappings</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_MAPPING__TYPE_MAPPINGS = eINSTANCE.getTechnologyMapping_TypeMappings();

        /**
         * The meta object literal for the '<em><b>Service Mappings</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_MAPPING__SERVICE_MAPPINGS = eINSTANCE.getTechnologyMapping_ServiceMappings();

        /**
         * The meta object literal for the '<em><b>Get Mapped Interfaces</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TECHNOLOGY_MAPPING___GET_MAPPED_INTERFACES = eINSTANCE.getTechnologyMapping__GetMappedInterfaces();

        /**
         * The meta object literal for the '<em><b>Get Mapped Operations</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TECHNOLOGY_MAPPING___GET_MAPPED_OPERATIONS = eINSTANCE.getTechnologyMapping__GetMappedOperations();

        /**
         * The meta object literal for the '<em><b>Get Complex Parameter Mappings</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TECHNOLOGY_MAPPING___GET_COMPLEX_PARAMETER_MAPPINGS = eINSTANCE.getTechnologyMapping__GetComplexParameterMappings();

        /**
         * The meta object literal for the '<em><b>Get Mapped Referred Operations</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TECHNOLOGY_MAPPING___GET_MAPPED_REFERRED_OPERATIONS = eINSTANCE.getTechnologyMapping__GetMappedReferredOperations();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.ComplexTypeMappingImpl <em>Complex Type Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.ComplexTypeMappingImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getComplexTypeMapping()
         * @generated
         */
        EClass COMPLEX_TYPE_MAPPING = eINSTANCE.getComplexTypeMapping();

        /**
         * The meta object literal for the '<em><b>Tsource Model Uri</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPLEX_TYPE_MAPPING__TSOURCE_MODEL_URI = eINSTANCE.getComplexTypeMapping_T_sourceModelUri();

        /**
         * The meta object literal for the '<em><b>Technologies</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE_MAPPING__TECHNOLOGIES = eINSTANCE.getComplexTypeMapping_Technologies();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE_MAPPING__TYPE = eINSTANCE.getComplexTypeMapping_Type();

        /**
         * The meta object literal for the '<em><b>Field Mappings</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE_MAPPING__FIELD_MAPPINGS = eINSTANCE.getComplexTypeMapping_FieldMappings();

        /**
         * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE_MAPPING__ASPECTS = eINSTANCE.getComplexTypeMapping_Aspects();

        /**
         * The meta object literal for the '<em><b>Mapping Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_TYPE_MAPPING__MAPPING_MODEL = eINSTANCE.getComplexTypeMapping_MappingModel();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.ImportedComplexTypeImpl <em>Imported Complex Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.ImportedComplexTypeImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getImportedComplexType()
         * @generated
         */
        EClass IMPORTED_COMPLEX_TYPE = eINSTANCE.getImportedComplexType();

        /**
         * The meta object literal for the '<em><b>Service Model Import</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPORTED_COMPLEX_TYPE__SERVICE_MODEL_IMPORT = eINSTANCE.getImportedComplexType_ServiceModelImport();

        /**
         * The meta object literal for the '<em><b>Data Model Import</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPORTED_COMPLEX_TYPE__DATA_MODEL_IMPORT = eINSTANCE.getImportedComplexType_DataModelImport();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPORTED_COMPLEX_TYPE__TYPE = eINSTANCE.getImportedComplexType_Type();

        /**
         * The meta object literal for the '<em><b>Type Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPORTED_COMPLEX_TYPE__TYPE_MAPPING = eINSTANCE.getImportedComplexType_TypeMapping();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.MicroserviceMappingImpl <em>Microservice Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.MicroserviceMappingImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getMicroserviceMapping()
         * @generated
         */
        EClass MICROSERVICE_MAPPING = eINSTANCE.getMicroserviceMapping();

        /**
         * The meta object literal for the '<em><b>Technologies</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MICROSERVICE_MAPPING__TECHNOLOGIES = eINSTANCE.getMicroserviceMapping_Technologies();

        /**
         * The meta object literal for the '<em><b>Microservice</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MICROSERVICE_MAPPING__MICROSERVICE = eINSTANCE.getMicroserviceMapping_Microservice();

        /**
         * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MICROSERVICE_MAPPING__ENDPOINTS = eINSTANCE.getMicroserviceMapping_Endpoints();

        /**
         * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MICROSERVICE_MAPPING__PROTOCOLS = eINSTANCE.getMicroserviceMapping_Protocols();

        /**
         * The meta object literal for the '<em><b>Interface Mappings</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MICROSERVICE_MAPPING__INTERFACE_MAPPINGS = eINSTANCE.getMicroserviceMapping_InterfaceMappings();

        /**
         * The meta object literal for the '<em><b>Operation Mappings</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MICROSERVICE_MAPPING__OPERATION_MAPPINGS = eINSTANCE.getMicroserviceMapping_OperationMappings();

        /**
         * The meta object literal for the '<em><b>Referred Operation Mappings</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MICROSERVICE_MAPPING__REFERRED_OPERATION_MAPPINGS = eINSTANCE.getMicroserviceMapping_ReferredOperationMappings();

        /**
         * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MICROSERVICE_MAPPING__ASPECTS = eINSTANCE.getMicroserviceMapping_Aspects();

        /**
         * The meta object literal for the '<em><b>Mapping Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MICROSERVICE_MAPPING__MAPPING_MODEL = eINSTANCE.getMicroserviceMapping_MappingModel();

        /**
         * The meta object literal for the '<em><b>Get Type Definition Technology Imports</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MICROSERVICE_MAPPING___GET_TYPE_DEFINITION_TECHNOLOGY_IMPORTS = eINSTANCE.getMicroserviceMapping__GetTypeDefinitionTechnologyImports();

        /**
         * The meta object literal for the '<em><b>Get Type Definition Technology Import</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MICROSERVICE_MAPPING___GET_TYPE_DEFINITION_TECHNOLOGY_IMPORT = eINSTANCE.getMicroserviceMapping__GetTypeDefinitionTechnologyImport();

        /**
         * The meta object literal for the '<em><b>Get Type Definition Technologies</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MICROSERVICE_MAPPING___GET_TYPE_DEFINITION_TECHNOLOGIES = eINSTANCE.getMicroserviceMapping__GetTypeDefinitionTechnologies();

        /**
         * The meta object literal for the '<em><b>Get Type Definition Technology</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation MICROSERVICE_MAPPING___GET_TYPE_DEFINITION_TECHNOLOGY = eINSTANCE.getMicroserviceMapping__GetTypeDefinitionTechnology();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.ImportedMicroserviceImpl <em>Imported Microservice</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.ImportedMicroserviceImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getImportedMicroservice()
         * @generated
         */
        EClass IMPORTED_MICROSERVICE = eINSTANCE.getImportedMicroservice();

        /**
         * The meta object literal for the '<em><b>Import</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPORTED_MICROSERVICE__IMPORT = eINSTANCE.getImportedMicroservice_Import();

        /**
         * The meta object literal for the '<em><b>Microservice</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPORTED_MICROSERVICE__MICROSERVICE = eINSTANCE.getImportedMicroservice_Microservice();

        /**
         * The meta object literal for the '<em><b>Microservice Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IMPORTED_MICROSERVICE__MICROSERVICE_MAPPING = eINSTANCE.getImportedMicroservice_MicroserviceMapping();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.InterfaceMappingImpl <em>Interface Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.InterfaceMappingImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getInterfaceMapping()
         * @generated
         */
        EClass INTERFACE_MAPPING = eINSTANCE.getInterfaceMapping();

        /**
         * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE_MAPPING__INTERFACE = eINSTANCE.getInterfaceMapping_Interface();

        /**
         * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE_MAPPING__ENDPOINTS = eINSTANCE.getInterfaceMapping_Endpoints();

        /**
         * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE_MAPPING__PROTOCOLS = eINSTANCE.getInterfaceMapping_Protocols();

        /**
         * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE_MAPPING__ASPECTS = eINSTANCE.getInterfaceMapping_Aspects();

        /**
         * The meta object literal for the '<em><b>Microservice Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE_MAPPING__MICROSERVICE_MAPPING = eINSTANCE.getInterfaceMapping_MicroserviceMapping();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.OperationMappingImpl <em>Operation Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.OperationMappingImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getOperationMapping()
         * @generated
         */
        EClass OPERATION_MAPPING = eINSTANCE.getOperationMapping();

        /**
         * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_MAPPING__OPERATION = eINSTANCE.getOperationMapping_Operation();

        /**
         * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_MAPPING__ENDPOINTS = eINSTANCE.getOperationMapping_Endpoints();

        /**
         * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_MAPPING__PROTOCOLS = eINSTANCE.getOperationMapping_Protocols();

        /**
         * The meta object literal for the '<em><b>Parameter Mappings</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_MAPPING__PARAMETER_MAPPINGS = eINSTANCE.getOperationMapping_ParameterMappings();

        /**
         * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_MAPPING__ASPECTS = eINSTANCE.getOperationMapping_Aspects();

        /**
         * The meta object literal for the '<em><b>Microservice Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_MAPPING__MICROSERVICE_MAPPING = eINSTANCE.getOperationMapping_MicroserviceMapping();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.ReferredOperationMappingImpl <em>Referred Operation Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.ReferredOperationMappingImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getReferredOperationMapping()
         * @generated
         */
        EClass REFERRED_OPERATION_MAPPING = eINSTANCE.getReferredOperationMapping();

        /**
         * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERRED_OPERATION_MAPPING__OPERATION = eINSTANCE.getReferredOperationMapping_Operation();

        /**
         * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERRED_OPERATION_MAPPING__ENDPOINTS = eINSTANCE.getReferredOperationMapping_Endpoints();

        /**
         * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERRED_OPERATION_MAPPING__PROTOCOLS = eINSTANCE.getReferredOperationMapping_Protocols();

        /**
         * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERRED_OPERATION_MAPPING__ASPECTS = eINSTANCE.getReferredOperationMapping_Aspects();

        /**
         * The meta object literal for the '<em><b>Microservice Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERRED_OPERATION_MAPPING__MICROSERVICE_MAPPING = eINSTANCE.getReferredOperationMapping_MicroserviceMapping();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.ParameterMappingImpl <em>Parameter Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.ParameterMappingImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getParameterMapping()
         * @generated
         */
        EClass PARAMETER_MAPPING = eINSTANCE.getParameterMapping();

        /**
         * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_MAPPING__PARAMETER = eINSTANCE.getParameterMapping_Parameter();

        /**
         * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_MAPPING__ASPECTS = eINSTANCE.getParameterMapping_Aspects();

        /**
         * The meta object literal for the '<em><b>Operation Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_MAPPING__OPERATION_MAPPING = eINSTANCE.getParameterMapping_OperationMapping();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.PrimitiveParameterMappingImpl <em>Primitive Parameter Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.PrimitiveParameterMappingImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getPrimitiveParameterMapping()
         * @generated
         */
        EClass PRIMITIVE_PARAMETER_MAPPING = eINSTANCE.getPrimitiveParameterMapping();

        /**
         * The meta object literal for the '<em><b>Technology</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRIMITIVE_PARAMETER_MAPPING__TECHNOLOGY = eINSTANCE.getPrimitiveParameterMapping_Technology();

        /**
         * The meta object literal for the '<em><b>Primitive Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRIMITIVE_PARAMETER_MAPPING__PRIMITIVE_TYPE = eINSTANCE.getPrimitiveParameterMapping_PrimitiveType();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.ComplexParameterMappingImpl <em>Complex Parameter Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.ComplexParameterMappingImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getComplexParameterMapping()
         * @generated
         */
        EClass COMPLEX_PARAMETER_MAPPING = eINSTANCE.getComplexParameterMapping();

        /**
         * The meta object literal for the '<em><b>Technology</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_PARAMETER_MAPPING__TECHNOLOGY = eINSTANCE.getComplexParameterMapping_Technology();

        /**
         * The meta object literal for the '<em><b>Technology Specific Complex Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_PARAMETER_MAPPING__TECHNOLOGY_SPECIFIC_COMPLEX_TYPE = eINSTANCE.getComplexParameterMapping_TechnologySpecificComplexType();

        /**
         * The meta object literal for the '<em><b>Field Mappings</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPLEX_PARAMETER_MAPPING__FIELD_MAPPINGS = eINSTANCE.getComplexParameterMapping_FieldMappings();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificFieldMappingImpl <em>Technology Specific Field Mapping</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificFieldMappingImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getTechnologySpecificFieldMapping()
         * @generated
         */
        EClass TECHNOLOGY_SPECIFIC_FIELD_MAPPING = eINSTANCE.getTechnologySpecificFieldMapping();

        /**
         * The meta object literal for the '<em><b>Tsource Model Uri</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHNOLOGY_SPECIFIC_FIELD_MAPPING__TSOURCE_MODEL_URI = eINSTANCE.getTechnologySpecificFieldMapping_T_sourceModelUri();

        /**
         * The meta object literal for the '<em><b>Technology</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_FIELD_MAPPING__TECHNOLOGY = eINSTANCE.getTechnologySpecificFieldMapping_Technology();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_FIELD_MAPPING__TYPE = eINSTANCE.getTechnologySpecificFieldMapping_Type();

        /**
         * The meta object literal for the '<em><b>Enumeration Field</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_FIELD_MAPPING__ENUMERATION_FIELD = eINSTANCE.getTechnologySpecificFieldMapping_EnumerationField();

        /**
         * The meta object literal for the '<em><b>Data Field</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_FIELD_MAPPING__DATA_FIELD = eINSTANCE.getTechnologySpecificFieldMapping_DataField();

        /**
         * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_FIELD_MAPPING__ASPECTS = eINSTANCE.getTechnologySpecificFieldMapping_Aspects();

        /**
         * The meta object literal for the '<em><b>Type Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_FIELD_MAPPING__TYPE_MAPPING = eINSTANCE.getTechnologySpecificFieldMapping_TypeMapping();

        /**
         * The meta object literal for the '<em><b>Parameter Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_FIELD_MAPPING__PARAMETER_MAPPING = eINSTANCE.getTechnologySpecificFieldMapping_ParameterMapping();

        /**
         * The meta object literal for the '<em><b>Get Original Type Of Mapped Element</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TECHNOLOGY_SPECIFIC_FIELD_MAPPING___GET_ORIGINAL_TYPE_OF_MAPPED_ELEMENT = eINSTANCE.getTechnologySpecificFieldMapping__GetOriginalTypeOfMappedElement();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificProtocolSpecificationImpl <em>Technology Specific Protocol Specification</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificProtocolSpecificationImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getTechnologySpecificProtocolSpecification()
         * @generated
         */
        EClass TECHNOLOGY_SPECIFIC_PROTOCOL_SPECIFICATION = eINSTANCE.getTechnologySpecificProtocolSpecification();

        /**
         * The meta object literal for the '<em><b>Communication Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHNOLOGY_SPECIFIC_PROTOCOL_SPECIFICATION__COMMUNICATION_TYPE = eINSTANCE.getTechnologySpecificProtocolSpecification_CommunicationType();

        /**
         * The meta object literal for the '<em><b>Technology Specific Protocol</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_PROTOCOL_SPECIFICATION__TECHNOLOGY_SPECIFIC_PROTOCOL = eINSTANCE.getTechnologySpecificProtocolSpecification_TechnologySpecificProtocol();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificProtocolImpl <em>Technology Specific Protocol</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificProtocolImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getTechnologySpecificProtocol()
         * @generated
         */
        EClass TECHNOLOGY_SPECIFIC_PROTOCOL = eINSTANCE.getTechnologySpecificProtocol();

        /**
         * The meta object literal for the '<em><b>Technology</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_PROTOCOL__TECHNOLOGY = eINSTANCE.getTechnologySpecificProtocol_Technology();

        /**
         * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_PROTOCOL__PROTOCOL = eINSTANCE.getTechnologySpecificProtocol_Protocol();

        /**
         * The meta object literal for the '<em><b>Data Format</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_PROTOCOL__DATA_FORMAT = eINSTANCE.getTechnologySpecificProtocol_DataFormat();

        /**
         * The meta object literal for the '<em><b>Protocol Specification</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_PROTOCOL__PROTOCOL_SPECIFICATION = eINSTANCE.getTechnologySpecificProtocol_ProtocolSpecification();

        /**
         * The meta object literal for the '<em><b>Endpoint</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_PROTOCOL__ENDPOINT = eINSTANCE.getTechnologySpecificProtocol_Endpoint();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificEndpointImpl <em>Technology Specific Endpoint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificEndpointImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getTechnologySpecificEndpoint()
         * @generated
         */
        EClass TECHNOLOGY_SPECIFIC_ENDPOINT = eINSTANCE.getTechnologySpecificEndpoint();

        /**
         * The meta object literal for the '<em><b>Addresses</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHNOLOGY_SPECIFIC_ENDPOINT__ADDRESSES = eINSTANCE.getTechnologySpecificEndpoint_Addresses();

        /**
         * The meta object literal for the '<em><b>Technology Specific Protocols</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_ENDPOINT__TECHNOLOGY_SPECIFIC_PROTOCOLS = eINSTANCE.getTechnologySpecificEndpoint_TechnologySpecificProtocols();

        /**
         * The meta object literal for the '<em><b>Microservice Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_ENDPOINT__MICROSERVICE_MAPPING = eINSTANCE.getTechnologySpecificEndpoint_MicroserviceMapping();

        /**
         * The meta object literal for the '<em><b>Interface Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_ENDPOINT__INTERFACE_MAPPING = eINSTANCE.getTechnologySpecificEndpoint_InterfaceMapping();

        /**
         * The meta object literal for the '<em><b>Operation Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_ENDPOINT__OPERATION_MAPPING = eINSTANCE.getTechnologySpecificEndpoint_OperationMapping();

        /**
         * The meta object literal for the '<em><b>Referred Operation Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_ENDPOINT__REFERRED_OPERATION_MAPPING = eINSTANCE.getTechnologySpecificEndpoint_ReferredOperationMapping();

        /**
         * The meta object literal for the '{@link de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificImportedServiceAspectImpl <em>Technology Specific Imported Service Aspect</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.fhdo.ddmm.technology.mapping.impl.TechnologySpecificImportedServiceAspectImpl
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getTechnologySpecificImportedServiceAspect()
         * @generated
         */
        EClass TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT = eINSTANCE.getTechnologySpecificImportedServiceAspect();

        /**
         * The meta object literal for the '<em><b>Technology</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__TECHNOLOGY = eINSTANCE.getTechnologySpecificImportedServiceAspect_Technology();

        /**
         * The meta object literal for the '<em><b>Aspect</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__ASPECT = eINSTANCE.getTechnologySpecificImportedServiceAspect_Aspect();

        /**
         * The meta object literal for the '<em><b>Single Property Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__SINGLE_PROPERTY_VALUE = eINSTANCE.getTechnologySpecificImportedServiceAspect_SinglePropertyValue();

        /**
         * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__VALUES = eINSTANCE.getTechnologySpecificImportedServiceAspect_Values();

        /**
         * The meta object literal for the '<em><b>Type Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__TYPE_MAPPING = eINSTANCE.getTechnologySpecificImportedServiceAspect_TypeMapping();

        /**
         * The meta object literal for the '<em><b>Microservice Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__MICROSERVICE_MAPPING = eINSTANCE.getTechnologySpecificImportedServiceAspect_MicroserviceMapping();

        /**
         * The meta object literal for the '<em><b>Interface Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__INTERFACE_MAPPING = eINSTANCE.getTechnologySpecificImportedServiceAspect_InterfaceMapping();

        /**
         * The meta object literal for the '<em><b>Operation Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__OPERATION_MAPPING = eINSTANCE.getTechnologySpecificImportedServiceAspect_OperationMapping();

        /**
         * The meta object literal for the '<em><b>Referred Operation Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__REFERRED_OPERATION_MAPPING = eINSTANCE.getTechnologySpecificImportedServiceAspect_ReferredOperationMapping();

        /**
         * The meta object literal for the '<em><b>Parameter Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__PARAMETER_MAPPING = eINSTANCE.getTechnologySpecificImportedServiceAspect_ParameterMapping();

        /**
         * The meta object literal for the '<em><b>Field Mapping</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT__FIELD_MAPPING = eINSTANCE.getTechnologySpecificImportedServiceAspect_FieldMapping();

        /**
         * The meta object literal for the '<em>Data Field List</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.List
         * @see de.fhdo.ddmm.technology.mapping.impl.MappingPackageImpl#getDataFieldList()
         * @generated
         */
        EDataType DATA_FIELD_LIST = eINSTANCE.getDataFieldList();

    }

} //MappingPackage

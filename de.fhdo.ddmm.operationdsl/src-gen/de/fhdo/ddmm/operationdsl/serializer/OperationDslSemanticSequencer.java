/*
 * generated by Xtext 2.16.0
 */
package de.fhdo.ddmm.operationdsl.serializer;

import com.google.inject.Inject;
import de.fhdo.ddmm.data.ComplexTypeImport;
import de.fhdo.ddmm.data.Context;
import de.fhdo.ddmm.data.DataField;
import de.fhdo.ddmm.data.DataModel;
import de.fhdo.ddmm.data.DataPackage;
import de.fhdo.ddmm.data.DataStructure;
import de.fhdo.ddmm.data.Enumeration;
import de.fhdo.ddmm.data.EnumerationField;
import de.fhdo.ddmm.data.ListType;
import de.fhdo.ddmm.data.PossiblyImportedComplexType;
import de.fhdo.ddmm.data.PrimitiveBoolean;
import de.fhdo.ddmm.data.PrimitiveByte;
import de.fhdo.ddmm.data.PrimitiveCharacter;
import de.fhdo.ddmm.data.PrimitiveDate;
import de.fhdo.ddmm.data.PrimitiveDouble;
import de.fhdo.ddmm.data.PrimitiveFloat;
import de.fhdo.ddmm.data.PrimitiveInteger;
import de.fhdo.ddmm.data.PrimitiveLong;
import de.fhdo.ddmm.data.PrimitiveShort;
import de.fhdo.ddmm.data.PrimitiveString;
import de.fhdo.ddmm.data.PrimitiveValue;
import de.fhdo.ddmm.data.Version;
import de.fhdo.ddmm.operation.BasicEndpoint;
import de.fhdo.ddmm.operation.Container;
import de.fhdo.ddmm.operation.DeploymentTechnologyReference;
import de.fhdo.ddmm.operation.ImportedMicroservice;
import de.fhdo.ddmm.operation.ImportedOperationAspect;
import de.fhdo.ddmm.operation.InfrastructureNode;
import de.fhdo.ddmm.operation.InfrastructureTechnologyReference;
import de.fhdo.ddmm.operation.OperationModel;
import de.fhdo.ddmm.operation.OperationPackage;
import de.fhdo.ddmm.operation.ProtocolAndDataFormat;
import de.fhdo.ddmm.operation.ServiceDeploymentSpecification;
import de.fhdo.ddmm.operationdsl.services.OperationDslGrammarAccess;
import de.fhdo.ddmm.serializer.ServiceDslSemanticSequencer;
import de.fhdo.ddmm.service.Endpoint;
import de.fhdo.ddmm.service.Import;
import de.fhdo.ddmm.service.ImportedProtocolAndDataFormat;
import de.fhdo.ddmm.service.ImportedServiceAspect;
import de.fhdo.ddmm.service.ImportedType;
import de.fhdo.ddmm.service.Interface;
import de.fhdo.ddmm.service.Microservice;
import de.fhdo.ddmm.service.Operation;
import de.fhdo.ddmm.service.PossiblyImportedInterface;
import de.fhdo.ddmm.service.PossiblyImportedMicroservice;
import de.fhdo.ddmm.service.PossiblyImportedOperation;
import de.fhdo.ddmm.service.ProtocolSpecification;
import de.fhdo.ddmm.service.ReferredOperation;
import de.fhdo.ddmm.service.ServiceModel;
import de.fhdo.ddmm.service.ServicePackage;
import de.fhdo.ddmm.technology.CompatibilityMatrixEntry;
import de.fhdo.ddmm.technology.DataFormat;
import de.fhdo.ddmm.technology.DeploymentTechnology;
import de.fhdo.ddmm.technology.InfrastructureTechnology;
import de.fhdo.ddmm.technology.OperationAspect;
import de.fhdo.ddmm.technology.OperationEnvironment;
import de.fhdo.ddmm.technology.PossiblyImportedTechnologySpecificType;
import de.fhdo.ddmm.technology.Protocol;
import de.fhdo.ddmm.technology.ServiceAspect;
import de.fhdo.ddmm.technology.ServiceAspectPointcut;
import de.fhdo.ddmm.technology.ServiceAspectPointcutSelector;
import de.fhdo.ddmm.technology.Technology;
import de.fhdo.ddmm.technology.TechnologyImport;
import de.fhdo.ddmm.technology.TechnologyPackage;
import de.fhdo.ddmm.technology.TechnologySpecificDataStructure;
import de.fhdo.ddmm.technology.TechnologySpecificListType;
import de.fhdo.ddmm.technology.TechnologySpecificPrimitiveType;
import de.fhdo.ddmm.technology.TechnologySpecificProperty;
import de.fhdo.ddmm.technology.TechnologySpecificPropertyValueAssignment;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class OperationDslSemanticSequencer extends ServiceDslSemanticSequencer {

	@Inject
	private OperationDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DataPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DataPackage.COMPLEX_TYPE_IMPORT:
				sequence_ComplexTypeImport(context, (ComplexTypeImport) semanticObject); 
				return; 
			case DataPackage.CONTEXT:
				sequence_Context(context, (Context) semanticObject); 
				return; 
			case DataPackage.DATA_FIELD:
				sequence_DataField(context, (DataField) semanticObject); 
				return; 
			case DataPackage.DATA_MODEL:
				sequence_DataModel(context, (DataModel) semanticObject); 
				return; 
			case DataPackage.DATA_STRUCTURE:
				sequence_DataStructure(context, (DataStructure) semanticObject); 
				return; 
			case DataPackage.ENUMERATION:
				sequence_Enumeration(context, (Enumeration) semanticObject); 
				return; 
			case DataPackage.ENUMERATION_FIELD:
				sequence_EnumerationField(context, (EnumerationField) semanticObject); 
				return; 
			case DataPackage.LIST_TYPE:
				sequence_ListType(context, (ListType) semanticObject); 
				return; 
			case DataPackage.POSSIBLY_IMPORTED_COMPLEX_TYPE:
				sequence_PossiblyImportedComplexType(context, (PossiblyImportedComplexType) semanticObject); 
				return; 
			case DataPackage.PRIMITIVE_BOOLEAN:
				sequence_PrimitiveType(context, (PrimitiveBoolean) semanticObject); 
				return; 
			case DataPackage.PRIMITIVE_BYTE:
				sequence_PrimitiveType(context, (PrimitiveByte) semanticObject); 
				return; 
			case DataPackage.PRIMITIVE_CHARACTER:
				sequence_PrimitiveType(context, (PrimitiveCharacter) semanticObject); 
				return; 
			case DataPackage.PRIMITIVE_DATE:
				sequence_PrimitiveType(context, (PrimitiveDate) semanticObject); 
				return; 
			case DataPackage.PRIMITIVE_DOUBLE:
				sequence_PrimitiveType(context, (PrimitiveDouble) semanticObject); 
				return; 
			case DataPackage.PRIMITIVE_FLOAT:
				sequence_PrimitiveType(context, (PrimitiveFloat) semanticObject); 
				return; 
			case DataPackage.PRIMITIVE_INTEGER:
				sequence_PrimitiveType(context, (PrimitiveInteger) semanticObject); 
				return; 
			case DataPackage.PRIMITIVE_LONG:
				sequence_PrimitiveType(context, (PrimitiveLong) semanticObject); 
				return; 
			case DataPackage.PRIMITIVE_SHORT:
				sequence_PrimitiveType(context, (PrimitiveShort) semanticObject); 
				return; 
			case DataPackage.PRIMITIVE_STRING:
				sequence_PrimitiveType(context, (PrimitiveString) semanticObject); 
				return; 
			case DataPackage.PRIMITIVE_VALUE:
				sequence_PrimitiveValue(context, (PrimitiveValue) semanticObject); 
				return; 
			case DataPackage.VERSION:
				sequence_Version(context, (Version) semanticObject); 
				return; 
			}
		else if (epackage == OperationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OperationPackage.BASIC_ENDPOINT:
				sequence_BasicEndpoint(context, (BasicEndpoint) semanticObject); 
				return; 
			case OperationPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case OperationPackage.DEPLOYMENT_TECHNOLOGY_REFERENCE:
				sequence_DeploymentTechnologyReference(context, (DeploymentTechnologyReference) semanticObject); 
				return; 
			case OperationPackage.IMPORTED_MICROSERVICE:
				sequence_ImportedMicroservice(context, (ImportedMicroservice) semanticObject); 
				return; 
			case OperationPackage.IMPORTED_OPERATION_ASPECT:
				sequence_ImportedOperationAspect(context, (ImportedOperationAspect) semanticObject); 
				return; 
			case OperationPackage.INFRASTRUCTURE_NODE:
				sequence_InfrastructureNode(context, (InfrastructureNode) semanticObject); 
				return; 
			case OperationPackage.INFRASTRUCTURE_TECHNOLOGY_REFERENCE:
				sequence_InfrastructureTechnologyReference(context, (InfrastructureTechnologyReference) semanticObject); 
				return; 
			case OperationPackage.OPERATION_MODEL:
				sequence_OperationModel(context, (OperationModel) semanticObject); 
				return; 
			case OperationPackage.PROTOCOL_AND_DATA_FORMAT:
				sequence_ProtocolAndDataFormat(context, (ProtocolAndDataFormat) semanticObject); 
				return; 
			case OperationPackage.SERVICE_DEPLOYMENT_SPECIFICATION:
				sequence_ServiceDeploymentSpecification(context, (ServiceDeploymentSpecification) semanticObject); 
				return; 
			}
		else if (epackage == ServicePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ServicePackage.ENDPOINT:
				sequence_Endpoint(context, (Endpoint) semanticObject); 
				return; 
			case ServicePackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case ServicePackage.IMPORTED_PROTOCOL_AND_DATA_FORMAT:
				sequence_ImportedProtocolAndDataFormat(context, (ImportedProtocolAndDataFormat) semanticObject); 
				return; 
			case ServicePackage.IMPORTED_SERVICE_ASPECT:
				sequence_ImportedServiceAspect(context, (ImportedServiceAspect) semanticObject); 
				return; 
			case ServicePackage.IMPORTED_TYPE:
				sequence_ImportedType(context, (ImportedType) semanticObject); 
				return; 
			case ServicePackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case ServicePackage.MICROSERVICE:
				sequence_Microservice(context, (Microservice) semanticObject); 
				return; 
			case ServicePackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case ServicePackage.PARAMETER:
				sequence_Parameter(context, (de.fhdo.ddmm.service.Parameter) semanticObject); 
				return; 
			case ServicePackage.POSSIBLY_IMPORTED_INTERFACE:
				sequence_PossiblyImportedInterface(context, (PossiblyImportedInterface) semanticObject); 
				return; 
			case ServicePackage.POSSIBLY_IMPORTED_MICROSERVICE:
				sequence_PossiblyImportedMicroservice(context, (PossiblyImportedMicroservice) semanticObject); 
				return; 
			case ServicePackage.POSSIBLY_IMPORTED_OPERATION:
				sequence_PossiblyImportedOperation(context, (PossiblyImportedOperation) semanticObject); 
				return; 
			case ServicePackage.PROTOCOL_SPECIFICATION:
				sequence_ProtocolSpecification(context, (ProtocolSpecification) semanticObject); 
				return; 
			case ServicePackage.REFERRED_OPERATION:
				sequence_ReferredOperation(context, (ReferredOperation) semanticObject); 
				return; 
			case ServicePackage.SERVICE_MODEL:
				sequence_ServiceModel(context, (ServiceModel) semanticObject); 
				return; 
			}
		else if (epackage == TechnologyPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TechnologyPackage.COMPATIBILITY_MATRIX_ENTRY:
				sequence_CompatibilityMatrixEntry(context, (CompatibilityMatrixEntry) semanticObject); 
				return; 
			case TechnologyPackage.DATA_FORMAT:
				sequence_DataFormat(context, (DataFormat) semanticObject); 
				return; 
			case TechnologyPackage.DEPLOYMENT_TECHNOLOGY:
				sequence_DeploymentTechnology(context, (DeploymentTechnology) semanticObject); 
				return; 
			case TechnologyPackage.INFRASTRUCTURE_TECHNOLOGY:
				sequence_InfrastructureTechnology(context, (InfrastructureTechnology) semanticObject); 
				return; 
			case TechnologyPackage.OPERATION_ASPECT:
				sequence_OperationAspect(context, (OperationAspect) semanticObject); 
				return; 
			case TechnologyPackage.OPERATION_ENVIRONMENT:
				sequence_OperationEnvironment(context, (OperationEnvironment) semanticObject); 
				return; 
			case TechnologyPackage.POSSIBLY_IMPORTED_TECHNOLOGY_SPECIFIC_TYPE:
				sequence_PossiblyImportedTechnologySpecificType(context, (PossiblyImportedTechnologySpecificType) semanticObject); 
				return; 
			case TechnologyPackage.PROTOCOL:
				sequence_Protocol(context, (Protocol) semanticObject); 
				return; 
			case TechnologyPackage.SERVICE_ASPECT:
				sequence_ServiceAspect(context, (ServiceAspect) semanticObject); 
				return; 
			case TechnologyPackage.SERVICE_ASPECT_POINTCUT:
				sequence_ServiceAspectPointcut(context, (ServiceAspectPointcut) semanticObject); 
				return; 
			case TechnologyPackage.SERVICE_ASPECT_POINTCUT_SELECTOR:
				sequence_ServiceAspectPointcutSelector(context, (ServiceAspectPointcutSelector) semanticObject); 
				return; 
			case TechnologyPackage.TECHNOLOGY:
				sequence_Technology(context, (Technology) semanticObject); 
				return; 
			case TechnologyPackage.TECHNOLOGY_IMPORT:
				sequence_TechnologyImport(context, (TechnologyImport) semanticObject); 
				return; 
			case TechnologyPackage.TECHNOLOGY_SPECIFIC_DATA_STRUCTURE:
				sequence_TechnologySpecificDataStructure(context, (TechnologySpecificDataStructure) semanticObject); 
				return; 
			case TechnologyPackage.TECHNOLOGY_SPECIFIC_LIST_TYPE:
				sequence_TechnologySpecificListType(context, (TechnologySpecificListType) semanticObject); 
				return; 
			case TechnologyPackage.TECHNOLOGY_SPECIFIC_PRIMITIVE_TYPE:
				sequence_TechnologySpecificPrimitiveType(context, (TechnologySpecificPrimitiveType) semanticObject); 
				return; 
			case TechnologyPackage.TECHNOLOGY_SPECIFIC_PROPERTY:
				sequence_TechnologySpecificProperty(context, (TechnologySpecificProperty) semanticObject); 
				return; 
			case TechnologyPackage.TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT:
				sequence_PropertyValueAssignment(context, (TechnologySpecificPropertyValueAssignment) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BasicEndpoint returns BasicEndpoint
	 *
	 * Constraint:
	 *     (protocols+=ProtocolAndDataFormat protocols+=ProtocolAndDataFormat* addresses+=STRING addresses+=STRING*)
	 */
	protected void sequence_BasicEndpoint(ISerializationContext context, BasicEndpoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Container returns Container
	 *
	 * Constraint:
	 *     (
	 *         technologies+=[Import|ID]+ 
	 *         name=ID 
	 *         deploymentTechnology=DeploymentTechnologyReference 
	 *         operationEnvironment=[OperationEnvironment|STRING]? 
	 *         deployedServices+=ImportedMicroservice 
	 *         deployedServices+=ImportedMicroservice* 
	 *         aspects+=ImportedOperationAspect* 
	 *         (
	 *             defaultServicePropertyValues+=PropertyValueAssignment+ | 
	 *             defaultBasicEndpoints+=BasicEndpoint+ | 
	 *             (defaultServicePropertyValues+=PropertyValueAssignment+ defaultBasicEndpoints+=BasicEndpoint+)
	 *         )? 
	 *         deploymentSpecifications+=ServiceDeploymentSpecification*
	 *     )
	 */
	protected void sequence_Container(ISerializationContext context, Container semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeploymentTechnologyReference returns DeploymentTechnologyReference
	 *
	 * Constraint:
	 *     (import=[Import|ID] deploymentTechnology=[DeploymentTechnology|QualifiedName])
	 */
	protected void sequence_DeploymentTechnologyReference(ISerializationContext context, DeploymentTechnologyReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OperationPackage.Literals.DEPLOYMENT_TECHNOLOGY_REFERENCE__IMPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OperationPackage.Literals.DEPLOYMENT_TECHNOLOGY_REFERENCE__IMPORT));
			if (transientValues.isValueTransient(semanticObject, OperationPackage.Literals.DEPLOYMENT_TECHNOLOGY_REFERENCE__DEPLOYMENT_TECHNOLOGY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OperationPackage.Literals.DEPLOYMENT_TECHNOLOGY_REFERENCE__DEPLOYMENT_TECHNOLOGY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeploymentTechnologyReferenceAccess().getImportImportIDTerminalRuleCall_0_0_1(), semanticObject.eGet(OperationPackage.Literals.DEPLOYMENT_TECHNOLOGY_REFERENCE__IMPORT, false));
		feeder.accept(grammarAccess.getDeploymentTechnologyReferenceAccess().getDeploymentTechnologyDeploymentTechnologyQualifiedNameParserRuleCall_2_0_1(), semanticObject.eGet(OperationPackage.Literals.DEPLOYMENT_TECHNOLOGY_REFERENCE__DEPLOYMENT_TECHNOLOGY, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImportedMicroservice returns ImportedMicroservice
	 *
	 * Constraint:
	 *     (import=[Import|ID] microservice=[Microservice|QualifiedNameWithAtLeastOneLevel])
	 */
	protected void sequence_ImportedMicroservice(ISerializationContext context, ImportedMicroservice semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OperationPackage.Literals.IMPORTED_MICROSERVICE__IMPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OperationPackage.Literals.IMPORTED_MICROSERVICE__IMPORT));
			if (transientValues.isValueTransient(semanticObject, OperationPackage.Literals.IMPORTED_MICROSERVICE__MICROSERVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OperationPackage.Literals.IMPORTED_MICROSERVICE__MICROSERVICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportedMicroserviceAccess().getImportImportIDTerminalRuleCall_0_0_1(), semanticObject.eGet(OperationPackage.Literals.IMPORTED_MICROSERVICE__IMPORT, false));
		feeder.accept(grammarAccess.getImportedMicroserviceAccess().getMicroserviceMicroserviceQualifiedNameWithAtLeastOneLevelParserRuleCall_2_0_1(), semanticObject.eGet(OperationPackage.Literals.IMPORTED_MICROSERVICE__MICROSERVICE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImportedOperationAspect returns ImportedOperationAspect
	 *
	 * Constraint:
	 *     (
	 *         technology=[Import|ID] 
	 *         aspect=[OperationAspect|QualifiedName] 
	 *         (singlePropertyValue=PrimitiveValue | (values+=PropertyValueAssignment values+=PropertyValueAssignment*))?
	 *     )
	 */
	protected void sequence_ImportedOperationAspect(ISerializationContext context, ImportedOperationAspect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InfrastructureNode returns InfrastructureNode
	 *
	 * Constraint:
	 *     (
	 *         technologies+=[Import|ID]+ 
	 *         name=ID 
	 *         infrastructureTechnology=InfrastructureTechnologyReference 
	 *         operationEnvironment=[OperationEnvironment|STRING]? 
	 *         deployedServices+=ImportedMicroservice 
	 *         deployedServices+=ImportedMicroservice* 
	 *         aspects+=ImportedOperationAspect* 
	 *         defaultServicePropertyValues+=PropertyValueAssignment* 
	 *         endpoints+=BasicEndpoint* 
	 *         deploymentSpecifications+=ServiceDeploymentSpecification*
	 *     )
	 */
	protected void sequence_InfrastructureNode(ISerializationContext context, InfrastructureNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InfrastructureTechnologyReference returns InfrastructureTechnologyReference
	 *
	 * Constraint:
	 *     (import=[Import|ID] infrastructureTechnology=[InfrastructureTechnology|QualifiedName])
	 */
	protected void sequence_InfrastructureTechnologyReference(ISerializationContext context, InfrastructureTechnologyReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OperationPackage.Literals.INFRASTRUCTURE_TECHNOLOGY_REFERENCE__IMPORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OperationPackage.Literals.INFRASTRUCTURE_TECHNOLOGY_REFERENCE__IMPORT));
			if (transientValues.isValueTransient(semanticObject, OperationPackage.Literals.INFRASTRUCTURE_TECHNOLOGY_REFERENCE__INFRASTRUCTURE_TECHNOLOGY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OperationPackage.Literals.INFRASTRUCTURE_TECHNOLOGY_REFERENCE__INFRASTRUCTURE_TECHNOLOGY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInfrastructureTechnologyReferenceAccess().getImportImportIDTerminalRuleCall_0_0_1(), semanticObject.eGet(OperationPackage.Literals.INFRASTRUCTURE_TECHNOLOGY_REFERENCE__IMPORT, false));
		feeder.accept(grammarAccess.getInfrastructureTechnologyReferenceAccess().getInfrastructureTechnologyInfrastructureTechnologyQualifiedNameParserRuleCall_2_0_1(), semanticObject.eGet(OperationPackage.Literals.INFRASTRUCTURE_TECHNOLOGY_REFERENCE__INFRASTRUCTURE_TECHNOLOGY, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OperationModel returns OperationModel
	 *
	 * Constraint:
	 *     (imports+=Import+ containers+=Container* infrastructureNodes+=InfrastructureNode*)
	 */
	protected void sequence_OperationModel(ISerializationContext context, OperationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyValueAssignment returns TechnologySpecificPropertyValueAssignment
	 *
	 * Constraint:
	 *     (property=[TechnologySpecificProperty|ID] value=PrimitiveValue)
	 */
	protected void sequence_PropertyValueAssignment(ISerializationContext context, TechnologySpecificPropertyValueAssignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT__PROPERTY));
			if (transientValues.isValueTransient(semanticObject, TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyValueAssignmentAccess().getPropertyTechnologySpecificPropertyIDTerminalRuleCall_0_0_1(), semanticObject.eGet(TechnologyPackage.Literals.TECHNOLOGY_SPECIFIC_PROPERTY_VALUE_ASSIGNMENT__PROPERTY, false));
		feeder.accept(grammarAccess.getPropertyValueAssignmentAccess().getValuePrimitiveValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ProtocolAndDataFormat returns ProtocolAndDataFormat
	 *
	 * Constraint:
	 *     (technology=[Import|ID] protocol=[Protocol|QualifiedName] dataFormat=[DataFormat|ID]?)
	 */
	protected void sequence_ProtocolAndDataFormat(ISerializationContext context, ProtocolAndDataFormat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ServiceDeploymentSpecification returns ServiceDeploymentSpecification
	 *
	 * Constraint:
	 *     (
	 *         import=[Import|ID] 
	 *         service=[ImportedMicroservice|QualifiedNameWithAtLeastOneLevel] 
	 *         servicePropertyValues+=PropertyValueAssignment* 
	 *         basicEndpoints+=BasicEndpoint*
	 *     )
	 */
	protected void sequence_ServiceDeploymentSpecification(ISerializationContext context, ServiceDeploymentSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

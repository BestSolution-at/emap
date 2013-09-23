package at.bestsolution.persistence.emap.serializer;

import at.bestsolution.persistence.emap.eMap.EAttribute;
import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.EMapping;
import at.bestsolution.persistence.emap.eMap.EMappingAttribute;
import at.bestsolution.persistence.emap.eMap.EMappingBundle;
import at.bestsolution.persistence.emap.eMap.EMappingEntity;
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef;
import at.bestsolution.persistence.emap.eMap.ENamedQuery;
import at.bestsolution.persistence.emap.eMap.EObjectSection;
import at.bestsolution.persistence.emap.eMap.EParameter;
import at.bestsolution.persistence.emap.eMap.EQuery;
import at.bestsolution.persistence.emap.eMap.EType;
import at.bestsolution.persistence.emap.eMap.Import;
import at.bestsolution.persistence.emap.eMap.PackageDeclaration;
import at.bestsolution.persistence.emap.services.EMapGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EMapSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EMapGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EMapPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EMapPackage.EATTRIBUTE:
				if(context == grammarAccess.getEAttributeRule()) {
					sequence_EAttribute(context, (EAttribute) semanticObject); 
					return; 
				}
				else break;
			case EMapPackage.EMAPPING:
				if(context == grammarAccess.getEMappingRule()) {
					sequence_EMapping(context, (EMapping) semanticObject); 
					return; 
				}
				else break;
			case EMapPackage.EMAPPING_ATTRIBUTE:
				if(context == grammarAccess.getEMappingAttributeRule()) {
					sequence_EMappingAttribute(context, (EMappingAttribute) semanticObject); 
					return; 
				}
				else break;
			case EMapPackage.EMAPPING_BUNDLE:
				if(context == grammarAccess.getEMappingBundleRule()) {
					sequence_EMappingBundle(context, (EMappingBundle) semanticObject); 
					return; 
				}
				else break;
			case EMapPackage.EMAPPING_ENTITY:
				if(context == grammarAccess.getEMappingEntityRule()) {
					sequence_EMappingEntity(context, (EMappingEntity) semanticObject); 
					return; 
				}
				else break;
			case EMapPackage.EMAPPING_ENTITY_DEF:
				if(context == grammarAccess.getEMappingEntityDefRule()) {
					sequence_EMappingEntityDef(context, (EMappingEntityDef) semanticObject); 
					return; 
				}
				else break;
			case EMapPackage.ENAMED_QUERY:
				if(context == grammarAccess.getENamedQueryRule()) {
					sequence_ENamedQuery(context, (ENamedQuery) semanticObject); 
					return; 
				}
				else break;
			case EMapPackage.EOBJECT_SECTION:
				if(context == grammarAccess.getEObjectSectionRule()) {
					sequence_EObjectSection(context, (EObjectSection) semanticObject); 
					return; 
				}
				else break;
			case EMapPackage.EPARAMETER:
				if(context == grammarAccess.getEParameterRule()) {
					sequence_EParameter(context, (EParameter) semanticObject); 
					return; 
				}
				else break;
			case EMapPackage.EQUERY:
				if(context == grammarAccess.getEQueryRule()) {
					sequence_EQuery(context, (EQuery) semanticObject); 
					return; 
				}
				else break;
			case EMapPackage.ETYPE:
				if(context == grammarAccess.getETypeRule()) {
					sequence_EType(context, (EType) semanticObject); 
					return; 
				}
				else break;
			case EMapPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case EMapPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getPackageDeclarationRule()) {
					sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (pk?='primarykey'? property=ID (columnName=ID | (resolved?='resolve' query=[ENamedQuery|QualifiedName] parameters+=ID)))
	 */
	protected void sequence_EAttribute(EObject context, EAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pk?='primarykey'? property=QualifiedName (columnName=ID | (entity=[ENamedQuery|QualifiedName] parameters+=ID) | map=EObjectSection))
	 */
	protected void sequence_EMappingAttribute(EObject context, EMappingAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* name=ID entities+=[EMappingEntity|ID] entities+=[EMappingEntity|ID]*)
	 */
	protected void sequence_EMappingBundle(EObject context, EMappingBundle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (package=PackageDeclaration imports+=Import* entity=EMappingEntity)
	 */
	protected void sequence_EMappingEntityDef(EObject context, EMappingEntityDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         name=ID 
	 *         ((extensionType='extends' | extensionType='derived') parent=[EMappingEntity|QualifiedName])? 
	 *         etype=EType 
	 *         attributes+=EAttribute 
	 *         attributes+=EAttribute* 
	 *         (namedQueries+=ENamedQuery namedQueries+=ENamedQuery*)? 
	 *         tableName=ID?
	 *     )
	 */
	protected void sequence_EMappingEntity(EObject context, EMappingEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (root=EMappingBundle | root=EMappingEntityDef)
	 */
	protected void sequence_EMapping(EObject context, EMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameters+=EParameter* queries+=EQuery)
	 */
	protected void sequence_ENamedQuery(EObject context, ENamedQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entity=[EMappingEntity|ID] (prefix=ID (attributes+=EMappingAttribute attributes+=EMappingAttribute*)?)?)
	 */
	protected void sequence_EObjectSection(EObject context, EObjectSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ID name=ID)
	 */
	protected void sequence_EParameter(EObject context, EParameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EMapPackage.Literals.EPARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EMapPackage.Literals.EPARAMETER__TYPE));
			if(transientValues.isValueTransient(semanticObject, EMapPackage.Literals.EPARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EMapPackage.Literals.EPARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEParameterAccess().getTypeIDTerminalRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getEParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((dbType='default' | dbType=STRING) mapping=EObjectSection ((from=STRING where=STRING? groupBy=STRING? orderby=STRING?) | all=STRING))
	 */
	protected void sequence_EQuery(EObject context, EQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (url=STRING name=ID)
	 */
	protected void sequence_EType(EObject context, EType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EMapPackage.Literals.ETYPE__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EMapPackage.Literals.ETYPE__URL));
			if(transientValues.isValueTransient(semanticObject, EMapPackage.Literals.ETYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EMapPackage.Literals.ETYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getETypeAccess().getUrlSTRINGTerminalRuleCall_1_0(), semanticObject.getUrl());
		feeder.accept(grammarAccess.getETypeAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (importedNamespace=QualifiedNameWithWildcard | importedNamespace=QualifiedName)
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EMapPackage.Literals.PACKAGE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EMapPackage.Literals.PACKAGE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}

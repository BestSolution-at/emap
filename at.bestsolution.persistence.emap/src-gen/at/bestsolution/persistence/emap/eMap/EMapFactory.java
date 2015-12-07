/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage
 * @generated
 */
public interface EMapFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EMapFactory eINSTANCE = at.bestsolution.persistence.emap.eMap.impl.EMapFactoryImpl.init();

  /**
   * Returns a new object of class '<em>EMapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMapping</em>'.
   * @generated
   */
  EMapping createEMapping();

  /**
   * Returns a new object of class '<em>EMapping Bundle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMapping Bundle</em>'.
   * @generated
   */
  EMappingBundle createEMappingBundle();

  /**
   * Returns a new object of class '<em>EPredef</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EPredef</em>'.
   * @generated
   */
  EPredef createEPredef();

  /**
   * Returns a new object of class '<em>EGenerator Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EGenerator Def</em>'.
   * @generated
   */
  EGeneratorDef createEGeneratorDef();

  /**
   * Returns a new object of class '<em>EGenerator Config Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EGenerator Config Value</em>'.
   * @generated
   */
  EGeneratorConfigValue createEGeneratorConfigValue();

  /**
   * Returns a new object of class '<em>EBundle Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EBundle Entity</em>'.
   * @generated
   */
  EBundleEntity createEBundleEntity();

  /**
   * Returns a new object of class '<em>EIndex</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EIndex</em>'.
   * @generated
   */
  EIndex createEIndex();

  /**
   * Returns a new object of class '<em>EFk Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EFk Constraint</em>'.
   * @generated
   */
  EFkConstraint createEFkConstraint();

  /**
   * Returns a new object of class '<em>EUnique Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EUnique Constraint</em>'.
   * @generated
   */
  EUniqueConstraint createEUniqueConstraint();

  /**
   * Returns a new object of class '<em>ESQL Att Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ESQL Att Type Def</em>'.
   * @generated
   */
  ESQLAttTypeDef createESQLAttTypeDef();

  /**
   * Returns a new object of class '<em>ESQL Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ESQL Type Def</em>'.
   * @generated
   */
  ESQLTypeDef createESQLTypeDef();

  /**
   * Returns a new object of class '<em>ESQL Db Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ESQL Db Type</em>'.
   * @generated
   */
  ESQLDbType createESQLDbType();

  /**
   * Returns a new object of class '<em>ERest Service Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ERest Service Mapping</em>'.
   * @generated
   */
  ERestServiceMapping createERestServiceMapping();

  /**
   * Returns a new object of class '<em>ENamed Service Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ENamed Service Query</em>'.
   * @generated
   */
  ENamedServiceQuery createENamedServiceQuery();

  /**
   * Returns a new object of class '<em>ECustom Service Methods</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECustom Service Methods</em>'.
   * @generated
   */
  ECustomServiceMethods createECustomServiceMethods();

  /**
   * Returns a new object of class '<em>EGreedy Attribute Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EGreedy Attribute Path</em>'.
   * @generated
   */
  EGreedyAttributePath createEGreedyAttributePath();

  /**
   * Returns a new object of class '<em>EService Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EService Param</em>'.
   * @generated
   */
  EServiceParam createEServiceParam();

  /**
   * Returns a new object of class '<em>EPath Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EPath Param</em>'.
   * @generated
   */
  EPathParam createEPathParam();

  /**
   * Returns a new object of class '<em>EQuery Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EQuery Param</em>'.
   * @generated
   */
  EQueryParam createEQueryParam();

  /**
   * Returns a new object of class '<em>EMapping Entity Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMapping Entity Def</em>'.
   * @generated
   */
  EMappingEntityDef createEMappingEntityDef();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Declaration</em>'.
   * @generated
   */
  PackageDeclaration createPackageDeclaration();

  /**
   * Returns a new object of class '<em>EMapping Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMapping Entity</em>'.
   * @generated
   */
  EMappingEntity createEMappingEntity();

  /**
   * Returns a new object of class '<em>EAttribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EAttribute</em>'.
   * @generated
   */
  EAttribute createEAttribute();

  /**
   * Returns a new object of class '<em>EValue Generator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EValue Generator</em>'.
   * @generated
   */
  EValueGenerator createEValueGenerator();

  /**
   * Returns a new object of class '<em>ENamed Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ENamed Query</em>'.
   * @generated
   */
  ENamedQuery createENamedQuery();

  /**
   * Returns a new object of class '<em>ENamed Custom Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ENamed Custom Query</em>'.
   * @generated
   */
  ENamedCustomQuery createENamedCustomQuery();

  /**
   * Returns a new object of class '<em>EReturn Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EReturn Type</em>'.
   * @generated
   */
  EReturnType createEReturnType();

  /**
   * Returns a new object of class '<em>EPredefined Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EPredefined Type</em>'.
   * @generated
   */
  EPredefinedType createEPredefinedType();

  /**
   * Returns a new object of class '<em>EType Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EType Def</em>'.
   * @generated
   */
  ETypeDef createETypeDef();

  /**
   * Returns a new object of class '<em>EModel Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EModel Type Def</em>'.
   * @generated
   */
  EModelTypeDef createEModelTypeDef();

  /**
   * Returns a new object of class '<em>EModel Type Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EModel Type Attribute</em>'.
   * @generated
   */
  EModelTypeAttribute createEModelTypeAttribute();

  /**
   * Returns a new object of class '<em>EValue Type Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EValue Type Attribute</em>'.
   * @generated
   */
  EValueTypeAttribute createEValueTypeAttribute();

  /**
   * Returns a new object of class '<em>EParameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EParameter</em>'.
   * @generated
   */
  EParameter createEParameter();

  /**
   * Returns a new object of class '<em>EQuery</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EQuery</em>'.
   * @generated
   */
  EQuery createEQuery();

  /**
   * Returns a new object of class '<em>ECustom Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ECustom Query</em>'.
   * @generated
   */
  ECustomQuery createECustomQuery();

  /**
   * Returns a new object of class '<em>EObject Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EObject Section</em>'.
   * @generated
   */
  EObjectSection createEObjectSection();

  /**
   * Returns a new object of class '<em>EMapping Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EMapping Attribute</em>'.
   * @generated
   */
  EMappingAttribute createEMappingAttribute();

  /**
   * Returns a new object of class '<em>EType</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EType</em>'.
   * @generated
   */
  EType createEType();

  /**
   * Returns a new object of class '<em>EPredef Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EPredef Sequence</em>'.
   * @generated
   */
  EPredefSequence createEPredefSequence();

  /**
   * Returns a new object of class '<em>EPredef Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EPredef Table</em>'.
   * @generated
   */
  EPredefTable createEPredefTable();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EMapPackage getEMapPackage();

} //EMapFactory

/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.persistence.emap.eMap.EMapFactory
 * @model kind="package"
 * @generated
 */
public interface EMapPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eMap";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/persistence/emap/EMap";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "eMap";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EMapPackage eINSTANCE = at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EMappingImpl <em>EMapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EMappingImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEMapping()
   * @generated
   */
  int EMAPPING = 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING__ROOT = 0;

  /**
   * The number of structural features of the '<em>EMapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EMappingBundleImpl <em>EMapping Bundle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EMappingBundleImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEMappingBundle()
   * @generated
   */
  int EMAPPING_BUNDLE = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_BUNDLE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_BUNDLE__NAME = 1;

  /**
   * The feature id for the '<em><b>Entities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_BUNDLE__ENTITIES = 2;

  /**
   * The number of structural features of the '<em>EMapping Bundle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_BUNDLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityDefImpl <em>EMapping Entity Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EMappingEntityDefImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEMappingEntityDef()
   * @generated
   */
  int EMAPPING_ENTITY_DEF = 2;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY_DEF__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY_DEF__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY_DEF__ENTITY = 2;

  /**
   * The number of structural features of the '<em>EMapping Entity Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.ImportImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.PackageDeclarationImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl <em>EMapping Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEMappingEntity()
   * @generated
   */
  int EMAPPING_ENTITY = 5;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY__ABSTRACT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY__NAME = 1;

  /**
   * The feature id for the '<em><b>Extension Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY__EXTENSION_TYPE = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY__PARENT = 3;

  /**
   * The feature id for the '<em><b>Etype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY__ETYPE = 4;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY__ATTRIBUTES = 5;

  /**
   * The feature id for the '<em><b>Named Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY__NAMED_QUERIES = 6;

  /**
   * The feature id for the '<em><b>Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY__TABLE_NAME = 7;

  /**
   * The number of structural features of the '<em>EMapping Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl <em>EAttribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEAttribute()
   * @generated
   */
  int EATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Pk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__PK = 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__PROPERTY = 1;

  /**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__COLUMN_NAME = 2;

  /**
   * The feature id for the '<em><b>Resolved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__RESOLVED = 3;

  /**
   * The feature id for the '<em><b>Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__QUERY = 4;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__PARAMETERS = 5;

  /**
   * The number of structural features of the '<em>EAttribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.ENamedQueryImpl <em>ENamed Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.ENamedQueryImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getENamedQuery()
   * @generated
   */
  int ENAMED_QUERY = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_QUERY__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_QUERY__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_QUERY__QUERIES = 2;

  /**
   * The number of structural features of the '<em>ENamed Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_QUERY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EParameterImpl <em>EParameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EParameterImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEParameter()
   * @generated
   */
  int EPARAMETER = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>EParameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EQueryImpl <em>EQuery</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EQueryImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEQuery()
   * @generated
   */
  int EQUERY = 9;

  /**
   * The feature id for the '<em><b>Db Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUERY__DB_TYPE = 0;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUERY__MAPPING = 1;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUERY__FROM = 2;

  /**
   * The feature id for the '<em><b>Where</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUERY__WHERE = 3;

  /**
   * The feature id for the '<em><b>Group By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUERY__GROUP_BY = 4;

  /**
   * The feature id for the '<em><b>Orderby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUERY__ORDERBY = 5;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUERY__ALL = 6;

  /**
   * The number of structural features of the '<em>EQuery</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUERY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EObjectSectionImpl <em>EObject Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EObjectSectionImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEObjectSection()
   * @generated
   */
  int EOBJECT_SECTION = 10;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOBJECT_SECTION__ENTITY = 0;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOBJECT_SECTION__PREFIX = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOBJECT_SECTION__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>EObject Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOBJECT_SECTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl <em>EMapping Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEMappingAttribute()
   * @generated
   */
  int EMAPPING_ATTRIBUTE = 11;

  /**
   * The feature id for the '<em><b>Pk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ATTRIBUTE__PK = 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ATTRIBUTE__PROPERTY = 1;

  /**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ATTRIBUTE__COLUMN_NAME = 2;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ATTRIBUTE__ENTITY = 3;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ATTRIBUTE__PARAMETERS = 4;

  /**
   * The feature id for the '<em><b>Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ATTRIBUTE__MAP = 5;

  /**
   * The number of structural features of the '<em>EMapping Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ATTRIBUTE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.ETypeImpl <em>EType</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.ETypeImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEType()
   * @generated
   */
  int ETYPE = 12;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPE__URL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPE__NAME = 1;

  /**
   * The number of structural features of the '<em>EType</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EMapping <em>EMapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EMapping</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMapping
   * @generated
   */
  EClass getEMapping();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.persistence.emap.eMap.EMapping#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMapping#getRoot()
   * @see #getEMapping()
   * @generated
   */
  EReference getEMapping_Root();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle <em>EMapping Bundle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EMapping Bundle</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingBundle
   * @generated
   */
  EClass getEMappingBundle();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingBundle#getImports()
   * @see #getEMappingBundle()
   * @generated
   */
  EReference getEMappingBundle_Imports();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingBundle#getName()
   * @see #getEMappingBundle()
   * @generated
   */
  EAttribute getEMappingBundle_Name();

  /**
   * Returns the meta object for the reference list '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Entities</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingBundle#getEntities()
   * @see #getEMappingBundle()
   * @generated
   */
  EReference getEMappingBundle_Entities();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EMappingEntityDef <em>EMapping Entity Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EMapping Entity Def</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntityDef
   * @generated
   */
  EClass getEMappingEntityDef();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.persistence.emap.eMap.EMappingEntityDef#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntityDef#getPackage()
   * @see #getEMappingEntityDef()
   * @generated
   */
  EReference getEMappingEntityDef_Package();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EMappingEntityDef#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntityDef#getImports()
   * @see #getEMappingEntityDef()
   * @generated
   */
  EReference getEMappingEntityDef_Imports();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.persistence.emap.eMap.EMappingEntityDef#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntityDef#getEntity()
   * @see #getEMappingEntityDef()
   * @generated
   */
  EReference getEMappingEntityDef_Entity();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see at.bestsolution.persistence.emap.eMap.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see at.bestsolution.persistence.emap.eMap.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see at.bestsolution.persistence.emap.eMap.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity <em>EMapping Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EMapping Entity</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntity
   * @generated
   */
  EClass getEMappingEntity();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntity#isAbstract()
   * @see #getEMappingEntity()
   * @generated
   */
  EAttribute getEMappingEntity_Abstract();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntity#getName()
   * @see #getEMappingEntity()
   * @generated
   */
  EAttribute getEMappingEntity_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getExtensionType <em>Extension Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension Type</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntity#getExtensionType()
   * @see #getEMappingEntity()
   * @generated
   */
  EAttribute getEMappingEntity_ExtensionType();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntity#getParent()
   * @see #getEMappingEntity()
   * @generated
   */
  EReference getEMappingEntity_Parent();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getEtype <em>Etype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Etype</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntity#getEtype()
   * @see #getEMappingEntity()
   * @generated
   */
  EReference getEMappingEntity_Etype();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntity#getAttributes()
   * @see #getEMappingEntity()
   * @generated
   */
  EReference getEMappingEntity_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getNamedQueries <em>Named Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Named Queries</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntity#getNamedQueries()
   * @see #getEMappingEntity()
   * @generated
   */
  EReference getEMappingEntity_NamedQueries();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getTableName <em>Table Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntity#getTableName()
   * @see #getEMappingEntity()
   * @generated
   */
  EAttribute getEMappingEntity_TableName();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EAttribute <em>EAttribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EAttribute</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute
   * @generated
   */
  EClass getEAttribute();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EAttribute#isPk <em>Pk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute#isPk()
   * @see #getEAttribute()
   * @generated
   */
  EAttribute getEAttribute_Pk();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute#getProperty()
   * @see #getEAttribute()
   * @generated
   */
  EAttribute getEAttribute_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getColumnName <em>Column Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute#getColumnName()
   * @see #getEAttribute()
   * @generated
   */
  EAttribute getEAttribute_ColumnName();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EAttribute#isResolved <em>Resolved</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resolved</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute#isResolved()
   * @see #getEAttribute()
   * @generated
   */
  EAttribute getEAttribute_Resolved();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Query</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute#getQuery()
   * @see #getEAttribute()
   * @generated
   */
  EReference getEAttribute_Query();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute#getParameters()
   * @see #getEAttribute()
   * @generated
   */
  EAttribute getEAttribute_Parameters();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.ENamedQuery <em>ENamed Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ENamed Query</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedQuery
   * @generated
   */
  EClass getENamedQuery();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ENamedQuery#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedQuery#getName()
   * @see #getENamedQuery()
   * @generated
   */
  EAttribute getENamedQuery_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.ENamedQuery#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedQuery#getParameters()
   * @see #getENamedQuery()
   * @generated
   */
  EReference getENamedQuery_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.ENamedQuery#getQueries <em>Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queries</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedQuery#getQueries()
   * @see #getENamedQuery()
   * @generated
   */
  EReference getENamedQuery_Queries();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EParameter <em>EParameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EParameter</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EParameter
   * @generated
   */
  EClass getEParameter();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EParameter#getType()
   * @see #getEParameter()
   * @generated
   */
  EAttribute getEParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EParameter#getName()
   * @see #getEParameter()
   * @generated
   */
  EAttribute getEParameter_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EQuery <em>EQuery</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EQuery</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EQuery
   * @generated
   */
  EClass getEQuery();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EQuery#getDbType <em>Db Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Type</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EQuery#getDbType()
   * @see #getEQuery()
   * @generated
   */
  EAttribute getEQuery_DbType();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.persistence.emap.eMap.EQuery#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EQuery#getMapping()
   * @see #getEQuery()
   * @generated
   */
  EReference getEQuery_Mapping();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EQuery#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EQuery#getFrom()
   * @see #getEQuery()
   * @generated
   */
  EAttribute getEQuery_From();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EQuery#getWhere <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Where</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EQuery#getWhere()
   * @see #getEQuery()
   * @generated
   */
  EAttribute getEQuery_Where();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EQuery#getGroupBy <em>Group By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group By</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EQuery#getGroupBy()
   * @see #getEQuery()
   * @generated
   */
  EAttribute getEQuery_GroupBy();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EQuery#getOrderby <em>Orderby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orderby</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EQuery#getOrderby()
   * @see #getEQuery()
   * @generated
   */
  EAttribute getEQuery_Orderby();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EQuery#getAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EQuery#getAll()
   * @see #getEQuery()
   * @generated
   */
  EAttribute getEQuery_All();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EObjectSection <em>EObject Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EObject Section</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EObjectSection
   * @generated
   */
  EClass getEObjectSection();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.EObjectSection#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EObjectSection#getEntity()
   * @see #getEObjectSection()
   * @generated
   */
  EReference getEObjectSection_Entity();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EObjectSection#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EObjectSection#getPrefix()
   * @see #getEObjectSection()
   * @generated
   */
  EAttribute getEObjectSection_Prefix();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EObjectSection#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EObjectSection#getAttributes()
   * @see #getEObjectSection()
   * @generated
   */
  EReference getEObjectSection_Attributes();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute <em>EMapping Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EMapping Attribute</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingAttribute
   * @generated
   */
  EClass getEMappingAttribute();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#isPk <em>Pk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingAttribute#isPk()
   * @see #getEMappingAttribute()
   * @generated
   */
  EAttribute getEMappingAttribute_Pk();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingAttribute#getProperty()
   * @see #getEMappingAttribute()
   * @generated
   */
  EAttribute getEMappingAttribute_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getColumnName <em>Column Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingAttribute#getColumnName()
   * @see #getEMappingAttribute()
   * @generated
   */
  EAttribute getEMappingAttribute_ColumnName();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingAttribute#getEntity()
   * @see #getEMappingAttribute()
   * @generated
   */
  EReference getEMappingAttribute_Entity();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingAttribute#getParameters()
   * @see #getEMappingAttribute()
   * @generated
   */
  EAttribute getEMappingAttribute_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getMap <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingAttribute#getMap()
   * @see #getEMappingAttribute()
   * @generated
   */
  EReference getEMappingAttribute_Map();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EType <em>EType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EType</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EType
   * @generated
   */
  EClass getEType();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EType#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EType#getUrl()
   * @see #getEType()
   * @generated
   */
  EAttribute getEType_Url();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EType#getName()
   * @see #getEType()
   * @generated
   */
  EAttribute getEType_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EMapFactory getEMapFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EMappingImpl <em>EMapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EMappingImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEMapping()
     * @generated
     */
    EClass EMAPPING = eINSTANCE.getEMapping();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING__ROOT = eINSTANCE.getEMapping_Root();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EMappingBundleImpl <em>EMapping Bundle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EMappingBundleImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEMappingBundle()
     * @generated
     */
    EClass EMAPPING_BUNDLE = eINSTANCE.getEMappingBundle();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_BUNDLE__IMPORTS = eINSTANCE.getEMappingBundle_Imports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_BUNDLE__NAME = eINSTANCE.getEMappingBundle_Name();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_BUNDLE__ENTITIES = eINSTANCE.getEMappingBundle_Entities();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityDefImpl <em>EMapping Entity Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EMappingEntityDefImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEMappingEntityDef()
     * @generated
     */
    EClass EMAPPING_ENTITY_DEF = eINSTANCE.getEMappingEntityDef();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_ENTITY_DEF__PACKAGE = eINSTANCE.getEMappingEntityDef_Package();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_ENTITY_DEF__IMPORTS = eINSTANCE.getEMappingEntityDef_Imports();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_ENTITY_DEF__ENTITY = eINSTANCE.getEMappingEntityDef_Entity();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.ImportImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.PackageDeclarationImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl <em>EMapping Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEMappingEntity()
     * @generated
     */
    EClass EMAPPING_ENTITY = eINSTANCE.getEMappingEntity();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_ENTITY__ABSTRACT = eINSTANCE.getEMappingEntity_Abstract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_ENTITY__NAME = eINSTANCE.getEMappingEntity_Name();

    /**
     * The meta object literal for the '<em><b>Extension Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_ENTITY__EXTENSION_TYPE = eINSTANCE.getEMappingEntity_ExtensionType();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_ENTITY__PARENT = eINSTANCE.getEMappingEntity_Parent();

    /**
     * The meta object literal for the '<em><b>Etype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_ENTITY__ETYPE = eINSTANCE.getEMappingEntity_Etype();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_ENTITY__ATTRIBUTES = eINSTANCE.getEMappingEntity_Attributes();

    /**
     * The meta object literal for the '<em><b>Named Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_ENTITY__NAMED_QUERIES = eINSTANCE.getEMappingEntity_NamedQueries();

    /**
     * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_ENTITY__TABLE_NAME = eINSTANCE.getEMappingEntity_TableName();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl <em>EAttribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEAttribute()
     * @generated
     */
    EClass EATTRIBUTE = eINSTANCE.getEAttribute();

    /**
     * The meta object literal for the '<em><b>Pk</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EATTRIBUTE__PK = eINSTANCE.getEAttribute_Pk();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EATTRIBUTE__PROPERTY = eINSTANCE.getEAttribute_Property();

    /**
     * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EATTRIBUTE__COLUMN_NAME = eINSTANCE.getEAttribute_ColumnName();

    /**
     * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EATTRIBUTE__RESOLVED = eINSTANCE.getEAttribute_Resolved();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EATTRIBUTE__QUERY = eINSTANCE.getEAttribute_Query();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EATTRIBUTE__PARAMETERS = eINSTANCE.getEAttribute_Parameters();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.ENamedQueryImpl <em>ENamed Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.ENamedQueryImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getENamedQuery()
     * @generated
     */
    EClass ENAMED_QUERY = eINSTANCE.getENamedQuery();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENAMED_QUERY__NAME = eINSTANCE.getENamedQuery_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENAMED_QUERY__PARAMETERS = eINSTANCE.getENamedQuery_Parameters();

    /**
     * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENAMED_QUERY__QUERIES = eINSTANCE.getENamedQuery_Queries();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EParameterImpl <em>EParameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EParameterImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEParameter()
     * @generated
     */
    EClass EPARAMETER = eINSTANCE.getEParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EPARAMETER__TYPE = eINSTANCE.getEParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EPARAMETER__NAME = eINSTANCE.getEParameter_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EQueryImpl <em>EQuery</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EQueryImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEQuery()
     * @generated
     */
    EClass EQUERY = eINSTANCE.getEQuery();

    /**
     * The meta object literal for the '<em><b>Db Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUERY__DB_TYPE = eINSTANCE.getEQuery_DbType();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUERY__MAPPING = eINSTANCE.getEQuery_Mapping();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUERY__FROM = eINSTANCE.getEQuery_From();

    /**
     * The meta object literal for the '<em><b>Where</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUERY__WHERE = eINSTANCE.getEQuery_Where();

    /**
     * The meta object literal for the '<em><b>Group By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUERY__GROUP_BY = eINSTANCE.getEQuery_GroupBy();

    /**
     * The meta object literal for the '<em><b>Orderby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUERY__ORDERBY = eINSTANCE.getEQuery_Orderby();

    /**
     * The meta object literal for the '<em><b>All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUERY__ALL = eINSTANCE.getEQuery_All();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EObjectSectionImpl <em>EObject Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EObjectSectionImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEObjectSection()
     * @generated
     */
    EClass EOBJECT_SECTION = eINSTANCE.getEObjectSection();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EOBJECT_SECTION__ENTITY = eINSTANCE.getEObjectSection_Entity();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EOBJECT_SECTION__PREFIX = eINSTANCE.getEObjectSection_Prefix();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EOBJECT_SECTION__ATTRIBUTES = eINSTANCE.getEObjectSection_Attributes();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl <em>EMapping Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEMappingAttribute()
     * @generated
     */
    EClass EMAPPING_ATTRIBUTE = eINSTANCE.getEMappingAttribute();

    /**
     * The meta object literal for the '<em><b>Pk</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_ATTRIBUTE__PK = eINSTANCE.getEMappingAttribute_Pk();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_ATTRIBUTE__PROPERTY = eINSTANCE.getEMappingAttribute_Property();

    /**
     * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_ATTRIBUTE__COLUMN_NAME = eINSTANCE.getEMappingAttribute_ColumnName();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_ATTRIBUTE__ENTITY = eINSTANCE.getEMappingAttribute_Entity();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_ATTRIBUTE__PARAMETERS = eINSTANCE.getEMappingAttribute_Parameters();

    /**
     * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_ATTRIBUTE__MAP = eINSTANCE.getEMappingAttribute_Map();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.ETypeImpl <em>EType</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.ETypeImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEType()
     * @generated
     */
    EClass ETYPE = eINSTANCE.getEType();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ETYPE__URL = eINSTANCE.getEType_Url();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ETYPE__NAME = eINSTANCE.getEType_Name();

  }

} //EMapPackage

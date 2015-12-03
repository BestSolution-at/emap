/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The feature id for the '<em><b>Parent Bundle</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_BUNDLE__PARENT_BUNDLE = 2;

  /**
   * The feature id for the '<em><b>Predef</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_BUNDLE__PREDEF = 3;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_BUNDLE__ENTITIES = 4;

  /**
   * The feature id for the '<em><b>Type Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_BUNDLE__TYPE_DEFS = 5;

  /**
   * The feature id for the '<em><b>Generators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_BUNDLE__GENERATORS = 6;

  /**
   * The feature id for the '<em><b>Databases</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_BUNDLE__DATABASES = 7;

  /**
   * The feature id for the '<em><b>Col Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_BUNDLE__COL_SORT = 8;

  /**
   * The number of structural features of the '<em>EMapping Bundle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_BUNDLE_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EPredefImpl <em>EPredef</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EPredefImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEPredef()
   * @generated
   */
  int EPREDEF = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPREDEF__NAME = 0;

  /**
   * The number of structural features of the '<em>EPredef</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPREDEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EGeneratorDefImpl <em>EGenerator Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EGeneratorDefImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEGeneratorDef()
   * @generated
   */
  int EGENERATOR_DEF = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EGENERATOR_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EGENERATOR_DEF__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>EGenerator Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EGENERATOR_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EGeneratorConfigValueImpl <em>EGenerator Config Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EGeneratorConfigValueImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEGeneratorConfigValue()
   * @generated
   */
  int EGENERATOR_CONFIG_VALUE = 4;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EGENERATOR_CONFIG_VALUE__KEY = 0;

  /**
   * The feature id for the '<em><b>Simple Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EGENERATOR_CONFIG_VALUE__SIMPLE_VALUE = 1;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EGENERATOR_CONFIG_VALUE__CHILDREN = 2;

  /**
   * The number of structural features of the '<em>EGenerator Config Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EGENERATOR_CONFIG_VALUE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EBundleEntityImpl <em>EBundle Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EBundleEntityImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEBundleEntity()
   * @generated
   */
  int EBUNDLE_ENTITY = 5;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBUNDLE_ENTITY__ENTITY = 0;

  /**
   * The feature id for the '<em><b>Pk Constraint Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBUNDLE_ENTITY__PK_CONSTRAINT_NAME = 1;

  /**
   * The feature id for the '<em><b>Fk Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBUNDLE_ENTITY__FK_CONSTRAINTS = 2;

  /**
   * The feature id for the '<em><b>Unique Contraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBUNDLE_ENTITY__UNIQUE_CONTRAINTS = 3;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBUNDLE_ENTITY__INDICES = 4;

  /**
   * The feature id for the '<em><b>Type Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBUNDLE_ENTITY__TYPE_DEFS = 5;

  /**
   * The feature id for the '<em><b>Rest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBUNDLE_ENTITY__REST = 6;

  /**
   * The number of structural features of the '<em>EBundle Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBUNDLE_ENTITY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EIndexImpl <em>EIndex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EIndexImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEIndex()
   * @generated
   */
  int EINDEX = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EINDEX__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EINDEX__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>EIndex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EINDEX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EFkConstraintImpl <em>EFk Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EFkConstraintImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEFkConstraint()
   * @generated
   */
  int EFK_CONSTRAINT = 7;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFK_CONSTRAINT__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFK_CONSTRAINT__NAME = 1;

  /**
   * The number of structural features of the '<em>EFk Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFK_CONSTRAINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EUniqueConstraintImpl <em>EUnique Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EUniqueConstraintImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEUniqueConstraint()
   * @generated
   */
  int EUNIQUE_CONSTRAINT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUNIQUE_CONSTRAINT__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUNIQUE_CONSTRAINT__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>EUnique Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EUNIQUE_CONSTRAINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.ESQLAttTypeDefImpl <em>ESQL Att Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.ESQLAttTypeDefImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getESQLAttTypeDef()
   * @generated
   */
  int ESQL_ATT_TYPE_DEF = 9;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESQL_ATT_TYPE_DEF__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Db Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESQL_ATT_TYPE_DEF__DB_TYPES = 1;

  /**
   * The number of structural features of the '<em>ESQL Att Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESQL_ATT_TYPE_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.ESQLTypeDefImpl <em>ESQL Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.ESQLTypeDefImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getESQLTypeDef()
   * @generated
   */
  int ESQL_TYPE_DEF = 10;

  /**
   * The feature id for the '<em><b>Etype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESQL_TYPE_DEF__ETYPE = 0;

  /**
   * The feature id for the '<em><b>Db Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESQL_TYPE_DEF__DB_TYPES = 1;

  /**
   * The number of structural features of the '<em>ESQL Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESQL_TYPE_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.ESQLDbTypeImpl <em>ESQL Db Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.ESQLDbTypeImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getESQLDbType()
   * @generated
   */
  int ESQL_DB_TYPE = 11;

  /**
   * The feature id for the '<em><b>Db Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESQL_DB_TYPE__DB_TYPE = 0;

  /**
   * The feature id for the '<em><b>Sql Type Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESQL_DB_TYPE__SQL_TYPE_DEF = 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESQL_DB_TYPE__SIZE = 2;

  /**
   * The number of structural features of the '<em>ESQL Db Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESQL_DB_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.ERestServiceMappingImpl <em>ERest Service Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.ERestServiceMappingImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getERestServiceMapping()
   * @generated
   */
  int EREST_SERVICE_MAPPING = 12;

  /**
   * The feature id for the '<em><b>Service Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREST_SERVICE_MAPPING__SERVICE_METHODS = 0;

  /**
   * The feature id for the '<em><b>Rest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREST_SERVICE_MAPPING__REST = 1;

  /**
   * The number of structural features of the '<em>ERest Service Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREST_SERVICE_MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.ENamedServiceQueryImpl <em>ENamed Service Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.ENamedServiceQueryImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getENamedServiceQuery()
   * @generated
   */
  int ENAMED_SERVICE_QUERY = 13;

  /**
   * The feature id for the '<em><b>Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_SERVICE_QUERY__QUERY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_SERVICE_QUERY__NAME = 1;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_SERVICE_QUERY__PATH = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_SERVICE_QUERY__PARAMETERS = 3;

  /**
   * The feature id for the '<em><b>Greedy Attribute Path List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_SERVICE_QUERY__GREEDY_ATTRIBUTE_PATH_LIST = 4;

  /**
   * The number of structural features of the '<em>ENamed Service Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_SERVICE_QUERY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EGreedyAttributePathImpl <em>EGreedy Attribute Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EGreedyAttributePathImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEGreedyAttributePath()
   * @generated
   */
  int EGREEDY_ATTRIBUTE_PATH = 14;

  /**
   * The feature id for the '<em><b>Greedy Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EGREEDY_ATTRIBUTE_PATH__GREEDY_ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Sub Path List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EGREEDY_ATTRIBUTE_PATH__SUB_PATH_LIST = 1;

  /**
   * The number of structural features of the '<em>EGreedy Attribute Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EGREEDY_ATTRIBUTE_PATH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EServiceParamImpl <em>EService Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EServiceParamImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEServiceParam()
   * @generated
   */
  int ESERVICE_PARAM = 15;

  /**
   * The feature id for the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESERVICE_PARAM__PARAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESERVICE_PARAM__NAME = 1;

  /**
   * The number of structural features of the '<em>EService Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESERVICE_PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EPathParamImpl <em>EPath Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EPathParamImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEPathParam()
   * @generated
   */
  int EPATH_PARAM = 16;

  /**
   * The feature id for the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPATH_PARAM__PARAM = ESERVICE_PARAM__PARAM;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPATH_PARAM__NAME = ESERVICE_PARAM__NAME;

  /**
   * The number of structural features of the '<em>EPath Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPATH_PARAM_FEATURE_COUNT = ESERVICE_PARAM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EQueryParamImpl <em>EQuery Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EQueryParamImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEQueryParam()
   * @generated
   */
  int EQUERY_PARAM = 17;

  /**
   * The feature id for the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUERY_PARAM__PARAM = ESERVICE_PARAM__PARAM;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUERY_PARAM__NAME = ESERVICE_PARAM__NAME;

  /**
   * The number of structural features of the '<em>EQuery Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUERY_PARAM_FEATURE_COUNT = ESERVICE_PARAM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityDefImpl <em>EMapping Entity Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EMappingEntityDefImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEMappingEntityDef()
   * @generated
   */
  int EMAPPING_ENTITY_DEF = 18;

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
  int IMPORT = 19;

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
  int PACKAGE_DECLARATION = 20;

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
  int EMAPPING_ENTITY = 21;

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
   * The feature id for the '<em><b>Named Custom Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY__NAMED_CUSTOM_QUERIES = 7;

  /**
   * The feature id for the '<em><b>Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY__TABLE_NAME = 8;

  /**
   * The feature id for the '<em><b>Descrimination Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY__DESCRIMINATION_COLUMN = 9;

  /**
   * The number of structural features of the '<em>EMapping Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ENTITY_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl <em>EAttribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEAttribute()
   * @generated
   */
  int EATTRIBUTE = 22;

  /**
   * The feature id for the '<em><b>Pk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__PK = 0;

  /**
   * The feature id for the '<em><b>Forced Fk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__FORCED_FK = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__NAME = 2;

  /**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__COLUMN_NAME = 3;

  /**
   * The feature id for the '<em><b>Value Generators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__VALUE_GENERATORS = 4;

  /**
   * The feature id for the '<em><b>Resolved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__RESOLVED = 5;

  /**
   * The feature id for the '<em><b>Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__QUERY = 6;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__PARAMETERS = 7;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__OPPOSITE = 8;

  /**
   * The feature id for the '<em><b>Relation Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__RELATION_TABLE = 9;

  /**
   * The feature id for the '<em><b>Relation Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__RELATION_COLUMN = 10;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE__SIZE = 11;

  /**
   * The number of structural features of the '<em>EAttribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EValueGeneratorImpl <em>EValue Generator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EValueGeneratorImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEValueGenerator()
   * @generated
   */
  int EVALUE_GENERATOR = 23;

  /**
   * The feature id for the '<em><b>Db Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUE_GENERATOR__DB_TYPE = 0;

  /**
   * The feature id for the '<em><b>Autokey</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUE_GENERATOR__AUTOKEY = 1;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUE_GENERATOR__QUERY = 2;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUE_GENERATOR__SEQUENCE = 3;

  /**
   * The number of structural features of the '<em>EValue Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUE_GENERATOR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.ENamedQueryImpl <em>ENamed Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.ENamedQueryImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getENamedQuery()
   * @generated
   */
  int ENAMED_QUERY = 24;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_QUERY__RETURN_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_QUERY__NAME = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_QUERY__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_QUERY__QUERIES = 3;

  /**
   * The number of structural features of the '<em>ENamed Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_QUERY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.ENamedCustomQueryImpl <em>ENamed Custom Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.ENamedCustomQueryImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getENamedCustomQuery()
   * @generated
   */
  int ENAMED_CUSTOM_QUERY = 25;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_CUSTOM_QUERY__RETURN_TYPE = 0;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_CUSTOM_QUERY__LIST = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_CUSTOM_QUERY__NAME = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_CUSTOM_QUERY__PARAMETERS = 3;

  /**
   * The feature id for the '<em><b>Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_CUSTOM_QUERY__QUERIES = 4;

  /**
   * The number of structural features of the '<em>ENamed Custom Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENAMED_CUSTOM_QUERY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EReturnTypeImpl <em>EReturn Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EReturnTypeImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEReturnType()
   * @generated
   */
  int ERETURN_TYPE = 26;

  /**
   * The number of structural features of the '<em>EReturn Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERETURN_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EPredefinedTypeImpl <em>EPredefined Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EPredefinedTypeImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEPredefinedType()
   * @generated
   */
  int EPREDEFINED_TYPE = 27;

  /**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPREDEFINED_TYPE__REF = ERETURN_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>EPredefined Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPREDEFINED_TYPE_FEATURE_COUNT = ERETURN_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.ETypeDefImpl <em>EType Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.ETypeDefImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getETypeDef()
   * @generated
   */
  int ETYPE_DEF = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPE_DEF__NAME = ERETURN_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPE_DEF__TYPES = ERETURN_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>EType Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETYPE_DEF_FEATURE_COUNT = ERETURN_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EModelTypeDefImpl <em>EModel Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EModelTypeDefImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEModelTypeDef()
   * @generated
   */
  int EMODEL_TYPE_DEF = 29;

  /**
   * The feature id for the '<em><b>Eclass Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMODEL_TYPE_DEF__ECLASS_DEF = ERETURN_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMODEL_TYPE_DEF__ATTRIBUTES = ERETURN_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>EModel Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMODEL_TYPE_DEF_FEATURE_COUNT = ERETURN_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EModelTypeAttributeImpl <em>EModel Type Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EModelTypeAttributeImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEModelTypeAttribute()
   * @generated
   */
  int EMODEL_TYPE_ATTRIBUTE = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMODEL_TYPE_ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMODEL_TYPE_ATTRIBUTE__QUERY = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMODEL_TYPE_ATTRIBUTE__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Cached</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMODEL_TYPE_ATTRIBUTE__CACHED = 3;

  /**
   * The feature id for the '<em><b>Cache Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMODEL_TYPE_ATTRIBUTE__CACHE_NAME = 4;

  /**
   * The number of structural features of the '<em>EModel Type Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMODEL_TYPE_ATTRIBUTE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EValueTypeAttributeImpl <em>EValue Type Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EValueTypeAttributeImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEValueTypeAttribute()
   * @generated
   */
  int EVALUE_TYPE_ATTRIBUTE = 31;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUE_TYPE_ATTRIBUTE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUE_TYPE_ATTRIBUTE__NAME = 1;

  /**
   * The number of structural features of the '<em>EValue Type Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUE_TYPE_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EParameterImpl <em>EParameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EParameterImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEParameter()
   * @generated
   */
  int EPARAMETER = 32;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__ID = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__TYPE = 1;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__LIST = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER__NAME = 3;

  /**
   * The number of structural features of the '<em>EParameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPARAMETER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EQueryImpl <em>EQuery</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EQueryImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEQuery()
   * @generated
   */
  int EQUERY = 33;

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
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.ECustomQueryImpl <em>ECustom Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.ECustomQueryImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getECustomQuery()
   * @generated
   */
  int ECUSTOM_QUERY = 34;

  /**
   * The feature id for the '<em><b>Db Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECUSTOM_QUERY__DB_TYPE = 0;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECUSTOM_QUERY__COLUMNS = 1;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECUSTOM_QUERY__FROM = 2;

  /**
   * The feature id for the '<em><b>Where</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECUSTOM_QUERY__WHERE = 3;

  /**
   * The feature id for the '<em><b>Group By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECUSTOM_QUERY__GROUP_BY = 4;

  /**
   * The feature id for the '<em><b>Orderby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECUSTOM_QUERY__ORDERBY = 5;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECUSTOM_QUERY__ALL = 6;

  /**
   * The number of structural features of the '<em>ECustom Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECUSTOM_QUERY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EObjectSectionImpl <em>EObject Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EObjectSectionImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEObjectSection()
   * @generated
   */
  int EOBJECT_SECTION = 35;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOBJECT_SECTION__ENTITY = 0;

  /**
   * The feature id for the '<em><b>Descriminated Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOBJECT_SECTION__DESCRIMINATED_TYPES = 1;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOBJECT_SECTION__PREFIX = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOBJECT_SECTION__ATTRIBUTES = 3;

  /**
   * The number of structural features of the '<em>EObject Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOBJECT_SECTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl <em>EMapping Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEMappingAttribute()
   * @generated
   */
  int EMAPPING_ATTRIBUTE = 36;

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
   * The feature id for the '<em><b>Resolved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ATTRIBUTE__RESOLVED = 3;

  /**
   * The feature id for the '<em><b>Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ATTRIBUTE__QUERY = 4;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ATTRIBUTE__PARAMETERS = 5;

  /**
   * The feature id for the '<em><b>Mapped</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ATTRIBUTE__MAPPED = 6;

  /**
   * The feature id for the '<em><b>Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ATTRIBUTE__MAP = 7;

  /**
   * The number of structural features of the '<em>EMapping Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAPPING_ATTRIBUTE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.ETypeImpl <em>EType</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.ETypeImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEType()
   * @generated
   */
  int ETYPE = 37;

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
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EPredefSequenceImpl <em>EPredef Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EPredefSequenceImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEPredefSequence()
   * @generated
   */
  int EPREDEF_SEQUENCE = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPREDEF_SEQUENCE__NAME = EPREDEF__NAME;

  /**
   * The number of structural features of the '<em>EPredef Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPREDEF_SEQUENCE_FEATURE_COUNT = EPREDEF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.impl.EPredefTableImpl <em>EPredef Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.impl.EPredefTableImpl
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEPredefTable()
   * @generated
   */
  int EPREDEF_TABLE = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPREDEF_TABLE__NAME = EPREDEF__NAME;

  /**
   * The number of structural features of the '<em>EPredef Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPREDEF_TABLE_FEATURE_COUNT = EPREDEF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.ColSort <em>Col Sort</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.ColSort
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getColSort()
   * @generated
   */
  int COL_SORT = 40;

  /**
   * The meta object id for the '{@link at.bestsolution.persistence.emap.eMap.ReturnType <em>Return Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.persistence.emap.eMap.ReturnType
   * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getReturnType()
   * @generated
   */
  int RETURN_TYPE = 41;


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
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getParentBundle <em>Parent Bundle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent Bundle</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingBundle#getParentBundle()
   * @see #getEMappingBundle()
   * @generated
   */
  EReference getEMappingBundle_ParentBundle();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getPredef <em>Predef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Predef</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingBundle#getPredef()
   * @see #getEMappingBundle()
   * @generated
   */
  EReference getEMappingBundle_Predef();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingBundle#getEntities()
   * @see #getEMappingBundle()
   * @generated
   */
  EReference getEMappingBundle_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getTypeDefs <em>Type Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Defs</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingBundle#getTypeDefs()
   * @see #getEMappingBundle()
   * @generated
   */
  EReference getEMappingBundle_TypeDefs();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getGenerators <em>Generators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generators</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingBundle#getGenerators()
   * @see #getEMappingBundle()
   * @generated
   */
  EReference getEMappingBundle_Generators();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getDatabases <em>Databases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Databases</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingBundle#getDatabases()
   * @see #getEMappingBundle()
   * @generated
   */
  EAttribute getEMappingBundle_Databases();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getColSort <em>Col Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Col Sort</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingBundle#getColSort()
   * @see #getEMappingBundle()
   * @generated
   */
  EAttribute getEMappingBundle_ColSort();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EPredef <em>EPredef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EPredef</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EPredef
   * @generated
   */
  EClass getEPredef();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EPredef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EPredef#getName()
   * @see #getEPredef()
   * @generated
   */
  EAttribute getEPredef_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EGeneratorDef <em>EGenerator Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EGenerator Def</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EGeneratorDef
   * @generated
   */
  EClass getEGeneratorDef();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EGeneratorDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EGeneratorDef#getName()
   * @see #getEGeneratorDef()
   * @generated
   */
  EAttribute getEGeneratorDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EGeneratorDef#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EGeneratorDef#getParameters()
   * @see #getEGeneratorDef()
   * @generated
   */
  EReference getEGeneratorDef_Parameters();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue <em>EGenerator Config Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EGenerator Config Value</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue
   * @generated
   */
  EClass getEGeneratorConfigValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue#getKey()
   * @see #getEGeneratorConfigValue()
   * @generated
   */
  EAttribute getEGeneratorConfigValue_Key();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue#getSimpleValue <em>Simple Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simple Value</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue#getSimpleValue()
   * @see #getEGeneratorConfigValue()
   * @generated
   */
  EAttribute getEGeneratorConfigValue_SimpleValue();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue#getChildren()
   * @see #getEGeneratorConfigValue()
   * @generated
   */
  EReference getEGeneratorConfigValue_Children();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EBundleEntity <em>EBundle Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EBundle Entity</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EBundleEntity
   * @generated
   */
  EClass getEBundleEntity();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EBundleEntity#getEntity()
   * @see #getEBundleEntity()
   * @generated
   */
  EReference getEBundleEntity_Entity();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getPkConstraintName <em>Pk Constraint Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk Constraint Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EBundleEntity#getPkConstraintName()
   * @see #getEBundleEntity()
   * @generated
   */
  EAttribute getEBundleEntity_PkConstraintName();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getFkConstraints <em>Fk Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fk Constraints</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EBundleEntity#getFkConstraints()
   * @see #getEBundleEntity()
   * @generated
   */
  EReference getEBundleEntity_FkConstraints();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getUniqueContraints <em>Unique Contraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unique Contraints</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EBundleEntity#getUniqueContraints()
   * @see #getEBundleEntity()
   * @generated
   */
  EReference getEBundleEntity_UniqueContraints();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indices</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EBundleEntity#getIndices()
   * @see #getEBundleEntity()
   * @generated
   */
  EReference getEBundleEntity_Indices();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getTypeDefs <em>Type Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Defs</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EBundleEntity#getTypeDefs()
   * @see #getEBundleEntity()
   * @generated
   */
  EReference getEBundleEntity_TypeDefs();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getRest <em>Rest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rest</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EBundleEntity#getRest()
   * @see #getEBundleEntity()
   * @generated
   */
  EReference getEBundleEntity_Rest();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EIndex <em>EIndex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EIndex</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EIndex
   * @generated
   */
  EClass getEIndex();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EIndex#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EIndex#getName()
   * @see #getEIndex()
   * @generated
   */
  EAttribute getEIndex_Name();

  /**
   * Returns the meta object for the reference list '{@link at.bestsolution.persistence.emap.eMap.EIndex#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Attributes</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EIndex#getAttributes()
   * @see #getEIndex()
   * @generated
   */
  EReference getEIndex_Attributes();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EFkConstraint <em>EFk Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EFk Constraint</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EFkConstraint
   * @generated
   */
  EClass getEFkConstraint();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.EFkConstraint#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EFkConstraint#getAttribute()
   * @see #getEFkConstraint()
   * @generated
   */
  EReference getEFkConstraint_Attribute();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EFkConstraint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EFkConstraint#getName()
   * @see #getEFkConstraint()
   * @generated
   */
  EAttribute getEFkConstraint_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EUniqueConstraint <em>EUnique Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EUnique Constraint</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EUniqueConstraint
   * @generated
   */
  EClass getEUniqueConstraint();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EUniqueConstraint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EUniqueConstraint#getName()
   * @see #getEUniqueConstraint()
   * @generated
   */
  EAttribute getEUniqueConstraint_Name();

  /**
   * Returns the meta object for the reference list '{@link at.bestsolution.persistence.emap.eMap.EUniqueConstraint#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Attributes</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EUniqueConstraint#getAttributes()
   * @see #getEUniqueConstraint()
   * @generated
   */
  EReference getEUniqueConstraint_Attributes();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef <em>ESQL Att Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ESQL Att Type Def</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef
   * @generated
   */
  EClass getESQLAttTypeDef();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef#getAttribute()
   * @see #getESQLAttTypeDef()
   * @generated
   */
  EReference getESQLAttTypeDef_Attribute();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef#getDbTypes <em>Db Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Db Types</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef#getDbTypes()
   * @see #getESQLAttTypeDef()
   * @generated
   */
  EReference getESQLAttTypeDef_DbTypes();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.ESQLTypeDef <em>ESQL Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ESQL Type Def</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ESQLTypeDef
   * @generated
   */
  EClass getESQLTypeDef();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.persistence.emap.eMap.ESQLTypeDef#getEtype <em>Etype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Etype</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ESQLTypeDef#getEtype()
   * @see #getESQLTypeDef()
   * @generated
   */
  EReference getESQLTypeDef_Etype();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.ESQLTypeDef#getDbTypes <em>Db Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Db Types</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ESQLTypeDef#getDbTypes()
   * @see #getESQLTypeDef()
   * @generated
   */
  EReference getESQLTypeDef_DbTypes();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.ESQLDbType <em>ESQL Db Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ESQL Db Type</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ESQLDbType
   * @generated
   */
  EClass getESQLDbType();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ESQLDbType#getDbType <em>Db Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Type</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ESQLDbType#getDbType()
   * @see #getESQLDbType()
   * @generated
   */
  EAttribute getESQLDbType_DbType();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ESQLDbType#getSqlTypeDef <em>Sql Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sql Type Def</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ESQLDbType#getSqlTypeDef()
   * @see #getESQLDbType()
   * @generated
   */
  EAttribute getESQLDbType_SqlTypeDef();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ESQLDbType#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ESQLDbType#getSize()
   * @see #getESQLDbType()
   * @generated
   */
  EAttribute getESQLDbType_Size();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.ERestServiceMapping <em>ERest Service Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ERest Service Mapping</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ERestServiceMapping
   * @generated
   */
  EClass getERestServiceMapping();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.ERestServiceMapping#getServiceMethods <em>Service Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Methods</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ERestServiceMapping#getServiceMethods()
   * @see #getERestServiceMapping()
   * @generated
   */
  EReference getERestServiceMapping_ServiceMethods();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ERestServiceMapping#isRest <em>Rest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rest</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ERestServiceMapping#isRest()
   * @see #getERestServiceMapping()
   * @generated
   */
  EAttribute getERestServiceMapping_Rest();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery <em>ENamed Service Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ENamed Service Query</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedServiceQuery
   * @generated
   */
  EClass getENamedServiceQuery();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Query</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getQuery()
   * @see #getENamedServiceQuery()
   * @generated
   */
  EReference getENamedServiceQuery_Query();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getName()
   * @see #getENamedServiceQuery()
   * @generated
   */
  EAttribute getENamedServiceQuery_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getPath()
   * @see #getENamedServiceQuery()
   * @generated
   */
  EAttribute getENamedServiceQuery_Path();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getParameters()
   * @see #getENamedServiceQuery()
   * @generated
   */
  EReference getENamedServiceQuery_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getGreedyAttributePathList <em>Greedy Attribute Path List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greedy Attribute Path List</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getGreedyAttributePathList()
   * @see #getENamedServiceQuery()
   * @generated
   */
  EReference getENamedServiceQuery_GreedyAttributePathList();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EGreedyAttributePath <em>EGreedy Attribute Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EGreedy Attribute Path</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EGreedyAttributePath
   * @generated
   */
  EClass getEGreedyAttributePath();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.EGreedyAttributePath#getGreedyAttribute <em>Greedy Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Greedy Attribute</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EGreedyAttributePath#getGreedyAttribute()
   * @see #getEGreedyAttributePath()
   * @generated
   */
  EReference getEGreedyAttributePath_GreedyAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EGreedyAttributePath#getSubPathList <em>Sub Path List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Path List</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EGreedyAttributePath#getSubPathList()
   * @see #getEGreedyAttributePath()
   * @generated
   */
  EReference getEGreedyAttributePath_SubPathList();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EServiceParam <em>EService Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EService Param</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EServiceParam
   * @generated
   */
  EClass getEServiceParam();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.EServiceParam#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Param</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EServiceParam#getParam()
   * @see #getEServiceParam()
   * @generated
   */
  EReference getEServiceParam_Param();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EServiceParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EServiceParam#getName()
   * @see #getEServiceParam()
   * @generated
   */
  EAttribute getEServiceParam_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EPathParam <em>EPath Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EPath Param</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EPathParam
   * @generated
   */
  EClass getEPathParam();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EQueryParam <em>EQuery Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EQuery Param</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EQueryParam
   * @generated
   */
  EClass getEQueryParam();

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
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getNamedCustomQueries <em>Named Custom Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Named Custom Queries</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntity#getNamedCustomQueries()
   * @see #getEMappingEntity()
   * @generated
   */
  EReference getEMappingEntity_NamedCustomQueries();

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
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getDescriminationColumn <em>Descrimination Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descrimination Column</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntity#getDescriminationColumn()
   * @see #getEMappingEntity()
   * @generated
   */
  EAttribute getEMappingEntity_DescriminationColumn();

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
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EAttribute#isForcedFk <em>Forced Fk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Forced Fk</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute#isForcedFk()
   * @see #getEAttribute()
   * @generated
   */
  EAttribute getEAttribute_ForcedFk();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute#getName()
   * @see #getEAttribute()
   * @generated
   */
  EAttribute getEAttribute_Name();

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
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getValueGenerators <em>Value Generators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value Generators</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute#getValueGenerators()
   * @see #getEAttribute()
   * @generated
   */
  EReference getEAttribute_ValueGenerators();

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
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute#getOpposite()
   * @see #getEAttribute()
   * @generated
   */
  EReference getEAttribute_Opposite();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getRelationTable <em>Relation Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relation Table</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute#getRelationTable()
   * @see #getEAttribute()
   * @generated
   */
  EAttribute getEAttribute_RelationTable();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getRelationColumn <em>Relation Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relation Column</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute#getRelationColumn()
   * @see #getEAttribute()
   * @generated
   */
  EAttribute getEAttribute_RelationColumn();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute#getSize()
   * @see #getEAttribute()
   * @generated
   */
  EAttribute getEAttribute_Size();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EValueGenerator <em>EValue Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EValue Generator</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EValueGenerator
   * @generated
   */
  EClass getEValueGenerator();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EValueGenerator#getDbType <em>Db Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Type</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EValueGenerator#getDbType()
   * @see #getEValueGenerator()
   * @generated
   */
  EAttribute getEValueGenerator_DbType();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EValueGenerator#isAutokey <em>Autokey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Autokey</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EValueGenerator#isAutokey()
   * @see #getEValueGenerator()
   * @generated
   */
  EAttribute getEValueGenerator_Autokey();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EValueGenerator#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EValueGenerator#getQuery()
   * @see #getEValueGenerator()
   * @generated
   */
  EAttribute getEValueGenerator_Query();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EValueGenerator#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sequence</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EValueGenerator#getSequence()
   * @see #getEValueGenerator()
   * @generated
   */
  EAttribute getEValueGenerator_Sequence();

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
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ENamedQuery#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedQuery#getReturnType()
   * @see #getENamedQuery()
   * @generated
   */
  EAttribute getENamedQuery_ReturnType();

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
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery <em>ENamed Custom Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ENamed Custom Query</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedCustomQuery
   * @generated
   */
  EClass getENamedCustomQuery();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getReturnType()
   * @see #getENamedCustomQuery()
   * @generated
   */
  EReference getENamedCustomQuery_ReturnType();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#isList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#isList()
   * @see #getENamedCustomQuery()
   * @generated
   */
  EAttribute getENamedCustomQuery_List();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getName()
   * @see #getENamedCustomQuery()
   * @generated
   */
  EAttribute getENamedCustomQuery_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getParameters()
   * @see #getENamedCustomQuery()
   * @generated
   */
  EReference getENamedCustomQuery_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getQueries <em>Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queries</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getQueries()
   * @see #getENamedCustomQuery()
   * @generated
   */
  EReference getENamedCustomQuery_Queries();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EReturnType <em>EReturn Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EReturn Type</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EReturnType
   * @generated
   */
  EClass getEReturnType();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EPredefinedType <em>EPredefined Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EPredefined Type</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EPredefinedType
   * @generated
   */
  EClass getEPredefinedType();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EPredefinedType#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EPredefinedType#getRef()
   * @see #getEPredefinedType()
   * @generated
   */
  EAttribute getEPredefinedType_Ref();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.ETypeDef <em>EType Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EType Def</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ETypeDef
   * @generated
   */
  EClass getETypeDef();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ETypeDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ETypeDef#getName()
   * @see #getETypeDef()
   * @generated
   */
  EAttribute getETypeDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.ETypeDef#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ETypeDef#getTypes()
   * @see #getETypeDef()
   * @generated
   */
  EReference getETypeDef_Types();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EModelTypeDef <em>EModel Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EModel Type Def</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EModelTypeDef
   * @generated
   */
  EClass getEModelTypeDef();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.persistence.emap.eMap.EModelTypeDef#getEclassDef <em>Eclass Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Eclass Def</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EModelTypeDef#getEclassDef()
   * @see #getEModelTypeDef()
   * @generated
   */
  EReference getEModelTypeDef_EclassDef();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.persistence.emap.eMap.EModelTypeDef#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EModelTypeDef#getAttributes()
   * @see #getEModelTypeDef()
   * @generated
   */
  EReference getEModelTypeDef_Attributes();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute <em>EModel Type Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EModel Type Attribute</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EModelTypeAttribute
   * @generated
   */
  EClass getEModelTypeAttribute();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getName()
   * @see #getEModelTypeAttribute()
   * @generated
   */
  EAttribute getEModelTypeAttribute_Name();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Query</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getQuery()
   * @see #getEModelTypeAttribute()
   * @generated
   */
  EReference getEModelTypeAttribute_Query();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getParameters()
   * @see #getEModelTypeAttribute()
   * @generated
   */
  EAttribute getEModelTypeAttribute_Parameters();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#isCached <em>Cached</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cached</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#isCached()
   * @see #getEModelTypeAttribute()
   * @generated
   */
  EAttribute getEModelTypeAttribute_Cached();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getCacheName <em>Cache Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cache Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getCacheName()
   * @see #getEModelTypeAttribute()
   * @generated
   */
  EAttribute getEModelTypeAttribute_CacheName();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EValueTypeAttribute <em>EValue Type Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EValue Type Attribute</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EValueTypeAttribute
   * @generated
   */
  EClass getEValueTypeAttribute();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EValueTypeAttribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EValueTypeAttribute#getType()
   * @see #getEValueTypeAttribute()
   * @generated
   */
  EAttribute getEValueTypeAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EValueTypeAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EValueTypeAttribute#getName()
   * @see #getEValueTypeAttribute()
   * @generated
   */
  EAttribute getEValueTypeAttribute_Name();

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
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EParameter#isId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EParameter#isId()
   * @see #getEParameter()
   * @generated
   */
  EAttribute getEParameter_Id();

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
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EParameter#isList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EParameter#isList()
   * @see #getEParameter()
   * @generated
   */
  EAttribute getEParameter_List();

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
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery <em>ECustom Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ECustom Query</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ECustomQuery
   * @generated
   */
  EClass getECustomQuery();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getDbType <em>Db Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Type</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ECustomQuery#getDbType()
   * @see #getECustomQuery()
   * @generated
   */
  EAttribute getECustomQuery_DbType();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Columns</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ECustomQuery#getColumns()
   * @see #getECustomQuery()
   * @generated
   */
  EAttribute getECustomQuery_Columns();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ECustomQuery#getFrom()
   * @see #getECustomQuery()
   * @generated
   */
  EAttribute getECustomQuery_From();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getWhere <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Where</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ECustomQuery#getWhere()
   * @see #getECustomQuery()
   * @generated
   */
  EAttribute getECustomQuery_Where();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getGroupBy <em>Group By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group By</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ECustomQuery#getGroupBy()
   * @see #getECustomQuery()
   * @generated
   */
  EAttribute getECustomQuery_GroupBy();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getOrderby <em>Orderby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orderby</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ECustomQuery#getOrderby()
   * @see #getECustomQuery()
   * @generated
   */
  EAttribute getECustomQuery_Orderby();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ECustomQuery#getAll()
   * @see #getECustomQuery()
   * @generated
   */
  EAttribute getECustomQuery_All();

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
   * Returns the meta object for the reference list '{@link at.bestsolution.persistence.emap.eMap.EObjectSection#getDescriminatedTypes <em>Descriminated Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Descriminated Types</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EObjectSection#getDescriminatedTypes()
   * @see #getEObjectSection()
   * @generated
   */
  EReference getEObjectSection_DescriminatedTypes();

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
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#isResolved <em>Resolved</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resolved</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingAttribute#isResolved()
   * @see #getEMappingAttribute()
   * @generated
   */
  EAttribute getEMappingAttribute_Resolved();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Query</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingAttribute#getQuery()
   * @see #getEMappingAttribute()
   * @generated
   */
  EReference getEMappingAttribute_Query();

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
   * Returns the meta object for the attribute '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#isMapped <em>Mapped</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapped</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EMappingAttribute#isMapped()
   * @see #getEMappingAttribute()
   * @generated
   */
  EAttribute getEMappingAttribute_Mapped();

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
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EPredefSequence <em>EPredef Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EPredef Sequence</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EPredefSequence
   * @generated
   */
  EClass getEPredefSequence();

  /**
   * Returns the meta object for class '{@link at.bestsolution.persistence.emap.eMap.EPredefTable <em>EPredef Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EPredef Table</em>'.
   * @see at.bestsolution.persistence.emap.eMap.EPredefTable
   * @generated
   */
  EClass getEPredefTable();

  /**
   * Returns the meta object for enum '{@link at.bestsolution.persistence.emap.eMap.ColSort <em>Col Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Col Sort</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ColSort
   * @generated
   */
  EEnum getColSort();

  /**
   * Returns the meta object for enum '{@link at.bestsolution.persistence.emap.eMap.ReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Return Type</em>'.
   * @see at.bestsolution.persistence.emap.eMap.ReturnType
   * @generated
   */
  EEnum getReturnType();

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
     * The meta object literal for the '<em><b>Parent Bundle</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_BUNDLE__PARENT_BUNDLE = eINSTANCE.getEMappingBundle_ParentBundle();

    /**
     * The meta object literal for the '<em><b>Predef</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_BUNDLE__PREDEF = eINSTANCE.getEMappingBundle_Predef();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_BUNDLE__ENTITIES = eINSTANCE.getEMappingBundle_Entities();

    /**
     * The meta object literal for the '<em><b>Type Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_BUNDLE__TYPE_DEFS = eINSTANCE.getEMappingBundle_TypeDefs();

    /**
     * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_BUNDLE__GENERATORS = eINSTANCE.getEMappingBundle_Generators();

    /**
     * The meta object literal for the '<em><b>Databases</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_BUNDLE__DATABASES = eINSTANCE.getEMappingBundle_Databases();

    /**
     * The meta object literal for the '<em><b>Col Sort</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_BUNDLE__COL_SORT = eINSTANCE.getEMappingBundle_ColSort();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EPredefImpl <em>EPredef</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EPredefImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEPredef()
     * @generated
     */
    EClass EPREDEF = eINSTANCE.getEPredef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EPREDEF__NAME = eINSTANCE.getEPredef_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EGeneratorDefImpl <em>EGenerator Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EGeneratorDefImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEGeneratorDef()
     * @generated
     */
    EClass EGENERATOR_DEF = eINSTANCE.getEGeneratorDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EGENERATOR_DEF__NAME = eINSTANCE.getEGeneratorDef_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EGENERATOR_DEF__PARAMETERS = eINSTANCE.getEGeneratorDef_Parameters();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EGeneratorConfigValueImpl <em>EGenerator Config Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EGeneratorConfigValueImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEGeneratorConfigValue()
     * @generated
     */
    EClass EGENERATOR_CONFIG_VALUE = eINSTANCE.getEGeneratorConfigValue();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EGENERATOR_CONFIG_VALUE__KEY = eINSTANCE.getEGeneratorConfigValue_Key();

    /**
     * The meta object literal for the '<em><b>Simple Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EGENERATOR_CONFIG_VALUE__SIMPLE_VALUE = eINSTANCE.getEGeneratorConfigValue_SimpleValue();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EGENERATOR_CONFIG_VALUE__CHILDREN = eINSTANCE.getEGeneratorConfigValue_Children();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EBundleEntityImpl <em>EBundle Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EBundleEntityImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEBundleEntity()
     * @generated
     */
    EClass EBUNDLE_ENTITY = eINSTANCE.getEBundleEntity();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EBUNDLE_ENTITY__ENTITY = eINSTANCE.getEBundleEntity_Entity();

    /**
     * The meta object literal for the '<em><b>Pk Constraint Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EBUNDLE_ENTITY__PK_CONSTRAINT_NAME = eINSTANCE.getEBundleEntity_PkConstraintName();

    /**
     * The meta object literal for the '<em><b>Fk Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EBUNDLE_ENTITY__FK_CONSTRAINTS = eINSTANCE.getEBundleEntity_FkConstraints();

    /**
     * The meta object literal for the '<em><b>Unique Contraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EBUNDLE_ENTITY__UNIQUE_CONTRAINTS = eINSTANCE.getEBundleEntity_UniqueContraints();

    /**
     * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EBUNDLE_ENTITY__INDICES = eINSTANCE.getEBundleEntity_Indices();

    /**
     * The meta object literal for the '<em><b>Type Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EBUNDLE_ENTITY__TYPE_DEFS = eINSTANCE.getEBundleEntity_TypeDefs();

    /**
     * The meta object literal for the '<em><b>Rest</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EBUNDLE_ENTITY__REST = eINSTANCE.getEBundleEntity_Rest();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EIndexImpl <em>EIndex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EIndexImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEIndex()
     * @generated
     */
    EClass EINDEX = eINSTANCE.getEIndex();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EINDEX__NAME = eINSTANCE.getEIndex_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EINDEX__ATTRIBUTES = eINSTANCE.getEIndex_Attributes();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EFkConstraintImpl <em>EFk Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EFkConstraintImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEFkConstraint()
     * @generated
     */
    EClass EFK_CONSTRAINT = eINSTANCE.getEFkConstraint();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFK_CONSTRAINT__ATTRIBUTE = eINSTANCE.getEFkConstraint_Attribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFK_CONSTRAINT__NAME = eINSTANCE.getEFkConstraint_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EUniqueConstraintImpl <em>EUnique Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EUniqueConstraintImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEUniqueConstraint()
     * @generated
     */
    EClass EUNIQUE_CONSTRAINT = eINSTANCE.getEUniqueConstraint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EUNIQUE_CONSTRAINT__NAME = eINSTANCE.getEUniqueConstraint_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EUNIQUE_CONSTRAINT__ATTRIBUTES = eINSTANCE.getEUniqueConstraint_Attributes();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.ESQLAttTypeDefImpl <em>ESQL Att Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.ESQLAttTypeDefImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getESQLAttTypeDef()
     * @generated
     */
    EClass ESQL_ATT_TYPE_DEF = eINSTANCE.getESQLAttTypeDef();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESQL_ATT_TYPE_DEF__ATTRIBUTE = eINSTANCE.getESQLAttTypeDef_Attribute();

    /**
     * The meta object literal for the '<em><b>Db Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESQL_ATT_TYPE_DEF__DB_TYPES = eINSTANCE.getESQLAttTypeDef_DbTypes();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.ESQLTypeDefImpl <em>ESQL Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.ESQLTypeDefImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getESQLTypeDef()
     * @generated
     */
    EClass ESQL_TYPE_DEF = eINSTANCE.getESQLTypeDef();

    /**
     * The meta object literal for the '<em><b>Etype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESQL_TYPE_DEF__ETYPE = eINSTANCE.getESQLTypeDef_Etype();

    /**
     * The meta object literal for the '<em><b>Db Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESQL_TYPE_DEF__DB_TYPES = eINSTANCE.getESQLTypeDef_DbTypes();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.ESQLDbTypeImpl <em>ESQL Db Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.ESQLDbTypeImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getESQLDbType()
     * @generated
     */
    EClass ESQL_DB_TYPE = eINSTANCE.getESQLDbType();

    /**
     * The meta object literal for the '<em><b>Db Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESQL_DB_TYPE__DB_TYPE = eINSTANCE.getESQLDbType_DbType();

    /**
     * The meta object literal for the '<em><b>Sql Type Def</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESQL_DB_TYPE__SQL_TYPE_DEF = eINSTANCE.getESQLDbType_SqlTypeDef();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESQL_DB_TYPE__SIZE = eINSTANCE.getESQLDbType_Size();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.ERestServiceMappingImpl <em>ERest Service Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.ERestServiceMappingImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getERestServiceMapping()
     * @generated
     */
    EClass EREST_SERVICE_MAPPING = eINSTANCE.getERestServiceMapping();

    /**
     * The meta object literal for the '<em><b>Service Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EREST_SERVICE_MAPPING__SERVICE_METHODS = eINSTANCE.getERestServiceMapping_ServiceMethods();

    /**
     * The meta object literal for the '<em><b>Rest</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EREST_SERVICE_MAPPING__REST = eINSTANCE.getERestServiceMapping_Rest();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.ENamedServiceQueryImpl <em>ENamed Service Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.ENamedServiceQueryImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getENamedServiceQuery()
     * @generated
     */
    EClass ENAMED_SERVICE_QUERY = eINSTANCE.getENamedServiceQuery();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENAMED_SERVICE_QUERY__QUERY = eINSTANCE.getENamedServiceQuery_Query();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENAMED_SERVICE_QUERY__NAME = eINSTANCE.getENamedServiceQuery_Name();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENAMED_SERVICE_QUERY__PATH = eINSTANCE.getENamedServiceQuery_Path();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENAMED_SERVICE_QUERY__PARAMETERS = eINSTANCE.getENamedServiceQuery_Parameters();

    /**
     * The meta object literal for the '<em><b>Greedy Attribute Path List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENAMED_SERVICE_QUERY__GREEDY_ATTRIBUTE_PATH_LIST = eINSTANCE.getENamedServiceQuery_GreedyAttributePathList();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EGreedyAttributePathImpl <em>EGreedy Attribute Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EGreedyAttributePathImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEGreedyAttributePath()
     * @generated
     */
    EClass EGREEDY_ATTRIBUTE_PATH = eINSTANCE.getEGreedyAttributePath();

    /**
     * The meta object literal for the '<em><b>Greedy Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EGREEDY_ATTRIBUTE_PATH__GREEDY_ATTRIBUTE = eINSTANCE.getEGreedyAttributePath_GreedyAttribute();

    /**
     * The meta object literal for the '<em><b>Sub Path List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EGREEDY_ATTRIBUTE_PATH__SUB_PATH_LIST = eINSTANCE.getEGreedyAttributePath_SubPathList();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EServiceParamImpl <em>EService Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EServiceParamImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEServiceParam()
     * @generated
     */
    EClass ESERVICE_PARAM = eINSTANCE.getEServiceParam();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESERVICE_PARAM__PARAM = eINSTANCE.getEServiceParam_Param();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESERVICE_PARAM__NAME = eINSTANCE.getEServiceParam_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EPathParamImpl <em>EPath Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EPathParamImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEPathParam()
     * @generated
     */
    EClass EPATH_PARAM = eINSTANCE.getEPathParam();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EQueryParamImpl <em>EQuery Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EQueryParamImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEQueryParam()
     * @generated
     */
    EClass EQUERY_PARAM = eINSTANCE.getEQueryParam();

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
     * The meta object literal for the '<em><b>Named Custom Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_ENTITY__NAMED_CUSTOM_QUERIES = eINSTANCE.getEMappingEntity_NamedCustomQueries();

    /**
     * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_ENTITY__TABLE_NAME = eINSTANCE.getEMappingEntity_TableName();

    /**
     * The meta object literal for the '<em><b>Descrimination Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_ENTITY__DESCRIMINATION_COLUMN = eINSTANCE.getEMappingEntity_DescriminationColumn();

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
     * The meta object literal for the '<em><b>Forced Fk</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EATTRIBUTE__FORCED_FK = eINSTANCE.getEAttribute_ForcedFk();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EATTRIBUTE__NAME = eINSTANCE.getEAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EATTRIBUTE__COLUMN_NAME = eINSTANCE.getEAttribute_ColumnName();

    /**
     * The meta object literal for the '<em><b>Value Generators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EATTRIBUTE__VALUE_GENERATORS = eINSTANCE.getEAttribute_ValueGenerators();

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
     * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EATTRIBUTE__OPPOSITE = eINSTANCE.getEAttribute_Opposite();

    /**
     * The meta object literal for the '<em><b>Relation Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EATTRIBUTE__RELATION_TABLE = eINSTANCE.getEAttribute_RelationTable();

    /**
     * The meta object literal for the '<em><b>Relation Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EATTRIBUTE__RELATION_COLUMN = eINSTANCE.getEAttribute_RelationColumn();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EATTRIBUTE__SIZE = eINSTANCE.getEAttribute_Size();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EValueGeneratorImpl <em>EValue Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EValueGeneratorImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEValueGenerator()
     * @generated
     */
    EClass EVALUE_GENERATOR = eINSTANCE.getEValueGenerator();

    /**
     * The meta object literal for the '<em><b>Db Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUE_GENERATOR__DB_TYPE = eINSTANCE.getEValueGenerator_DbType();

    /**
     * The meta object literal for the '<em><b>Autokey</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUE_GENERATOR__AUTOKEY = eINSTANCE.getEValueGenerator_Autokey();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUE_GENERATOR__QUERY = eINSTANCE.getEValueGenerator_Query();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUE_GENERATOR__SEQUENCE = eINSTANCE.getEValueGenerator_Sequence();

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
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENAMED_QUERY__RETURN_TYPE = eINSTANCE.getENamedQuery_ReturnType();

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
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.ENamedCustomQueryImpl <em>ENamed Custom Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.ENamedCustomQueryImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getENamedCustomQuery()
     * @generated
     */
    EClass ENAMED_CUSTOM_QUERY = eINSTANCE.getENamedCustomQuery();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENAMED_CUSTOM_QUERY__RETURN_TYPE = eINSTANCE.getENamedCustomQuery_ReturnType();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENAMED_CUSTOM_QUERY__LIST = eINSTANCE.getENamedCustomQuery_List();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENAMED_CUSTOM_QUERY__NAME = eINSTANCE.getENamedCustomQuery_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENAMED_CUSTOM_QUERY__PARAMETERS = eINSTANCE.getENamedCustomQuery_Parameters();

    /**
     * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENAMED_CUSTOM_QUERY__QUERIES = eINSTANCE.getENamedCustomQuery_Queries();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EReturnTypeImpl <em>EReturn Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EReturnTypeImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEReturnType()
     * @generated
     */
    EClass ERETURN_TYPE = eINSTANCE.getEReturnType();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EPredefinedTypeImpl <em>EPredefined Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EPredefinedTypeImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEPredefinedType()
     * @generated
     */
    EClass EPREDEFINED_TYPE = eINSTANCE.getEPredefinedType();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EPREDEFINED_TYPE__REF = eINSTANCE.getEPredefinedType_Ref();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.ETypeDefImpl <em>EType Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.ETypeDefImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getETypeDef()
     * @generated
     */
    EClass ETYPE_DEF = eINSTANCE.getETypeDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ETYPE_DEF__NAME = eINSTANCE.getETypeDef_Name();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ETYPE_DEF__TYPES = eINSTANCE.getETypeDef_Types();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EModelTypeDefImpl <em>EModel Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EModelTypeDefImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEModelTypeDef()
     * @generated
     */
    EClass EMODEL_TYPE_DEF = eINSTANCE.getEModelTypeDef();

    /**
     * The meta object literal for the '<em><b>Eclass Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMODEL_TYPE_DEF__ECLASS_DEF = eINSTANCE.getEModelTypeDef_EclassDef();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMODEL_TYPE_DEF__ATTRIBUTES = eINSTANCE.getEModelTypeDef_Attributes();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EModelTypeAttributeImpl <em>EModel Type Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EModelTypeAttributeImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEModelTypeAttribute()
     * @generated
     */
    EClass EMODEL_TYPE_ATTRIBUTE = eINSTANCE.getEModelTypeAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMODEL_TYPE_ATTRIBUTE__NAME = eINSTANCE.getEModelTypeAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMODEL_TYPE_ATTRIBUTE__QUERY = eINSTANCE.getEModelTypeAttribute_Query();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMODEL_TYPE_ATTRIBUTE__PARAMETERS = eINSTANCE.getEModelTypeAttribute_Parameters();

    /**
     * The meta object literal for the '<em><b>Cached</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMODEL_TYPE_ATTRIBUTE__CACHED = eINSTANCE.getEModelTypeAttribute_Cached();

    /**
     * The meta object literal for the '<em><b>Cache Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMODEL_TYPE_ATTRIBUTE__CACHE_NAME = eINSTANCE.getEModelTypeAttribute_CacheName();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EValueTypeAttributeImpl <em>EValue Type Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EValueTypeAttributeImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEValueTypeAttribute()
     * @generated
     */
    EClass EVALUE_TYPE_ATTRIBUTE = eINSTANCE.getEValueTypeAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUE_TYPE_ATTRIBUTE__TYPE = eINSTANCE.getEValueTypeAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUE_TYPE_ATTRIBUTE__NAME = eINSTANCE.getEValueTypeAttribute_Name();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EPARAMETER__ID = eINSTANCE.getEParameter_Id();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EPARAMETER__TYPE = eINSTANCE.getEParameter_Type();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EPARAMETER__LIST = eINSTANCE.getEParameter_List();

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
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.ECustomQueryImpl <em>ECustom Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.ECustomQueryImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getECustomQuery()
     * @generated
     */
    EClass ECUSTOM_QUERY = eINSTANCE.getECustomQuery();

    /**
     * The meta object literal for the '<em><b>Db Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECUSTOM_QUERY__DB_TYPE = eINSTANCE.getECustomQuery_DbType();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECUSTOM_QUERY__COLUMNS = eINSTANCE.getECustomQuery_Columns();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECUSTOM_QUERY__FROM = eINSTANCE.getECustomQuery_From();

    /**
     * The meta object literal for the '<em><b>Where</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECUSTOM_QUERY__WHERE = eINSTANCE.getECustomQuery_Where();

    /**
     * The meta object literal for the '<em><b>Group By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECUSTOM_QUERY__GROUP_BY = eINSTANCE.getECustomQuery_GroupBy();

    /**
     * The meta object literal for the '<em><b>Orderby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECUSTOM_QUERY__ORDERBY = eINSTANCE.getECustomQuery_Orderby();

    /**
     * The meta object literal for the '<em><b>All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECUSTOM_QUERY__ALL = eINSTANCE.getECustomQuery_All();

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
     * The meta object literal for the '<em><b>Descriminated Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EOBJECT_SECTION__DESCRIMINATED_TYPES = eINSTANCE.getEObjectSection_DescriminatedTypes();

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
     * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_ATTRIBUTE__RESOLVED = eINSTANCE.getEMappingAttribute_Resolved();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAPPING_ATTRIBUTE__QUERY = eINSTANCE.getEMappingAttribute_Query();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_ATTRIBUTE__PARAMETERS = eINSTANCE.getEMappingAttribute_Parameters();

    /**
     * The meta object literal for the '<em><b>Mapped</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAPPING_ATTRIBUTE__MAPPED = eINSTANCE.getEMappingAttribute_Mapped();

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

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EPredefSequenceImpl <em>EPredef Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EPredefSequenceImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEPredefSequence()
     * @generated
     */
    EClass EPREDEF_SEQUENCE = eINSTANCE.getEPredefSequence();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.impl.EPredefTableImpl <em>EPredef Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.impl.EPredefTableImpl
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getEPredefTable()
     * @generated
     */
    EClass EPREDEF_TABLE = eINSTANCE.getEPredefTable();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.ColSort <em>Col Sort</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.ColSort
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getColSort()
     * @generated
     */
    EEnum COL_SORT = eINSTANCE.getColSort();

    /**
     * The meta object literal for the '{@link at.bestsolution.persistence.emap.eMap.ReturnType <em>Return Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.persistence.emap.eMap.ReturnType
     * @see at.bestsolution.persistence.emap.eMap.impl.EMapPackageImpl#getReturnType()
     * @generated
     */
    EEnum RETURN_TYPE = eINSTANCE.getReturnType();

  }

} //EMapPackage

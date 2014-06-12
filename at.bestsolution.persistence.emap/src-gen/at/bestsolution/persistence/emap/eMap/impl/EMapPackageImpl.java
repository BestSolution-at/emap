/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.ECustomQuery;
import at.bestsolution.persistence.emap.eMap.EMapFactory;
import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.EMapping;
import at.bestsolution.persistence.emap.eMap.EMappingAttribute;
import at.bestsolution.persistence.emap.eMap.EMappingBundle;
import at.bestsolution.persistence.emap.eMap.EMappingEntity;
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef;
import at.bestsolution.persistence.emap.eMap.EModelTypeAttribute;
import at.bestsolution.persistence.emap.eMap.EModelTypeDef;
import at.bestsolution.persistence.emap.eMap.ENamedCustomQuery;
import at.bestsolution.persistence.emap.eMap.ENamedQuery;
import at.bestsolution.persistence.emap.eMap.EObjectSection;
import at.bestsolution.persistence.emap.eMap.EParameter;
import at.bestsolution.persistence.emap.eMap.EPredefinedType;
import at.bestsolution.persistence.emap.eMap.EQuery;
import at.bestsolution.persistence.emap.eMap.EReturnType;
import at.bestsolution.persistence.emap.eMap.EType;
import at.bestsolution.persistence.emap.eMap.ETypeDef;
import at.bestsolution.persistence.emap.eMap.EValueGenerator;
import at.bestsolution.persistence.emap.eMap.EValueTypeAttribute;
import at.bestsolution.persistence.emap.eMap.Import;
import at.bestsolution.persistence.emap.eMap.PackageDeclaration;
import at.bestsolution.persistence.emap.eMap.ReturnType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMapPackageImpl extends EPackageImpl implements EMapPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eMappingBundleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eMappingEntityDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eMappingEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eValueGeneratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eNamedQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eNamedCustomQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eReturnTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ePredefinedTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eModelTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eModelTypeAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eValueTypeAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eCustomQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eObjectSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eMappingAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum returnTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EMapPackageImpl()
  {
    super(eNS_URI, EMapFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EMapPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EMapPackage init()
  {
    if (isInited) return (EMapPackage)EPackage.Registry.INSTANCE.getEPackage(EMapPackage.eNS_URI);

    // Obtain or create and register package
    EMapPackageImpl theEMapPackage = (EMapPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMapPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMapPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEMapPackage.createPackageContents();

    // Initialize created meta-data
    theEMapPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEMapPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EMapPackage.eNS_URI, theEMapPackage);
    return theEMapPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMapping()
  {
    return eMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMapping_Root()
  {
    return (EReference)eMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMappingBundle()
  {
    return eMappingBundleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMappingBundle_Imports()
  {
    return (EReference)eMappingBundleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMappingBundle_Name()
  {
    return (EAttribute)eMappingBundleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMappingBundle_Entities()
  {
    return (EReference)eMappingBundleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMappingBundle_Databases()
  {
    return (EAttribute)eMappingBundleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMappingEntityDef()
  {
    return eMappingEntityDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMappingEntityDef_Package()
  {
    return (EReference)eMappingEntityDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMappingEntityDef_Imports()
  {
    return (EReference)eMappingEntityDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMappingEntityDef_Entity()
  {
    return (EReference)eMappingEntityDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Name()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMappingEntity()
  {
    return eMappingEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMappingEntity_Abstract()
  {
    return (EAttribute)eMappingEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMappingEntity_Name()
  {
    return (EAttribute)eMappingEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMappingEntity_ExtensionType()
  {
    return (EAttribute)eMappingEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMappingEntity_Parent()
  {
    return (EReference)eMappingEntityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMappingEntity_Etype()
  {
    return (EReference)eMappingEntityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMappingEntity_Attributes()
  {
    return (EReference)eMappingEntityEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMappingEntity_NamedQueries()
  {
    return (EReference)eMappingEntityEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMappingEntity_NamedCustomQueries()
  {
    return (EReference)eMappingEntityEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMappingEntity_TableName()
  {
    return (EAttribute)eMappingEntityEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMappingEntity_DescriminationColumn()
  {
    return (EAttribute)eMappingEntityEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEAttribute()
  {
    return eAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEAttribute_Pk()
  {
    return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEAttribute_ForcedFk()
  {
    return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEAttribute_Name()
  {
    return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEAttribute_ColumnName()
  {
    return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEAttribute_ValueGenerators()
  {
    return (EReference)eAttributeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEAttribute_Resolved()
  {
    return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEAttribute_Query()
  {
    return (EReference)eAttributeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEAttribute_Parameters()
  {
    return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEAttribute_Opposite()
  {
    return (EReference)eAttributeEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEAttribute_RelationTable()
  {
    return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEAttribute_RelationColumn()
  {
    return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEValueGenerator()
  {
    return eValueGeneratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEValueGenerator_DbType()
  {
    return (EAttribute)eValueGeneratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEValueGenerator_Autokey()
  {
    return (EAttribute)eValueGeneratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEValueGenerator_Query()
  {
    return (EAttribute)eValueGeneratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEValueGenerator_Sequence()
  {
    return (EAttribute)eValueGeneratorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getENamedQuery()
  {
    return eNamedQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENamedQuery_ReturnType()
  {
    return (EAttribute)eNamedQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENamedQuery_Name()
  {
    return (EAttribute)eNamedQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getENamedQuery_Parameters()
  {
    return (EReference)eNamedQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getENamedQuery_Queries()
  {
    return (EReference)eNamedQueryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getENamedCustomQuery()
  {
    return eNamedCustomQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getENamedCustomQuery_ReturnType()
  {
    return (EReference)eNamedCustomQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENamedCustomQuery_List()
  {
    return (EAttribute)eNamedCustomQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getENamedCustomQuery_Name()
  {
    return (EAttribute)eNamedCustomQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getENamedCustomQuery_Parameters()
  {
    return (EReference)eNamedCustomQueryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getENamedCustomQuery_Queries()
  {
    return (EReference)eNamedCustomQueryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEReturnType()
  {
    return eReturnTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEPredefinedType()
  {
    return ePredefinedTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEPredefinedType_Ref()
  {
    return (EAttribute)ePredefinedTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETypeDef()
  {
    return eTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETypeDef_Name()
  {
    return (EAttribute)eTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETypeDef_Types()
  {
    return (EReference)eTypeDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEModelTypeDef()
  {
    return eModelTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEModelTypeDef_EclassDef()
  {
    return (EReference)eModelTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEModelTypeDef_Attributes()
  {
    return (EReference)eModelTypeDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEModelTypeAttribute()
  {
    return eModelTypeAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEModelTypeAttribute_Name()
  {
    return (EAttribute)eModelTypeAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEModelTypeAttribute_Query()
  {
    return (EReference)eModelTypeAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEModelTypeAttribute_Parameters()
  {
    return (EAttribute)eModelTypeAttributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEModelTypeAttribute_Cached()
  {
    return (EAttribute)eModelTypeAttributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEModelTypeAttribute_CacheName()
  {
    return (EAttribute)eModelTypeAttributeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEValueTypeAttribute()
  {
    return eValueTypeAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEValueTypeAttribute_Type()
  {
    return (EAttribute)eValueTypeAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEValueTypeAttribute_Name()
  {
    return (EAttribute)eValueTypeAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEParameter()
  {
    return eParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEParameter_Id()
  {
    return (EAttribute)eParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEParameter_Type()
  {
    return (EAttribute)eParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEParameter_Name()
  {
    return (EAttribute)eParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEQuery()
  {
    return eQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEQuery_DbType()
  {
    return (EAttribute)eQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEQuery_Mapping()
  {
    return (EReference)eQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEQuery_From()
  {
    return (EAttribute)eQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEQuery_Where()
  {
    return (EAttribute)eQueryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEQuery_GroupBy()
  {
    return (EAttribute)eQueryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEQuery_Orderby()
  {
    return (EAttribute)eQueryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEQuery_All()
  {
    return (EAttribute)eQueryEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getECustomQuery()
  {
    return eCustomQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getECustomQuery_DbType()
  {
    return (EAttribute)eCustomQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getECustomQuery_Columns()
  {
    return (EAttribute)eCustomQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getECustomQuery_From()
  {
    return (EAttribute)eCustomQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getECustomQuery_Where()
  {
    return (EAttribute)eCustomQueryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getECustomQuery_GroupBy()
  {
    return (EAttribute)eCustomQueryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getECustomQuery_Orderby()
  {
    return (EAttribute)eCustomQueryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getECustomQuery_All()
  {
    return (EAttribute)eCustomQueryEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEObjectSection()
  {
    return eObjectSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEObjectSection_Entity()
  {
    return (EReference)eObjectSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEObjectSection_DescriminatedTypes()
  {
    return (EReference)eObjectSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEObjectSection_Prefix()
  {
    return (EAttribute)eObjectSectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEObjectSection_Attributes()
  {
    return (EReference)eObjectSectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMappingAttribute()
  {
    return eMappingAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMappingAttribute_Pk()
  {
    return (EAttribute)eMappingAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMappingAttribute_Property()
  {
    return (EAttribute)eMappingAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMappingAttribute_ColumnName()
  {
    return (EAttribute)eMappingAttributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMappingAttribute_Resolved()
  {
    return (EAttribute)eMappingAttributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMappingAttribute_Query()
  {
    return (EReference)eMappingAttributeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMappingAttribute_Parameters()
  {
    return (EAttribute)eMappingAttributeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMappingAttribute_Mapped()
  {
    return (EAttribute)eMappingAttributeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMappingAttribute_Map()
  {
    return (EReference)eMappingAttributeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEType()
  {
    return eTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEType_Url()
  {
    return (EAttribute)eTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEType_Name()
  {
    return (EAttribute)eTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getReturnType()
  {
    return returnTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMapFactory getEMapFactory()
  {
    return (EMapFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    eMappingEClass = createEClass(EMAPPING);
    createEReference(eMappingEClass, EMAPPING__ROOT);

    eMappingBundleEClass = createEClass(EMAPPING_BUNDLE);
    createEReference(eMappingBundleEClass, EMAPPING_BUNDLE__IMPORTS);
    createEAttribute(eMappingBundleEClass, EMAPPING_BUNDLE__NAME);
    createEReference(eMappingBundleEClass, EMAPPING_BUNDLE__ENTITIES);
    createEAttribute(eMappingBundleEClass, EMAPPING_BUNDLE__DATABASES);

    eMappingEntityDefEClass = createEClass(EMAPPING_ENTITY_DEF);
    createEReference(eMappingEntityDefEClass, EMAPPING_ENTITY_DEF__PACKAGE);
    createEReference(eMappingEntityDefEClass, EMAPPING_ENTITY_DEF__IMPORTS);
    createEReference(eMappingEntityDefEClass, EMAPPING_ENTITY_DEF__ENTITY);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);

    eMappingEntityEClass = createEClass(EMAPPING_ENTITY);
    createEAttribute(eMappingEntityEClass, EMAPPING_ENTITY__ABSTRACT);
    createEAttribute(eMappingEntityEClass, EMAPPING_ENTITY__NAME);
    createEAttribute(eMappingEntityEClass, EMAPPING_ENTITY__EXTENSION_TYPE);
    createEReference(eMappingEntityEClass, EMAPPING_ENTITY__PARENT);
    createEReference(eMappingEntityEClass, EMAPPING_ENTITY__ETYPE);
    createEReference(eMappingEntityEClass, EMAPPING_ENTITY__ATTRIBUTES);
    createEReference(eMappingEntityEClass, EMAPPING_ENTITY__NAMED_QUERIES);
    createEReference(eMappingEntityEClass, EMAPPING_ENTITY__NAMED_CUSTOM_QUERIES);
    createEAttribute(eMappingEntityEClass, EMAPPING_ENTITY__TABLE_NAME);
    createEAttribute(eMappingEntityEClass, EMAPPING_ENTITY__DESCRIMINATION_COLUMN);

    eAttributeEClass = createEClass(EATTRIBUTE);
    createEAttribute(eAttributeEClass, EATTRIBUTE__PK);
    createEAttribute(eAttributeEClass, EATTRIBUTE__FORCED_FK);
    createEAttribute(eAttributeEClass, EATTRIBUTE__NAME);
    createEAttribute(eAttributeEClass, EATTRIBUTE__COLUMN_NAME);
    createEReference(eAttributeEClass, EATTRIBUTE__VALUE_GENERATORS);
    createEAttribute(eAttributeEClass, EATTRIBUTE__RESOLVED);
    createEReference(eAttributeEClass, EATTRIBUTE__QUERY);
    createEAttribute(eAttributeEClass, EATTRIBUTE__PARAMETERS);
    createEReference(eAttributeEClass, EATTRIBUTE__OPPOSITE);
    createEAttribute(eAttributeEClass, EATTRIBUTE__RELATION_TABLE);
    createEAttribute(eAttributeEClass, EATTRIBUTE__RELATION_COLUMN);

    eValueGeneratorEClass = createEClass(EVALUE_GENERATOR);
    createEAttribute(eValueGeneratorEClass, EVALUE_GENERATOR__DB_TYPE);
    createEAttribute(eValueGeneratorEClass, EVALUE_GENERATOR__AUTOKEY);
    createEAttribute(eValueGeneratorEClass, EVALUE_GENERATOR__QUERY);
    createEAttribute(eValueGeneratorEClass, EVALUE_GENERATOR__SEQUENCE);

    eNamedQueryEClass = createEClass(ENAMED_QUERY);
    createEAttribute(eNamedQueryEClass, ENAMED_QUERY__RETURN_TYPE);
    createEAttribute(eNamedQueryEClass, ENAMED_QUERY__NAME);
    createEReference(eNamedQueryEClass, ENAMED_QUERY__PARAMETERS);
    createEReference(eNamedQueryEClass, ENAMED_QUERY__QUERIES);

    eNamedCustomQueryEClass = createEClass(ENAMED_CUSTOM_QUERY);
    createEReference(eNamedCustomQueryEClass, ENAMED_CUSTOM_QUERY__RETURN_TYPE);
    createEAttribute(eNamedCustomQueryEClass, ENAMED_CUSTOM_QUERY__LIST);
    createEAttribute(eNamedCustomQueryEClass, ENAMED_CUSTOM_QUERY__NAME);
    createEReference(eNamedCustomQueryEClass, ENAMED_CUSTOM_QUERY__PARAMETERS);
    createEReference(eNamedCustomQueryEClass, ENAMED_CUSTOM_QUERY__QUERIES);

    eReturnTypeEClass = createEClass(ERETURN_TYPE);

    ePredefinedTypeEClass = createEClass(EPREDEFINED_TYPE);
    createEAttribute(ePredefinedTypeEClass, EPREDEFINED_TYPE__REF);

    eTypeDefEClass = createEClass(ETYPE_DEF);
    createEAttribute(eTypeDefEClass, ETYPE_DEF__NAME);
    createEReference(eTypeDefEClass, ETYPE_DEF__TYPES);

    eModelTypeDefEClass = createEClass(EMODEL_TYPE_DEF);
    createEReference(eModelTypeDefEClass, EMODEL_TYPE_DEF__ECLASS_DEF);
    createEReference(eModelTypeDefEClass, EMODEL_TYPE_DEF__ATTRIBUTES);

    eModelTypeAttributeEClass = createEClass(EMODEL_TYPE_ATTRIBUTE);
    createEAttribute(eModelTypeAttributeEClass, EMODEL_TYPE_ATTRIBUTE__NAME);
    createEReference(eModelTypeAttributeEClass, EMODEL_TYPE_ATTRIBUTE__QUERY);
    createEAttribute(eModelTypeAttributeEClass, EMODEL_TYPE_ATTRIBUTE__PARAMETERS);
    createEAttribute(eModelTypeAttributeEClass, EMODEL_TYPE_ATTRIBUTE__CACHED);
    createEAttribute(eModelTypeAttributeEClass, EMODEL_TYPE_ATTRIBUTE__CACHE_NAME);

    eValueTypeAttributeEClass = createEClass(EVALUE_TYPE_ATTRIBUTE);
    createEAttribute(eValueTypeAttributeEClass, EVALUE_TYPE_ATTRIBUTE__TYPE);
    createEAttribute(eValueTypeAttributeEClass, EVALUE_TYPE_ATTRIBUTE__NAME);

    eParameterEClass = createEClass(EPARAMETER);
    createEAttribute(eParameterEClass, EPARAMETER__ID);
    createEAttribute(eParameterEClass, EPARAMETER__TYPE);
    createEAttribute(eParameterEClass, EPARAMETER__NAME);

    eQueryEClass = createEClass(EQUERY);
    createEAttribute(eQueryEClass, EQUERY__DB_TYPE);
    createEReference(eQueryEClass, EQUERY__MAPPING);
    createEAttribute(eQueryEClass, EQUERY__FROM);
    createEAttribute(eQueryEClass, EQUERY__WHERE);
    createEAttribute(eQueryEClass, EQUERY__GROUP_BY);
    createEAttribute(eQueryEClass, EQUERY__ORDERBY);
    createEAttribute(eQueryEClass, EQUERY__ALL);

    eCustomQueryEClass = createEClass(ECUSTOM_QUERY);
    createEAttribute(eCustomQueryEClass, ECUSTOM_QUERY__DB_TYPE);
    createEAttribute(eCustomQueryEClass, ECUSTOM_QUERY__COLUMNS);
    createEAttribute(eCustomQueryEClass, ECUSTOM_QUERY__FROM);
    createEAttribute(eCustomQueryEClass, ECUSTOM_QUERY__WHERE);
    createEAttribute(eCustomQueryEClass, ECUSTOM_QUERY__GROUP_BY);
    createEAttribute(eCustomQueryEClass, ECUSTOM_QUERY__ORDERBY);
    createEAttribute(eCustomQueryEClass, ECUSTOM_QUERY__ALL);

    eObjectSectionEClass = createEClass(EOBJECT_SECTION);
    createEReference(eObjectSectionEClass, EOBJECT_SECTION__ENTITY);
    createEReference(eObjectSectionEClass, EOBJECT_SECTION__DESCRIMINATED_TYPES);
    createEAttribute(eObjectSectionEClass, EOBJECT_SECTION__PREFIX);
    createEReference(eObjectSectionEClass, EOBJECT_SECTION__ATTRIBUTES);

    eMappingAttributeEClass = createEClass(EMAPPING_ATTRIBUTE);
    createEAttribute(eMappingAttributeEClass, EMAPPING_ATTRIBUTE__PK);
    createEAttribute(eMappingAttributeEClass, EMAPPING_ATTRIBUTE__PROPERTY);
    createEAttribute(eMappingAttributeEClass, EMAPPING_ATTRIBUTE__COLUMN_NAME);
    createEAttribute(eMappingAttributeEClass, EMAPPING_ATTRIBUTE__RESOLVED);
    createEReference(eMappingAttributeEClass, EMAPPING_ATTRIBUTE__QUERY);
    createEAttribute(eMappingAttributeEClass, EMAPPING_ATTRIBUTE__PARAMETERS);
    createEAttribute(eMappingAttributeEClass, EMAPPING_ATTRIBUTE__MAPPED);
    createEReference(eMappingAttributeEClass, EMAPPING_ATTRIBUTE__MAP);

    eTypeEClass = createEClass(ETYPE);
    createEAttribute(eTypeEClass, ETYPE__URL);
    createEAttribute(eTypeEClass, ETYPE__NAME);

    // Create enums
    returnTypeEEnum = createEEnum(RETURN_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    ePredefinedTypeEClass.getESuperTypes().add(this.getEReturnType());
    eTypeDefEClass.getESuperTypes().add(this.getEReturnType());
    eModelTypeDefEClass.getESuperTypes().add(this.getEReturnType());

    // Initialize classes and features; add operations and parameters
    initEClass(eMappingEClass, EMapping.class, "EMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEMapping_Root(), ecorePackage.getEObject(), null, "root", null, 0, 1, EMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eMappingBundleEClass, EMappingBundle.class, "EMappingBundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEMappingBundle_Imports(), this.getImport(), null, "imports", null, 0, -1, EMappingBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMappingBundle_Name(), ecorePackage.getEString(), "name", null, 0, 1, EMappingBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMappingBundle_Entities(), this.getEMappingEntity(), null, "entities", null, 0, -1, EMappingBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMappingBundle_Databases(), ecorePackage.getEString(), "databases", null, 0, -1, EMappingBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eMappingEntityDefEClass, EMappingEntityDef.class, "EMappingEntityDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEMappingEntityDef_Package(), this.getPackageDeclaration(), null, "package", null, 0, 1, EMappingEntityDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMappingEntityDef_Imports(), this.getImport(), null, "imports", null, 0, -1, EMappingEntityDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMappingEntityDef_Entity(), this.getEMappingEntity(), null, "entity", null, 0, 1, EMappingEntityDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eMappingEntityEClass, EMappingEntity.class, "EMappingEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEMappingEntity_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, EMappingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMappingEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, EMappingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMappingEntity_ExtensionType(), ecorePackage.getEString(), "extensionType", null, 0, 1, EMappingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMappingEntity_Parent(), this.getEMappingEntity(), null, "parent", null, 0, 1, EMappingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMappingEntity_Etype(), this.getEType(), null, "etype", null, 0, 1, EMappingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMappingEntity_Attributes(), this.getEAttribute(), null, "attributes", null, 0, -1, EMappingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMappingEntity_NamedQueries(), this.getENamedQuery(), null, "namedQueries", null, 0, -1, EMappingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMappingEntity_NamedCustomQueries(), this.getENamedCustomQuery(), null, "namedCustomQueries", null, 0, -1, EMappingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMappingEntity_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, EMappingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMappingEntity_DescriminationColumn(), ecorePackage.getEString(), "descriminationColumn", null, 0, 1, EMappingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eAttributeEClass, at.bestsolution.persistence.emap.eMap.EAttribute.class, "EAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEAttribute_Pk(), ecorePackage.getEBoolean(), "pk", null, 0, 1, at.bestsolution.persistence.emap.eMap.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEAttribute_ForcedFk(), ecorePackage.getEBoolean(), "forcedFk", null, 0, 1, at.bestsolution.persistence.emap.eMap.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, at.bestsolution.persistence.emap.eMap.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEAttribute_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, at.bestsolution.persistence.emap.eMap.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEAttribute_ValueGenerators(), this.getEValueGenerator(), null, "valueGenerators", null, 0, -1, at.bestsolution.persistence.emap.eMap.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEAttribute_Resolved(), ecorePackage.getEBoolean(), "resolved", null, 0, 1, at.bestsolution.persistence.emap.eMap.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEAttribute_Query(), this.getENamedQuery(), null, "query", null, 0, 1, at.bestsolution.persistence.emap.eMap.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEAttribute_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, at.bestsolution.persistence.emap.eMap.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEAttribute_Opposite(), this.getEAttribute(), null, "opposite", null, 0, 1, at.bestsolution.persistence.emap.eMap.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEAttribute_RelationTable(), ecorePackage.getEString(), "relationTable", null, 0, 1, at.bestsolution.persistence.emap.eMap.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEAttribute_RelationColumn(), ecorePackage.getEString(), "relationColumn", null, 0, 1, at.bestsolution.persistence.emap.eMap.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eValueGeneratorEClass, EValueGenerator.class, "EValueGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEValueGenerator_DbType(), ecorePackage.getEString(), "dbType", null, 0, 1, EValueGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEValueGenerator_Autokey(), ecorePackage.getEBoolean(), "autokey", null, 0, 1, EValueGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEValueGenerator_Query(), ecorePackage.getEString(), "query", null, 0, 1, EValueGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEValueGenerator_Sequence(), ecorePackage.getEString(), "sequence", null, 0, 1, EValueGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eNamedQueryEClass, ENamedQuery.class, "ENamedQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getENamedQuery_ReturnType(), this.getReturnType(), "returnType", null, 0, 1, ENamedQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENamedQuery_Name(), ecorePackage.getEString(), "name", null, 0, 1, ENamedQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getENamedQuery_Parameters(), this.getEParameter(), null, "parameters", null, 0, -1, ENamedQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getENamedQuery_Queries(), this.getEQuery(), null, "queries", null, 0, -1, ENamedQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eNamedCustomQueryEClass, ENamedCustomQuery.class, "ENamedCustomQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getENamedCustomQuery_ReturnType(), this.getEReturnType(), null, "returnType", null, 0, 1, ENamedCustomQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENamedCustomQuery_List(), ecorePackage.getEBoolean(), "list", null, 0, 1, ENamedCustomQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getENamedCustomQuery_Name(), ecorePackage.getEString(), "name", null, 0, 1, ENamedCustomQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getENamedCustomQuery_Parameters(), this.getEParameter(), null, "parameters", null, 0, -1, ENamedCustomQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getENamedCustomQuery_Queries(), this.getECustomQuery(), null, "queries", null, 0, -1, ENamedCustomQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eReturnTypeEClass, EReturnType.class, "EReturnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ePredefinedTypeEClass, EPredefinedType.class, "EPredefinedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEPredefinedType_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, EPredefinedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eTypeDefEClass, ETypeDef.class, "ETypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETypeDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, ETypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETypeDef_Types(), this.getEValueTypeAttribute(), null, "types", null, 0, -1, ETypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eModelTypeDefEClass, EModelTypeDef.class, "EModelTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEModelTypeDef_EclassDef(), this.getEType(), null, "eclassDef", null, 0, 1, EModelTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEModelTypeDef_Attributes(), this.getEModelTypeAttribute(), null, "attributes", null, 0, -1, EModelTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eModelTypeAttributeEClass, EModelTypeAttribute.class, "EModelTypeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEModelTypeAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, EModelTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEModelTypeAttribute_Query(), this.getENamedCustomQuery(), null, "query", null, 0, 1, EModelTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEModelTypeAttribute_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, EModelTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEModelTypeAttribute_Cached(), ecorePackage.getEBoolean(), "cached", null, 0, 1, EModelTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEModelTypeAttribute_CacheName(), ecorePackage.getEString(), "cacheName", null, 0, 1, EModelTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eValueTypeAttributeEClass, EValueTypeAttribute.class, "EValueTypeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEValueTypeAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, EValueTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEValueTypeAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, EValueTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eParameterEClass, EParameter.class, "EParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEParameter_Id(), ecorePackage.getEBoolean(), "id", null, 0, 1, EParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, EParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, EParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eQueryEClass, EQuery.class, "EQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEQuery_DbType(), ecorePackage.getEString(), "dbType", null, 0, 1, EQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEQuery_Mapping(), this.getEObjectSection(), null, "mapping", null, 0, 1, EQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEQuery_From(), ecorePackage.getEString(), "from", null, 0, 1, EQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEQuery_Where(), ecorePackage.getEString(), "where", null, 0, 1, EQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEQuery_GroupBy(), ecorePackage.getEString(), "groupBy", null, 0, 1, EQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEQuery_Orderby(), ecorePackage.getEString(), "orderby", null, 0, 1, EQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEQuery_All(), ecorePackage.getEString(), "all", null, 0, 1, EQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eCustomQueryEClass, ECustomQuery.class, "ECustomQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getECustomQuery_DbType(), ecorePackage.getEString(), "dbType", null, 0, 1, ECustomQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getECustomQuery_Columns(), ecorePackage.getEString(), "columns", null, 0, 1, ECustomQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getECustomQuery_From(), ecorePackage.getEString(), "from", null, 0, 1, ECustomQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getECustomQuery_Where(), ecorePackage.getEString(), "where", null, 0, 1, ECustomQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getECustomQuery_GroupBy(), ecorePackage.getEString(), "groupBy", null, 0, 1, ECustomQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getECustomQuery_Orderby(), ecorePackage.getEString(), "orderby", null, 0, 1, ECustomQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getECustomQuery_All(), ecorePackage.getEString(), "all", null, 0, 1, ECustomQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eObjectSectionEClass, EObjectSection.class, "EObjectSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEObjectSection_Entity(), this.getEMappingEntity(), null, "entity", null, 0, 1, EObjectSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEObjectSection_DescriminatedTypes(), this.getEMappingEntity(), null, "descriminatedTypes", null, 0, -1, EObjectSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEObjectSection_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, EObjectSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEObjectSection_Attributes(), this.getEMappingAttribute(), null, "attributes", null, 0, -1, EObjectSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eMappingAttributeEClass, EMappingAttribute.class, "EMappingAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEMappingAttribute_Pk(), ecorePackage.getEBoolean(), "pk", null, 0, 1, EMappingAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMappingAttribute_Property(), ecorePackage.getEString(), "property", null, 0, 1, EMappingAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMappingAttribute_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, EMappingAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMappingAttribute_Resolved(), ecorePackage.getEBoolean(), "resolved", null, 0, 1, EMappingAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMappingAttribute_Query(), this.getENamedQuery(), null, "query", null, 0, 1, EMappingAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMappingAttribute_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, EMappingAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMappingAttribute_Mapped(), ecorePackage.getEBoolean(), "mapped", null, 0, 1, EMappingAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMappingAttribute_Map(), this.getEObjectSection(), null, "map", null, 0, 1, EMappingAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eTypeEClass, EType.class, "EType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEType_Url(), ecorePackage.getEString(), "url", null, 0, 1, EType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEType_Name(), ecorePackage.getEString(), "name", null, 0, 1, EType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(returnTypeEEnum, ReturnType.class, "ReturnType");
    addEEnumLiteral(returnTypeEEnum, ReturnType.LIST);
    addEEnumLiteral(returnTypeEEnum, ReturnType.SINGLE);

    // Create resource
    createResource(eNS_URI);
  }

} //EMapPackageImpl

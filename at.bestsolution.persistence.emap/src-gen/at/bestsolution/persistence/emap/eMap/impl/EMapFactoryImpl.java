/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMapFactoryImpl extends EFactoryImpl implements EMapFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EMapFactory init()
  {
    try
    {
      EMapFactory theEMapFactory = (EMapFactory)EPackage.Registry.INSTANCE.getEFactory(EMapPackage.eNS_URI);
      if (theEMapFactory != null)
      {
        return theEMapFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EMapFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMapFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EMapPackage.EMAPPING: return createEMapping();
      case EMapPackage.EMAPPING_BUNDLE: return createEMappingBundle();
      case EMapPackage.EMAPPING_ENTITY_DEF: return createEMappingEntityDef();
      case EMapPackage.IMPORT: return createImport();
      case EMapPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case EMapPackage.EMAPPING_ENTITY: return createEMappingEntity();
      case EMapPackage.EATTRIBUTE: return createEAttribute();
      case EMapPackage.EVALUE_GENERATOR: return createEValueGenerator();
      case EMapPackage.ENAMED_QUERY: return createENamedQuery();
      case EMapPackage.EPARAMETER: return createEParameter();
      case EMapPackage.EQUERY: return createEQuery();
      case EMapPackage.EOBJECT_SECTION: return createEObjectSection();
      case EMapPackage.EMAPPING_ATTRIBUTE: return createEMappingAttribute();
      case EMapPackage.ETYPE: return createEType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EMapPackage.RETURN_TYPE:
        return createReturnTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EMapPackage.RETURN_TYPE:
        return convertReturnTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMapping createEMapping()
  {
    EMappingImpl eMapping = new EMappingImpl();
    return eMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMappingBundle createEMappingBundle()
  {
    EMappingBundleImpl eMappingBundle = new EMappingBundleImpl();
    return eMappingBundle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMappingEntityDef createEMappingEntityDef()
  {
    EMappingEntityDefImpl eMappingEntityDef = new EMappingEntityDefImpl();
    return eMappingEntityDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMappingEntity createEMappingEntity()
  {
    EMappingEntityImpl eMappingEntity = new EMappingEntityImpl();
    return eMappingEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute createEAttribute()
  {
    EAttributeImpl eAttribute = new EAttributeImpl();
    return eAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EValueGenerator createEValueGenerator()
  {
    EValueGeneratorImpl eValueGenerator = new EValueGeneratorImpl();
    return eValueGenerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamedQuery createENamedQuery()
  {
    ENamedQueryImpl eNamedQuery = new ENamedQueryImpl();
    return eNamedQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EParameter createEParameter()
  {
    EParameterImpl eParameter = new EParameterImpl();
    return eParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EQuery createEQuery()
  {
    EQueryImpl eQuery = new EQueryImpl();
    return eQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObjectSection createEObjectSection()
  {
    EObjectSectionImpl eObjectSection = new EObjectSectionImpl();
    return eObjectSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMappingAttribute createEMappingAttribute()
  {
    EMappingAttributeImpl eMappingAttribute = new EMappingAttributeImpl();
    return eMappingAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EType createEType()
  {
    ETypeImpl eType = new ETypeImpl();
    return eType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnType createReturnTypeFromString(EDataType eDataType, String initialValue)
  {
    ReturnType result = ReturnType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertReturnTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMapPackage getEMapPackage()
  {
    return (EMapPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EMapPackage getPackage()
  {
    return EMapPackage.eINSTANCE;
  }

} //EMapFactoryImpl

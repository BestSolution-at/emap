/**
 */
package at.bestsolution.persistence.emap.eMap.util;

import at.bestsolution.persistence.emap.eMap.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage
 * @generated
 */
public class EMapAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EMapPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMapAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EMapPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMapSwitch<Adapter> modelSwitch =
    new EMapSwitch<Adapter>()
    {
      @Override
      public Adapter caseEMapping(EMapping object)
      {
        return createEMappingAdapter();
      }
      @Override
      public Adapter caseEMappingBundle(EMappingBundle object)
      {
        return createEMappingBundleAdapter();
      }
      @Override
      public Adapter caseEPredef(EPredef object)
      {
        return createEPredefAdapter();
      }
      @Override
      public Adapter caseEGeneratorDef(EGeneratorDef object)
      {
        return createEGeneratorDefAdapter();
      }
      @Override
      public Adapter caseEGeneratorConfigValue(EGeneratorConfigValue object)
      {
        return createEGeneratorConfigValueAdapter();
      }
      @Override
      public Adapter caseEBundleEntity(EBundleEntity object)
      {
        return createEBundleEntityAdapter();
      }
      @Override
      public Adapter caseEIndex(EIndex object)
      {
        return createEIndexAdapter();
      }
      @Override
      public Adapter caseEFkConstraint(EFkConstraint object)
      {
        return createEFkConstraintAdapter();
      }
      @Override
      public Adapter caseEUniqueConstraint(EUniqueConstraint object)
      {
        return createEUniqueConstraintAdapter();
      }
      @Override
      public Adapter caseESQLAttTypeDef(ESQLAttTypeDef object)
      {
        return createESQLAttTypeDefAdapter();
      }
      @Override
      public Adapter caseESQLTypeDef(ESQLTypeDef object)
      {
        return createESQLTypeDefAdapter();
      }
      @Override
      public Adapter caseESQLDbType(ESQLDbType object)
      {
        return createESQLDbTypeAdapter();
      }
      @Override
      public Adapter caseERestServiceMapping(ERestServiceMapping object)
      {
        return createERestServiceMappingAdapter();
      }
      @Override
      public Adapter caseENamedServiceQuery(ENamedServiceQuery object)
      {
        return createENamedServiceQueryAdapter();
      }
      @Override
      public Adapter caseEGreedyAttributePath(EGreedyAttributePath object)
      {
        return createEGreedyAttributePathAdapter();
      }
      @Override
      public Adapter caseEServiceParam(EServiceParam object)
      {
        return createEServiceParamAdapter();
      }
      @Override
      public Adapter caseEPathParam(EPathParam object)
      {
        return createEPathParamAdapter();
      }
      @Override
      public Adapter caseEQueryParam(EQueryParam object)
      {
        return createEQueryParamAdapter();
      }
      @Override
      public Adapter caseEMappingEntityDef(EMappingEntityDef object)
      {
        return createEMappingEntityDefAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter casePackageDeclaration(PackageDeclaration object)
      {
        return createPackageDeclarationAdapter();
      }
      @Override
      public Adapter caseEMappingEntity(EMappingEntity object)
      {
        return createEMappingEntityAdapter();
      }
      @Override
      public Adapter caseEAttribute(EAttribute object)
      {
        return createEAttributeAdapter();
      }
      @Override
      public Adapter caseEValueGenerator(EValueGenerator object)
      {
        return createEValueGeneratorAdapter();
      }
      @Override
      public Adapter caseENamedQuery(ENamedQuery object)
      {
        return createENamedQueryAdapter();
      }
      @Override
      public Adapter caseENamedCustomQuery(ENamedCustomQuery object)
      {
        return createENamedCustomQueryAdapter();
      }
      @Override
      public Adapter caseEReturnType(EReturnType object)
      {
        return createEReturnTypeAdapter();
      }
      @Override
      public Adapter caseEPredefinedType(EPredefinedType object)
      {
        return createEPredefinedTypeAdapter();
      }
      @Override
      public Adapter caseETypeDef(ETypeDef object)
      {
        return createETypeDefAdapter();
      }
      @Override
      public Adapter caseEModelTypeDef(EModelTypeDef object)
      {
        return createEModelTypeDefAdapter();
      }
      @Override
      public Adapter caseEModelTypeAttribute(EModelTypeAttribute object)
      {
        return createEModelTypeAttributeAdapter();
      }
      @Override
      public Adapter caseEValueTypeAttribute(EValueTypeAttribute object)
      {
        return createEValueTypeAttributeAdapter();
      }
      @Override
      public Adapter caseEParameter(EParameter object)
      {
        return createEParameterAdapter();
      }
      @Override
      public Adapter caseEQuery(EQuery object)
      {
        return createEQueryAdapter();
      }
      @Override
      public Adapter caseECustomQuery(ECustomQuery object)
      {
        return createECustomQueryAdapter();
      }
      @Override
      public Adapter caseEObjectSection(EObjectSection object)
      {
        return createEObjectSectionAdapter();
      }
      @Override
      public Adapter caseEMappingAttribute(EMappingAttribute object)
      {
        return createEMappingAttributeAdapter();
      }
      @Override
      public Adapter caseEType(EType object)
      {
        return createETypeAdapter();
      }
      @Override
      public Adapter caseEPredefSequence(EPredefSequence object)
      {
        return createEPredefSequenceAdapter();
      }
      @Override
      public Adapter caseEPredefTable(EPredefTable object)
      {
        return createEPredefTableAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EMapping <em>EMapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EMapping
   * @generated
   */
  public Adapter createEMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle <em>EMapping Bundle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EMappingBundle
   * @generated
   */
  public Adapter createEMappingBundleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EPredef <em>EPredef</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EPredef
   * @generated
   */
  public Adapter createEPredefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EGeneratorDef <em>EGenerator Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EGeneratorDef
   * @generated
   */
  public Adapter createEGeneratorDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue <em>EGenerator Config Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue
   * @generated
   */
  public Adapter createEGeneratorConfigValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EBundleEntity <em>EBundle Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EBundleEntity
   * @generated
   */
  public Adapter createEBundleEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EIndex <em>EIndex</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EIndex
   * @generated
   */
  public Adapter createEIndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EFkConstraint <em>EFk Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EFkConstraint
   * @generated
   */
  public Adapter createEFkConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EUniqueConstraint <em>EUnique Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EUniqueConstraint
   * @generated
   */
  public Adapter createEUniqueConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef <em>ESQL Att Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef
   * @generated
   */
  public Adapter createESQLAttTypeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.ESQLTypeDef <em>ESQL Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.ESQLTypeDef
   * @generated
   */
  public Adapter createESQLTypeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.ESQLDbType <em>ESQL Db Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.ESQLDbType
   * @generated
   */
  public Adapter createESQLDbTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.ERestServiceMapping <em>ERest Service Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.ERestServiceMapping
   * @generated
   */
  public Adapter createERestServiceMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery <em>ENamed Service Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.ENamedServiceQuery
   * @generated
   */
  public Adapter createENamedServiceQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EGreedyAttributePath <em>EGreedy Attribute Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EGreedyAttributePath
   * @generated
   */
  public Adapter createEGreedyAttributePathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EServiceParam <em>EService Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EServiceParam
   * @generated
   */
  public Adapter createEServiceParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EPathParam <em>EPath Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EPathParam
   * @generated
   */
  public Adapter createEPathParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EQueryParam <em>EQuery Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EQueryParam
   * @generated
   */
  public Adapter createEQueryParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EMappingEntityDef <em>EMapping Entity Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntityDef
   * @generated
   */
  public Adapter createEMappingEntityDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity <em>EMapping Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EMappingEntity
   * @generated
   */
  public Adapter createEMappingEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EAttribute <em>EAttribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EAttribute
   * @generated
   */
  public Adapter createEAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EValueGenerator <em>EValue Generator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EValueGenerator
   * @generated
   */
  public Adapter createEValueGeneratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.ENamedQuery <em>ENamed Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.ENamedQuery
   * @generated
   */
  public Adapter createENamedQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery <em>ENamed Custom Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.ENamedCustomQuery
   * @generated
   */
  public Adapter createENamedCustomQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EReturnType <em>EReturn Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EReturnType
   * @generated
   */
  public Adapter createEReturnTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EPredefinedType <em>EPredefined Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EPredefinedType
   * @generated
   */
  public Adapter createEPredefinedTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.ETypeDef <em>EType Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.ETypeDef
   * @generated
   */
  public Adapter createETypeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EModelTypeDef <em>EModel Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EModelTypeDef
   * @generated
   */
  public Adapter createEModelTypeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute <em>EModel Type Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EModelTypeAttribute
   * @generated
   */
  public Adapter createEModelTypeAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EValueTypeAttribute <em>EValue Type Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EValueTypeAttribute
   * @generated
   */
  public Adapter createEValueTypeAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EParameter <em>EParameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EParameter
   * @generated
   */
  public Adapter createEParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EQuery <em>EQuery</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EQuery
   * @generated
   */
  public Adapter createEQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery <em>ECustom Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.ECustomQuery
   * @generated
   */
  public Adapter createECustomQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EObjectSection <em>EObject Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EObjectSection
   * @generated
   */
  public Adapter createEObjectSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute <em>EMapping Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EMappingAttribute
   * @generated
   */
  public Adapter createEMappingAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EType <em>EType</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EType
   * @generated
   */
  public Adapter createETypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EPredefSequence <em>EPredef Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EPredefSequence
   * @generated
   */
  public Adapter createEPredefSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.persistence.emap.eMap.EPredefTable <em>EPredef Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.persistence.emap.eMap.EPredefTable
   * @generated
   */
  public Adapter createEPredefTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EMapAdapterFactory

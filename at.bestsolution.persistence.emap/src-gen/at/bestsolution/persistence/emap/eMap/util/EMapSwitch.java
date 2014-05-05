/**
 */
package at.bestsolution.persistence.emap.eMap.util;

import at.bestsolution.persistence.emap.eMap.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage
 * @generated
 */
public class EMapSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EMapPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMapSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EMapPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EMapPackage.EMAPPING:
      {
        EMapping eMapping = (EMapping)theEObject;
        T result = caseEMapping(eMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.EMAPPING_BUNDLE:
      {
        EMappingBundle eMappingBundle = (EMappingBundle)theEObject;
        T result = caseEMappingBundle(eMappingBundle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.EMAPPING_ENTITY_DEF:
      {
        EMappingEntityDef eMappingEntityDef = (EMappingEntityDef)theEObject;
        T result = caseEMappingEntityDef(eMappingEntityDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.PACKAGE_DECLARATION:
      {
        PackageDeclaration packageDeclaration = (PackageDeclaration)theEObject;
        T result = casePackageDeclaration(packageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.EMAPPING_ENTITY:
      {
        EMappingEntity eMappingEntity = (EMappingEntity)theEObject;
        T result = caseEMappingEntity(eMappingEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.EATTRIBUTE:
      {
        EAttribute eAttribute = (EAttribute)theEObject;
        T result = caseEAttribute(eAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.EVALUE_GENERATOR:
      {
        EValueGenerator eValueGenerator = (EValueGenerator)theEObject;
        T result = caseEValueGenerator(eValueGenerator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.ENAMED_QUERY:
      {
        ENamedQuery eNamedQuery = (ENamedQuery)theEObject;
        T result = caseENamedQuery(eNamedQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.ENAMED_CUSTOM_QUERY:
      {
        ENamedCustomQuery eNamedCustomQuery = (ENamedCustomQuery)theEObject;
        T result = caseENamedCustomQuery(eNamedCustomQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.ERETURN_TYPE:
      {
        EReturnType eReturnType = (EReturnType)theEObject;
        T result = caseEReturnType(eReturnType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.EPREDEFINED_TYPE:
      {
        EPredefinedType ePredefinedType = (EPredefinedType)theEObject;
        T result = caseEPredefinedType(ePredefinedType);
        if (result == null) result = caseEReturnType(ePredefinedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.ETYPE_DEF:
      {
        ETypeDef eTypeDef = (ETypeDef)theEObject;
        T result = caseETypeDef(eTypeDef);
        if (result == null) result = caseEReturnType(eTypeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.EVALUE_TYPE_ATTRIBUTE:
      {
        EValueTypeAttribute eValueTypeAttribute = (EValueTypeAttribute)theEObject;
        T result = caseEValueTypeAttribute(eValueTypeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.EPARAMETER:
      {
        EParameter eParameter = (EParameter)theEObject;
        T result = caseEParameter(eParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.EQUERY:
      {
        EQuery eQuery = (EQuery)theEObject;
        T result = caseEQuery(eQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.ECUSTOM_QUERY:
      {
        ECustomQuery eCustomQuery = (ECustomQuery)theEObject;
        T result = caseECustomQuery(eCustomQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.EOBJECT_SECTION:
      {
        EObjectSection eObjectSection = (EObjectSection)theEObject;
        T result = caseEObjectSection(eObjectSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.EMAPPING_ATTRIBUTE:
      {
        EMappingAttribute eMappingAttribute = (EMappingAttribute)theEObject;
        T result = caseEMappingAttribute(eMappingAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EMapPackage.ETYPE:
      {
        EType eType = (EType)theEObject;
        T result = caseEType(eType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMapping(EMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMapping Bundle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMapping Bundle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMappingBundle(EMappingBundle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMapping Entity Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMapping Entity Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMappingEntityDef(EMappingEntityDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDeclaration(PackageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMapping Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMapping Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMappingEntity(EMappingEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EAttribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EAttribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEAttribute(EAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EValue Generator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EValue Generator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEValueGenerator(EValueGenerator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ENamed Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ENamed Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseENamedQuery(ENamedQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ENamed Custom Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ENamed Custom Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseENamedCustomQuery(ENamedCustomQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EReturn Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EReturn Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEReturnType(EReturnType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EPredefined Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EPredefined Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEPredefinedType(EPredefinedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EType Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EType Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETypeDef(ETypeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EValue Type Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EValue Type Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEValueTypeAttribute(EValueTypeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EParameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EParameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEParameter(EParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EQuery</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EQuery</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEQuery(EQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECustom Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECustom Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECustomQuery(ECustomQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEObjectSection(EObjectSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMapping Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMapping Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMappingAttribute(EMappingAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EType</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EType</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEType(EType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EMapSwitch

/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.ENamedQuery;
import at.bestsolution.persistence.emap.eMap.EParameter;
import at.bestsolution.persistence.emap.eMap.EQuery;
import at.bestsolution.persistence.emap.eMap.ReturnType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENamed Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedQueryImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedQueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedQueryImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedQueryImpl#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ENamedQueryImpl extends MinimalEObjectImpl.Container implements ENamedQuery
{
  /**
   * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected static final ReturnType RETURN_TYPE_EDEFAULT = ReturnType.LIST;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected ReturnType returnType = RETURN_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<EParameter> parameters;

  /**
   * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueries()
   * @generated
   * @ordered
   */
  protected EList<EQuery> queries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ENamedQueryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EMapPackage.Literals.ENAMED_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnType getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(ReturnType newReturnType)
  {
    ReturnType oldReturnType = returnType;
    returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ENAMED_QUERY__RETURN_TYPE, oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ENAMED_QUERY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<EParameter>(EParameter.class, this, EMapPackage.ENAMED_QUERY__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EQuery> getQueries()
  {
    if (queries == null)
    {
      queries = new EObjectContainmentEList<EQuery>(EQuery.class, this, EMapPackage.ENAMED_QUERY__QUERIES);
    }
    return queries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EMapPackage.ENAMED_QUERY__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case EMapPackage.ENAMED_QUERY__QUERIES:
        return ((InternalEList<?>)getQueries()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EMapPackage.ENAMED_QUERY__RETURN_TYPE:
        return getReturnType();
      case EMapPackage.ENAMED_QUERY__NAME:
        return getName();
      case EMapPackage.ENAMED_QUERY__PARAMETERS:
        return getParameters();
      case EMapPackage.ENAMED_QUERY__QUERIES:
        return getQueries();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EMapPackage.ENAMED_QUERY__RETURN_TYPE:
        setReturnType((ReturnType)newValue);
        return;
      case EMapPackage.ENAMED_QUERY__NAME:
        setName((String)newValue);
        return;
      case EMapPackage.ENAMED_QUERY__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends EParameter>)newValue);
        return;
      case EMapPackage.ENAMED_QUERY__QUERIES:
        getQueries().clear();
        getQueries().addAll((Collection<? extends EQuery>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EMapPackage.ENAMED_QUERY__RETURN_TYPE:
        setReturnType(RETURN_TYPE_EDEFAULT);
        return;
      case EMapPackage.ENAMED_QUERY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EMapPackage.ENAMED_QUERY__PARAMETERS:
        getParameters().clear();
        return;
      case EMapPackage.ENAMED_QUERY__QUERIES:
        getQueries().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EMapPackage.ENAMED_QUERY__RETURN_TYPE:
        return returnType != RETURN_TYPE_EDEFAULT;
      case EMapPackage.ENAMED_QUERY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EMapPackage.ENAMED_QUERY__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case EMapPackage.ENAMED_QUERY__QUERIES:
        return queries != null && !queries.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (returnType: ");
    result.append(returnType);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ENamedQueryImpl

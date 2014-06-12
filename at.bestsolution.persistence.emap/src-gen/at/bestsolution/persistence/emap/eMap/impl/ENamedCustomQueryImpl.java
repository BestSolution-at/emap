/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.ECustomQuery;
import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.ENamedCustomQuery;
import at.bestsolution.persistence.emap.eMap.EParameter;
import at.bestsolution.persistence.emap.eMap.EReturnType;

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
 * An implementation of the model object '<em><b>ENamed Custom Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedCustomQueryImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedCustomQueryImpl#isList <em>List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedCustomQueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedCustomQueryImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedCustomQueryImpl#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ENamedCustomQueryImpl extends MinimalEObjectImpl.Container implements ENamedCustomQuery
{
  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected EReturnType returnType;

  /**
   * The default value of the '{@link #isList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isList()
   * @generated
   * @ordered
   */
  protected static final boolean LIST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isList()
   * @generated
   * @ordered
   */
  protected boolean list = LIST_EDEFAULT;

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
  protected EList<ECustomQuery> queries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ENamedCustomQueryImpl()
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
    return EMapPackage.Literals.ENAMED_CUSTOM_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReturnType getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(EReturnType newReturnType, NotificationChain msgs)
  {
    EReturnType oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMapPackage.ENAMED_CUSTOM_QUERY__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(EReturnType newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMapPackage.ENAMED_CUSTOM_QUERY__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMapPackage.ENAMED_CUSTOM_QUERY__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ENAMED_CUSTOM_QUERY__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(boolean newList)
  {
    boolean oldList = list;
    list = newList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ENAMED_CUSTOM_QUERY__LIST, oldList, list));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ENAMED_CUSTOM_QUERY__NAME, oldName, name));
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
      parameters = new EObjectContainmentEList<EParameter>(EParameter.class, this, EMapPackage.ENAMED_CUSTOM_QUERY__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ECustomQuery> getQueries()
  {
    if (queries == null)
    {
      queries = new EObjectContainmentEList<ECustomQuery>(ECustomQuery.class, this, EMapPackage.ENAMED_CUSTOM_QUERY__QUERIES);
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
      case EMapPackage.ENAMED_CUSTOM_QUERY__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case EMapPackage.ENAMED_CUSTOM_QUERY__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case EMapPackage.ENAMED_CUSTOM_QUERY__QUERIES:
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
      case EMapPackage.ENAMED_CUSTOM_QUERY__RETURN_TYPE:
        return getReturnType();
      case EMapPackage.ENAMED_CUSTOM_QUERY__LIST:
        return isList();
      case EMapPackage.ENAMED_CUSTOM_QUERY__NAME:
        return getName();
      case EMapPackage.ENAMED_CUSTOM_QUERY__PARAMETERS:
        return getParameters();
      case EMapPackage.ENAMED_CUSTOM_QUERY__QUERIES:
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
      case EMapPackage.ENAMED_CUSTOM_QUERY__RETURN_TYPE:
        setReturnType((EReturnType)newValue);
        return;
      case EMapPackage.ENAMED_CUSTOM_QUERY__LIST:
        setList((Boolean)newValue);
        return;
      case EMapPackage.ENAMED_CUSTOM_QUERY__NAME:
        setName((String)newValue);
        return;
      case EMapPackage.ENAMED_CUSTOM_QUERY__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends EParameter>)newValue);
        return;
      case EMapPackage.ENAMED_CUSTOM_QUERY__QUERIES:
        getQueries().clear();
        getQueries().addAll((Collection<? extends ECustomQuery>)newValue);
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
      case EMapPackage.ENAMED_CUSTOM_QUERY__RETURN_TYPE:
        setReturnType((EReturnType)null);
        return;
      case EMapPackage.ENAMED_CUSTOM_QUERY__LIST:
        setList(LIST_EDEFAULT);
        return;
      case EMapPackage.ENAMED_CUSTOM_QUERY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EMapPackage.ENAMED_CUSTOM_QUERY__PARAMETERS:
        getParameters().clear();
        return;
      case EMapPackage.ENAMED_CUSTOM_QUERY__QUERIES:
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
      case EMapPackage.ENAMED_CUSTOM_QUERY__RETURN_TYPE:
        return returnType != null;
      case EMapPackage.ENAMED_CUSTOM_QUERY__LIST:
        return list != LIST_EDEFAULT;
      case EMapPackage.ENAMED_CUSTOM_QUERY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EMapPackage.ENAMED_CUSTOM_QUERY__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case EMapPackage.ENAMED_CUSTOM_QUERY__QUERIES:
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
    result.append(" (list: ");
    result.append(list);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ENamedCustomQueryImpl

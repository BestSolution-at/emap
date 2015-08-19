/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EGreedyAttributePath;
import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.ENamedQuery;
import at.bestsolution.persistence.emap.eMap.ENamedServiceQuery;
import at.bestsolution.persistence.emap.eMap.EServiceParam;

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
 * An implementation of the model object '<em><b>ENamed Service Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedServiceQueryImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedServiceQueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedServiceQueryImpl#getPath <em>Path</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedServiceQueryImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ENamedServiceQueryImpl#getGreedyAttributePathList <em>Greedy Attribute Path List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ENamedServiceQueryImpl extends MinimalEObjectImpl.Container implements ENamedServiceQuery
{
  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected ENamedQuery query;

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
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<EServiceParam> parameters;

  /**
   * The cached value of the '{@link #getGreedyAttributePathList() <em>Greedy Attribute Path List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreedyAttributePathList()
   * @generated
   * @ordered
   */
  protected EList<EGreedyAttributePath> greedyAttributePathList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ENamedServiceQueryImpl()
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
    return EMapPackage.Literals.ENAMED_SERVICE_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamedQuery getQuery()
  {
    if (query != null && query.eIsProxy())
    {
      InternalEObject oldQuery = (InternalEObject)query;
      query = (ENamedQuery)eResolveProxy(oldQuery);
      if (query != oldQuery)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.ENAMED_SERVICE_QUERY__QUERY, oldQuery, query));
      }
    }
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamedQuery basicGetQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(ENamedQuery newQuery)
  {
    ENamedQuery oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ENAMED_SERVICE_QUERY__QUERY, oldQuery, query));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ENAMED_SERVICE_QUERY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ENAMED_SERVICE_QUERY__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EServiceParam> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<EServiceParam>(EServiceParam.class, this, EMapPackage.ENAMED_SERVICE_QUERY__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EGreedyAttributePath> getGreedyAttributePathList()
  {
    if (greedyAttributePathList == null)
    {
      greedyAttributePathList = new EObjectContainmentEList<EGreedyAttributePath>(EGreedyAttributePath.class, this, EMapPackage.ENAMED_SERVICE_QUERY__GREEDY_ATTRIBUTE_PATH_LIST);
    }
    return greedyAttributePathList;
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
      case EMapPackage.ENAMED_SERVICE_QUERY__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case EMapPackage.ENAMED_SERVICE_QUERY__GREEDY_ATTRIBUTE_PATH_LIST:
        return ((InternalEList<?>)getGreedyAttributePathList()).basicRemove(otherEnd, msgs);
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
      case EMapPackage.ENAMED_SERVICE_QUERY__QUERY:
        if (resolve) return getQuery();
        return basicGetQuery();
      case EMapPackage.ENAMED_SERVICE_QUERY__NAME:
        return getName();
      case EMapPackage.ENAMED_SERVICE_QUERY__PATH:
        return getPath();
      case EMapPackage.ENAMED_SERVICE_QUERY__PARAMETERS:
        return getParameters();
      case EMapPackage.ENAMED_SERVICE_QUERY__GREEDY_ATTRIBUTE_PATH_LIST:
        return getGreedyAttributePathList();
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
      case EMapPackage.ENAMED_SERVICE_QUERY__QUERY:
        setQuery((ENamedQuery)newValue);
        return;
      case EMapPackage.ENAMED_SERVICE_QUERY__NAME:
        setName((String)newValue);
        return;
      case EMapPackage.ENAMED_SERVICE_QUERY__PATH:
        setPath((String)newValue);
        return;
      case EMapPackage.ENAMED_SERVICE_QUERY__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends EServiceParam>)newValue);
        return;
      case EMapPackage.ENAMED_SERVICE_QUERY__GREEDY_ATTRIBUTE_PATH_LIST:
        getGreedyAttributePathList().clear();
        getGreedyAttributePathList().addAll((Collection<? extends EGreedyAttributePath>)newValue);
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
      case EMapPackage.ENAMED_SERVICE_QUERY__QUERY:
        setQuery((ENamedQuery)null);
        return;
      case EMapPackage.ENAMED_SERVICE_QUERY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EMapPackage.ENAMED_SERVICE_QUERY__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case EMapPackage.ENAMED_SERVICE_QUERY__PARAMETERS:
        getParameters().clear();
        return;
      case EMapPackage.ENAMED_SERVICE_QUERY__GREEDY_ATTRIBUTE_PATH_LIST:
        getGreedyAttributePathList().clear();
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
      case EMapPackage.ENAMED_SERVICE_QUERY__QUERY:
        return query != null;
      case EMapPackage.ENAMED_SERVICE_QUERY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EMapPackage.ENAMED_SERVICE_QUERY__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case EMapPackage.ENAMED_SERVICE_QUERY__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case EMapPackage.ENAMED_SERVICE_QUERY__GREEDY_ATTRIBUTE_PATH_LIST:
        return greedyAttributePathList != null && !greedyAttributePathList.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", path: ");
    result.append(path);
    result.append(')');
    return result.toString();
  }

} //ENamedServiceQueryImpl

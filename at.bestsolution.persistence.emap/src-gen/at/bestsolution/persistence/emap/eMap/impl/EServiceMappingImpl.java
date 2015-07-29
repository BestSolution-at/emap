/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.EMappingEntity;
import at.bestsolution.persistence.emap.eMap.ENamedQuery;
import at.bestsolution.persistence.emap.eMap.ENamedServiceQuery;
import at.bestsolution.persistence.emap.eMap.EServiceMapping;
import at.bestsolution.persistence.emap.eMap.PackageDeclaration;

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
 * An implementation of the model object '<em><b>EService Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EServiceMappingImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EServiceMappingImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EServiceMappingImpl#isList <em>List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EServiceMappingImpl#getListQuery <em>List Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EServiceMappingImpl#isGet <em>Get</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EServiceMappingImpl#getGetQuery <em>Get Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EServiceMappingImpl#isUpdate <em>Update</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EServiceMappingImpl#isInsert <em>Insert</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EServiceMappingImpl#isDelete <em>Delete</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EServiceMappingImpl#getServiceMethods <em>Service Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EServiceMappingImpl extends MinimalEObjectImpl.Container implements EServiceMapping
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected PackageDeclaration package_;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected EMappingEntity entity;

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
   * The cached value of the '{@link #getListQuery() <em>List Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListQuery()
   * @generated
   * @ordered
   */
  protected ENamedQuery listQuery;

  /**
   * The default value of the '{@link #isGet() <em>Get</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGet()
   * @generated
   * @ordered
   */
  protected static final boolean GET_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGet() <em>Get</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGet()
   * @generated
   * @ordered
   */
  protected boolean get = GET_EDEFAULT;

  /**
   * The cached value of the '{@link #getGetQuery() <em>Get Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetQuery()
   * @generated
   * @ordered
   */
  protected ENamedQuery getQuery;

  /**
   * The default value of the '{@link #isUpdate() <em>Update</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUpdate()
   * @generated
   * @ordered
   */
  protected static final boolean UPDATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUpdate() <em>Update</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUpdate()
   * @generated
   * @ordered
   */
  protected boolean update = UPDATE_EDEFAULT;

  /**
   * The default value of the '{@link #isInsert() <em>Insert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInsert()
   * @generated
   * @ordered
   */
  protected static final boolean INSERT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInsert() <em>Insert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInsert()
   * @generated
   * @ordered
   */
  protected boolean insert = INSERT_EDEFAULT;

  /**
   * The default value of the '{@link #isDelete() <em>Delete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDelete()
   * @generated
   * @ordered
   */
  protected static final boolean DELETE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDelete() <em>Delete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDelete()
   * @generated
   * @ordered
   */
  protected boolean delete = DELETE_EDEFAULT;

  /**
   * The cached value of the '{@link #getServiceMethods() <em>Service Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceMethods()
   * @generated
   * @ordered
   */
  protected EList<ENamedServiceQuery> serviceMethods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EServiceMappingImpl()
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
    return EMapPackage.Literals.ESERVICE_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(PackageDeclaration newPackage, NotificationChain msgs)
  {
    PackageDeclaration oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMapPackage.ESERVICE_MAPPING__PACKAGE, oldPackage, newPackage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(PackageDeclaration newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMapPackage.ESERVICE_MAPPING__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMapPackage.ESERVICE_MAPPING__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESERVICE_MAPPING__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMappingEntity getEntity()
  {
    if (entity != null && entity.eIsProxy())
    {
      InternalEObject oldEntity = (InternalEObject)entity;
      entity = (EMappingEntity)eResolveProxy(oldEntity);
      if (entity != oldEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.ESERVICE_MAPPING__ENTITY, oldEntity, entity));
      }
    }
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMappingEntity basicGetEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(EMappingEntity newEntity)
  {
    EMappingEntity oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESERVICE_MAPPING__ENTITY, oldEntity, entity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESERVICE_MAPPING__LIST, oldList, list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamedQuery getListQuery()
  {
    if (listQuery != null && listQuery.eIsProxy())
    {
      InternalEObject oldListQuery = (InternalEObject)listQuery;
      listQuery = (ENamedQuery)eResolveProxy(oldListQuery);
      if (listQuery != oldListQuery)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.ESERVICE_MAPPING__LIST_QUERY, oldListQuery, listQuery));
      }
    }
    return listQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamedQuery basicGetListQuery()
  {
    return listQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListQuery(ENamedQuery newListQuery)
  {
    ENamedQuery oldListQuery = listQuery;
    listQuery = newListQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESERVICE_MAPPING__LIST_QUERY, oldListQuery, listQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGet()
  {
    return get;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGet(boolean newGet)
  {
    boolean oldGet = get;
    get = newGet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESERVICE_MAPPING__GET, oldGet, get));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamedQuery getGetQuery()
  {
    if (getQuery != null && getQuery.eIsProxy())
    {
      InternalEObject oldGetQuery = (InternalEObject)getQuery;
      getQuery = (ENamedQuery)eResolveProxy(oldGetQuery);
      if (getQuery != oldGetQuery)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.ESERVICE_MAPPING__GET_QUERY, oldGetQuery, getQuery));
      }
    }
    return getQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamedQuery basicGetGetQuery()
  {
    return getQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetQuery(ENamedQuery newGetQuery)
  {
    ENamedQuery oldGetQuery = getQuery;
    getQuery = newGetQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESERVICE_MAPPING__GET_QUERY, oldGetQuery, getQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUpdate()
  {
    return update;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdate(boolean newUpdate)
  {
    boolean oldUpdate = update;
    update = newUpdate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESERVICE_MAPPING__UPDATE, oldUpdate, update));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInsert()
  {
    return insert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInsert(boolean newInsert)
  {
    boolean oldInsert = insert;
    insert = newInsert;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESERVICE_MAPPING__INSERT, oldInsert, insert));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDelete()
  {
    return delete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelete(boolean newDelete)
  {
    boolean oldDelete = delete;
    delete = newDelete;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESERVICE_MAPPING__DELETE, oldDelete, delete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ENamedServiceQuery> getServiceMethods()
  {
    if (serviceMethods == null)
    {
      serviceMethods = new EObjectContainmentEList<ENamedServiceQuery>(ENamedServiceQuery.class, this, EMapPackage.ESERVICE_MAPPING__SERVICE_METHODS);
    }
    return serviceMethods;
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
      case EMapPackage.ESERVICE_MAPPING__PACKAGE:
        return basicSetPackage(null, msgs);
      case EMapPackage.ESERVICE_MAPPING__SERVICE_METHODS:
        return ((InternalEList<?>)getServiceMethods()).basicRemove(otherEnd, msgs);
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
      case EMapPackage.ESERVICE_MAPPING__PACKAGE:
        return getPackage();
      case EMapPackage.ESERVICE_MAPPING__ENTITY:
        if (resolve) return getEntity();
        return basicGetEntity();
      case EMapPackage.ESERVICE_MAPPING__LIST:
        return isList();
      case EMapPackage.ESERVICE_MAPPING__LIST_QUERY:
        if (resolve) return getListQuery();
        return basicGetListQuery();
      case EMapPackage.ESERVICE_MAPPING__GET:
        return isGet();
      case EMapPackage.ESERVICE_MAPPING__GET_QUERY:
        if (resolve) return getGetQuery();
        return basicGetGetQuery();
      case EMapPackage.ESERVICE_MAPPING__UPDATE:
        return isUpdate();
      case EMapPackage.ESERVICE_MAPPING__INSERT:
        return isInsert();
      case EMapPackage.ESERVICE_MAPPING__DELETE:
        return isDelete();
      case EMapPackage.ESERVICE_MAPPING__SERVICE_METHODS:
        return getServiceMethods();
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
      case EMapPackage.ESERVICE_MAPPING__PACKAGE:
        setPackage((PackageDeclaration)newValue);
        return;
      case EMapPackage.ESERVICE_MAPPING__ENTITY:
        setEntity((EMappingEntity)newValue);
        return;
      case EMapPackage.ESERVICE_MAPPING__LIST:
        setList((Boolean)newValue);
        return;
      case EMapPackage.ESERVICE_MAPPING__LIST_QUERY:
        setListQuery((ENamedQuery)newValue);
        return;
      case EMapPackage.ESERVICE_MAPPING__GET:
        setGet((Boolean)newValue);
        return;
      case EMapPackage.ESERVICE_MAPPING__GET_QUERY:
        setGetQuery((ENamedQuery)newValue);
        return;
      case EMapPackage.ESERVICE_MAPPING__UPDATE:
        setUpdate((Boolean)newValue);
        return;
      case EMapPackage.ESERVICE_MAPPING__INSERT:
        setInsert((Boolean)newValue);
        return;
      case EMapPackage.ESERVICE_MAPPING__DELETE:
        setDelete((Boolean)newValue);
        return;
      case EMapPackage.ESERVICE_MAPPING__SERVICE_METHODS:
        getServiceMethods().clear();
        getServiceMethods().addAll((Collection<? extends ENamedServiceQuery>)newValue);
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
      case EMapPackage.ESERVICE_MAPPING__PACKAGE:
        setPackage((PackageDeclaration)null);
        return;
      case EMapPackage.ESERVICE_MAPPING__ENTITY:
        setEntity((EMappingEntity)null);
        return;
      case EMapPackage.ESERVICE_MAPPING__LIST:
        setList(LIST_EDEFAULT);
        return;
      case EMapPackage.ESERVICE_MAPPING__LIST_QUERY:
        setListQuery((ENamedQuery)null);
        return;
      case EMapPackage.ESERVICE_MAPPING__GET:
        setGet(GET_EDEFAULT);
        return;
      case EMapPackage.ESERVICE_MAPPING__GET_QUERY:
        setGetQuery((ENamedQuery)null);
        return;
      case EMapPackage.ESERVICE_MAPPING__UPDATE:
        setUpdate(UPDATE_EDEFAULT);
        return;
      case EMapPackage.ESERVICE_MAPPING__INSERT:
        setInsert(INSERT_EDEFAULT);
        return;
      case EMapPackage.ESERVICE_MAPPING__DELETE:
        setDelete(DELETE_EDEFAULT);
        return;
      case EMapPackage.ESERVICE_MAPPING__SERVICE_METHODS:
        getServiceMethods().clear();
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
      case EMapPackage.ESERVICE_MAPPING__PACKAGE:
        return package_ != null;
      case EMapPackage.ESERVICE_MAPPING__ENTITY:
        return entity != null;
      case EMapPackage.ESERVICE_MAPPING__LIST:
        return list != LIST_EDEFAULT;
      case EMapPackage.ESERVICE_MAPPING__LIST_QUERY:
        return listQuery != null;
      case EMapPackage.ESERVICE_MAPPING__GET:
        return get != GET_EDEFAULT;
      case EMapPackage.ESERVICE_MAPPING__GET_QUERY:
        return getQuery != null;
      case EMapPackage.ESERVICE_MAPPING__UPDATE:
        return update != UPDATE_EDEFAULT;
      case EMapPackage.ESERVICE_MAPPING__INSERT:
        return insert != INSERT_EDEFAULT;
      case EMapPackage.ESERVICE_MAPPING__DELETE:
        return delete != DELETE_EDEFAULT;
      case EMapPackage.ESERVICE_MAPPING__SERVICE_METHODS:
        return serviceMethods != null && !serviceMethods.isEmpty();
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
    result.append(", get: ");
    result.append(get);
    result.append(", update: ");
    result.append(update);
    result.append(", insert: ");
    result.append(insert);
    result.append(", delete: ");
    result.append(delete);
    result.append(')');
    return result.toString();
  }

} //EServiceMappingImpl

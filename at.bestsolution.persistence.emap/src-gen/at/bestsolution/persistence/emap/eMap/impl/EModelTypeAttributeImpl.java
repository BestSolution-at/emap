/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.EModelTypeAttribute;
import at.bestsolution.persistence.emap.eMap.ENamedCustomQuery;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EModel Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EModelTypeAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EModelTypeAttributeImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EModelTypeAttributeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EModelTypeAttributeImpl#isCached <em>Cached</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EModelTypeAttributeImpl#getCacheName <em>Cache Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EModelTypeAttributeImpl extends MinimalEObjectImpl.Container implements EModelTypeAttribute
{
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
   * The cached value of the '{@link #getQuery() <em>Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected ENamedCustomQuery query;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<String> parameters;

  /**
   * The default value of the '{@link #isCached() <em>Cached</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCached()
   * @generated
   * @ordered
   */
  protected static final boolean CACHED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCached() <em>Cached</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCached()
   * @generated
   * @ordered
   */
  protected boolean cached = CACHED_EDEFAULT;

  /**
   * The default value of the '{@link #getCacheName() <em>Cache Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCacheName()
   * @generated
   * @ordered
   */
  protected static final String CACHE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCacheName() <em>Cache Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCacheName()
   * @generated
   * @ordered
   */
  protected String cacheName = CACHE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EModelTypeAttributeImpl()
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
    return EMapPackage.Literals.EMODEL_TYPE_ATTRIBUTE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMODEL_TYPE_ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamedCustomQuery getQuery()
  {
    if (query != null && query.eIsProxy())
    {
      InternalEObject oldQuery = (InternalEObject)query;
      query = (ENamedCustomQuery)eResolveProxy(oldQuery);
      if (query != oldQuery)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.EMODEL_TYPE_ATTRIBUTE__QUERY, oldQuery, query));
      }
    }
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamedCustomQuery basicGetQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(ENamedCustomQuery newQuery)
  {
    ENamedCustomQuery oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMODEL_TYPE_ATTRIBUTE__QUERY, oldQuery, query));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EDataTypeEList<String>(String.class, this, EMapPackage.EMODEL_TYPE_ATTRIBUTE__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCached()
  {
    return cached;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCached(boolean newCached)
  {
    boolean oldCached = cached;
    cached = newCached;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMODEL_TYPE_ATTRIBUTE__CACHED, oldCached, cached));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCacheName()
  {
    return cacheName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCacheName(String newCacheName)
  {
    String oldCacheName = cacheName;
    cacheName = newCacheName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMODEL_TYPE_ATTRIBUTE__CACHE_NAME, oldCacheName, cacheName));
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
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__NAME:
        return getName();
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__QUERY:
        if (resolve) return getQuery();
        return basicGetQuery();
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__PARAMETERS:
        return getParameters();
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__CACHED:
        return isCached();
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__CACHE_NAME:
        return getCacheName();
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
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__QUERY:
        setQuery((ENamedCustomQuery)newValue);
        return;
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends String>)newValue);
        return;
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__CACHED:
        setCached((Boolean)newValue);
        return;
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__CACHE_NAME:
        setCacheName((String)newValue);
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
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__QUERY:
        setQuery((ENamedCustomQuery)null);
        return;
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__PARAMETERS:
        getParameters().clear();
        return;
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__CACHED:
        setCached(CACHED_EDEFAULT);
        return;
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__CACHE_NAME:
        setCacheName(CACHE_NAME_EDEFAULT);
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
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__QUERY:
        return query != null;
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__CACHED:
        return cached != CACHED_EDEFAULT;
      case EMapPackage.EMODEL_TYPE_ATTRIBUTE__CACHE_NAME:
        return CACHE_NAME_EDEFAULT == null ? cacheName != null : !CACHE_NAME_EDEFAULT.equals(cacheName);
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
    result.append(", parameters: ");
    result.append(parameters);
    result.append(", cached: ");
    result.append(cached);
    result.append(", cacheName: ");
    result.append(cacheName);
    result.append(')');
    return result.toString();
  }

} //EModelTypeAttributeImpl

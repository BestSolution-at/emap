/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.EMappingAttribute;
import at.bestsolution.persistence.emap.eMap.ENamedQuery;
import at.bestsolution.persistence.emap.eMap.EObjectSection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMapping Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl#isPk <em>Pk</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl#isMapped <em>Mapped</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingAttributeImpl#getMap <em>Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMappingAttributeImpl extends MinimalEObjectImpl.Container implements EMappingAttribute
{
  /**
   * The default value of the '{@link #isPk() <em>Pk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPk()
   * @generated
   * @ordered
   */
  protected static final boolean PK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPk() <em>Pk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPk()
   * @generated
   * @ordered
   */
  protected boolean pk = PK_EDEFAULT;

  /**
   * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected String property = PROPERTY_EDEFAULT;

  /**
   * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnName()
   * @generated
   * @ordered
   */
  protected static final String COLUMN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnName()
   * @generated
   * @ordered
   */
  protected String columnName = COLUMN_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResolved()
   * @generated
   * @ordered
   */
  protected static final boolean RESOLVED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResolved()
   * @generated
   * @ordered
   */
  protected boolean resolved = RESOLVED_EDEFAULT;

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
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<String> parameters;

  /**
   * The default value of the '{@link #isMapped() <em>Mapped</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMapped()
   * @generated
   * @ordered
   */
  protected static final boolean MAPPED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMapped() <em>Mapped</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMapped()
   * @generated
   * @ordered
   */
  protected boolean mapped = MAPPED_EDEFAULT;

  /**
   * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMap()
   * @generated
   * @ordered
   */
  protected EObjectSection map;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMappingAttributeImpl()
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
    return EMapPackage.Literals.EMAPPING_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPk()
  {
    return pk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPk(boolean newPk)
  {
    boolean oldPk = pk;
    pk = newPk;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ATTRIBUTE__PK, oldPk, pk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(String newProperty)
  {
    String oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ATTRIBUTE__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColumnName()
  {
    return columnName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnName(String newColumnName)
  {
    String oldColumnName = columnName;
    columnName = newColumnName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ATTRIBUTE__COLUMN_NAME, oldColumnName, columnName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResolved()
  {
    return resolved;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResolved(boolean newResolved)
  {
    boolean oldResolved = resolved;
    resolved = newResolved;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ATTRIBUTE__RESOLVED, oldResolved, resolved));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.EMAPPING_ATTRIBUTE__QUERY, oldQuery, query));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ATTRIBUTE__QUERY, oldQuery, query));
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
      parameters = new EDataTypeEList<String>(String.class, this, EMapPackage.EMAPPING_ATTRIBUTE__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMapped()
  {
    return mapped;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapped(boolean newMapped)
  {
    boolean oldMapped = mapped;
    mapped = newMapped;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ATTRIBUTE__MAPPED, oldMapped, mapped));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObjectSection getMap()
  {
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMap(EObjectSection newMap, NotificationChain msgs)
  {
    EObjectSection oldMap = map;
    map = newMap;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ATTRIBUTE__MAP, oldMap, newMap);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMap(EObjectSection newMap)
  {
    if (newMap != map)
    {
      NotificationChain msgs = null;
      if (map != null)
        msgs = ((InternalEObject)map).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMapPackage.EMAPPING_ATTRIBUTE__MAP, null, msgs);
      if (newMap != null)
        msgs = ((InternalEObject)newMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMapPackage.EMAPPING_ATTRIBUTE__MAP, null, msgs);
      msgs = basicSetMap(newMap, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ATTRIBUTE__MAP, newMap, newMap));
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
      case EMapPackage.EMAPPING_ATTRIBUTE__MAP:
        return basicSetMap(null, msgs);
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
      case EMapPackage.EMAPPING_ATTRIBUTE__PK:
        return isPk();
      case EMapPackage.EMAPPING_ATTRIBUTE__PROPERTY:
        return getProperty();
      case EMapPackage.EMAPPING_ATTRIBUTE__COLUMN_NAME:
        return getColumnName();
      case EMapPackage.EMAPPING_ATTRIBUTE__RESOLVED:
        return isResolved();
      case EMapPackage.EMAPPING_ATTRIBUTE__QUERY:
        if (resolve) return getQuery();
        return basicGetQuery();
      case EMapPackage.EMAPPING_ATTRIBUTE__PARAMETERS:
        return getParameters();
      case EMapPackage.EMAPPING_ATTRIBUTE__MAPPED:
        return isMapped();
      case EMapPackage.EMAPPING_ATTRIBUTE__MAP:
        return getMap();
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
      case EMapPackage.EMAPPING_ATTRIBUTE__PK:
        setPk((Boolean)newValue);
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__PROPERTY:
        setProperty((String)newValue);
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__COLUMN_NAME:
        setColumnName((String)newValue);
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__RESOLVED:
        setResolved((Boolean)newValue);
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__QUERY:
        setQuery((ENamedQuery)newValue);
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends String>)newValue);
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__MAPPED:
        setMapped((Boolean)newValue);
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__MAP:
        setMap((EObjectSection)newValue);
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
      case EMapPackage.EMAPPING_ATTRIBUTE__PK:
        setPk(PK_EDEFAULT);
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__PROPERTY:
        setProperty(PROPERTY_EDEFAULT);
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__COLUMN_NAME:
        setColumnName(COLUMN_NAME_EDEFAULT);
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__RESOLVED:
        setResolved(RESOLVED_EDEFAULT);
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__QUERY:
        setQuery((ENamedQuery)null);
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__PARAMETERS:
        getParameters().clear();
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__MAPPED:
        setMapped(MAPPED_EDEFAULT);
        return;
      case EMapPackage.EMAPPING_ATTRIBUTE__MAP:
        setMap((EObjectSection)null);
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
      case EMapPackage.EMAPPING_ATTRIBUTE__PK:
        return pk != PK_EDEFAULT;
      case EMapPackage.EMAPPING_ATTRIBUTE__PROPERTY:
        return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
      case EMapPackage.EMAPPING_ATTRIBUTE__COLUMN_NAME:
        return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
      case EMapPackage.EMAPPING_ATTRIBUTE__RESOLVED:
        return resolved != RESOLVED_EDEFAULT;
      case EMapPackage.EMAPPING_ATTRIBUTE__QUERY:
        return query != null;
      case EMapPackage.EMAPPING_ATTRIBUTE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case EMapPackage.EMAPPING_ATTRIBUTE__MAPPED:
        return mapped != MAPPED_EDEFAULT;
      case EMapPackage.EMAPPING_ATTRIBUTE__MAP:
        return map != null;
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
    result.append(" (pk: ");
    result.append(pk);
    result.append(", property: ");
    result.append(property);
    result.append(", columnName: ");
    result.append(columnName);
    result.append(", resolved: ");
    result.append(resolved);
    result.append(", parameters: ");
    result.append(parameters);
    result.append(", mapped: ");
    result.append(mapped);
    result.append(')');
    return result.toString();
  }

} //EMappingAttributeImpl

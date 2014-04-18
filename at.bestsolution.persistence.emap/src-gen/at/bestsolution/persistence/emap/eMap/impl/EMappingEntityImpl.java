/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EAttribute;
import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.EMappingEntity;
import at.bestsolution.persistence.emap.eMap.ENamedCustomQuery;
import at.bestsolution.persistence.emap.eMap.ENamedQuery;
import at.bestsolution.persistence.emap.eMap.EType;

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
 * An implementation of the model object '<em><b>EMapping Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl#getExtensionType <em>Extension Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl#getEtype <em>Etype</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl#getNamedQueries <em>Named Queries</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl#getNamedCustomQueries <em>Named Custom Queries</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityImpl#getDescriminationColumn <em>Descrimination Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMappingEntityImpl extends MinimalEObjectImpl.Container implements EMappingEntity
{
  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

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
   * The default value of the '{@link #getExtensionType() <em>Extension Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensionType()
   * @generated
   * @ordered
   */
  protected static final String EXTENSION_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtensionType() <em>Extension Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensionType()
   * @generated
   * @ordered
   */
  protected String extensionType = EXTENSION_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected EMappingEntity parent;

  /**
   * The cached value of the '{@link #getEtype() <em>Etype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtype()
   * @generated
   * @ordered
   */
  protected EType etype;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<EAttribute> attributes;

  /**
   * The cached value of the '{@link #getNamedQueries() <em>Named Queries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamedQueries()
   * @generated
   * @ordered
   */
  protected EList<ENamedQuery> namedQueries;

  /**
   * The cached value of the '{@link #getNamedCustomQueries() <em>Named Custom Queries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamedCustomQueries()
   * @generated
   * @ordered
   */
  protected EList<ENamedCustomQuery> namedCustomQueries;

  /**
   * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableName()
   * @generated
   * @ordered
   */
  protected static final String TABLE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableName()
   * @generated
   * @ordered
   */
  protected String tableName = TABLE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescriminationColumn() <em>Descrimination Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriminationColumn()
   * @generated
   * @ordered
   */
  protected static final String DESCRIMINATION_COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescriminationColumn() <em>Descrimination Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriminationColumn()
   * @generated
   * @ordered
   */
  protected String descriminationColumn = DESCRIMINATION_COLUMN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMappingEntityImpl()
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
    return EMapPackage.Literals.EMAPPING_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ENTITY__ABSTRACT, oldAbstract, abstract_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtensionType()
  {
    return extensionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtensionType(String newExtensionType)
  {
    String oldExtensionType = extensionType;
    extensionType = newExtensionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ENTITY__EXTENSION_TYPE, oldExtensionType, extensionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMappingEntity getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (EMappingEntity)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.EMAPPING_ENTITY__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMappingEntity basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(EMappingEntity newParent)
  {
    EMappingEntity oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ENTITY__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EType getEtype()
  {
    return etype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEtype(EType newEtype, NotificationChain msgs)
  {
    EType oldEtype = etype;
    etype = newEtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ENTITY__ETYPE, oldEtype, newEtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEtype(EType newEtype)
  {
    if (newEtype != etype)
    {
      NotificationChain msgs = null;
      if (etype != null)
        msgs = ((InternalEObject)etype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMapPackage.EMAPPING_ENTITY__ETYPE, null, msgs);
      if (newEtype != null)
        msgs = ((InternalEObject)newEtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMapPackage.EMAPPING_ENTITY__ETYPE, null, msgs);
      msgs = basicSetEtype(newEtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ENTITY__ETYPE, newEtype, newEtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<EAttribute>(EAttribute.class, this, EMapPackage.EMAPPING_ENTITY__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ENamedQuery> getNamedQueries()
  {
    if (namedQueries == null)
    {
      namedQueries = new EObjectContainmentEList<ENamedQuery>(ENamedQuery.class, this, EMapPackage.EMAPPING_ENTITY__NAMED_QUERIES);
    }
    return namedQueries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ENamedCustomQuery> getNamedCustomQueries()
  {
    if (namedCustomQueries == null)
    {
      namedCustomQueries = new EObjectContainmentEList<ENamedCustomQuery>(ENamedCustomQuery.class, this, EMapPackage.EMAPPING_ENTITY__NAMED_CUSTOM_QUERIES);
    }
    return namedCustomQueries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTableName()
  {
    return tableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTableName(String newTableName)
  {
    String oldTableName = tableName;
    tableName = newTableName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ENTITY__TABLE_NAME, oldTableName, tableName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescriminationColumn()
  {
    return descriminationColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescriminationColumn(String newDescriminationColumn)
  {
    String oldDescriminationColumn = descriminationColumn;
    descriminationColumn = newDescriminationColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ENTITY__DESCRIMINATION_COLUMN, oldDescriminationColumn, descriminationColumn));
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
      case EMapPackage.EMAPPING_ENTITY__ETYPE:
        return basicSetEtype(null, msgs);
      case EMapPackage.EMAPPING_ENTITY__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case EMapPackage.EMAPPING_ENTITY__NAMED_QUERIES:
        return ((InternalEList<?>)getNamedQueries()).basicRemove(otherEnd, msgs);
      case EMapPackage.EMAPPING_ENTITY__NAMED_CUSTOM_QUERIES:
        return ((InternalEList<?>)getNamedCustomQueries()).basicRemove(otherEnd, msgs);
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
      case EMapPackage.EMAPPING_ENTITY__ABSTRACT:
        return isAbstract();
      case EMapPackage.EMAPPING_ENTITY__NAME:
        return getName();
      case EMapPackage.EMAPPING_ENTITY__EXTENSION_TYPE:
        return getExtensionType();
      case EMapPackage.EMAPPING_ENTITY__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case EMapPackage.EMAPPING_ENTITY__ETYPE:
        return getEtype();
      case EMapPackage.EMAPPING_ENTITY__ATTRIBUTES:
        return getAttributes();
      case EMapPackage.EMAPPING_ENTITY__NAMED_QUERIES:
        return getNamedQueries();
      case EMapPackage.EMAPPING_ENTITY__NAMED_CUSTOM_QUERIES:
        return getNamedCustomQueries();
      case EMapPackage.EMAPPING_ENTITY__TABLE_NAME:
        return getTableName();
      case EMapPackage.EMAPPING_ENTITY__DESCRIMINATION_COLUMN:
        return getDescriminationColumn();
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
      case EMapPackage.EMAPPING_ENTITY__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case EMapPackage.EMAPPING_ENTITY__NAME:
        setName((String)newValue);
        return;
      case EMapPackage.EMAPPING_ENTITY__EXTENSION_TYPE:
        setExtensionType((String)newValue);
        return;
      case EMapPackage.EMAPPING_ENTITY__PARENT:
        setParent((EMappingEntity)newValue);
        return;
      case EMapPackage.EMAPPING_ENTITY__ETYPE:
        setEtype((EType)newValue);
        return;
      case EMapPackage.EMAPPING_ENTITY__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends EAttribute>)newValue);
        return;
      case EMapPackage.EMAPPING_ENTITY__NAMED_QUERIES:
        getNamedQueries().clear();
        getNamedQueries().addAll((Collection<? extends ENamedQuery>)newValue);
        return;
      case EMapPackage.EMAPPING_ENTITY__NAMED_CUSTOM_QUERIES:
        getNamedCustomQueries().clear();
        getNamedCustomQueries().addAll((Collection<? extends ENamedCustomQuery>)newValue);
        return;
      case EMapPackage.EMAPPING_ENTITY__TABLE_NAME:
        setTableName((String)newValue);
        return;
      case EMapPackage.EMAPPING_ENTITY__DESCRIMINATION_COLUMN:
        setDescriminationColumn((String)newValue);
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
      case EMapPackage.EMAPPING_ENTITY__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case EMapPackage.EMAPPING_ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EMapPackage.EMAPPING_ENTITY__EXTENSION_TYPE:
        setExtensionType(EXTENSION_TYPE_EDEFAULT);
        return;
      case EMapPackage.EMAPPING_ENTITY__PARENT:
        setParent((EMappingEntity)null);
        return;
      case EMapPackage.EMAPPING_ENTITY__ETYPE:
        setEtype((EType)null);
        return;
      case EMapPackage.EMAPPING_ENTITY__ATTRIBUTES:
        getAttributes().clear();
        return;
      case EMapPackage.EMAPPING_ENTITY__NAMED_QUERIES:
        getNamedQueries().clear();
        return;
      case EMapPackage.EMAPPING_ENTITY__NAMED_CUSTOM_QUERIES:
        getNamedCustomQueries().clear();
        return;
      case EMapPackage.EMAPPING_ENTITY__TABLE_NAME:
        setTableName(TABLE_NAME_EDEFAULT);
        return;
      case EMapPackage.EMAPPING_ENTITY__DESCRIMINATION_COLUMN:
        setDescriminationColumn(DESCRIMINATION_COLUMN_EDEFAULT);
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
      case EMapPackage.EMAPPING_ENTITY__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case EMapPackage.EMAPPING_ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EMapPackage.EMAPPING_ENTITY__EXTENSION_TYPE:
        return EXTENSION_TYPE_EDEFAULT == null ? extensionType != null : !EXTENSION_TYPE_EDEFAULT.equals(extensionType);
      case EMapPackage.EMAPPING_ENTITY__PARENT:
        return parent != null;
      case EMapPackage.EMAPPING_ENTITY__ETYPE:
        return etype != null;
      case EMapPackage.EMAPPING_ENTITY__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case EMapPackage.EMAPPING_ENTITY__NAMED_QUERIES:
        return namedQueries != null && !namedQueries.isEmpty();
      case EMapPackage.EMAPPING_ENTITY__NAMED_CUSTOM_QUERIES:
        return namedCustomQueries != null && !namedCustomQueries.isEmpty();
      case EMapPackage.EMAPPING_ENTITY__TABLE_NAME:
        return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
      case EMapPackage.EMAPPING_ENTITY__DESCRIMINATION_COLUMN:
        return DESCRIMINATION_COLUMN_EDEFAULT == null ? descriminationColumn != null : !DESCRIMINATION_COLUMN_EDEFAULT.equals(descriminationColumn);
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
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(", name: ");
    result.append(name);
    result.append(", extensionType: ");
    result.append(extensionType);
    result.append(", tableName: ");
    result.append(tableName);
    result.append(", descriminationColumn: ");
    result.append(descriminationColumn);
    result.append(')');
    return result.toString();
  }

} //EMappingEntityImpl

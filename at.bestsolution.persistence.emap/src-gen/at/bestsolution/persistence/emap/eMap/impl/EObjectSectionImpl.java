/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.EMappingAttribute;
import at.bestsolution.persistence.emap.eMap.EMappingEntity;
import at.bestsolution.persistence.emap.eMap.EObjectSection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EObject Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EObjectSectionImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EObjectSectionImpl#getDescriminatedTypes <em>Descriminated Types</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EObjectSectionImpl#getDescrimatorColumn <em>Descrimator Column</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EObjectSectionImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EObjectSectionImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EObjectSectionImpl extends MinimalEObjectImpl.Container implements EObjectSection
{
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
   * The cached value of the '{@link #getDescriminatedTypes() <em>Descriminated Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriminatedTypes()
   * @generated
   * @ordered
   */
  protected EList<EMappingEntity> descriminatedTypes;

  /**
   * The default value of the '{@link #getDescrimatorColumn() <em>Descrimator Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescrimatorColumn()
   * @generated
   * @ordered
   */
  protected static final String DESCRIMATOR_COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescrimatorColumn() <em>Descrimator Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescrimatorColumn()
   * @generated
   * @ordered
   */
  protected String descrimatorColumn = DESCRIMATOR_COLUMN_EDEFAULT;

  /**
   * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected static final String PREFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected String prefix = PREFIX_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<EMappingAttribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EObjectSectionImpl()
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
    return EMapPackage.Literals.EOBJECT_SECTION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.EOBJECT_SECTION__ENTITY, oldEntity, entity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EOBJECT_SECTION__ENTITY, oldEntity, entity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EMappingEntity> getDescriminatedTypes()
  {
    if (descriminatedTypes == null)
    {
      descriminatedTypes = new EObjectResolvingEList<EMappingEntity>(EMappingEntity.class, this, EMapPackage.EOBJECT_SECTION__DESCRIMINATED_TYPES);
    }
    return descriminatedTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescrimatorColumn()
  {
    return descrimatorColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescrimatorColumn(String newDescrimatorColumn)
  {
    String oldDescrimatorColumn = descrimatorColumn;
    descrimatorColumn = newDescrimatorColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EOBJECT_SECTION__DESCRIMATOR_COLUMN, oldDescrimatorColumn, descrimatorColumn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(String newPrefix)
  {
    String oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EOBJECT_SECTION__PREFIX, oldPrefix, prefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EMappingAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<EMappingAttribute>(EMappingAttribute.class, this, EMapPackage.EOBJECT_SECTION__ATTRIBUTES);
    }
    return attributes;
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
      case EMapPackage.EOBJECT_SECTION__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
      case EMapPackage.EOBJECT_SECTION__ENTITY:
        if (resolve) return getEntity();
        return basicGetEntity();
      case EMapPackage.EOBJECT_SECTION__DESCRIMINATED_TYPES:
        return getDescriminatedTypes();
      case EMapPackage.EOBJECT_SECTION__DESCRIMATOR_COLUMN:
        return getDescrimatorColumn();
      case EMapPackage.EOBJECT_SECTION__PREFIX:
        return getPrefix();
      case EMapPackage.EOBJECT_SECTION__ATTRIBUTES:
        return getAttributes();
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
      case EMapPackage.EOBJECT_SECTION__ENTITY:
        setEntity((EMappingEntity)newValue);
        return;
      case EMapPackage.EOBJECT_SECTION__DESCRIMINATED_TYPES:
        getDescriminatedTypes().clear();
        getDescriminatedTypes().addAll((Collection<? extends EMappingEntity>)newValue);
        return;
      case EMapPackage.EOBJECT_SECTION__DESCRIMATOR_COLUMN:
        setDescrimatorColumn((String)newValue);
        return;
      case EMapPackage.EOBJECT_SECTION__PREFIX:
        setPrefix((String)newValue);
        return;
      case EMapPackage.EOBJECT_SECTION__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends EMappingAttribute>)newValue);
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
      case EMapPackage.EOBJECT_SECTION__ENTITY:
        setEntity((EMappingEntity)null);
        return;
      case EMapPackage.EOBJECT_SECTION__DESCRIMINATED_TYPES:
        getDescriminatedTypes().clear();
        return;
      case EMapPackage.EOBJECT_SECTION__DESCRIMATOR_COLUMN:
        setDescrimatorColumn(DESCRIMATOR_COLUMN_EDEFAULT);
        return;
      case EMapPackage.EOBJECT_SECTION__PREFIX:
        setPrefix(PREFIX_EDEFAULT);
        return;
      case EMapPackage.EOBJECT_SECTION__ATTRIBUTES:
        getAttributes().clear();
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
      case EMapPackage.EOBJECT_SECTION__ENTITY:
        return entity != null;
      case EMapPackage.EOBJECT_SECTION__DESCRIMINATED_TYPES:
        return descriminatedTypes != null && !descriminatedTypes.isEmpty();
      case EMapPackage.EOBJECT_SECTION__DESCRIMATOR_COLUMN:
        return DESCRIMATOR_COLUMN_EDEFAULT == null ? descrimatorColumn != null : !DESCRIMATOR_COLUMN_EDEFAULT.equals(descrimatorColumn);
      case EMapPackage.EOBJECT_SECTION__PREFIX:
        return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
      case EMapPackage.EOBJECT_SECTION__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
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
    result.append(" (descrimatorColumn: ");
    result.append(descrimatorColumn);
    result.append(", prefix: ");
    result.append(prefix);
    result.append(')');
    return result.toString();
  }

} //EObjectSectionImpl

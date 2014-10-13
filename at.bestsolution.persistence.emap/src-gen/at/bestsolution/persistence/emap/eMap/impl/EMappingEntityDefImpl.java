/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.EMappingEntity;
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef;
import at.bestsolution.persistence.emap.eMap.Import;
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
 * An implementation of the model object '<em><b>EMapping Entity Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityDefImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityDefImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingEntityDefImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMappingEntityDefImpl extends MinimalEObjectImpl.Container implements EMappingEntityDef
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected EMappingEntity entity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMappingEntityDefImpl()
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
    return EMapPackage.Literals.EMAPPING_ENTITY_DEF;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ENTITY_DEF__PACKAGE, oldPackage, newPackage);
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
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMapPackage.EMAPPING_ENTITY_DEF__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMapPackage.EMAPPING_ENTITY_DEF__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ENTITY_DEF__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, EMapPackage.EMAPPING_ENTITY_DEF__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMappingEntity getEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity(EMappingEntity newEntity, NotificationChain msgs)
  {
    EMappingEntity oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ENTITY_DEF__ENTITY, oldEntity, newEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(EMappingEntity newEntity)
  {
    if (newEntity != entity)
    {
      NotificationChain msgs = null;
      if (entity != null)
        msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMapPackage.EMAPPING_ENTITY_DEF__ENTITY, null, msgs);
      if (newEntity != null)
        msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMapPackage.EMAPPING_ENTITY_DEF__ENTITY, null, msgs);
      msgs = basicSetEntity(newEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_ENTITY_DEF__ENTITY, newEntity, newEntity));
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
      case EMapPackage.EMAPPING_ENTITY_DEF__PACKAGE:
        return basicSetPackage(null, msgs);
      case EMapPackage.EMAPPING_ENTITY_DEF__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case EMapPackage.EMAPPING_ENTITY_DEF__ENTITY:
        return basicSetEntity(null, msgs);
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
      case EMapPackage.EMAPPING_ENTITY_DEF__PACKAGE:
        return getPackage();
      case EMapPackage.EMAPPING_ENTITY_DEF__IMPORTS:
        return getImports();
      case EMapPackage.EMAPPING_ENTITY_DEF__ENTITY:
        return getEntity();
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
      case EMapPackage.EMAPPING_ENTITY_DEF__PACKAGE:
        setPackage((PackageDeclaration)newValue);
        return;
      case EMapPackage.EMAPPING_ENTITY_DEF__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case EMapPackage.EMAPPING_ENTITY_DEF__ENTITY:
        setEntity((EMappingEntity)newValue);
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
      case EMapPackage.EMAPPING_ENTITY_DEF__PACKAGE:
        setPackage((PackageDeclaration)null);
        return;
      case EMapPackage.EMAPPING_ENTITY_DEF__IMPORTS:
        getImports().clear();
        return;
      case EMapPackage.EMAPPING_ENTITY_DEF__ENTITY:
        setEntity((EMappingEntity)null);
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
      case EMapPackage.EMAPPING_ENTITY_DEF__PACKAGE:
        return package_ != null;
      case EMapPackage.EMAPPING_ENTITY_DEF__IMPORTS:
        return imports != null && !imports.isEmpty();
      case EMapPackage.EMAPPING_ENTITY_DEF__ENTITY:
        return entity != null;
    }
    return super.eIsSet(featureID);
  }

} //EMappingEntityDefImpl

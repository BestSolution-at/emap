/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EBundleEntity;
import at.bestsolution.persistence.emap.eMap.EFkConstraint;
import at.bestsolution.persistence.emap.eMap.EIndex;
import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.EMappingEntity;
import at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef;
import at.bestsolution.persistence.emap.eMap.EUniqueConstraint;

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
 * An implementation of the model object '<em><b>EBundle Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EBundleEntityImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EBundleEntityImpl#getPkConstraintName <em>Pk Constraint Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EBundleEntityImpl#getFkConstraints <em>Fk Constraints</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EBundleEntityImpl#getUniqueContraints <em>Unique Contraints</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EBundleEntityImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EBundleEntityImpl#getTypeDefs <em>Type Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EBundleEntityImpl extends MinimalEObjectImpl.Container implements EBundleEntity
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
   * The default value of the '{@link #getPkConstraintName() <em>Pk Constraint Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPkConstraintName()
   * @generated
   * @ordered
   */
  protected static final String PK_CONSTRAINT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPkConstraintName() <em>Pk Constraint Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPkConstraintName()
   * @generated
   * @ordered
   */
  protected String pkConstraintName = PK_CONSTRAINT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFkConstraints() <em>Fk Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFkConstraints()
   * @generated
   * @ordered
   */
  protected EList<EFkConstraint> fkConstraints;

  /**
   * The cached value of the '{@link #getUniqueContraints() <em>Unique Contraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUniqueContraints()
   * @generated
   * @ordered
   */
  protected EList<EUniqueConstraint> uniqueContraints;

  /**
   * The cached value of the '{@link #getIndices() <em>Indices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndices()
   * @generated
   * @ordered
   */
  protected EList<EIndex> indices;

  /**
   * The cached value of the '{@link #getTypeDefs() <em>Type Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefs()
   * @generated
   * @ordered
   */
  protected EList<ESQLAttTypeDef> typeDefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EBundleEntityImpl()
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
    return EMapPackage.Literals.EBUNDLE_ENTITY;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.EBUNDLE_ENTITY__ENTITY, oldEntity, entity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EBUNDLE_ENTITY__ENTITY, oldEntity, entity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPkConstraintName()
  {
    return pkConstraintName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPkConstraintName(String newPkConstraintName)
  {
    String oldPkConstraintName = pkConstraintName;
    pkConstraintName = newPkConstraintName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EBUNDLE_ENTITY__PK_CONSTRAINT_NAME, oldPkConstraintName, pkConstraintName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EFkConstraint> getFkConstraints()
  {
    if (fkConstraints == null)
    {
      fkConstraints = new EObjectContainmentEList<EFkConstraint>(EFkConstraint.class, this, EMapPackage.EBUNDLE_ENTITY__FK_CONSTRAINTS);
    }
    return fkConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EUniqueConstraint> getUniqueContraints()
  {
    if (uniqueContraints == null)
    {
      uniqueContraints = new EObjectContainmentEList<EUniqueConstraint>(EUniqueConstraint.class, this, EMapPackage.EBUNDLE_ENTITY__UNIQUE_CONTRAINTS);
    }
    return uniqueContraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EIndex> getIndices()
  {
    if (indices == null)
    {
      indices = new EObjectContainmentEList<EIndex>(EIndex.class, this, EMapPackage.EBUNDLE_ENTITY__INDICES);
    }
    return indices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ESQLAttTypeDef> getTypeDefs()
  {
    if (typeDefs == null)
    {
      typeDefs = new EObjectContainmentEList<ESQLAttTypeDef>(ESQLAttTypeDef.class, this, EMapPackage.EBUNDLE_ENTITY__TYPE_DEFS);
    }
    return typeDefs;
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
      case EMapPackage.EBUNDLE_ENTITY__FK_CONSTRAINTS:
        return ((InternalEList<?>)getFkConstraints()).basicRemove(otherEnd, msgs);
      case EMapPackage.EBUNDLE_ENTITY__UNIQUE_CONTRAINTS:
        return ((InternalEList<?>)getUniqueContraints()).basicRemove(otherEnd, msgs);
      case EMapPackage.EBUNDLE_ENTITY__INDICES:
        return ((InternalEList<?>)getIndices()).basicRemove(otherEnd, msgs);
      case EMapPackage.EBUNDLE_ENTITY__TYPE_DEFS:
        return ((InternalEList<?>)getTypeDefs()).basicRemove(otherEnd, msgs);
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
      case EMapPackage.EBUNDLE_ENTITY__ENTITY:
        if (resolve) return getEntity();
        return basicGetEntity();
      case EMapPackage.EBUNDLE_ENTITY__PK_CONSTRAINT_NAME:
        return getPkConstraintName();
      case EMapPackage.EBUNDLE_ENTITY__FK_CONSTRAINTS:
        return getFkConstraints();
      case EMapPackage.EBUNDLE_ENTITY__UNIQUE_CONTRAINTS:
        return getUniqueContraints();
      case EMapPackage.EBUNDLE_ENTITY__INDICES:
        return getIndices();
      case EMapPackage.EBUNDLE_ENTITY__TYPE_DEFS:
        return getTypeDefs();
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
      case EMapPackage.EBUNDLE_ENTITY__ENTITY:
        setEntity((EMappingEntity)newValue);
        return;
      case EMapPackage.EBUNDLE_ENTITY__PK_CONSTRAINT_NAME:
        setPkConstraintName((String)newValue);
        return;
      case EMapPackage.EBUNDLE_ENTITY__FK_CONSTRAINTS:
        getFkConstraints().clear();
        getFkConstraints().addAll((Collection<? extends EFkConstraint>)newValue);
        return;
      case EMapPackage.EBUNDLE_ENTITY__UNIQUE_CONTRAINTS:
        getUniqueContraints().clear();
        getUniqueContraints().addAll((Collection<? extends EUniqueConstraint>)newValue);
        return;
      case EMapPackage.EBUNDLE_ENTITY__INDICES:
        getIndices().clear();
        getIndices().addAll((Collection<? extends EIndex>)newValue);
        return;
      case EMapPackage.EBUNDLE_ENTITY__TYPE_DEFS:
        getTypeDefs().clear();
        getTypeDefs().addAll((Collection<? extends ESQLAttTypeDef>)newValue);
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
      case EMapPackage.EBUNDLE_ENTITY__ENTITY:
        setEntity((EMappingEntity)null);
        return;
      case EMapPackage.EBUNDLE_ENTITY__PK_CONSTRAINT_NAME:
        setPkConstraintName(PK_CONSTRAINT_NAME_EDEFAULT);
        return;
      case EMapPackage.EBUNDLE_ENTITY__FK_CONSTRAINTS:
        getFkConstraints().clear();
        return;
      case EMapPackage.EBUNDLE_ENTITY__UNIQUE_CONTRAINTS:
        getUniqueContraints().clear();
        return;
      case EMapPackage.EBUNDLE_ENTITY__INDICES:
        getIndices().clear();
        return;
      case EMapPackage.EBUNDLE_ENTITY__TYPE_DEFS:
        getTypeDefs().clear();
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
      case EMapPackage.EBUNDLE_ENTITY__ENTITY:
        return entity != null;
      case EMapPackage.EBUNDLE_ENTITY__PK_CONSTRAINT_NAME:
        return PK_CONSTRAINT_NAME_EDEFAULT == null ? pkConstraintName != null : !PK_CONSTRAINT_NAME_EDEFAULT.equals(pkConstraintName);
      case EMapPackage.EBUNDLE_ENTITY__FK_CONSTRAINTS:
        return fkConstraints != null && !fkConstraints.isEmpty();
      case EMapPackage.EBUNDLE_ENTITY__UNIQUE_CONTRAINTS:
        return uniqueContraints != null && !uniqueContraints.isEmpty();
      case EMapPackage.EBUNDLE_ENTITY__INDICES:
        return indices != null && !indices.isEmpty();
      case EMapPackage.EBUNDLE_ENTITY__TYPE_DEFS:
        return typeDefs != null && !typeDefs.isEmpty();
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
    result.append(" (pkConstraintName: ");
    result.append(pkConstraintName);
    result.append(')');
    return result.toString();
  }

} //EBundleEntityImpl

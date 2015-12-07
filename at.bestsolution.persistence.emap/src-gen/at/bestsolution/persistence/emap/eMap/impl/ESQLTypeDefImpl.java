/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.ESQLDbType;
import at.bestsolution.persistence.emap.eMap.ESQLTypeDef;
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
 * An implementation of the model object '<em><b>ESQL Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ESQLTypeDefImpl#getEtype <em>Etype</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ESQLTypeDefImpl#getDbTypes <em>Db Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESQLTypeDefImpl extends MinimalEObjectImpl.Container implements ESQLTypeDef
{
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
   * The cached value of the '{@link #getDbTypes() <em>Db Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbTypes()
   * @generated
   * @ordered
   */
  protected EList<ESQLDbType> dbTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ESQLTypeDefImpl()
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
    return EMapPackage.Literals.ESQL_TYPE_DEF;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMapPackage.ESQL_TYPE_DEF__ETYPE, oldEtype, newEtype);
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
        msgs = ((InternalEObject)etype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMapPackage.ESQL_TYPE_DEF__ETYPE, null, msgs);
      if (newEtype != null)
        msgs = ((InternalEObject)newEtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMapPackage.ESQL_TYPE_DEF__ETYPE, null, msgs);
      msgs = basicSetEtype(newEtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESQL_TYPE_DEF__ETYPE, newEtype, newEtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ESQLDbType> getDbTypes()
  {
    if (dbTypes == null)
    {
      dbTypes = new EObjectContainmentEList<ESQLDbType>(ESQLDbType.class, this, EMapPackage.ESQL_TYPE_DEF__DB_TYPES);
    }
    return dbTypes;
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
      case EMapPackage.ESQL_TYPE_DEF__ETYPE:
        return basicSetEtype(null, msgs);
      case EMapPackage.ESQL_TYPE_DEF__DB_TYPES:
        return ((InternalEList<?>)getDbTypes()).basicRemove(otherEnd, msgs);
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
      case EMapPackage.ESQL_TYPE_DEF__ETYPE:
        return getEtype();
      case EMapPackage.ESQL_TYPE_DEF__DB_TYPES:
        return getDbTypes();
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
      case EMapPackage.ESQL_TYPE_DEF__ETYPE:
        setEtype((EType)newValue);
        return;
      case EMapPackage.ESQL_TYPE_DEF__DB_TYPES:
        getDbTypes().clear();
        getDbTypes().addAll((Collection<? extends ESQLDbType>)newValue);
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
      case EMapPackage.ESQL_TYPE_DEF__ETYPE:
        setEtype((EType)null);
        return;
      case EMapPackage.ESQL_TYPE_DEF__DB_TYPES:
        getDbTypes().clear();
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
      case EMapPackage.ESQL_TYPE_DEF__ETYPE:
        return etype != null;
      case EMapPackage.ESQL_TYPE_DEF__DB_TYPES:
        return dbTypes != null && !dbTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ESQLTypeDefImpl

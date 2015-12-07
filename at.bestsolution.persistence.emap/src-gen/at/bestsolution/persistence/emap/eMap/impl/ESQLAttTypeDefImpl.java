/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EAttribute;
import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef;
import at.bestsolution.persistence.emap.eMap.ESQLDbType;

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
 * An implementation of the model object '<em><b>ESQL Att Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ESQLAttTypeDefImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ESQLAttTypeDefImpl#getDbTypes <em>Db Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESQLAttTypeDefImpl extends MinimalEObjectImpl.Container implements ESQLAttTypeDef
{
  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected EAttribute attribute;

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
  protected ESQLAttTypeDefImpl()
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
    return EMapPackage.Literals.ESQL_ATT_TYPE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute()
  {
    if (attribute != null && attribute.eIsProxy())
    {
      InternalEObject oldAttribute = (InternalEObject)attribute;
      attribute = (EAttribute)eResolveProxy(oldAttribute);
      if (attribute != oldAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.ESQL_ATT_TYPE_DEF__ATTRIBUTE, oldAttribute, attribute));
      }
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute basicGetAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(EAttribute newAttribute)
  {
    EAttribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESQL_ATT_TYPE_DEF__ATTRIBUTE, oldAttribute, attribute));
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
      dbTypes = new EObjectContainmentEList<ESQLDbType>(ESQLDbType.class, this, EMapPackage.ESQL_ATT_TYPE_DEF__DB_TYPES);
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
      case EMapPackage.ESQL_ATT_TYPE_DEF__DB_TYPES:
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
      case EMapPackage.ESQL_ATT_TYPE_DEF__ATTRIBUTE:
        if (resolve) return getAttribute();
        return basicGetAttribute();
      case EMapPackage.ESQL_ATT_TYPE_DEF__DB_TYPES:
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
      case EMapPackage.ESQL_ATT_TYPE_DEF__ATTRIBUTE:
        setAttribute((EAttribute)newValue);
        return;
      case EMapPackage.ESQL_ATT_TYPE_DEF__DB_TYPES:
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
      case EMapPackage.ESQL_ATT_TYPE_DEF__ATTRIBUTE:
        setAttribute((EAttribute)null);
        return;
      case EMapPackage.ESQL_ATT_TYPE_DEF__DB_TYPES:
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
      case EMapPackage.ESQL_ATT_TYPE_DEF__ATTRIBUTE:
        return attribute != null;
      case EMapPackage.ESQL_ATT_TYPE_DEF__DB_TYPES:
        return dbTypes != null && !dbTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ESQLAttTypeDefImpl

/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.EModelTypeAttribute;
import at.bestsolution.persistence.emap.eMap.EModelTypeDef;
import at.bestsolution.persistence.emap.eMap.EType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EModel Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EModelTypeDefImpl#getEclassDef <em>Eclass Def</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EModelTypeDefImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EModelTypeDefImpl extends EReturnTypeImpl implements EModelTypeDef
{
  /**
   * The cached value of the '{@link #getEclassDef() <em>Eclass Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEclassDef()
   * @generated
   * @ordered
   */
  protected EType eclassDef;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<EModelTypeAttribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EModelTypeDefImpl()
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
    return EMapPackage.Literals.EMODEL_TYPE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EType getEclassDef()
  {
    return eclassDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEclassDef(EType newEclassDef, NotificationChain msgs)
  {
    EType oldEclassDef = eclassDef;
    eclassDef = newEclassDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMapPackage.EMODEL_TYPE_DEF__ECLASS_DEF, oldEclassDef, newEclassDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEclassDef(EType newEclassDef)
  {
    if (newEclassDef != eclassDef)
    {
      NotificationChain msgs = null;
      if (eclassDef != null)
        msgs = ((InternalEObject)eclassDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMapPackage.EMODEL_TYPE_DEF__ECLASS_DEF, null, msgs);
      if (newEclassDef != null)
        msgs = ((InternalEObject)newEclassDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMapPackage.EMODEL_TYPE_DEF__ECLASS_DEF, null, msgs);
      msgs = basicSetEclassDef(newEclassDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMODEL_TYPE_DEF__ECLASS_DEF, newEclassDef, newEclassDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EModelTypeAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<EModelTypeAttribute>(EModelTypeAttribute.class, this, EMapPackage.EMODEL_TYPE_DEF__ATTRIBUTES);
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
      case EMapPackage.EMODEL_TYPE_DEF__ECLASS_DEF:
        return basicSetEclassDef(null, msgs);
      case EMapPackage.EMODEL_TYPE_DEF__ATTRIBUTES:
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
      case EMapPackage.EMODEL_TYPE_DEF__ECLASS_DEF:
        return getEclassDef();
      case EMapPackage.EMODEL_TYPE_DEF__ATTRIBUTES:
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
      case EMapPackage.EMODEL_TYPE_DEF__ECLASS_DEF:
        setEclassDef((EType)newValue);
        return;
      case EMapPackage.EMODEL_TYPE_DEF__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends EModelTypeAttribute>)newValue);
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
      case EMapPackage.EMODEL_TYPE_DEF__ECLASS_DEF:
        setEclassDef((EType)null);
        return;
      case EMapPackage.EMODEL_TYPE_DEF__ATTRIBUTES:
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
      case EMapPackage.EMODEL_TYPE_DEF__ECLASS_DEF:
        return eclassDef != null;
      case EMapPackage.EMODEL_TYPE_DEF__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EModelTypeDefImpl

/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.ENamedServiceQuery;
import at.bestsolution.persistence.emap.eMap.ERestServiceMapping;

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
 * An implementation of the model object '<em><b>ERest Service Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ERestServiceMappingImpl#getServiceMethods <em>Service Methods</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ERestServiceMappingImpl#isRest <em>Rest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ERestServiceMappingImpl extends MinimalEObjectImpl.Container implements ERestServiceMapping
{
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
   * The default value of the '{@link #isRest() <em>Rest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRest()
   * @generated
   * @ordered
   */
  protected static final boolean REST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRest() <em>Rest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRest()
   * @generated
   * @ordered
   */
  protected boolean rest = REST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ERestServiceMappingImpl()
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
    return EMapPackage.Literals.EREST_SERVICE_MAPPING;
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
      serviceMethods = new EObjectContainmentEList<ENamedServiceQuery>(ENamedServiceQuery.class, this, EMapPackage.EREST_SERVICE_MAPPING__SERVICE_METHODS);
    }
    return serviceMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRest()
  {
    return rest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRest(boolean newRest)
  {
    boolean oldRest = rest;
    rest = newRest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EREST_SERVICE_MAPPING__REST, oldRest, rest));
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
      case EMapPackage.EREST_SERVICE_MAPPING__SERVICE_METHODS:
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
      case EMapPackage.EREST_SERVICE_MAPPING__SERVICE_METHODS:
        return getServiceMethods();
      case EMapPackage.EREST_SERVICE_MAPPING__REST:
        return isRest();
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
      case EMapPackage.EREST_SERVICE_MAPPING__SERVICE_METHODS:
        getServiceMethods().clear();
        getServiceMethods().addAll((Collection<? extends ENamedServiceQuery>)newValue);
        return;
      case EMapPackage.EREST_SERVICE_MAPPING__REST:
        setRest((Boolean)newValue);
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
      case EMapPackage.EREST_SERVICE_MAPPING__SERVICE_METHODS:
        getServiceMethods().clear();
        return;
      case EMapPackage.EREST_SERVICE_MAPPING__REST:
        setRest(REST_EDEFAULT);
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
      case EMapPackage.EREST_SERVICE_MAPPING__SERVICE_METHODS:
        return serviceMethods != null && !serviceMethods.isEmpty();
      case EMapPackage.EREST_SERVICE_MAPPING__REST:
        return rest != REST_EDEFAULT;
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
    result.append(" (rest: ");
    result.append(rest);
    result.append(')');
    return result.toString();
  }

} //ERestServiceMappingImpl

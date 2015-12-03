/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue;
import at.bestsolution.persistence.emap.eMap.EMapPackage;

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
 * An implementation of the model object '<em><b>EGenerator Config Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EGeneratorConfigValueImpl#getKey <em>Key</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EGeneratorConfigValueImpl#getSimpleValue <em>Simple Value</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EGeneratorConfigValueImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EGeneratorConfigValueImpl extends MinimalEObjectImpl.Container implements EGeneratorConfigValue
{
  /**
   * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected static final String KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected String key = KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getSimpleValue() <em>Simple Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleValue()
   * @generated
   * @ordered
   */
  protected static final String SIMPLE_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSimpleValue() <em>Simple Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleValue()
   * @generated
   * @ordered
   */
  protected String simpleValue = SIMPLE_VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<EGeneratorConfigValue> children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EGeneratorConfigValueImpl()
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
    return EMapPackage.Literals.EGENERATOR_CONFIG_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(String newKey)
  {
    String oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EGENERATOR_CONFIG_VALUE__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSimpleValue()
  {
    return simpleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleValue(String newSimpleValue)
  {
    String oldSimpleValue = simpleValue;
    simpleValue = newSimpleValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EGENERATOR_CONFIG_VALUE__SIMPLE_VALUE, oldSimpleValue, simpleValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EGeneratorConfigValue> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList<EGeneratorConfigValue>(EGeneratorConfigValue.class, this, EMapPackage.EGENERATOR_CONFIG_VALUE__CHILDREN);
    }
    return children;
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
      case EMapPackage.EGENERATOR_CONFIG_VALUE__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
      case EMapPackage.EGENERATOR_CONFIG_VALUE__KEY:
        return getKey();
      case EMapPackage.EGENERATOR_CONFIG_VALUE__SIMPLE_VALUE:
        return getSimpleValue();
      case EMapPackage.EGENERATOR_CONFIG_VALUE__CHILDREN:
        return getChildren();
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
      case EMapPackage.EGENERATOR_CONFIG_VALUE__KEY:
        setKey((String)newValue);
        return;
      case EMapPackage.EGENERATOR_CONFIG_VALUE__SIMPLE_VALUE:
        setSimpleValue((String)newValue);
        return;
      case EMapPackage.EGENERATOR_CONFIG_VALUE__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends EGeneratorConfigValue>)newValue);
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
      case EMapPackage.EGENERATOR_CONFIG_VALUE__KEY:
        setKey(KEY_EDEFAULT);
        return;
      case EMapPackage.EGENERATOR_CONFIG_VALUE__SIMPLE_VALUE:
        setSimpleValue(SIMPLE_VALUE_EDEFAULT);
        return;
      case EMapPackage.EGENERATOR_CONFIG_VALUE__CHILDREN:
        getChildren().clear();
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
      case EMapPackage.EGENERATOR_CONFIG_VALUE__KEY:
        return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
      case EMapPackage.EGENERATOR_CONFIG_VALUE__SIMPLE_VALUE:
        return SIMPLE_VALUE_EDEFAULT == null ? simpleValue != null : !SIMPLE_VALUE_EDEFAULT.equals(simpleValue);
      case EMapPackage.EGENERATOR_CONFIG_VALUE__CHILDREN:
        return children != null && !children.isEmpty();
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
    result.append(" (key: ");
    result.append(key);
    result.append(", simpleValue: ");
    result.append(simpleValue);
    result.append(')');
    return result.toString();
  }

} //EGeneratorConfigValueImpl

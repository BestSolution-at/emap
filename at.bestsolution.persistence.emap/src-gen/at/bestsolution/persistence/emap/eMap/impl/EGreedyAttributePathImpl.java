/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EAttribute;
import at.bestsolution.persistence.emap.eMap.EGreedyAttributePath;
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
 * An implementation of the model object '<em><b>EGreedy Attribute Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EGreedyAttributePathImpl#getGreedyAttribute <em>Greedy Attribute</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EGreedyAttributePathImpl#getSubPathList <em>Sub Path List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EGreedyAttributePathImpl extends MinimalEObjectImpl.Container implements EGreedyAttributePath
{
  /**
   * The cached value of the '{@link #getGreedyAttribute() <em>Greedy Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreedyAttribute()
   * @generated
   * @ordered
   */
  protected EAttribute greedyAttribute;

  /**
   * The cached value of the '{@link #getSubPathList() <em>Sub Path List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubPathList()
   * @generated
   * @ordered
   */
  protected EList<EGreedyAttributePath> subPathList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EGreedyAttributePathImpl()
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
    return EMapPackage.Literals.EGREEDY_ATTRIBUTE_PATH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGreedyAttribute()
  {
    if (greedyAttribute != null && greedyAttribute.eIsProxy())
    {
      InternalEObject oldGreedyAttribute = (InternalEObject)greedyAttribute;
      greedyAttribute = (EAttribute)eResolveProxy(oldGreedyAttribute);
      if (greedyAttribute != oldGreedyAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.EGREEDY_ATTRIBUTE_PATH__GREEDY_ATTRIBUTE, oldGreedyAttribute, greedyAttribute));
      }
    }
    return greedyAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute basicGetGreedyAttribute()
  {
    return greedyAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreedyAttribute(EAttribute newGreedyAttribute)
  {
    EAttribute oldGreedyAttribute = greedyAttribute;
    greedyAttribute = newGreedyAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EGREEDY_ATTRIBUTE_PATH__GREEDY_ATTRIBUTE, oldGreedyAttribute, greedyAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EGreedyAttributePath> getSubPathList()
  {
    if (subPathList == null)
    {
      subPathList = new EObjectContainmentEList<EGreedyAttributePath>(EGreedyAttributePath.class, this, EMapPackage.EGREEDY_ATTRIBUTE_PATH__SUB_PATH_LIST);
    }
    return subPathList;
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
      case EMapPackage.EGREEDY_ATTRIBUTE_PATH__SUB_PATH_LIST:
        return ((InternalEList<?>)getSubPathList()).basicRemove(otherEnd, msgs);
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
      case EMapPackage.EGREEDY_ATTRIBUTE_PATH__GREEDY_ATTRIBUTE:
        if (resolve) return getGreedyAttribute();
        return basicGetGreedyAttribute();
      case EMapPackage.EGREEDY_ATTRIBUTE_PATH__SUB_PATH_LIST:
        return getSubPathList();
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
      case EMapPackage.EGREEDY_ATTRIBUTE_PATH__GREEDY_ATTRIBUTE:
        setGreedyAttribute((EAttribute)newValue);
        return;
      case EMapPackage.EGREEDY_ATTRIBUTE_PATH__SUB_PATH_LIST:
        getSubPathList().clear();
        getSubPathList().addAll((Collection<? extends EGreedyAttributePath>)newValue);
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
      case EMapPackage.EGREEDY_ATTRIBUTE_PATH__GREEDY_ATTRIBUTE:
        setGreedyAttribute((EAttribute)null);
        return;
      case EMapPackage.EGREEDY_ATTRIBUTE_PATH__SUB_PATH_LIST:
        getSubPathList().clear();
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
      case EMapPackage.EGREEDY_ATTRIBUTE_PATH__GREEDY_ATTRIBUTE:
        return greedyAttribute != null;
      case EMapPackage.EGREEDY_ATTRIBUTE_PATH__SUB_PATH_LIST:
        return subPathList != null && !subPathList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EGreedyAttributePathImpl

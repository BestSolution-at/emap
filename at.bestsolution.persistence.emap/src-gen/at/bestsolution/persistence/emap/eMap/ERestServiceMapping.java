/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERest Service Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ERestServiceMapping#getServiceMethods <em>Service Methods</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ERestServiceMapping#getCustomServiceMethods <em>Custom Service Methods</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ERestServiceMapping#isRest <em>Rest</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getERestServiceMapping()
 * @model
 * @generated
 */
public interface ERestServiceMapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Service Methods</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Methods</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getERestServiceMapping_ServiceMethods()
   * @model containment="true"
   * @generated
   */
  EList<ENamedServiceQuery> getServiceMethods();

  /**
   * Returns the value of the '<em><b>Custom Service Methods</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.ECustomServiceMethods}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom Service Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Service Methods</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getERestServiceMapping_CustomServiceMethods()
   * @model containment="true"
   * @generated
   */
  EList<ECustomServiceMethods> getCustomServiceMethods();

  /**
   * Returns the value of the '<em><b>Rest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rest</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rest</em>' attribute.
   * @see #setRest(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getERestServiceMapping_Rest()
   * @model
   * @generated
   */
  boolean isRest();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ERestServiceMapping#isRest <em>Rest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rest</em>' attribute.
   * @see #isRest()
   * @generated
   */
  void setRest(boolean value);

} // ERestServiceMapping

/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMapping#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMapping()
 * @model
 * @generated
 */
public interface EMapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' containment reference.
   * @see #setRoot(EObject)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMapping_Root()
   * @model containment="true"
   * @generated
   */
  EObject getRoot();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMapping#getRoot <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' containment reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(EObject value);

} // EMapping

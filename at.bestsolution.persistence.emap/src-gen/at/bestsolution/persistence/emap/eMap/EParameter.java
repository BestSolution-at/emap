/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EParameter#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EParameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEParameter()
 * @model
 * @generated
 */
public interface EParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEParameter_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EParameter#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // EParameter

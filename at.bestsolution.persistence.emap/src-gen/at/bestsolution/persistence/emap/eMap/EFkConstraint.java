/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFk Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EFkConstraint#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EFkConstraint#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEFkConstraint()
 * @model
 * @generated
 */
public interface EFkConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(EAttribute)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEFkConstraint_Attribute()
   * @model
   * @generated
   */
  EAttribute getAttribute();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EFkConstraint#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(EAttribute value);

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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEFkConstraint_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EFkConstraint#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // EFkConstraint

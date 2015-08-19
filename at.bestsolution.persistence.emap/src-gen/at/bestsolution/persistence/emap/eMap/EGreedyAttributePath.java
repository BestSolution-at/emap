/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EGreedy Attribute Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EGreedyAttributePath#getGreedyAttribute <em>Greedy Attribute</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EGreedyAttributePath#getSubPathList <em>Sub Path List</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEGreedyAttributePath()
 * @model
 * @generated
 */
public interface EGreedyAttributePath extends EObject
{
  /**
   * Returns the value of the '<em><b>Greedy Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Greedy Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greedy Attribute</em>' reference.
   * @see #setGreedyAttribute(EAttribute)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEGreedyAttributePath_GreedyAttribute()
   * @model
   * @generated
   */
  EAttribute getGreedyAttribute();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EGreedyAttributePath#getGreedyAttribute <em>Greedy Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Greedy Attribute</em>' reference.
   * @see #getGreedyAttribute()
   * @generated
   */
  void setGreedyAttribute(EAttribute value);

  /**
   * Returns the value of the '<em><b>Sub Path List</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EGreedyAttributePath}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Path List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Path List</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEGreedyAttributePath_SubPathList()
   * @model containment="true"
   * @generated
   */
  EList<EGreedyAttributePath> getSubPathList();

} // EGreedyAttributePath

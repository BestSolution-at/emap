/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EType Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ETypeDef#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ETypeDef#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getETypeDef()
 * @model
 * @generated
 */
public interface ETypeDef extends EReturnType
{
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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getETypeDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ETypeDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EValueTypeAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getETypeDef_Types()
   * @model containment="true"
   * @generated
   */
  EList<EValueTypeAttribute> getTypes();

} // ETypeDef

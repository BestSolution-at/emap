/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESQL Att Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef#getDbTypes <em>Db Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getESQLAttTypeDef()
 * @model
 * @generated
 */
public interface ESQLAttTypeDef extends EObject
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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getESQLAttTypeDef_Attribute()
   * @model
   * @generated
   */
  EAttribute getAttribute();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(EAttribute value);

  /**
   * Returns the value of the '<em><b>Db Types</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.ESQLDbType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Types</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getESQLAttTypeDef_DbTypes()
   * @model containment="true"
   * @generated
   */
  EList<ESQLDbType> getDbTypes();

} // ESQLAttTypeDef

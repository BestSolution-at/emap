/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESQL Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ESQLTypeDef#getEtype <em>Etype</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ESQLTypeDef#getDbTypes <em>Db Types</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getESQLTypeDef()
 * @model
 * @generated
 */
public interface ESQLTypeDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Etype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Etype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Etype</em>' containment reference.
   * @see #setEtype(EType)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getESQLTypeDef_Etype()
   * @model containment="true"
   * @generated
   */
  EType getEtype();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ESQLTypeDef#getEtype <em>Etype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Etype</em>' containment reference.
   * @see #getEtype()
   * @generated
   */
  void setEtype(EType value);

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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getESQLTypeDef_DbTypes()
   * @model containment="true"
   * @generated
   */
  EList<ESQLDbType> getDbTypes();

} // ESQLTypeDef

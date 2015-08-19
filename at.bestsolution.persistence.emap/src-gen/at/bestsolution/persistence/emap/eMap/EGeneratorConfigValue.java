/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EGenerator Config Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue#getKey <em>Key</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue#getSimpleValue <em>Simple Value</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEGeneratorConfigValue()
 * @model
 * @generated
 */
public interface EGeneratorConfigValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEGeneratorConfigValue_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Simple Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Value</em>' attribute.
   * @see #setSimpleValue(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEGeneratorConfigValue_SimpleValue()
   * @model
   * @generated
   */
  String getSimpleValue();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue#getSimpleValue <em>Simple Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Value</em>' attribute.
   * @see #getSimpleValue()
   * @generated
   */
  void setSimpleValue(String value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EGeneratorConfigValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEGeneratorConfigValue_Children()
   * @model containment="true"
   * @generated
   */
  EList<EGeneratorConfigValue> getChildren();

} // EGeneratorConfigValue

/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EModel Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EModelTypeDef#getEclassDef <em>Eclass Def</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EModelTypeDef#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEModelTypeDef()
 * @model
 * @generated
 */
public interface EModelTypeDef extends EReturnType
{
  /**
   * Returns the value of the '<em><b>Eclass Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eclass Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eclass Def</em>' containment reference.
   * @see #setEclassDef(EType)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEModelTypeDef_EclassDef()
   * @model containment="true"
   * @generated
   */
  EType getEclassDef();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EModelTypeDef#getEclassDef <em>Eclass Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eclass Def</em>' containment reference.
   * @see #getEclassDef()
   * @generated
   */
  void setEclassDef(EType value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEModelTypeDef_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<EModelTypeAttribute> getAttributes();

} // EModelTypeDef

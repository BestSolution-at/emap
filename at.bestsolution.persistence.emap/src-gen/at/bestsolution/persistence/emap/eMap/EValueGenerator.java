/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EValue Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EValueGenerator#getDbType <em>Db Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EValueGenerator#isAutokey <em>Autokey</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EValueGenerator#getQuery <em>Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EValueGenerator#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEValueGenerator()
 * @model
 * @generated
 */
public interface EValueGenerator extends EObject
{
  /**
   * Returns the value of the '<em><b>Db Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Type</em>' attribute.
   * @see #setDbType(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEValueGenerator_DbType()
   * @model
   * @generated
   */
  String getDbType();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EValueGenerator#getDbType <em>Db Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Type</em>' attribute.
   * @see #getDbType()
   * @generated
   */
  void setDbType(String value);

  /**
   * Returns the value of the '<em><b>Autokey</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Autokey</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autokey</em>' attribute.
   * @see #setAutokey(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEValueGenerator_Autokey()
   * @model
   * @generated
   */
  boolean isAutokey();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EValueGenerator#isAutokey <em>Autokey</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Autokey</em>' attribute.
   * @see #isAutokey()
   * @generated
   */
  void setAutokey(boolean value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' attribute.
   * @see #setQuery(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEValueGenerator_Query()
   * @model
   * @generated
   */
  String getQuery();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EValueGenerator#getQuery <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' attribute.
   * @see #getQuery()
   * @generated
   */
  void setQuery(String value);

  /**
   * Returns the value of the '<em><b>Sequence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence</em>' attribute.
   * @see #setSequence(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEValueGenerator_Sequence()
   * @model
   * @generated
   */
  String getSequence();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EValueGenerator#getSequence <em>Sequence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence</em>' attribute.
   * @see #getSequence()
   * @generated
   */
  void setSequence(String value);

} // EValueGenerator

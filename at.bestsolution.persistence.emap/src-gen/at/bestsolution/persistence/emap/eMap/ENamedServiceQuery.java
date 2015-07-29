/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENamed Service Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getQuery <em>Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getPath <em>Path</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedServiceQuery()
 * @model
 * @generated
 */
public interface ENamedServiceQuery extends EObject
{
  /**
   * Returns the value of the '<em><b>Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' reference.
   * @see #setQuery(ENamedQuery)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedServiceQuery_Query()
   * @model
   * @generated
   */
  ENamedQuery getQuery();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getQuery <em>Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(ENamedQuery value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedServiceQuery_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EServiceParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedServiceQuery_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<EServiceParam> getParameters();

} // ENamedServiceQuery

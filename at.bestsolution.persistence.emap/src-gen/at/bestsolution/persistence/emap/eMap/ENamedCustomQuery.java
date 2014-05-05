/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENamed Custom Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#isList <em>List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getParameters <em>Parameters</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedCustomQuery()
 * @model
 * @generated
 */
public interface ENamedCustomQuery extends EObject
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(EReturnType)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedCustomQuery_ReturnType()
   * @model containment="true"
   * @generated
   */
  EReturnType getReturnType();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(EReturnType value);

  /**
   * Returns the value of the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' attribute.
   * @see #setList(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedCustomQuery_List()
   * @model
   * @generated
   */
  boolean isList();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#isList <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' attribute.
   * @see #isList()
   * @generated
   */
  void setList(boolean value);

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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedCustomQuery_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ENamedCustomQuery#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedCustomQuery_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<EParameter> getParameters();

  /**
   * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.ECustomQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Queries</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedCustomQuery_Queries()
   * @model containment="true"
   * @generated
   */
  EList<ECustomQuery> getQueries();

} // ENamedCustomQuery

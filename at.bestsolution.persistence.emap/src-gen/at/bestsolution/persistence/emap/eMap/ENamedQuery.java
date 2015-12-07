/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENamed Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ENamedQuery#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ENamedQuery#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ENamedQuery#getParameters <em>Parameters</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ENamedQuery#getQueries <em>Queries</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedQuery()
 * @model
 * @generated
 */
public interface ENamedQuery extends EObject
{
  /**
   * Returns the value of the '<em><b>Return Type</b></em>' attribute.
   * The literals are from the enumeration {@link at.bestsolution.persistence.emap.eMap.ReturnType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' attribute.
   * @see at.bestsolution.persistence.emap.eMap.ReturnType
   * @see #setReturnType(ReturnType)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedQuery_ReturnType()
   * @model
   * @generated
   */
  ReturnType getReturnType();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ENamedQuery#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see at.bestsolution.persistence.emap.eMap.ReturnType
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(ReturnType value);

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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedQuery_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ENamedQuery#getName <em>Name</em>}' attribute.
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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedQuery_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<EParameter> getParameters();

  /**
   * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Queries</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getENamedQuery_Queries()
   * @model containment="true"
   * @generated
   */
  EList<EQuery> getQueries();

} // ENamedQuery

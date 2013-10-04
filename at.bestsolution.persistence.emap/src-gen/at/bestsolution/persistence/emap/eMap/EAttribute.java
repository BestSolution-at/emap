/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#isPk <em>Pk</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#getProperty <em>Property</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#getValueGenerators <em>Value Generators</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#isResolved <em>Resolved</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#getQuery <em>Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEAttribute()
 * @model
 * @generated
 */
public interface EAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Pk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pk</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pk</em>' attribute.
   * @see #setPk(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEAttribute_Pk()
   * @model
   * @generated
   */
  boolean isPk();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EAttribute#isPk <em>Pk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pk</em>' attribute.
   * @see #isPk()
   * @generated
   */
  void setPk(boolean value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEAttribute_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

  /**
   * Returns the value of the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Name</em>' attribute.
   * @see #setColumnName(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEAttribute_ColumnName()
   * @model
   * @generated
   */
  String getColumnName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getColumnName <em>Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Name</em>' attribute.
   * @see #getColumnName()
   * @generated
   */
  void setColumnName(String value);

  /**
   * Returns the value of the '<em><b>Value Generators</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EValueGenerator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Generators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Generators</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEAttribute_ValueGenerators()
   * @model containment="true"
   * @generated
   */
  EList<EValueGenerator> getValueGenerators();

  /**
   * Returns the value of the '<em><b>Resolved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolved</em>' attribute.
   * @see #setResolved(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEAttribute_Resolved()
   * @model
   * @generated
   */
  boolean isResolved();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EAttribute#isResolved <em>Resolved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resolved</em>' attribute.
   * @see #isResolved()
   * @generated
   */
  void setResolved(boolean value);

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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEAttribute_Query()
   * @model
   * @generated
   */
  ENamedQuery getQuery();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getQuery <em>Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(ENamedQuery value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' attribute list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEAttribute_Parameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameters();

} // EAttribute

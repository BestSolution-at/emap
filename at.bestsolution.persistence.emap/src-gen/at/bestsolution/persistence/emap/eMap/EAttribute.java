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
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#isForcedFk <em>Forced Fk</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#getValueGenerators <em>Value Generators</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#isResolved <em>Resolved</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#getQuery <em>Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#getParameters <em>Parameters</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EAttribute#getRelationTable <em>Relation Table</em>}</li>
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
   * Returns the value of the '<em><b>Forced Fk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forced Fk</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forced Fk</em>' attribute.
   * @see #setForcedFk(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEAttribute_ForcedFk()
   * @model
   * @generated
   */
  boolean isForcedFk();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EAttribute#isForcedFk <em>Forced Fk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forced Fk</em>' attribute.
   * @see #isForcedFk()
   * @generated
   */
  void setForcedFk(boolean value);

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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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

  /**
   * Returns the value of the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opposite</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite</em>' reference.
   * @see #setOpposite(EAttribute)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEAttribute_Opposite()
   * @model
   * @generated
   */
  EAttribute getOpposite();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(EAttribute value);

  /**
   * Returns the value of the '<em><b>Relation Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation Table</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation Table</em>' attribute.
   * @see #setRelationTable(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEAttribute_RelationTable()
   * @model
   * @generated
   */
  String getRelationTable();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EAttribute#getRelationTable <em>Relation Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation Table</em>' attribute.
   * @see #getRelationTable()
   * @generated
   */
  void setRelationTable(String value);

} // EAttribute

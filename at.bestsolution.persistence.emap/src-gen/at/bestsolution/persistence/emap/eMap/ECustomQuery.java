/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECustom Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getDbType <em>Db Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getColumns <em>Columns</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getFrom <em>From</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getWhere <em>Where</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getOrderby <em>Orderby</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getAll <em>All</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getECustomQuery()
 * @model
 * @generated
 */
public interface ECustomQuery extends EObject
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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getECustomQuery_DbType()
   * @model
   * @generated
   */
  String getDbType();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getDbType <em>Db Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Type</em>' attribute.
   * @see #getDbType()
   * @generated
   */
  void setDbType(String value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' attribute.
   * @see #setColumns(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getECustomQuery_Columns()
   * @model
   * @generated
   */
  String getColumns();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getColumns <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columns</em>' attribute.
   * @see #getColumns()
   * @generated
   */
  void setColumns(String value);

  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getECustomQuery_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

  /**
   * Returns the value of the '<em><b>Where</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' attribute.
   * @see #setWhere(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getECustomQuery_Where()
   * @model
   * @generated
   */
  String getWhere();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getWhere <em>Where</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' attribute.
   * @see #getWhere()
   * @generated
   */
  void setWhere(String value);

  /**
   * Returns the value of the '<em><b>Group By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group By</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group By</em>' attribute.
   * @see #setGroupBy(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getECustomQuery_GroupBy()
   * @model
   * @generated
   */
  String getGroupBy();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getGroupBy <em>Group By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group By</em>' attribute.
   * @see #getGroupBy()
   * @generated
   */
  void setGroupBy(String value);

  /**
   * Returns the value of the '<em><b>Orderby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orderby</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orderby</em>' attribute.
   * @see #setOrderby(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getECustomQuery_Orderby()
   * @model
   * @generated
   */
  String getOrderby();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getOrderby <em>Orderby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orderby</em>' attribute.
   * @see #getOrderby()
   * @generated
   */
  void setOrderby(String value);

  /**
   * Returns the value of the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All</em>' attribute.
   * @see #setAll(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getECustomQuery_All()
   * @model
   * @generated
   */
  String getAll();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ECustomQuery#getAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #getAll()
   * @generated
   */
  void setAll(String value);

} // ECustomQuery

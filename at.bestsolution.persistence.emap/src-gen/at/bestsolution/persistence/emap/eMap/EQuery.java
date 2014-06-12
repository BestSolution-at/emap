/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EQuery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EQuery#getDbType <em>Db Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EQuery#getMapping <em>Mapping</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EQuery#getFrom <em>From</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EQuery#getWhere <em>Where</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EQuery#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EQuery#getOrderby <em>Orderby</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EQuery#getAll <em>All</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEQuery()
 * @model
 * @generated
 */
public interface EQuery extends EObject
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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEQuery_DbType()
   * @model
   * @generated
   */
  String getDbType();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EQuery#getDbType <em>Db Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Type</em>' attribute.
   * @see #getDbType()
   * @generated
   */
  void setDbType(String value);

  /**
   * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping</em>' containment reference.
   * @see #setMapping(EObjectSection)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEQuery_Mapping()
   * @model containment="true"
   * @generated
   */
  EObjectSection getMapping();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EQuery#getMapping <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping</em>' containment reference.
   * @see #getMapping()
   * @generated
   */
  void setMapping(EObjectSection value);

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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEQuery_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EQuery#getFrom <em>From</em>}' attribute.
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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEQuery_Where()
   * @model
   * @generated
   */
  String getWhere();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EQuery#getWhere <em>Where</em>}' attribute.
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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEQuery_GroupBy()
   * @model
   * @generated
   */
  String getGroupBy();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EQuery#getGroupBy <em>Group By</em>}' attribute.
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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEQuery_Orderby()
   * @model
   * @generated
   */
  String getOrderby();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EQuery#getOrderby <em>Orderby</em>}' attribute.
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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEQuery_All()
   * @model
   * @generated
   */
  String getAll();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EQuery#getAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #getAll()
   * @generated
   */
  void setAll(String value);

} // EQuery

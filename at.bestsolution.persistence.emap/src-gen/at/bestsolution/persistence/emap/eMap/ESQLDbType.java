/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESQL Db Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ESQLDbType#getDbType <em>Db Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ESQLDbType#getSqlTypeDef <em>Sql Type Def</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.ESQLDbType#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getESQLDbType()
 * @model
 * @generated
 */
public interface ESQLDbType extends EObject
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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getESQLDbType_DbType()
   * @model
   * @generated
   */
  String getDbType();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ESQLDbType#getDbType <em>Db Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Type</em>' attribute.
   * @see #getDbType()
   * @generated
   */
  void setDbType(String value);

  /**
   * Returns the value of the '<em><b>Sql Type Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sql Type Def</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sql Type Def</em>' attribute.
   * @see #setSqlTypeDef(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getESQLDbType_SqlTypeDef()
   * @model
   * @generated
   */
  String getSqlTypeDef();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ESQLDbType#getSqlTypeDef <em>Sql Type Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sql Type Def</em>' attribute.
   * @see #getSqlTypeDef()
   * @generated
   */
  void setSqlTypeDef(String value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getESQLDbType_Size()
   * @model
   * @generated
   */
  String getSize();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.ESQLDbType#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(String value);

} // ESQLDbType

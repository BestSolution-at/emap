/**
 */
package at.bestsolution.persistence.emap.model.table;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.Table#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.Table#getKey <em>Key</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.Table#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.Table#getLockColumn <em>Lock Column</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
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
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.emap.model.table.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.persistence.emap.model.table.Column}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.emap.model.table.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getTable_Columns()
	 * @see at.bestsolution.persistence.emap.model.table.Column#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.emap.model.table.PrimaryKey#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(PrimaryKey)
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getTable_Key()
	 * @see at.bestsolution.persistence.emap.model.table.PrimaryKey#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	PrimaryKey getKey();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.emap.model.table.Table#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.persistence.emap.model.table.ForeignKey}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.emap.model.table.ForeignKey#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getTable_ForeignKeys()
	 * @see at.bestsolution.persistence.emap.model.table.ForeignKey#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<ForeignKey> getForeignKeys();

	/**
	 * Returns the value of the '<em><b>Lock Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Column</em>' reference.
	 * @see #setLockColumn(Column)
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getTable_LockColumn()
	 * @model
	 * @generated
	 */
	Column getLockColumn();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.emap.model.table.Table#getLockColumn <em>Lock Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Column</em>' reference.
	 * @see #getLockColumn()
	 * @generated
	 */
	void setLockColumn(Column value);

} // Table

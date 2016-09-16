/**
 */
package at.bestsolution.persistence.emap.model.table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.PrimaryKey#getTable <em>Table</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.PrimaryKey#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends Constraint {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.emap.model.table.Table#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getPrimaryKey_Table()
	 * @see at.bestsolution.persistence.emap.model.table.Table#getKey
	 * @model opposite="key" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.emap.model.table.PrimaryKey#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link at.bestsolution.persistence.emap.model.table.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getPrimaryKey_Columns()
	 * @model
	 * @generated
	 */
	EList<Column> getColumns();

} // PrimaryKey

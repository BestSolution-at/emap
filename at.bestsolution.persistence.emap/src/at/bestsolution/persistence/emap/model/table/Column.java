/**
 */
package at.bestsolution.persistence.emap.model.table;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.Column#getTable <em>Table</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.Column#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.Column#getDataType <em>Data Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.Column#getDataTypeSize <em>Data Type Size</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.Column#isNotNull <em>Not Null</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.emap.model.table.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getColumn_Table()
	 * @see at.bestsolution.persistence.emap.model.table.Table#getColumns
	 * @model opposite="columns" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.emap.model.table.Column#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

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
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.emap.model.table.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(EDataType)
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getColumn_DataType()
	 * @model
	 * @generated
	 */
	EDataType getDataType();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.emap.model.table.Column#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(EDataType value);

	/**
	 * Returns the value of the '<em><b>Data Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Size</em>' attribute.
	 * @see #setDataTypeSize(String)
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getColumn_DataTypeSize()
	 * @model
	 * @generated
	 */
	String getDataTypeSize();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.emap.model.table.Column#getDataTypeSize <em>Data Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Size</em>' attribute.
	 * @see #getDataTypeSize()
	 * @generated
	 */
	void setDataTypeSize(String value);

	/**
	 * Returns the value of the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Null</em>' attribute.
	 * @see #setNotNull(boolean)
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getColumn_NotNull()
	 * @model
	 * @generated
	 */
	boolean isNotNull();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.emap.model.table.Column#isNotNull <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Null</em>' attribute.
	 * @see #isNotNull()
	 * @generated
	 */
	void setNotNull(boolean value);

} // Column

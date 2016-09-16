/**
 */
package at.bestsolution.persistence.emap.model.table;

import at.bestsolution.persistence.emap.eMap.EMappingBundle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.TableModel#getTables <em>Tables</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.TableModel#getNmTables <em>Nm Tables</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.TableModel#getMappedBundle <em>Mapped Bundle</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getTableModel()
 * @model
 * @generated
 */
public interface TableModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.persistence.emap.model.table.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getTableModel_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Nm Tables</b></em>' reference list.
	 * The list contents are of type {@link at.bestsolution.persistence.emap.model.table.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nm Tables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nm Tables</em>' reference list.
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getTableModel_NmTables()
	 * @model
	 * @generated
	 */
	EList<Table> getNmTables();

	/**
	 * Returns the value of the '<em><b>Mapped Bundle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped Bundle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Bundle</em>' reference.
	 * @see #setMappedBundle(EMappingBundle)
	 * @see at.bestsolution.persistence.emap.model.table.TablePackage#getTableModel_MappedBundle()
	 * @model
	 * @generated
	 */
	EMappingBundle getMappedBundle();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.emap.model.table.TableModel#getMappedBundle <em>Mapped Bundle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Bundle</em>' reference.
	 * @see #getMappedBundle()
	 * @generated
	 */
	void setMappedBundle(EMappingBundle value);

} // TableModel

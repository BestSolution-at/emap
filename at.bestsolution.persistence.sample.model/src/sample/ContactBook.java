/**
 */
package sample;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sample.ContactBook#getPersonList <em>Person List</em>}</li>
 * </ul>
 * </p>
 *
 * @see sample.SamplePackage#getContactBook()
 * @model
 * @generated
 */
public interface ContactBook extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Person List</b></em>' containment reference list.
	 * The list contents are of type {@link sample.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person List</em>' containment reference list.
	 * @see sample.SamplePackage#getContactBook_PersonList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersonList();

} // ContactBook

/**
 */
package at.bestsolution.emf.navi.tests.model.sample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.emf.navi.tests.model.sample.Group#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.emf.navi.tests.model.sample.Group#getPersons <em>Persons</em>}</li>
 *   <li>{@link at.bestsolution.emf.navi.tests.model.sample.Group#getDepartment <em>Department</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
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
	 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.bestsolution.emf.navi.tests.model.sample.Group#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.emf.navi.tests.model.sample.Person}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.emf.navi.tests.model.sample.Person#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getGroup_Persons()
	 * @see at.bestsolution.emf.navi.tests.model.sample.Person#getGroup
	 * @model opposite="group" containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.emf.navi.tests.model.sample.Department#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Department</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getGroup_Department()
	 * @see at.bestsolution.emf.navi.tests.model.sample.Department#getGroups
	 * @model opposite="groups" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link at.bestsolution.emf.navi.tests.model.sample.Group#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

} // Group

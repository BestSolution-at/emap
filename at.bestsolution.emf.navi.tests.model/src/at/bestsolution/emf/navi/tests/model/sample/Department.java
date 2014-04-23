/**
 */
package at.bestsolution.emf.navi.tests.model.sample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.emf.navi.tests.model.sample.Department#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.emf.navi.tests.model.sample.Department#getGroups <em>Groups</em>}</li>
 *   <li>{@link at.bestsolution.emf.navi.tests.model.sample.Department#getCompany <em>Company</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
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
	 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getDepartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.bestsolution.emf.navi.tests.model.sample.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.emf.navi.tests.model.sample.Group}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.emf.navi.tests.model.sample.Group#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getDepartment_Groups()
	 * @see at.bestsolution.emf.navi.tests.model.sample.Group#getDepartment
	 * @model opposite="department" containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Company</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.emf.navi.tests.model.sample.Company#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' container reference.
	 * @see #setCompany(Company)
	 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getDepartment_Company()
	 * @see at.bestsolution.emf.navi.tests.model.sample.Company#getDepartments
	 * @model opposite="departments" transient="false"
	 * @generated
	 */
	Company getCompany();

	/**
	 * Sets the value of the '{@link at.bestsolution.emf.navi.tests.model.sample.Department#getCompany <em>Company</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' container reference.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(Company value);

} // Department

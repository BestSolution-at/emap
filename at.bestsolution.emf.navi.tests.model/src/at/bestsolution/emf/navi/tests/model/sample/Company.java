/**
 */
package at.bestsolution.emf.navi.tests.model.sample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.emf.navi.tests.model.sample.Company#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.emf.navi.tests.model.sample.Company#getDepartments <em>Departments</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getCompany()
 * @model
 * @generated
 */
public interface Company extends EObject {
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
	 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getCompany_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.bestsolution.emf.navi.tests.model.sample.Company#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Departments</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.emf.navi.tests.model.sample.Department}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.emf.navi.tests.model.sample.Department#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departments</em>' containment reference list.
	 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getCompany_Departments()
	 * @see at.bestsolution.emf.navi.tests.model.sample.Department#getCompany
	 * @model opposite="company" containment="true"
	 * @generated
	 */
	EList<Department> getDepartments();

} // Company

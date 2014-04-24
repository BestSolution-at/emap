/**
 */
package at.bestsolution.emf.navi.tests.model.sample;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.emf.navi.tests.model.sample.Person#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.emf.navi.tests.model.sample.Person#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link at.bestsolution.emf.navi.tests.model.sample.Person#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
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
	 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.bestsolution.emf.navi.tests.model.sample.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birthdate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthdate</em>' attribute.
	 * @see #setBirthdate(Date)
	 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getPerson_Birthdate()
	 * @model
	 * @generated
	 */
	Date getBirthdate();

	/**
	 * Sets the value of the '{@link at.bestsolution.emf.navi.tests.model.sample.Person#getBirthdate <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' attribute.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(Date value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.emf.navi.tests.model.sample.Group#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(Group)
	 * @see at.bestsolution.emf.navi.tests.model.sample.SamplePackage#getPerson_Group()
	 * @see at.bestsolution.emf.navi.tests.model.sample.Group#getPersons
	 * @model opposite="persons" transient="false"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link at.bestsolution.emf.navi.tests.model.sample.Person#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

} // Person

/**
 */
package test.model.test;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.model.test.Address#getId <em>Id</em>}</li>
 *   <li>{@link test.model.test.Address#getStreet <em>Street</em>}</li>
 *   <li>{@link test.model.test.Address#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see test.model.test.TestPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see test.model.test.TestPackage#getAddress_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link test.model.test.Address#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see test.model.test.TestPackage#getAddress_Street()
	 * @model
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link test.model.test.Address#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link test.model.test.Person#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' container reference.
	 * @see #setPerson(Person)
	 * @see test.model.test.TestPackage#getAddress_Person()
	 * @see test.model.test.Person#getAddresses
	 * @model opposite="addresses" transient="false"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link test.model.test.Address#getPerson <em>Person</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' container reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // Address

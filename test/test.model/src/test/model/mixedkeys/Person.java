/**
 */
package test.model.mixedkeys;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.model.mixedkeys.Person#getId <em>Id</em>}</li>
 *   <li>{@link test.model.mixedkeys.Person#getName <em>Name</em>}</li>
 *   <li>{@link test.model.mixedkeys.Person#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link test.model.mixedkeys.Person#getLikes <em>Likes</em>}</li>
 * </ul>
 *
 * @see test.model.mixedkeys.MixedkeysPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see test.model.mixedkeys.MixedkeysPackage#getPerson_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link test.model.mixedkeys.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see test.model.mixedkeys.MixedkeysPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link test.model.mixedkeys.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link test.model.mixedkeys.Address}.
	 * It is bidirectional and its opposite is '{@link test.model.mixedkeys.Address#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see test.model.mixedkeys.MixedkeysPackage#getPerson_Addresses()
	 * @see test.model.mixedkeys.Address#getPerson
	 * @model opposite="person" containment="true"
	 * @generated
	 */
	EList<Address> getAddresses();

	/**
	 * Returns the value of the '<em><b>Likes</b></em>' reference list.
	 * The list contents are of type {@link test.model.mixedkeys.Place}.
	 * It is bidirectional and its opposite is '{@link test.model.mixedkeys.Place#getLikedBy <em>Liked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Likes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likes</em>' reference list.
	 * @see test.model.mixedkeys.MixedkeysPackage#getPerson_Likes()
	 * @see test.model.mixedkeys.Place#getLikedBy
	 * @model opposite="likedBy"
	 * @generated
	 */
	EList<Place> getLikes();

} // Person

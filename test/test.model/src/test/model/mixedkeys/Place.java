/**
 */
package test.model.mixedkeys;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.model.mixedkeys.Place#getId <em>Id</em>}</li>
 *   <li>{@link test.model.mixedkeys.Place#getName <em>Name</em>}</li>
 *   <li>{@link test.model.mixedkeys.Place#getLikedBy <em>Liked By</em>}</li>
 * </ul>
 *
 * @see test.model.mixedkeys.MixedkeysPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends EObject {
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
	 * @see test.model.mixedkeys.MixedkeysPackage#getPlace_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link test.model.mixedkeys.Place#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

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
	 * @see test.model.mixedkeys.MixedkeysPackage#getPlace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link test.model.mixedkeys.Place#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Liked By</b></em>' reference list.
	 * The list contents are of type {@link test.model.mixedkeys.Person}.
	 * It is bidirectional and its opposite is '{@link test.model.mixedkeys.Person#getLikes <em>Likes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liked By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liked By</em>' reference list.
	 * @see test.model.mixedkeys.MixedkeysPackage#getPlace_LikedBy()
	 * @see test.model.mixedkeys.Person#getLikes
	 * @model opposite="likes"
	 * @generated
	 */
	EList<Person> getLikedBy();

} // Place

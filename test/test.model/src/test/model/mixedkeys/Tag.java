/**
 */
package test.model.mixedkeys;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.model.mixedkeys.Tag#getId <em>Id</em>}</li>
 *   <li>{@link test.model.mixedkeys.Tag#getValue <em>Value</em>}</li>
 *   <li>{@link test.model.mixedkeys.Tag#getAddress <em>Address</em>}</li>
 *   <li>{@link test.model.mixedkeys.Tag#getEndlessInt <em>Endless Int</em>}</li>
 * </ul>
 *
 * @see test.model.mixedkeys.MixedkeysPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BigInteger)
	 * @see test.model.mixedkeys.MixedkeysPackage#getTag_Id()
	 * @model
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '{@link test.model.mixedkeys.Tag#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see test.model.mixedkeys.MixedkeysPackage#getTag_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link test.model.mixedkeys.Tag#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link test.model.mixedkeys.Address#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' container reference.
	 * @see #setAddress(Address)
	 * @see test.model.mixedkeys.MixedkeysPackage#getTag_Address()
	 * @see test.model.mixedkeys.Address#getTags
	 * @model opposite="tags" transient="false"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link test.model.mixedkeys.Tag#getAddress <em>Address</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' container reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Endless Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endless Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endless Int</em>' attribute.
	 * @see #setEndlessInt(BigInteger)
	 * @see test.model.mixedkeys.MixedkeysPackage#getTag_EndlessInt()
	 * @model
	 * @generated
	 */
	BigInteger getEndlessInt();

	/**
	 * Sets the value of the '{@link test.model.mixedkeys.Tag#getEndlessInt <em>Endless Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endless Int</em>' attribute.
	 * @see #getEndlessInt()
	 * @generated
	 */
	void setEndlessInt(BigInteger value);

} // Tag

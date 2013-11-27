/**
 */
package sample.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sample.ContactBook;
import sample.Person;
import sample.SamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sample.impl.ContactBookImpl#getPersonList <em>Person List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactBookImpl extends BaseObjectImpl implements ContactBook {
	/**
	 * The cached value of the '{@link #getPersonList() <em>Person List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonList()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> personList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactBookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SamplePackage.Literals.CONTACT_BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersonList() {
		if (personList == null) {
			personList = new EObjectContainmentEList<Person>(Person.class, this, SamplePackage.CONTACT_BOOK__PERSON_LIST);
		}
		return personList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SamplePackage.CONTACT_BOOK__PERSON_LIST:
				return ((InternalEList<?>)getPersonList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SamplePackage.CONTACT_BOOK__PERSON_LIST:
				return getPersonList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SamplePackage.CONTACT_BOOK__PERSON_LIST:
				getPersonList().clear();
				getPersonList().addAll((Collection<? extends Person>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SamplePackage.CONTACT_BOOK__PERSON_LIST:
				getPersonList().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SamplePackage.CONTACT_BOOK__PERSON_LIST:
				return personList != null && !personList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContactBookImpl

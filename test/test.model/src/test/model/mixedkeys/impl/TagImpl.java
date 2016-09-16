/**
 */
package test.model.mixedkeys.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import test.model.mixedkeys.Address;
import test.model.mixedkeys.MixedkeysPackage;
import test.model.mixedkeys.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link test.model.mixedkeys.impl.TagImpl#getId <em>Id</em>}</li>
 *   <li>{@link test.model.mixedkeys.impl.TagImpl#getValue <em>Value</em>}</li>
 *   <li>{@link test.model.mixedkeys.impl.TagImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link test.model.mixedkeys.impl.TagImpl#getEndlessInt <em>Endless Int</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagImpl extends MinimalEObjectImpl.Container implements Tag {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndlessInt() <em>Endless Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndlessInt()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ENDLESS_INT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndlessInt() <em>Endless Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndlessInt()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endlessInt = ENDLESS_INT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MixedkeysPackage.Literals.TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(BigInteger newId) {
		BigInteger oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MixedkeysPackage.TAG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MixedkeysPackage.TAG__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAddress() {
		if (eContainerFeatureID() != MixedkeysPackage.TAG__ADDRESS) return null;
		return (Address)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAddress, MixedkeysPackage.TAG__ADDRESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Address newAddress) {
		if (newAddress != eInternalContainer() || (eContainerFeatureID() != MixedkeysPackage.TAG__ADDRESS && newAddress != null)) {
			if (EcoreUtil.isAncestor(this, newAddress))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, MixedkeysPackage.ADDRESS__TAGS, Address.class, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MixedkeysPackage.TAG__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEndlessInt() {
		return endlessInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndlessInt(BigInteger newEndlessInt) {
		BigInteger oldEndlessInt = endlessInt;
		endlessInt = newEndlessInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MixedkeysPackage.TAG__ENDLESS_INT, oldEndlessInt, endlessInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MixedkeysPackage.TAG__ADDRESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAddress((Address)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MixedkeysPackage.TAG__ADDRESS:
				return basicSetAddress(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MixedkeysPackage.TAG__ADDRESS:
				return eInternalContainer().eInverseRemove(this, MixedkeysPackage.ADDRESS__TAGS, Address.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MixedkeysPackage.TAG__ID:
				return getId();
			case MixedkeysPackage.TAG__VALUE:
				return getValue();
			case MixedkeysPackage.TAG__ADDRESS:
				return getAddress();
			case MixedkeysPackage.TAG__ENDLESS_INT:
				return getEndlessInt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MixedkeysPackage.TAG__ID:
				setId((BigInteger)newValue);
				return;
			case MixedkeysPackage.TAG__VALUE:
				setValue((String)newValue);
				return;
			case MixedkeysPackage.TAG__ADDRESS:
				setAddress((Address)newValue);
				return;
			case MixedkeysPackage.TAG__ENDLESS_INT:
				setEndlessInt((BigInteger)newValue);
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
			case MixedkeysPackage.TAG__ID:
				setId(ID_EDEFAULT);
				return;
			case MixedkeysPackage.TAG__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MixedkeysPackage.TAG__ADDRESS:
				setAddress((Address)null);
				return;
			case MixedkeysPackage.TAG__ENDLESS_INT:
				setEndlessInt(ENDLESS_INT_EDEFAULT);
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
			case MixedkeysPackage.TAG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MixedkeysPackage.TAG__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case MixedkeysPackage.TAG__ADDRESS:
				return getAddress() != null;
			case MixedkeysPackage.TAG__ENDLESS_INT:
				return ENDLESS_INT_EDEFAULT == null ? endlessInt != null : !ENDLESS_INT_EDEFAULT.equals(endlessInt);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", value: ");
		result.append(value);
		result.append(", endlessInt: ");
		result.append(endlessInt);
		result.append(')');
		return result.toString();
	}

} //TagImpl

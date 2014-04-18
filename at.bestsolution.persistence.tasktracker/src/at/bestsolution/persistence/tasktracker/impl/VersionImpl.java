/**
 * *****************************************************************************
 *  Copyright (c) 2014 BestSolution.at and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *  *******************************************************************************
 */
package at.bestsolution.persistence.tasktracker.impl;

import at.bestsolution.persistence.tasktracker.TaskRepository;
import at.bestsolution.persistence.tasktracker.TasktrackerPackage;
import at.bestsolution.persistence.tasktracker.Version;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.VersionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.VersionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.VersionImpl#getCodename <em>Codename</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.VersionImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionImpl extends BaseObjectImpl implements Version {
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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodename() <em>Codename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodename()
	 * @generated
	 * @ordered
	 */
	protected static final String CODENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodename() <em>Codename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodename()
	 * @generated
	 * @ordered
	 */
	protected String codename = CODENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasktrackerPackage.Literals.VERSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.VERSION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.VERSION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodename() {
		return codename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodename(String newCodename) {
		String oldCodename = codename;
		codename = newCodename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.VERSION__CODENAME, oldCodename, codename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRepository getRepository() {
		if (eContainerFeatureID() != TasktrackerPackage.VERSION__REPOSITORY) return null;
		return (TaskRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(TaskRepository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, TasktrackerPackage.VERSION__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(TaskRepository newRepository) {
		if (newRepository != eInternalContainer() || (eContainerFeatureID() != TasktrackerPackage.VERSION__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, TasktrackerPackage.TASK_REPOSITORY__VERSION_LIST, TaskRepository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.VERSION__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TasktrackerPackage.VERSION__REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository((TaskRepository)otherEnd, msgs);
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
			case TasktrackerPackage.VERSION__REPOSITORY:
				return basicSetRepository(null, msgs);
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
			case TasktrackerPackage.VERSION__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, TasktrackerPackage.TASK_REPOSITORY__VERSION_LIST, TaskRepository.class, msgs);
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
			case TasktrackerPackage.VERSION__VALUE:
				return getValue();
			case TasktrackerPackage.VERSION__DATE:
				return getDate();
			case TasktrackerPackage.VERSION__CODENAME:
				return getCodename();
			case TasktrackerPackage.VERSION__REPOSITORY:
				return getRepository();
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
			case TasktrackerPackage.VERSION__VALUE:
				setValue((String)newValue);
				return;
			case TasktrackerPackage.VERSION__DATE:
				setDate((Date)newValue);
				return;
			case TasktrackerPackage.VERSION__CODENAME:
				setCodename((String)newValue);
				return;
			case TasktrackerPackage.VERSION__REPOSITORY:
				setRepository((TaskRepository)newValue);
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
			case TasktrackerPackage.VERSION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case TasktrackerPackage.VERSION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case TasktrackerPackage.VERSION__CODENAME:
				setCodename(CODENAME_EDEFAULT);
				return;
			case TasktrackerPackage.VERSION__REPOSITORY:
				setRepository((TaskRepository)null);
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
			case TasktrackerPackage.VERSION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case TasktrackerPackage.VERSION__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case TasktrackerPackage.VERSION__CODENAME:
				return CODENAME_EDEFAULT == null ? codename != null : !CODENAME_EDEFAULT.equals(codename);
			case TasktrackerPackage.VERSION__REPOSITORY:
				return getRepository() != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", date: ");
		result.append(date);
		result.append(", codename: ");
		result.append(codename);
		result.append(')');
		return result.toString();
	}

} //VersionImpl

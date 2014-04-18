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

import at.bestsolution.persistence.tasktracker.SourceRepository;
import at.bestsolution.persistence.tasktracker.SourceRepositoryType;
import at.bestsolution.persistence.tasktracker.TaskRepository;
import at.bestsolution.persistence.tasktracker.TasktrackerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.SourceRepositoryImpl#getSourceUrl <em>Source Url</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.SourceRepositoryImpl#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.SourceRepositoryImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.SourceRepositoryImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceRepositoryImpl extends BaseObjectImpl implements SourceRepository {
	/**
	 * The default value of the '{@link #getSourceUrl() <em>Source Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceUrl() <em>Source Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUrl()
	 * @generated
	 * @ordered
	 */
	protected String sourceUrl = SOURCE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebUrl() <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebUrl() <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebUrl()
	 * @generated
	 * @ordered
	 */
	protected String webUrl = WEB_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SourceRepositoryType TYPE_EDEFAULT = SourceRepositoryType.GIT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SourceRepositoryType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasktrackerPackage.Literals.SOURCE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceUrl() {
		return sourceUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceUrl(String newSourceUrl) {
		String oldSourceUrl = sourceUrl;
		sourceUrl = newSourceUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.SOURCE_REPOSITORY__SOURCE_URL, oldSourceUrl, sourceUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebUrl() {
		return webUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebUrl(String newWebUrl) {
		String oldWebUrl = webUrl;
		webUrl = newWebUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.SOURCE_REPOSITORY__WEB_URL, oldWebUrl, webUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRepositoryType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SourceRepositoryType newType) {
		SourceRepositoryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.SOURCE_REPOSITORY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRepository getRepository() {
		if (eContainerFeatureID() != TasktrackerPackage.SOURCE_REPOSITORY__REPOSITORY) return null;
		return (TaskRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(TaskRepository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, TasktrackerPackage.SOURCE_REPOSITORY__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(TaskRepository newRepository) {
		if (newRepository != eInternalContainer() || (eContainerFeatureID() != TasktrackerPackage.SOURCE_REPOSITORY__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, TasktrackerPackage.TASK_REPOSITORY__SOURCE_REPOSITORY_LIST, TaskRepository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.SOURCE_REPOSITORY__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TasktrackerPackage.SOURCE_REPOSITORY__REPOSITORY:
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
			case TasktrackerPackage.SOURCE_REPOSITORY__REPOSITORY:
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
			case TasktrackerPackage.SOURCE_REPOSITORY__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, TasktrackerPackage.TASK_REPOSITORY__SOURCE_REPOSITORY_LIST, TaskRepository.class, msgs);
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
			case TasktrackerPackage.SOURCE_REPOSITORY__SOURCE_URL:
				return getSourceUrl();
			case TasktrackerPackage.SOURCE_REPOSITORY__WEB_URL:
				return getWebUrl();
			case TasktrackerPackage.SOURCE_REPOSITORY__TYPE:
				return getType();
			case TasktrackerPackage.SOURCE_REPOSITORY__REPOSITORY:
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
			case TasktrackerPackage.SOURCE_REPOSITORY__SOURCE_URL:
				setSourceUrl((String)newValue);
				return;
			case TasktrackerPackage.SOURCE_REPOSITORY__WEB_URL:
				setWebUrl((String)newValue);
				return;
			case TasktrackerPackage.SOURCE_REPOSITORY__TYPE:
				setType((SourceRepositoryType)newValue);
				return;
			case TasktrackerPackage.SOURCE_REPOSITORY__REPOSITORY:
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
			case TasktrackerPackage.SOURCE_REPOSITORY__SOURCE_URL:
				setSourceUrl(SOURCE_URL_EDEFAULT);
				return;
			case TasktrackerPackage.SOURCE_REPOSITORY__WEB_URL:
				setWebUrl(WEB_URL_EDEFAULT);
				return;
			case TasktrackerPackage.SOURCE_REPOSITORY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TasktrackerPackage.SOURCE_REPOSITORY__REPOSITORY:
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
			case TasktrackerPackage.SOURCE_REPOSITORY__SOURCE_URL:
				return SOURCE_URL_EDEFAULT == null ? sourceUrl != null : !SOURCE_URL_EDEFAULT.equals(sourceUrl);
			case TasktrackerPackage.SOURCE_REPOSITORY__WEB_URL:
				return WEB_URL_EDEFAULT == null ? webUrl != null : !WEB_URL_EDEFAULT.equals(webUrl);
			case TasktrackerPackage.SOURCE_REPOSITORY__TYPE:
				return type != TYPE_EDEFAULT;
			case TasktrackerPackage.SOURCE_REPOSITORY__REPOSITORY:
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
		result.append(" (sourceUrl: ");
		result.append(sourceUrl);
		result.append(", webUrl: ");
		result.append(webUrl);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SourceRepositoryImpl

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

import at.bestsolution.persistence.tasktracker.Attachment;
import at.bestsolution.persistence.tasktracker.TasktrackerPackage;

import java.sql.Blob;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.AttachmentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.AttachmentImpl#getMimetype <em>Mimetype</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.AttachmentImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.AttachmentImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AttachmentImpl extends BaseObjectImpl implements Attachment {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimetype() <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimetype()
	 * @generated
	 * @ordered
	 */
	protected static final String MIMETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimetype() <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimetype()
	 * @generated
	 * @ordered
	 */
	protected String mimetype = MIMETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinary() <em>Binary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinary()
	 * @generated
	 * @ordered
	 */
	protected static final Blob BINARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinary() <em>Binary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinary()
	 * @generated
	 * @ordered
	 */
	protected Blob binary = BINARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasktrackerPackage.Literals.ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.ATTACHMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimetype() {
		return mimetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimetype(String newMimetype) {
		String oldMimetype = mimetype;
		mimetype = newMimetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.ATTACHMENT__MIMETYPE, oldMimetype, mimetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blob getBinary() {
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinary(Blob newBinary) {
		Blob oldBinary = binary;
		binary = newBinary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.ATTACHMENT__BINARY, oldBinary, binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.ATTACHMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TasktrackerPackage.ATTACHMENT__TITLE:
				return getTitle();
			case TasktrackerPackage.ATTACHMENT__MIMETYPE:
				return getMimetype();
			case TasktrackerPackage.ATTACHMENT__BINARY:
				return getBinary();
			case TasktrackerPackage.ATTACHMENT__DESCRIPTION:
				return getDescription();
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
			case TasktrackerPackage.ATTACHMENT__TITLE:
				setTitle((String)newValue);
				return;
			case TasktrackerPackage.ATTACHMENT__MIMETYPE:
				setMimetype((String)newValue);
				return;
			case TasktrackerPackage.ATTACHMENT__BINARY:
				setBinary((Blob)newValue);
				return;
			case TasktrackerPackage.ATTACHMENT__DESCRIPTION:
				setDescription((String)newValue);
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
			case TasktrackerPackage.ATTACHMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case TasktrackerPackage.ATTACHMENT__MIMETYPE:
				setMimetype(MIMETYPE_EDEFAULT);
				return;
			case TasktrackerPackage.ATTACHMENT__BINARY:
				setBinary(BINARY_EDEFAULT);
				return;
			case TasktrackerPackage.ATTACHMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case TasktrackerPackage.ATTACHMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case TasktrackerPackage.ATTACHMENT__MIMETYPE:
				return MIMETYPE_EDEFAULT == null ? mimetype != null : !MIMETYPE_EDEFAULT.equals(mimetype);
			case TasktrackerPackage.ATTACHMENT__BINARY:
				return BINARY_EDEFAULT == null ? binary != null : !BINARY_EDEFAULT.equals(binary);
			case TasktrackerPackage.ATTACHMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", mimetype: ");
		result.append(mimetype);
		result.append(", binary: ");
		result.append(binary);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AttachmentImpl

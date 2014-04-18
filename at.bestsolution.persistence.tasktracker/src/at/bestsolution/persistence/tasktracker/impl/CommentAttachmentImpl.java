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

import at.bestsolution.persistence.tasktracker.Comment;
import at.bestsolution.persistence.tasktracker.CommentAttachment;
import at.bestsolution.persistence.tasktracker.TasktrackerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.CommentAttachmentImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentAttachmentImpl extends AttachmentImpl implements CommentAttachment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentAttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasktrackerPackage.Literals.COMMENT_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getComment() {
		if (eContainerFeatureID() != TasktrackerPackage.COMMENT_ATTACHMENT__COMMENT) return null;
		return (Comment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Comment newComment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComment, TasktrackerPackage.COMMENT_ATTACHMENT__COMMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(Comment newComment) {
		if (newComment != eInternalContainer() || (eContainerFeatureID() != TasktrackerPackage.COMMENT_ATTACHMENT__COMMENT && newComment != null)) {
			if (EcoreUtil.isAncestor(this, newComment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, TasktrackerPackage.COMMENT__ATTACHMENT_LIST, Comment.class, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.COMMENT_ATTACHMENT__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TasktrackerPackage.COMMENT_ATTACHMENT__COMMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComment((Comment)otherEnd, msgs);
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
			case TasktrackerPackage.COMMENT_ATTACHMENT__COMMENT:
				return basicSetComment(null, msgs);
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
			case TasktrackerPackage.COMMENT_ATTACHMENT__COMMENT:
				return eInternalContainer().eInverseRemove(this, TasktrackerPackage.COMMENT__ATTACHMENT_LIST, Comment.class, msgs);
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
			case TasktrackerPackage.COMMENT_ATTACHMENT__COMMENT:
				return getComment();
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
			case TasktrackerPackage.COMMENT_ATTACHMENT__COMMENT:
				setComment((Comment)newValue);
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
			case TasktrackerPackage.COMMENT_ATTACHMENT__COMMENT:
				setComment((Comment)null);
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
			case TasktrackerPackage.COMMENT_ATTACHMENT__COMMENT:
				return getComment() != null;
		}
		return super.eIsSet(featureID);
	}

} //CommentAttachmentImpl

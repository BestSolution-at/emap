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

import at.bestsolution.persistence.tasktracker.ChangeSet;
import at.bestsolution.persistence.tasktracker.Comment;
import at.bestsolution.persistence.tasktracker.Person;
import at.bestsolution.persistence.tasktracker.Task;
import at.bestsolution.persistence.tasktracker.TaskAttachment;
import at.bestsolution.persistence.tasktracker.TaskRepository;
import at.bestsolution.persistence.tasktracker.TaskState;
import at.bestsolution.persistence.tasktracker.TasktrackerPackage;
import at.bestsolution.persistence.tasktracker.Version;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskImpl#getCommentList <em>Comment List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskImpl#getChangeSetList <em>Change Set List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskImpl#getReporter <em>Reporter</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskImpl#getState <em>State</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskImpl#getTargetVersion <em>Target Version</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskImpl#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskImpl#getAttachmentList <em>Attachment List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends BaseObjectImpl implements Task {
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected TaskRepository repository;

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
	 * The cached value of the '{@link #getCommentList() <em>Comment List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentList()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> commentList;

	/**
	 * The cached value of the '{@link #getChangeSetList() <em>Change Set List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSetList()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeSet> changeSetList;

	/**
	 * The cached value of the '{@link #getReporter() <em>Reporter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporter()
	 * @generated
	 * @ordered
	 */
	protected Person reporter;

	/**
	 * The cached value of the '{@link #getAssignee() <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignee()
	 * @generated
	 * @ordered
	 */
	protected Person assignee;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final TaskState STATE_EDEFAULT = TaskState.NEW;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected TaskState state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetVersion() <em>Target Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVersion()
	 * @generated
	 * @ordered
	 */
	protected Version targetVersion;

	/**
	 * The cached value of the '{@link #getProductVersion() <em>Product Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected Version productVersion;

	/**
	 * The cached value of the '{@link #getAttachmentList() <em>Attachment List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentList()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskAttachment> attachmentList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasktrackerPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRepository getRepository() {
		if (repository != null && repository.eIsProxy()) {
			InternalEObject oldRepository = (InternalEObject)repository;
			repository = (TaskRepository)eResolveProxy(oldRepository);
			if (repository != oldRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasktrackerPackage.TASK__REPOSITORY, oldRepository, repository));
			}
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRepository basicGetRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(TaskRepository newRepository, NotificationChain msgs) {
		TaskRepository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TasktrackerPackage.TASK__REPOSITORY, oldRepository, newRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(TaskRepository newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject)repository).eInverseRemove(this, TasktrackerPackage.TASK_REPOSITORY__TASK_LIST, TaskRepository.class, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, TasktrackerPackage.TASK_REPOSITORY__TASK_LIST, TaskRepository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.TASK__REPOSITORY, newRepository, newRepository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.TASK__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getCommentList() {
		if (commentList == null) {
			commentList = new EObjectContainmentWithInverseEList<Comment>(Comment.class, this, TasktrackerPackage.TASK__COMMENT_LIST, TasktrackerPackage.COMMENT__TASK);
		}
		return commentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeSet> getChangeSetList() {
		if (changeSetList == null) {
			changeSetList = new EObjectContainmentWithInverseEList<ChangeSet>(ChangeSet.class, this, TasktrackerPackage.TASK__CHANGE_SET_LIST, TasktrackerPackage.CHANGE_SET__TASK);
		}
		return changeSetList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getReporter() {
		if (reporter != null && reporter.eIsProxy()) {
			InternalEObject oldReporter = (InternalEObject)reporter;
			reporter = (Person)eResolveProxy(oldReporter);
			if (reporter != oldReporter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasktrackerPackage.TASK__REPORTER, oldReporter, reporter));
			}
		}
		return reporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetReporter() {
		return reporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReporter(Person newReporter) {
		Person oldReporter = reporter;
		reporter = newReporter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.TASK__REPORTER, oldReporter, reporter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getAssignee() {
		if (assignee != null && assignee.eIsProxy()) {
			InternalEObject oldAssignee = (InternalEObject)assignee;
			assignee = (Person)eResolveProxy(oldAssignee);
			if (assignee != oldAssignee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasktrackerPackage.TASK__ASSIGNEE, oldAssignee, assignee));
			}
		}
		return assignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetAssignee() {
		return assignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignee(Person newAssignee) {
		Person oldAssignee = assignee;
		assignee = newAssignee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.TASK__ASSIGNEE, oldAssignee, assignee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(TaskState newState) {
		TaskState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.TASK__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getTargetVersion() {
		if (targetVersion != null && targetVersion.eIsProxy()) {
			InternalEObject oldTargetVersion = (InternalEObject)targetVersion;
			targetVersion = (Version)eResolveProxy(oldTargetVersion);
			if (targetVersion != oldTargetVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasktrackerPackage.TASK__TARGET_VERSION, oldTargetVersion, targetVersion));
			}
		}
		return targetVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetTargetVersion() {
		return targetVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVersion(Version newTargetVersion) {
		Version oldTargetVersion = targetVersion;
		targetVersion = newTargetVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.TASK__TARGET_VERSION, oldTargetVersion, targetVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getProductVersion() {
		if (productVersion != null && productVersion.eIsProxy()) {
			InternalEObject oldProductVersion = (InternalEObject)productVersion;
			productVersion = (Version)eResolveProxy(oldProductVersion);
			if (productVersion != oldProductVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasktrackerPackage.TASK__PRODUCT_VERSION, oldProductVersion, productVersion));
			}
		}
		return productVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetProductVersion() {
		return productVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductVersion(Version newProductVersion) {
		Version oldProductVersion = productVersion;
		productVersion = newProductVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.TASK__PRODUCT_VERSION, oldProductVersion, productVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskAttachment> getAttachmentList() {
		if (attachmentList == null) {
			attachmentList = new EObjectContainmentWithInverseEList<TaskAttachment>(TaskAttachment.class, this, TasktrackerPackage.TASK__ATTACHMENT_LIST, TasktrackerPackage.TASK_ATTACHMENT__TASK);
		}
		return attachmentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TasktrackerPackage.TASK__REPOSITORY:
				if (repository != null)
					msgs = ((InternalEObject)repository).eInverseRemove(this, TasktrackerPackage.TASK_REPOSITORY__TASK_LIST, TaskRepository.class, msgs);
				return basicSetRepository((TaskRepository)otherEnd, msgs);
			case TasktrackerPackage.TASK__COMMENT_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommentList()).basicAdd(otherEnd, msgs);
			case TasktrackerPackage.TASK__CHANGE_SET_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeSetList()).basicAdd(otherEnd, msgs);
			case TasktrackerPackage.TASK__ATTACHMENT_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttachmentList()).basicAdd(otherEnd, msgs);
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
			case TasktrackerPackage.TASK__REPOSITORY:
				return basicSetRepository(null, msgs);
			case TasktrackerPackage.TASK__COMMENT_LIST:
				return ((InternalEList<?>)getCommentList()).basicRemove(otherEnd, msgs);
			case TasktrackerPackage.TASK__CHANGE_SET_LIST:
				return ((InternalEList<?>)getChangeSetList()).basicRemove(otherEnd, msgs);
			case TasktrackerPackage.TASK__ATTACHMENT_LIST:
				return ((InternalEList<?>)getAttachmentList()).basicRemove(otherEnd, msgs);
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
			case TasktrackerPackage.TASK__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case TasktrackerPackage.TASK__TITLE:
				return getTitle();
			case TasktrackerPackage.TASK__DESCRIPTION:
				return getDescription();
			case TasktrackerPackage.TASK__COMMENT_LIST:
				return getCommentList();
			case TasktrackerPackage.TASK__CHANGE_SET_LIST:
				return getChangeSetList();
			case TasktrackerPackage.TASK__REPORTER:
				if (resolve) return getReporter();
				return basicGetReporter();
			case TasktrackerPackage.TASK__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case TasktrackerPackage.TASK__STATE:
				return getState();
			case TasktrackerPackage.TASK__TARGET_VERSION:
				if (resolve) return getTargetVersion();
				return basicGetTargetVersion();
			case TasktrackerPackage.TASK__PRODUCT_VERSION:
				if (resolve) return getProductVersion();
				return basicGetProductVersion();
			case TasktrackerPackage.TASK__ATTACHMENT_LIST:
				return getAttachmentList();
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
			case TasktrackerPackage.TASK__REPOSITORY:
				setRepository((TaskRepository)newValue);
				return;
			case TasktrackerPackage.TASK__TITLE:
				setTitle((String)newValue);
				return;
			case TasktrackerPackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TasktrackerPackage.TASK__COMMENT_LIST:
				getCommentList().clear();
				getCommentList().addAll((Collection<? extends Comment>)newValue);
				return;
			case TasktrackerPackage.TASK__CHANGE_SET_LIST:
				getChangeSetList().clear();
				getChangeSetList().addAll((Collection<? extends ChangeSet>)newValue);
				return;
			case TasktrackerPackage.TASK__REPORTER:
				setReporter((Person)newValue);
				return;
			case TasktrackerPackage.TASK__ASSIGNEE:
				setAssignee((Person)newValue);
				return;
			case TasktrackerPackage.TASK__STATE:
				setState((TaskState)newValue);
				return;
			case TasktrackerPackage.TASK__TARGET_VERSION:
				setTargetVersion((Version)newValue);
				return;
			case TasktrackerPackage.TASK__PRODUCT_VERSION:
				setProductVersion((Version)newValue);
				return;
			case TasktrackerPackage.TASK__ATTACHMENT_LIST:
				getAttachmentList().clear();
				getAttachmentList().addAll((Collection<? extends TaskAttachment>)newValue);
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
			case TasktrackerPackage.TASK__REPOSITORY:
				setRepository((TaskRepository)null);
				return;
			case TasktrackerPackage.TASK__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case TasktrackerPackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TasktrackerPackage.TASK__COMMENT_LIST:
				getCommentList().clear();
				return;
			case TasktrackerPackage.TASK__CHANGE_SET_LIST:
				getChangeSetList().clear();
				return;
			case TasktrackerPackage.TASK__REPORTER:
				setReporter((Person)null);
				return;
			case TasktrackerPackage.TASK__ASSIGNEE:
				setAssignee((Person)null);
				return;
			case TasktrackerPackage.TASK__STATE:
				setState(STATE_EDEFAULT);
				return;
			case TasktrackerPackage.TASK__TARGET_VERSION:
				setTargetVersion((Version)null);
				return;
			case TasktrackerPackage.TASK__PRODUCT_VERSION:
				setProductVersion((Version)null);
				return;
			case TasktrackerPackage.TASK__ATTACHMENT_LIST:
				getAttachmentList().clear();
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
			case TasktrackerPackage.TASK__REPOSITORY:
				return repository != null;
			case TasktrackerPackage.TASK__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case TasktrackerPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TasktrackerPackage.TASK__COMMENT_LIST:
				return commentList != null && !commentList.isEmpty();
			case TasktrackerPackage.TASK__CHANGE_SET_LIST:
				return changeSetList != null && !changeSetList.isEmpty();
			case TasktrackerPackage.TASK__REPORTER:
				return reporter != null;
			case TasktrackerPackage.TASK__ASSIGNEE:
				return assignee != null;
			case TasktrackerPackage.TASK__STATE:
				return state != STATE_EDEFAULT;
			case TasktrackerPackage.TASK__TARGET_VERSION:
				return targetVersion != null;
			case TasktrackerPackage.TASK__PRODUCT_VERSION:
				return productVersion != null;
			case TasktrackerPackage.TASK__ATTACHMENT_LIST:
				return attachmentList != null && !attachmentList.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //TaskImpl

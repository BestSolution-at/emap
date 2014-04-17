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
import at.bestsolution.persistence.tasktracker.Person;
import at.bestsolution.persistence.tasktracker.SourceRepository;
import at.bestsolution.persistence.tasktracker.Task;
import at.bestsolution.persistence.tasktracker.TasktrackerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.ChangeSetImpl#getTask <em>Task</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.ChangeSetImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.ChangeSetImpl#getSourceRepository <em>Source Repository</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.ChangeSetImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.ChangeSetImpl#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeSetImpl extends BaseObjectImpl implements ChangeSet {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceRepository() <em>Source Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRepository()
	 * @generated
	 * @ordered
	 */
	protected SourceRepository sourceRepository;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasktrackerPackage.Literals.CHANGE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (eContainerFeatureID() != TasktrackerPackage.CHANGE_SET__TASK) return null;
		return (Task)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTask, TasktrackerPackage.CHANGE_SET__TASK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		if (newTask != eInternalContainer() || (eContainerFeatureID() != TasktrackerPackage.CHANGE_SET__TASK && newTask != null)) {
			if (EcoreUtil.isAncestor(this, newTask))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, TasktrackerPackage.TASK__CHANGE_SET_LIST, Task.class, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.CHANGE_SET__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.CHANGE_SET__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRepository getSourceRepository() {
		if (sourceRepository != null && sourceRepository.eIsProxy()) {
			InternalEObject oldSourceRepository = (InternalEObject)sourceRepository;
			sourceRepository = (SourceRepository)eResolveProxy(oldSourceRepository);
			if (sourceRepository != oldSourceRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasktrackerPackage.CHANGE_SET__SOURCE_REPOSITORY, oldSourceRepository, sourceRepository));
			}
		}
		return sourceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRepository basicGetSourceRepository() {
		return sourceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRepository(SourceRepository newSourceRepository) {
		SourceRepository oldSourceRepository = sourceRepository;
		sourceRepository = newSourceRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.CHANGE_SET__SOURCE_REPOSITORY, oldSourceRepository, sourceRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.CHANGE_SET__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (Person)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasktrackerPackage.CHANGE_SET__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.CHANGE_SET__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TasktrackerPackage.CHANGE_SET__TASK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTask((Task)otherEnd, msgs);
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
			case TasktrackerPackage.CHANGE_SET__TASK:
				return basicSetTask(null, msgs);
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
			case TasktrackerPackage.CHANGE_SET__TASK:
				return eInternalContainer().eInverseRemove(this, TasktrackerPackage.TASK__CHANGE_SET_LIST, Task.class, msgs);
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
			case TasktrackerPackage.CHANGE_SET__TASK:
				return getTask();
			case TasktrackerPackage.CHANGE_SET__ID:
				return getId();
			case TasktrackerPackage.CHANGE_SET__SOURCE_REPOSITORY:
				if (resolve) return getSourceRepository();
				return basicGetSourceRepository();
			case TasktrackerPackage.CHANGE_SET__COMMENT:
				return getComment();
			case TasktrackerPackage.CHANGE_SET__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
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
			case TasktrackerPackage.CHANGE_SET__TASK:
				setTask((Task)newValue);
				return;
			case TasktrackerPackage.CHANGE_SET__ID:
				setId((String)newValue);
				return;
			case TasktrackerPackage.CHANGE_SET__SOURCE_REPOSITORY:
				setSourceRepository((SourceRepository)newValue);
				return;
			case TasktrackerPackage.CHANGE_SET__COMMENT:
				setComment((String)newValue);
				return;
			case TasktrackerPackage.CHANGE_SET__PERSON:
				setPerson((Person)newValue);
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
			case TasktrackerPackage.CHANGE_SET__TASK:
				setTask((Task)null);
				return;
			case TasktrackerPackage.CHANGE_SET__ID:
				setId(ID_EDEFAULT);
				return;
			case TasktrackerPackage.CHANGE_SET__SOURCE_REPOSITORY:
				setSourceRepository((SourceRepository)null);
				return;
			case TasktrackerPackage.CHANGE_SET__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case TasktrackerPackage.CHANGE_SET__PERSON:
				setPerson((Person)null);
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
			case TasktrackerPackage.CHANGE_SET__TASK:
				return getTask() != null;
			case TasktrackerPackage.CHANGE_SET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TasktrackerPackage.CHANGE_SET__SOURCE_REPOSITORY:
				return sourceRepository != null;
			case TasktrackerPackage.CHANGE_SET__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case TasktrackerPackage.CHANGE_SET__PERSON:
				return person != null;
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
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //ChangeSetImpl

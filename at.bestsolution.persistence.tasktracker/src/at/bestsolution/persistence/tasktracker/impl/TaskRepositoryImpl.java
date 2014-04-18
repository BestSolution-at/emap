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

import at.bestsolution.persistence.tasktracker.Person;
import at.bestsolution.persistence.tasktracker.SourceRepository;
import at.bestsolution.persistence.tasktracker.Task;
import at.bestsolution.persistence.tasktracker.TaskRepository;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskRepositoryImpl#getPersonList <em>Person List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskRepositoryImpl#getTaskList <em>Task List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskRepositoryImpl#getSourceRepositoryList <em>Source Repository List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskRepositoryImpl#getVersionList <em>Version List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.impl.TaskRepositoryImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskRepositoryImpl extends BaseObjectImpl implements TaskRepository {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getTaskList() <em>Task List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskList()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> taskList;

	/**
	 * The cached value of the '{@link #getSourceRepositoryList() <em>Source Repository List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRepositoryList()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRepository> sourceRepositoryList;

	/**
	 * The cached value of the '{@link #getVersionList() <em>Version List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionList()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> versionList;

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
	protected TaskRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasktrackerPackage.Literals.TASK_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.TASK_REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersonList() {
		if (personList == null) {
			personList = new EObjectContainmentWithInverseEList<Person>(Person.class, this, TasktrackerPackage.TASK_REPOSITORY__PERSON_LIST, TasktrackerPackage.PERSON__REPOSITORY);
		}
		return personList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTaskList() {
		if (taskList == null) {
			taskList = new EObjectWithInverseResolvingEList<Task>(Task.class, this, TasktrackerPackage.TASK_REPOSITORY__TASK_LIST, TasktrackerPackage.TASK__REPOSITORY);
		}
		return taskList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRepository> getSourceRepositoryList() {
		if (sourceRepositoryList == null) {
			sourceRepositoryList = new EObjectContainmentWithInverseEList<SourceRepository>(SourceRepository.class, this, TasktrackerPackage.TASK_REPOSITORY__SOURCE_REPOSITORY_LIST, TasktrackerPackage.SOURCE_REPOSITORY__REPOSITORY);
		}
		return sourceRepositoryList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getVersionList() {
		if (versionList == null) {
			versionList = new EObjectContainmentWithInverseEList<Version>(Version.class, this, TasktrackerPackage.TASK_REPOSITORY__VERSION_LIST, TasktrackerPackage.VERSION__REPOSITORY);
		}
		return versionList;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TasktrackerPackage.TASK_REPOSITORY__DESCRIPTION, oldDescription, description));
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
			case TasktrackerPackage.TASK_REPOSITORY__PERSON_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPersonList()).basicAdd(otherEnd, msgs);
			case TasktrackerPackage.TASK_REPOSITORY__TASK_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaskList()).basicAdd(otherEnd, msgs);
			case TasktrackerPackage.TASK_REPOSITORY__SOURCE_REPOSITORY_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceRepositoryList()).basicAdd(otherEnd, msgs);
			case TasktrackerPackage.TASK_REPOSITORY__VERSION_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVersionList()).basicAdd(otherEnd, msgs);
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
			case TasktrackerPackage.TASK_REPOSITORY__PERSON_LIST:
				return ((InternalEList<?>)getPersonList()).basicRemove(otherEnd, msgs);
			case TasktrackerPackage.TASK_REPOSITORY__TASK_LIST:
				return ((InternalEList<?>)getTaskList()).basicRemove(otherEnd, msgs);
			case TasktrackerPackage.TASK_REPOSITORY__SOURCE_REPOSITORY_LIST:
				return ((InternalEList<?>)getSourceRepositoryList()).basicRemove(otherEnd, msgs);
			case TasktrackerPackage.TASK_REPOSITORY__VERSION_LIST:
				return ((InternalEList<?>)getVersionList()).basicRemove(otherEnd, msgs);
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
			case TasktrackerPackage.TASK_REPOSITORY__NAME:
				return getName();
			case TasktrackerPackage.TASK_REPOSITORY__PERSON_LIST:
				return getPersonList();
			case TasktrackerPackage.TASK_REPOSITORY__TASK_LIST:
				return getTaskList();
			case TasktrackerPackage.TASK_REPOSITORY__SOURCE_REPOSITORY_LIST:
				return getSourceRepositoryList();
			case TasktrackerPackage.TASK_REPOSITORY__VERSION_LIST:
				return getVersionList();
			case TasktrackerPackage.TASK_REPOSITORY__DESCRIPTION:
				return getDescription();
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
			case TasktrackerPackage.TASK_REPOSITORY__NAME:
				setName((String)newValue);
				return;
			case TasktrackerPackage.TASK_REPOSITORY__PERSON_LIST:
				getPersonList().clear();
				getPersonList().addAll((Collection<? extends Person>)newValue);
				return;
			case TasktrackerPackage.TASK_REPOSITORY__TASK_LIST:
				getTaskList().clear();
				getTaskList().addAll((Collection<? extends Task>)newValue);
				return;
			case TasktrackerPackage.TASK_REPOSITORY__SOURCE_REPOSITORY_LIST:
				getSourceRepositoryList().clear();
				getSourceRepositoryList().addAll((Collection<? extends SourceRepository>)newValue);
				return;
			case TasktrackerPackage.TASK_REPOSITORY__VERSION_LIST:
				getVersionList().clear();
				getVersionList().addAll((Collection<? extends Version>)newValue);
				return;
			case TasktrackerPackage.TASK_REPOSITORY__DESCRIPTION:
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
			case TasktrackerPackage.TASK_REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TasktrackerPackage.TASK_REPOSITORY__PERSON_LIST:
				getPersonList().clear();
				return;
			case TasktrackerPackage.TASK_REPOSITORY__TASK_LIST:
				getTaskList().clear();
				return;
			case TasktrackerPackage.TASK_REPOSITORY__SOURCE_REPOSITORY_LIST:
				getSourceRepositoryList().clear();
				return;
			case TasktrackerPackage.TASK_REPOSITORY__VERSION_LIST:
				getVersionList().clear();
				return;
			case TasktrackerPackage.TASK_REPOSITORY__DESCRIPTION:
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
			case TasktrackerPackage.TASK_REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TasktrackerPackage.TASK_REPOSITORY__PERSON_LIST:
				return personList != null && !personList.isEmpty();
			case TasktrackerPackage.TASK_REPOSITORY__TASK_LIST:
				return taskList != null && !taskList.isEmpty();
			case TasktrackerPackage.TASK_REPOSITORY__SOURCE_REPOSITORY_LIST:
				return sourceRepositoryList != null && !sourceRepositoryList.isEmpty();
			case TasktrackerPackage.TASK_REPOSITORY__VERSION_LIST:
				return versionList != null && !versionList.isEmpty();
			case TasktrackerPackage.TASK_REPOSITORY__DESCRIPTION:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TaskRepositoryImpl

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
package at.bestsolution.persistence.tasktracker;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.TaskRepository#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.TaskRepository#getPersonList <em>Person List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.TaskRepository#getTaskList <em>Task List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.TaskRepository#getSourceRepositoryList <em>Source Repository List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.TaskRepository#getVersionList <em>Version List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.TaskRepository#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTaskRepository()
 * @model
 * @generated
 */
public interface TaskRepository extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTaskRepository_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.TaskRepository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Person List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.persistence.tasktracker.Person}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.Person#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person List</em>' containment reference list.
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTaskRepository_PersonList()
	 * @see at.bestsolution.persistence.tasktracker.Person#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<Person> getPersonList();

	/**
	 * Returns the value of the '<em><b>Task List</b></em>' reference list.
	 * The list contents are of type {@link at.bestsolution.persistence.tasktracker.Task}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.Task#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task List</em>' reference list.
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTaskRepository_TaskList()
	 * @see at.bestsolution.persistence.tasktracker.Task#getRepository
	 * @model opposite="repository"
	 * @generated
	 */
	EList<Task> getTaskList();

	/**
	 * Returns the value of the '<em><b>Source Repository List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.persistence.tasktracker.SourceRepository}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.SourceRepository#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Repository List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Repository List</em>' containment reference list.
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTaskRepository_SourceRepositoryList()
	 * @see at.bestsolution.persistence.tasktracker.SourceRepository#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<SourceRepository> getSourceRepositoryList();

	/**
	 * Returns the value of the '<em><b>Version List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.persistence.tasktracker.Version}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.Version#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version List</em>' containment reference list.
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTaskRepository_VersionList()
	 * @see at.bestsolution.persistence.tasktracker.Version#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<Version> getVersionList();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTaskRepository_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.TaskRepository#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // TaskRepository

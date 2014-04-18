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
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Task#getRepository <em>Repository</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Task#getTitle <em>Title</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Task#getCommentList <em>Comment List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Task#getChangeSetList <em>Change Set List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Task#getReporter <em>Reporter</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Task#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Task#getState <em>State</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Task#getTargetVersion <em>Target Version</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Task#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Task#getAttachmentList <em>Attachment List</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.TaskRepository#getTaskList <em>Task List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(TaskRepository)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTask_Repository()
	 * @see at.bestsolution.persistence.tasktracker.TaskRepository#getTaskList
	 * @model opposite="taskList"
	 * @generated
	 */
	TaskRepository getRepository();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Task#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(TaskRepository value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTask_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Task#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTask_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Comment List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.persistence.tasktracker.Comment}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.Comment#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment List</em>' containment reference list.
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTask_CommentList()
	 * @see at.bestsolution.persistence.tasktracker.Comment#getTask
	 * @model opposite="task" containment="true"
	 * @generated
	 */
	EList<Comment> getCommentList();

	/**
	 * Returns the value of the '<em><b>Change Set List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.persistence.tasktracker.ChangeSet}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.ChangeSet#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Set List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Set List</em>' containment reference list.
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTask_ChangeSetList()
	 * @see at.bestsolution.persistence.tasktracker.ChangeSet#getTask
	 * @model opposite="task" containment="true"
	 * @generated
	 */
	EList<ChangeSet> getChangeSetList();

	/**
	 * Returns the value of the '<em><b>Reporter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporter</em>' reference.
	 * @see #setReporter(Person)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTask_Reporter()
	 * @model
	 * @generated
	 */
	Person getReporter();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Task#getReporter <em>Reporter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporter</em>' reference.
	 * @see #getReporter()
	 * @generated
	 */
	void setReporter(Person value);

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(Person)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTask_Assignee()
	 * @model
	 * @generated
	 */
	Person getAssignee();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Task#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(Person value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.persistence.tasktracker.TaskState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see at.bestsolution.persistence.tasktracker.TaskState
	 * @see #setState(TaskState)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTask_State()
	 * @model
	 * @generated
	 */
	TaskState getState();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Task#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see at.bestsolution.persistence.tasktracker.TaskState
	 * @see #getState()
	 * @generated
	 */
	void setState(TaskState value);

	/**
	 * Returns the value of the '<em><b>Target Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Version</em>' reference.
	 * @see #setTargetVersion(Version)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTask_TargetVersion()
	 * @model
	 * @generated
	 */
	Version getTargetVersion();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Task#getTargetVersion <em>Target Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Version</em>' reference.
	 * @see #getTargetVersion()
	 * @generated
	 */
	void setTargetVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Product Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Version</em>' reference.
	 * @see #setProductVersion(Version)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTask_ProductVersion()
	 * @model
	 * @generated
	 */
	Version getProductVersion();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Task#getProductVersion <em>Product Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Version</em>' reference.
	 * @see #getProductVersion()
	 * @generated
	 */
	void setProductVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Attachment List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.persistence.tasktracker.TaskAttachment}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.TaskAttachment#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment List</em>' containment reference list.
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTask_AttachmentList()
	 * @see at.bestsolution.persistence.tasktracker.TaskAttachment#getTask
	 * @model opposite="task" containment="true"
	 * @generated
	 */
	EList<TaskAttachment> getAttachmentList();

} // Task

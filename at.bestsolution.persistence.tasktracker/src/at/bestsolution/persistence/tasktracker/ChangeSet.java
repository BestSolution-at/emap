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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.ChangeSet#getTask <em>Task</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.ChangeSet#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.ChangeSet#getSourceRepository <em>Source Repository</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.ChangeSet#getComment <em>Comment</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.ChangeSet#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getChangeSet()
 * @model
 * @generated
 */
public interface ChangeSet extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.Task#getChangeSetList <em>Change Set List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' container reference.
	 * @see #setTask(Task)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getChangeSet_Task()
	 * @see at.bestsolution.persistence.tasktracker.Task#getChangeSetList
	 * @model opposite="changeSetList" transient="false"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.ChangeSet#getTask <em>Task</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' container reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getChangeSet_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.ChangeSet#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Source Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Repository</em>' reference.
	 * @see #setSourceRepository(SourceRepository)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getChangeSet_SourceRepository()
	 * @model
	 * @generated
	 */
	SourceRepository getSourceRepository();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.ChangeSet#getSourceRepository <em>Source Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Repository</em>' reference.
	 * @see #getSourceRepository()
	 * @generated
	 */
	void setSourceRepository(SourceRepository value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getChangeSet_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.ChangeSet#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getChangeSet_Person()
	 * @model
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.ChangeSet#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // ChangeSet

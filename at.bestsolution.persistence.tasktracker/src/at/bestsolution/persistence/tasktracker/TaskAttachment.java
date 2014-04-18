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
 * A representation of the model object '<em><b>Task Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.TaskAttachment#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTaskAttachment()
 * @model
 * @generated
 */
public interface TaskAttachment extends Attachment {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.Task#getAttachmentList <em>Attachment List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' container reference.
	 * @see #setTask(Task)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTaskAttachment_Task()
	 * @see at.bestsolution.persistence.tasktracker.Task#getAttachmentList
	 * @model opposite="attachmentList" transient="false"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.TaskAttachment#getTask <em>Task</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' container reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // TaskAttachment

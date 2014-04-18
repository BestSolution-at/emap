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
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Comment#getTask <em>Task</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Comment#getTitle <em>Title</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Comment#getDescription <em>Description</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Comment#getAttachmentList <em>Attachment List</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.Task#getCommentList <em>Comment List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' container reference.
	 * @see #setTask(Task)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getComment_Task()
	 * @see at.bestsolution.persistence.tasktracker.Task#getCommentList
	 * @model opposite="commentList" transient="false"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Comment#getTask <em>Task</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' container reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

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
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getComment_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Comment#getTitle <em>Title</em>}' attribute.
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
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getComment_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Comment#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attachment List</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.persistence.tasktracker.CommentAttachment}.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.CommentAttachment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment List</em>' containment reference list.
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getComment_AttachmentList()
	 * @see at.bestsolution.persistence.tasktracker.CommentAttachment#getComment
	 * @model opposite="comment" containment="true"
	 * @generated
	 */
	EList<CommentAttachment> getAttachmentList();

} // Comment

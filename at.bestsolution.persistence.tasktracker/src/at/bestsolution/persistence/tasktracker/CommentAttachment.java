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
 * A representation of the model object '<em><b>Comment Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.CommentAttachment#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getCommentAttachment()
 * @model
 * @generated
 */
public interface CommentAttachment extends Attachment {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.Comment#getAttachmentList <em>Attachment List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' container reference.
	 * @see #setComment(Comment)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getCommentAttachment_Comment()
	 * @see at.bestsolution.persistence.tasktracker.Comment#getAttachmentList
	 * @model opposite="attachmentList" transient="false"
	 * @generated
	 */
	Comment getComment();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.CommentAttachment#getComment <em>Comment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' container reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Comment value);

} // CommentAttachment

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

import java.sql.Blob;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Attachment#getTitle <em>Title</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Attachment#getMimetype <em>Mimetype</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Attachment#getBinary <em>Binary</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Attachment#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getAttachment()
 * @model abstract="true"
 * @generated
 */
public interface Attachment extends BaseObject {
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
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getAttachment_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Attachment#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mimetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mimetype</em>' attribute.
	 * @see #setMimetype(String)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getAttachment_Mimetype()
	 * @model
	 * @generated
	 */
	String getMimetype();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Attachment#getMimetype <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mimetype</em>' attribute.
	 * @see #getMimetype()
	 * @generated
	 */
	void setMimetype(String value);

	/**
	 * Returns the value of the '<em><b>Binary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary</em>' attribute.
	 * @see #setBinary(Blob)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getAttachment_Binary()
	 * @model dataType="at.bestsolution.persistence.tasktracker.Blob"
	 * @generated
	 */
	Blob getBinary();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Attachment#getBinary <em>Binary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary</em>' attribute.
	 * @see #getBinary()
	 * @generated
	 */
	void setBinary(Blob value);

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
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getAttachment_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Attachment#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Attachment

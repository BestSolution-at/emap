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
 * A representation of the model object '<em><b>Source Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.SourceRepository#getSourceUrl <em>Source Url</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.SourceRepository#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.SourceRepository#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.SourceRepository#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getSourceRepository()
 * @model
 * @generated
 */
public interface SourceRepository extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Source Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Url</em>' attribute.
	 * @see #setSourceUrl(String)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getSourceRepository_SourceUrl()
	 * @model
	 * @generated
	 */
	String getSourceUrl();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.SourceRepository#getSourceUrl <em>Source Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Url</em>' attribute.
	 * @see #getSourceUrl()
	 * @generated
	 */
	void setSourceUrl(String value);

	/**
	 * Returns the value of the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Url</em>' attribute.
	 * @see #setWebUrl(String)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getSourceRepository_WebUrl()
	 * @model
	 * @generated
	 */
	String getWebUrl();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.SourceRepository#getWebUrl <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Url</em>' attribute.
	 * @see #getWebUrl()
	 * @generated
	 */
	void setWebUrl(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.persistence.tasktracker.SourceRepositoryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see at.bestsolution.persistence.tasktracker.SourceRepositoryType
	 * @see #setType(SourceRepositoryType)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getSourceRepository_Type()
	 * @model
	 * @generated
	 */
	SourceRepositoryType getType();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.SourceRepository#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see at.bestsolution.persistence.tasktracker.SourceRepositoryType
	 * @see #getType()
	 * @generated
	 */
	void setType(SourceRepositoryType value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.TaskRepository#getSourceRepositoryList <em>Source Repository List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(TaskRepository)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getSourceRepository_Repository()
	 * @see at.bestsolution.persistence.tasktracker.TaskRepository#getSourceRepositoryList
	 * @model opposite="sourceRepositoryList" transient="false"
	 * @generated
	 */
	TaskRepository getRepository();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.SourceRepository#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(TaskRepository value);

} // SourceRepository

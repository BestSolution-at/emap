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
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Person#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Person#getLastname <em>Lastname</em>}</li>
 *   <li>{@link at.bestsolution.persistence.tasktracker.Person#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getPerson_Firstname()
	 * @model
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Person#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getPerson_Lastname()
	 * @model
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Person#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.persistence.tasktracker.TaskRepository#getPersonList <em>Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(TaskRepository)
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getPerson_Repository()
	 * @see at.bestsolution.persistence.tasktracker.TaskRepository#getPersonList
	 * @model opposite="personList" transient="false"
	 * @generated
	 */
	TaskRepository getRepository();

	/**
	 * Sets the value of the '{@link at.bestsolution.persistence.tasktracker.Person#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(TaskRepository value);

} // Person

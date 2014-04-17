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

import at.bestsolution.persistence.tasktracker.*;

import java.sql.Blob;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TasktrackerFactoryImpl extends EFactoryImpl implements TasktrackerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TasktrackerFactory init() {
		try {
			TasktrackerFactory theTasktrackerFactory = (TasktrackerFactory)EPackage.Registry.INSTANCE.getEFactory(TasktrackerPackage.eNS_URI);
			if (theTasktrackerFactory != null) {
				return theTasktrackerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TasktrackerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasktrackerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TasktrackerPackage.TASK_REPOSITORY: return createTaskRepository();
			case TasktrackerPackage.PERSON: return createPerson();
			case TasktrackerPackage.TASK: return createTask();
			case TasktrackerPackage.COMMENT: return createComment();
			case TasktrackerPackage.CHANGE_SET: return createChangeSet();
			case TasktrackerPackage.SOURCE_REPOSITORY: return createSourceRepository();
			case TasktrackerPackage.VERSION: return createVersion();
			case TasktrackerPackage.COMMENT_ATTACHMENT: return createCommentAttachment();
			case TasktrackerPackage.TASK_ATTACHMENT: return createTaskAttachment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TasktrackerPackage.TASK_STATE:
				return createTaskStateFromString(eDataType, initialValue);
			case TasktrackerPackage.SOURCE_REPOSITORY_TYPE:
				return createSourceRepositoryTypeFromString(eDataType, initialValue);
			case TasktrackerPackage.BLOB:
				return createBlobFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TasktrackerPackage.TASK_STATE:
				return convertTaskStateToString(eDataType, instanceValue);
			case TasktrackerPackage.SOURCE_REPOSITORY_TYPE:
				return convertSourceRepositoryTypeToString(eDataType, instanceValue);
			case TasktrackerPackage.BLOB:
				return convertBlobToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRepository createTaskRepository() {
		TaskRepositoryImpl taskRepository = new TaskRepositoryImpl();
		return taskRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeSet createChangeSet() {
		ChangeSetImpl changeSet = new ChangeSetImpl();
		return changeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRepository createSourceRepository() {
		SourceRepositoryImpl sourceRepository = new SourceRepositoryImpl();
		return sourceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentAttachment createCommentAttachment() {
		CommentAttachmentImpl commentAttachment = new CommentAttachmentImpl();
		return commentAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskAttachment createTaskAttachment() {
		TaskAttachmentImpl taskAttachment = new TaskAttachmentImpl();
		return taskAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskState createTaskStateFromString(EDataType eDataType, String initialValue) {
		TaskState result = TaskState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRepositoryType createSourceRepositoryTypeFromString(EDataType eDataType, String initialValue) {
		SourceRepositoryType result = SourceRepositoryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceRepositoryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blob createBlobFromString(EDataType eDataType, String initialValue) {
		return (Blob)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBlobToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasktrackerPackage getTasktrackerPackage() {
		return (TasktrackerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TasktrackerPackage getPackage() {
		return TasktrackerPackage.eINSTANCE;
	}

} //TasktrackerFactoryImpl

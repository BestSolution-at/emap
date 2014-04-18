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

import at.bestsolution.persistence.tasktracker.Attachment;
import at.bestsolution.persistence.tasktracker.BaseObject;
import at.bestsolution.persistence.tasktracker.ChangeSet;
import at.bestsolution.persistence.tasktracker.Comment;
import at.bestsolution.persistence.tasktracker.CommentAttachment;
import at.bestsolution.persistence.tasktracker.Person;
import at.bestsolution.persistence.tasktracker.SourceRepository;
import at.bestsolution.persistence.tasktracker.SourceRepositoryType;
import at.bestsolution.persistence.tasktracker.Task;
import at.bestsolution.persistence.tasktracker.TaskAttachment;
import at.bestsolution.persistence.tasktracker.TaskRepository;
import at.bestsolution.persistence.tasktracker.TaskState;
import at.bestsolution.persistence.tasktracker.TasktrackerFactory;
import at.bestsolution.persistence.tasktracker.TasktrackerPackage;
import at.bestsolution.persistence.tasktracker.Version;

import java.sql.Blob;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TasktrackerPackageImpl extends EPackageImpl implements TasktrackerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceRepositoryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType blobEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TasktrackerPackageImpl() {
		super(eNS_URI, TasktrackerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TasktrackerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TasktrackerPackage init() {
		if (isInited) return (TasktrackerPackage)EPackage.Registry.INSTANCE.getEPackage(TasktrackerPackage.eNS_URI);

		// Obtain or create and register package
		TasktrackerPackageImpl theTasktrackerPackage = (TasktrackerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TasktrackerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TasktrackerPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTasktrackerPackage.createPackageContents();

		// Initialize created meta-data
		theTasktrackerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTasktrackerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TasktrackerPackage.eNS_URI, theTasktrackerPackage);
		return theTasktrackerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseObject() {
		return baseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseObject_Sid() {
		return (EAttribute)baseObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskRepository() {
		return taskRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskRepository_Name() {
		return (EAttribute)taskRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRepository_PersonList() {
		return (EReference)taskRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRepository_TaskList() {
		return (EReference)taskRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRepository_SourceRepositoryList() {
		return (EReference)taskRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRepository_VersionList() {
		return (EReference)taskRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskRepository_Description() {
		return (EAttribute)taskRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Firstname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Lastname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Repository() {
		return (EReference)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Repository() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Title() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Description() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_CommentList() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ChangeSetList() {
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Reporter() {
		return (EReference)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Assignee() {
		return (EReference)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_State() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_TargetVersion() {
		return (EReference)taskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ProductVersion() {
		return (EReference)taskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_AttachmentList() {
		return (EReference)taskEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_Task() {
		return (EReference)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Title() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Description() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_AttachmentList() {
		return (EReference)commentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeSet() {
		return changeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeSet_Task() {
		return (EReference)changeSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeSet_Id() {
		return (EAttribute)changeSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeSet_SourceRepository() {
		return (EReference)changeSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeSet_Comment() {
		return (EAttribute)changeSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeSet_Person() {
		return (EReference)changeSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceRepository() {
		return sourceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceRepository_SourceUrl() {
		return (EAttribute)sourceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceRepository_WebUrl() {
		return (EAttribute)sourceRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceRepository_Type() {
		return (EAttribute)sourceRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceRepository_Repository() {
		return (EReference)sourceRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Value() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Date() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Codename() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_Repository() {
		return (EReference)versionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment() {
		return attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_Title() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_Mimetype() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_Binary() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_Description() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentAttachment() {
		return commentAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommentAttachment_Comment() {
		return (EReference)commentAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskAttachment() {
		return taskAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskAttachment_Task() {
		return (EReference)taskAttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskState() {
		return taskStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSourceRepositoryType() {
		return sourceRepositoryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBlob() {
		return blobEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasktrackerFactory getTasktrackerFactory() {
		return (TasktrackerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		baseObjectEClass = createEClass(BASE_OBJECT);
		createEAttribute(baseObjectEClass, BASE_OBJECT__SID);

		taskRepositoryEClass = createEClass(TASK_REPOSITORY);
		createEAttribute(taskRepositoryEClass, TASK_REPOSITORY__NAME);
		createEReference(taskRepositoryEClass, TASK_REPOSITORY__PERSON_LIST);
		createEReference(taskRepositoryEClass, TASK_REPOSITORY__TASK_LIST);
		createEReference(taskRepositoryEClass, TASK_REPOSITORY__SOURCE_REPOSITORY_LIST);
		createEReference(taskRepositoryEClass, TASK_REPOSITORY__VERSION_LIST);
		createEAttribute(taskRepositoryEClass, TASK_REPOSITORY__DESCRIPTION);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRSTNAME);
		createEAttribute(personEClass, PERSON__LASTNAME);
		createEReference(personEClass, PERSON__REPOSITORY);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__REPOSITORY);
		createEAttribute(taskEClass, TASK__TITLE);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEReference(taskEClass, TASK__COMMENT_LIST);
		createEReference(taskEClass, TASK__CHANGE_SET_LIST);
		createEReference(taskEClass, TASK__REPORTER);
		createEReference(taskEClass, TASK__ASSIGNEE);
		createEAttribute(taskEClass, TASK__STATE);
		createEReference(taskEClass, TASK__TARGET_VERSION);
		createEReference(taskEClass, TASK__PRODUCT_VERSION);
		createEReference(taskEClass, TASK__ATTACHMENT_LIST);

		commentEClass = createEClass(COMMENT);
		createEReference(commentEClass, COMMENT__TASK);
		createEAttribute(commentEClass, COMMENT__TITLE);
		createEAttribute(commentEClass, COMMENT__DESCRIPTION);
		createEReference(commentEClass, COMMENT__ATTACHMENT_LIST);

		changeSetEClass = createEClass(CHANGE_SET);
		createEReference(changeSetEClass, CHANGE_SET__TASK);
		createEAttribute(changeSetEClass, CHANGE_SET__ID);
		createEReference(changeSetEClass, CHANGE_SET__SOURCE_REPOSITORY);
		createEAttribute(changeSetEClass, CHANGE_SET__COMMENT);
		createEReference(changeSetEClass, CHANGE_SET__PERSON);

		sourceRepositoryEClass = createEClass(SOURCE_REPOSITORY);
		createEAttribute(sourceRepositoryEClass, SOURCE_REPOSITORY__SOURCE_URL);
		createEAttribute(sourceRepositoryEClass, SOURCE_REPOSITORY__WEB_URL);
		createEAttribute(sourceRepositoryEClass, SOURCE_REPOSITORY__TYPE);
		createEReference(sourceRepositoryEClass, SOURCE_REPOSITORY__REPOSITORY);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__VALUE);
		createEAttribute(versionEClass, VERSION__DATE);
		createEAttribute(versionEClass, VERSION__CODENAME);
		createEReference(versionEClass, VERSION__REPOSITORY);

		attachmentEClass = createEClass(ATTACHMENT);
		createEAttribute(attachmentEClass, ATTACHMENT__TITLE);
		createEAttribute(attachmentEClass, ATTACHMENT__MIMETYPE);
		createEAttribute(attachmentEClass, ATTACHMENT__BINARY);
		createEAttribute(attachmentEClass, ATTACHMENT__DESCRIPTION);

		commentAttachmentEClass = createEClass(COMMENT_ATTACHMENT);
		createEReference(commentAttachmentEClass, COMMENT_ATTACHMENT__COMMENT);

		taskAttachmentEClass = createEClass(TASK_ATTACHMENT);
		createEReference(taskAttachmentEClass, TASK_ATTACHMENT__TASK);

		// Create enums
		taskStateEEnum = createEEnum(TASK_STATE);
		sourceRepositoryTypeEEnum = createEEnum(SOURCE_REPOSITORY_TYPE);

		// Create data types
		blobEDataType = createEDataType(BLOB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		taskRepositoryEClass.getESuperTypes().add(this.getBaseObject());
		personEClass.getESuperTypes().add(this.getBaseObject());
		taskEClass.getESuperTypes().add(this.getBaseObject());
		commentEClass.getESuperTypes().add(this.getBaseObject());
		changeSetEClass.getESuperTypes().add(this.getBaseObject());
		sourceRepositoryEClass.getESuperTypes().add(this.getBaseObject());
		versionEClass.getESuperTypes().add(this.getBaseObject());
		attachmentEClass.getESuperTypes().add(this.getBaseObject());
		commentAttachmentEClass.getESuperTypes().add(this.getAttachment());
		taskAttachmentEClass.getESuperTypes().add(this.getAttachment());

		// Initialize classes, features, and operations; add parameters
		initEClass(baseObjectEClass, BaseObject.class, "BaseObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseObject_Sid(), ecorePackage.getELong(), "sid", null, 0, 1, BaseObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskRepositoryEClass, TaskRepository.class, "TaskRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskRepository_Name(), ecorePackage.getEString(), "name", null, 0, 1, TaskRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskRepository_PersonList(), this.getPerson(), this.getPerson_Repository(), "personList", null, 0, -1, TaskRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskRepository_TaskList(), this.getTask(), this.getTask_Repository(), "taskList", null, 0, -1, TaskRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskRepository_SourceRepositoryList(), this.getSourceRepository(), this.getSourceRepository_Repository(), "sourceRepositoryList", null, 0, -1, TaskRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskRepository_VersionList(), this.getVersion(), this.getVersion_Repository(), "versionList", null, 0, -1, TaskRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskRepository_Description(), ecorePackage.getEString(), "description", null, 0, 1, TaskRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Firstname(), ecorePackage.getEString(), "firstname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Lastname(), ecorePackage.getEString(), "lastname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Repository(), this.getTaskRepository(), this.getTaskRepository_PersonList(), "repository", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Repository(), this.getTaskRepository(), this.getTaskRepository_TaskList(), "repository", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Title(), ecorePackage.getEString(), "title", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_CommentList(), this.getComment(), this.getComment_Task(), "commentList", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ChangeSetList(), this.getChangeSet(), this.getChangeSet_Task(), "changeSetList", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Reporter(), this.getPerson(), null, "reporter", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Assignee(), this.getPerson(), null, "assignee", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_State(), this.getTaskState(), "state", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_TargetVersion(), this.getVersion(), null, "targetVersion", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ProductVersion(), this.getVersion(), null, "productVersion", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_AttachmentList(), this.getTaskAttachment(), this.getTaskAttachment_Task(), "attachmentList", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComment_Task(), this.getTask(), this.getTask_CommentList(), "task", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Title(), ecorePackage.getEString(), "title", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Description(), ecorePackage.getEString(), "description", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComment_AttachmentList(), this.getCommentAttachment(), this.getCommentAttachment_Comment(), "attachmentList", null, 0, -1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeSetEClass, ChangeSet.class, "ChangeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeSet_Task(), this.getTask(), this.getTask_ChangeSetList(), "task", null, 0, 1, ChangeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeSet_Id(), ecorePackage.getEString(), "id", null, 0, 1, ChangeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeSet_SourceRepository(), this.getSourceRepository(), null, "sourceRepository", null, 0, 1, ChangeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeSet_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, ChangeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeSet_Person(), this.getPerson(), null, "person", null, 0, 1, ChangeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceRepositoryEClass, SourceRepository.class, "SourceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceRepository_SourceUrl(), ecorePackage.getEString(), "sourceUrl", null, 0, 1, SourceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceRepository_WebUrl(), ecorePackage.getEString(), "webUrl", null, 0, 1, SourceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceRepository_Type(), this.getSourceRepositoryType(), "type", null, 0, 1, SourceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceRepository_Repository(), this.getTaskRepository(), this.getTaskRepository_SourceRepositoryList(), "repository", null, 0, 1, SourceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Value(), ecorePackage.getEString(), "value", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Codename(), ecorePackage.getEString(), "codename", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersion_Repository(), this.getTaskRepository(), this.getTaskRepository_VersionList(), "repository", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentEClass, Attachment.class, "Attachment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachment_Title(), ecorePackage.getEString(), "title", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_Mimetype(), ecorePackage.getEString(), "mimetype", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_Binary(), this.getBlob(), "binary", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_Description(), ecorePackage.getEString(), "description", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentAttachmentEClass, CommentAttachment.class, "CommentAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommentAttachment_Comment(), this.getComment(), this.getComment_AttachmentList(), "comment", null, 0, 1, CommentAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskAttachmentEClass, TaskAttachment.class, "TaskAttachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskAttachment_Task(), this.getTask(), this.getTask_AttachmentList(), "task", null, 0, 1, TaskAttachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(taskStateEEnum, TaskState.class, "TaskState");
		addEEnumLiteral(taskStateEEnum, TaskState.NEW);
		addEEnumLiteral(taskStateEEnum, TaskState.CONFIRMED);
		addEEnumLiteral(taskStateEEnum, TaskState.RESOLVED);

		initEEnum(sourceRepositoryTypeEEnum, SourceRepositoryType.class, "SourceRepositoryType");
		addEEnumLiteral(sourceRepositoryTypeEEnum, SourceRepositoryType.GIT);
		addEEnumLiteral(sourceRepositoryTypeEEnum, SourceRepositoryType.SVN);

		// Initialize data types
		initEDataType(blobEDataType, Blob.class, "Blob", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TasktrackerPackageImpl

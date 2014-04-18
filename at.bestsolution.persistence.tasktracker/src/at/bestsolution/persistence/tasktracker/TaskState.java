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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Task State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.bestsolution.persistence.tasktracker.TasktrackerPackage#getTaskState()
 * @model
 * @generated
 */
public enum TaskState implements Enumerator {
	/**
	 * The '<em><b>NEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_VALUE
	 * @generated
	 * @ordered
	 */
	NEW(0, "NEW", "NEW"),

	/**
	 * The '<em><b>CONFIRMED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIRMED_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIRMED(1, "CONFIRMED", "CONFIRMED"),

	/**
	 * The '<em><b>RESOLVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOLVED_VALUE
	 * @generated
	 * @ordered
	 */
	RESOLVED(2, "RESOLVED", "RESOLVED");

	/**
	 * The '<em><b>NEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEW_VALUE = 0;

	/**
	 * The '<em><b>CONFIRMED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFIRMED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIRMED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFIRMED_VALUE = 1;

	/**
	 * The '<em><b>RESOLVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESOLVED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOLVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESOLVED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Task State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaskState[] VALUES_ARRAY =
		new TaskState[] {
			NEW,
			CONFIRMED,
			RESOLVED,
		};

	/**
	 * A public read-only list of all the '<em><b>Task State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TaskState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Task State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskState get(int value) {
		switch (value) {
			case NEW_VALUE: return NEW;
			case CONFIRMED_VALUE: return CONFIRMED;
			case RESOLVED_VALUE: return RESOLVED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TaskState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TaskState

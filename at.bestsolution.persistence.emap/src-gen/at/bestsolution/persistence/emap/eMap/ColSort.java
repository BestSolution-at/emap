/**
 */
package at.bestsolution.persistence.emap.eMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Col Sort</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getColSort()
 * @model
 * @generated
 */
public enum ColSort implements Enumerator
{
  /**
   * The '<em><b>EMAP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EMAP_VALUE
   * @generated
   * @ordered
   */
  EMAP(0, "EMAP", "EMAP"),

  /**
   * The '<em><b>ECORE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ECORE_VALUE
   * @generated
   * @ordered
   */
  ECORE(1, "ECORE", "ECORE"),

  /**
   * The '<em><b>ECORE REVERSED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ECORE_REVERSED_VALUE
   * @generated
   * @ordered
   */
  ECORE_REVERSED(2, "ECORE_REVERSED", "ECORE_REVERSED"),

  /**
   * The '<em><b>ALPHABETIC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALPHABETIC_VALUE
   * @generated
   * @ordered
   */
  ALPHABETIC(3, "ALPHABETIC", "ALPHABETIC");

  /**
   * The '<em><b>EMAP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EMAP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EMAP
   * @model
   * @generated
   * @ordered
   */
  public static final int EMAP_VALUE = 0;

  /**
   * The '<em><b>ECORE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ECORE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ECORE
   * @model
   * @generated
   * @ordered
   */
  public static final int ECORE_VALUE = 1;

  /**
   * The '<em><b>ECORE REVERSED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ECORE REVERSED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ECORE_REVERSED
   * @model
   * @generated
   * @ordered
   */
  public static final int ECORE_REVERSED_VALUE = 2;

  /**
   * The '<em><b>ALPHABETIC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALPHABETIC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALPHABETIC
   * @model
   * @generated
   * @ordered
   */
  public static final int ALPHABETIC_VALUE = 3;

  /**
   * An array of all the '<em><b>Col Sort</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ColSort[] VALUES_ARRAY =
    new ColSort[]
    {
      EMAP,
      ECORE,
      ECORE_REVERSED,
      ALPHABETIC,
    };

  /**
   * A public read-only list of all the '<em><b>Col Sort</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ColSort> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Col Sort</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ColSort get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ColSort result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Col Sort</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ColSort getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ColSort result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Col Sort</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ColSort get(int value)
  {
    switch (value)
    {
      case EMAP_VALUE: return EMAP;
      case ECORE_VALUE: return ECORE;
      case ECORE_REVERSED_VALUE: return ECORE_REVERSED;
      case ALPHABETIC_VALUE: return ALPHABETIC;
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
  private ColSort(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ColSort

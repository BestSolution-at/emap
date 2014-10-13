/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EModel Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getQuery <em>Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getParameters <em>Parameters</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#isCached <em>Cached</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getCacheName <em>Cache Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEModelTypeAttribute()
 * @model
 * @generated
 */
public interface EModelTypeAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEModelTypeAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' reference.
   * @see #setQuery(ENamedCustomQuery)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEModelTypeAttribute_Query()
   * @model
   * @generated
   */
  ENamedCustomQuery getQuery();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getQuery <em>Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(ENamedCustomQuery value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' attribute list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEModelTypeAttribute_Parameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameters();

  /**
   * Returns the value of the '<em><b>Cached</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cached</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cached</em>' attribute.
   * @see #setCached(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEModelTypeAttribute_Cached()
   * @model
   * @generated
   */
  boolean isCached();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#isCached <em>Cached</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cached</em>' attribute.
   * @see #isCached()
   * @generated
   */
  void setCached(boolean value);

  /**
   * Returns the value of the '<em><b>Cache Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cache Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cache Name</em>' attribute.
   * @see #setCacheName(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEModelTypeAttribute_CacheName()
   * @model
   * @generated
   */
  String getCacheName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EModelTypeAttribute#getCacheName <em>Cache Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cache Name</em>' attribute.
   * @see #getCacheName()
   * @generated
   */
  void setCacheName(String value);

} // EModelTypeAttribute

/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMapping Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#isPk <em>Pk</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getProperty <em>Property</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#isResolved <em>Resolved</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getQuery <em>Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getParameters <em>Parameters</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#isMapped <em>Mapped</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getMap <em>Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingAttribute()
 * @model
 * @generated
 */
public interface EMappingAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Pk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pk</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pk</em>' attribute.
   * @see #setPk(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingAttribute_Pk()
   * @model
   * @generated
   */
  boolean isPk();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#isPk <em>Pk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pk</em>' attribute.
   * @see #isPk()
   * @generated
   */
  void setPk(boolean value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingAttribute_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

  /**
   * Returns the value of the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Name</em>' attribute.
   * @see #setColumnName(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingAttribute_ColumnName()
   * @model
   * @generated
   */
  String getColumnName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getColumnName <em>Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Name</em>' attribute.
   * @see #getColumnName()
   * @generated
   */
  void setColumnName(String value);

  /**
   * Returns the value of the '<em><b>Resolved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolved</em>' attribute.
   * @see #setResolved(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingAttribute_Resolved()
   * @model
   * @generated
   */
  boolean isResolved();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#isResolved <em>Resolved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resolved</em>' attribute.
   * @see #isResolved()
   * @generated
   */
  void setResolved(boolean value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' reference.
   * @see #setQuery(ENamedQuery)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingAttribute_Query()
   * @model
   * @generated
   */
  ENamedQuery getQuery();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getQuery <em>Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(ENamedQuery value);

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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingAttribute_Parameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameters();

  /**
   * Returns the value of the '<em><b>Mapped</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped</em>' attribute.
   * @see #setMapped(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingAttribute_Mapped()
   * @model
   * @generated
   */
  boolean isMapped();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#isMapped <em>Mapped</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped</em>' attribute.
   * @see #isMapped()
   * @generated
   */
  void setMapped(boolean value);

  /**
   * Returns the value of the '<em><b>Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map</em>' containment reference.
   * @see #setMap(EObjectSection)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingAttribute_Map()
   * @model containment="true"
   * @generated
   */
  EObjectSection getMap();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingAttribute#getMap <em>Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map</em>' containment reference.
   * @see #getMap()
   * @generated
   */
  void setMap(EObjectSection value);

} // EMappingAttribute

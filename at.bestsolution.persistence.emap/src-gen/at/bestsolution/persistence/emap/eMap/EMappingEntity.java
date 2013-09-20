/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMapping Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getExtensionType <em>Extension Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getParent <em>Parent</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getEtype <em>Etype</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getNamedQueries <em>Named Queries</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingEntity()
 * @model
 * @generated
 */
public interface EMappingEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingEntity_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Extension Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extension Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extension Type</em>' attribute.
   * @see #setExtensionType(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingEntity_ExtensionType()
   * @model
   * @generated
   */
  String getExtensionType();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getExtensionType <em>Extension Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extension Type</em>' attribute.
   * @see #getExtensionType()
   * @generated
   */
  void setExtensionType(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(EMappingEntity)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingEntity_Parent()
   * @model
   * @generated
   */
  EMappingEntity getParent();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(EMappingEntity value);

  /**
   * Returns the value of the '<em><b>Etype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Etype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Etype</em>' containment reference.
   * @see #setEtype(EType)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingEntity_Etype()
   * @model containment="true"
   * @generated
   */
  EType getEtype();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getEtype <em>Etype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Etype</em>' containment reference.
   * @see #getEtype()
   * @generated
   */
  void setEtype(EType value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingEntity_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<EAttribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Named Queries</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.ENamedQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named Queries</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingEntity_NamedQueries()
   * @model containment="true"
   * @generated
   */
  EList<ENamedQuery> getNamedQueries();

  /**
   * Returns the value of the '<em><b>Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Name</em>' attribute.
   * @see #setTableName(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingEntity_TableName()
   * @model
   * @generated
   */
  String getTableName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingEntity#getTableName <em>Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Name</em>' attribute.
   * @see #getTableName()
   * @generated
   */
  void setTableName(String value);

} // EMappingEntity

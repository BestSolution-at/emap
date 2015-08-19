/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMapping Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getImports <em>Imports</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getParentBundle <em>Parent Bundle</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getEntities <em>Entities</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getTypeDefs <em>Type Defs</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getGenerators <em>Generators</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getDatabases <em>Databases</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getColSort <em>Col Sort</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingBundle()
 * @model
 * @generated
 */
public interface EMappingBundle extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingBundle_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingBundle_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent Bundle</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Bundle</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Bundle</em>' reference.
   * @see #setParentBundle(EMappingBundle)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingBundle_ParentBundle()
   * @model
   * @generated
   */
  EMappingBundle getParentBundle();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getParentBundle <em>Parent Bundle</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Bundle</em>' reference.
   * @see #getParentBundle()
   * @generated
   */
  void setParentBundle(EMappingBundle value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EBundleEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingBundle_Entities()
   * @model containment="true"
   * @generated
   */
  EList<EBundleEntity> getEntities();

  /**
   * Returns the value of the '<em><b>Type Defs</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.ESQLTypeDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Defs</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingBundle_TypeDefs()
   * @model containment="true"
   * @generated
   */
  EList<ESQLTypeDef> getTypeDefs();

  /**
   * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EGeneratorDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generators</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingBundle_Generators()
   * @model containment="true"
   * @generated
   */
  EList<EGeneratorDef> getGenerators();

  /**
   * Returns the value of the '<em><b>Databases</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Databases</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Databases</em>' attribute list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingBundle_Databases()
   * @model unique="false"
   * @generated
   */
  EList<String> getDatabases();

  /**
   * Returns the value of the '<em><b>Col Sort</b></em>' attribute.
   * The literals are from the enumeration {@link at.bestsolution.persistence.emap.eMap.ColSort}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Col Sort</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col Sort</em>' attribute.
   * @see at.bestsolution.persistence.emap.eMap.ColSort
   * @see #setColSort(ColSort)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEMappingBundle_ColSort()
   * @model
   * @generated
   */
  ColSort getColSort();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EMappingBundle#getColSort <em>Col Sort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col Sort</em>' attribute.
   * @see at.bestsolution.persistence.emap.eMap.ColSort
   * @see #getColSort()
   * @generated
   */
  void setColSort(ColSort value);

} // EMappingBundle

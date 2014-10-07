/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBundle Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getEntity <em>Entity</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getPkConstraintName <em>Pk Constraint Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getFkConstraints <em>Fk Constraints</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getUniqueContraints <em>Unique Contraints</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getIndices <em>Indices</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getTypeDefs <em>Type Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEBundleEntity()
 * @model
 * @generated
 */
public interface EBundleEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' reference.
   * @see #setEntity(EMappingEntity)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEBundleEntity_Entity()
   * @model
   * @generated
   */
  EMappingEntity getEntity();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(EMappingEntity value);

  /**
   * Returns the value of the '<em><b>Pk Constraint Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pk Constraint Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pk Constraint Name</em>' attribute.
   * @see #setPkConstraintName(String)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEBundleEntity_PkConstraintName()
   * @model
   * @generated
   */
  String getPkConstraintName();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EBundleEntity#getPkConstraintName <em>Pk Constraint Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pk Constraint Name</em>' attribute.
   * @see #getPkConstraintName()
   * @generated
   */
  void setPkConstraintName(String value);

  /**
   * Returns the value of the '<em><b>Fk Constraints</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EFkConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fk Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fk Constraints</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEBundleEntity_FkConstraints()
   * @model containment="true"
   * @generated
   */
  EList<EFkConstraint> getFkConstraints();

  /**
   * Returns the value of the '<em><b>Unique Contraints</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EUniqueConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique Contraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique Contraints</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEBundleEntity_UniqueContraints()
   * @model containment="true"
   * @generated
   */
  EList<EUniqueConstraint> getUniqueContraints();

  /**
   * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.EIndex}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indices</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEBundleEntity_Indices()
   * @model containment="true"
   * @generated
   */
  EList<EIndex> getIndices();

  /**
   * Returns the value of the '<em><b>Type Defs</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Defs</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEBundleEntity_TypeDefs()
   * @model containment="true"
   * @generated
   */
  EList<ESQLAttTypeDef> getTypeDefs();

} // EBundleEntity

/**
 */
package at.bestsolution.persistence.emap.eMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EService Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#getPackage <em>Package</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#getEntity <em>Entity</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#isList <em>List</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#getListQuery <em>List Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#isGet <em>Get</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#getGetQuery <em>Get Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#isUpdate <em>Update</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#isInsert <em>Insert</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#isDelete <em>Delete</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#getServiceMethods <em>Service Methods</em>}</li>
 * </ul>
 *
 * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEServiceMapping()
 * @model
 * @generated
 */
public interface EServiceMapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference.
   * @see #setPackage(PackageDeclaration)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEServiceMapping_Package()
   * @model containment="true"
   * @generated
   */
  PackageDeclaration getPackage();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#getPackage <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' containment reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(PackageDeclaration value);

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
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEServiceMapping_Entity()
   * @model
   * @generated
   */
  EMappingEntity getEntity();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(EMappingEntity value);

  /**
   * Returns the value of the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' attribute.
   * @see #setList(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEServiceMapping_List()
   * @model
   * @generated
   */
  boolean isList();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#isList <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' attribute.
   * @see #isList()
   * @generated
   */
  void setList(boolean value);

  /**
   * Returns the value of the '<em><b>List Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Query</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Query</em>' reference.
   * @see #setListQuery(ENamedQuery)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEServiceMapping_ListQuery()
   * @model
   * @generated
   */
  ENamedQuery getListQuery();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#getListQuery <em>List Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Query</em>' reference.
   * @see #getListQuery()
   * @generated
   */
  void setListQuery(ENamedQuery value);

  /**
   * Returns the value of the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get</em>' attribute.
   * @see #setGet(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEServiceMapping_Get()
   * @model
   * @generated
   */
  boolean isGet();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#isGet <em>Get</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get</em>' attribute.
   * @see #isGet()
   * @generated
   */
  void setGet(boolean value);

  /**
   * Returns the value of the '<em><b>Get Query</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get Query</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get Query</em>' reference.
   * @see #setGetQuery(ENamedQuery)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEServiceMapping_GetQuery()
   * @model
   * @generated
   */
  ENamedQuery getGetQuery();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#getGetQuery <em>Get Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get Query</em>' reference.
   * @see #getGetQuery()
   * @generated
   */
  void setGetQuery(ENamedQuery value);

  /**
   * Returns the value of the '<em><b>Update</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update</em>' attribute.
   * @see #setUpdate(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEServiceMapping_Update()
   * @model
   * @generated
   */
  boolean isUpdate();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#isUpdate <em>Update</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update</em>' attribute.
   * @see #isUpdate()
   * @generated
   */
  void setUpdate(boolean value);

  /**
   * Returns the value of the '<em><b>Insert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insert</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insert</em>' attribute.
   * @see #setInsert(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEServiceMapping_Insert()
   * @model
   * @generated
   */
  boolean isInsert();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#isInsert <em>Insert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Insert</em>' attribute.
   * @see #isInsert()
   * @generated
   */
  void setInsert(boolean value);

  /**
   * Returns the value of the '<em><b>Delete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delete</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delete</em>' attribute.
   * @see #setDelete(boolean)
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEServiceMapping_Delete()
   * @model
   * @generated
   */
  boolean isDelete();

  /**
   * Sets the value of the '{@link at.bestsolution.persistence.emap.eMap.EServiceMapping#isDelete <em>Delete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' attribute.
   * @see #isDelete()
   * @generated
   */
  void setDelete(boolean value);

  /**
   * Returns the value of the '<em><b>Service Methods</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.persistence.emap.eMap.ENamedServiceQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Methods</em>' containment reference list.
   * @see at.bestsolution.persistence.emap.eMap.EMapPackage#getEServiceMapping_ServiceMethods()
   * @model containment="true"
   * @generated
   */
  EList<ENamedServiceQuery> getServiceMethods();

} // EServiceMapping

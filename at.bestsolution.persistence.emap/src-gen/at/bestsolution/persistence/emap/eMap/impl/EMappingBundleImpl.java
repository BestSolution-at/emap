/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.ColSort;
import at.bestsolution.persistence.emap.eMap.EBundleEntity;
import at.bestsolution.persistence.emap.eMap.EGeneratorDef;
import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.EMappingBundle;
import at.bestsolution.persistence.emap.eMap.EPredef;
import at.bestsolution.persistence.emap.eMap.ESQLTypeDef;
import at.bestsolution.persistence.emap.eMap.Import;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMapping Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingBundleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingBundleImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingBundleImpl#getParentBundle <em>Parent Bundle</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingBundleImpl#getPredef <em>Predef</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingBundleImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingBundleImpl#getTypeDefs <em>Type Defs</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingBundleImpl#getGenerators <em>Generators</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingBundleImpl#getDatabases <em>Databases</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EMappingBundleImpl#getColSort <em>Col Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMappingBundleImpl extends MinimalEObjectImpl.Container implements EMappingBundle
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParentBundle() <em>Parent Bundle</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentBundle()
   * @generated
   * @ordered
   */
  protected EMappingBundle parentBundle;

  /**
   * The cached value of the '{@link #getPredef() <em>Predef</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredef()
   * @generated
   * @ordered
   */
  protected EList<EPredef> predef;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<EBundleEntity> entities;

  /**
   * The cached value of the '{@link #getTypeDefs() <em>Type Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefs()
   * @generated
   * @ordered
   */
  protected EList<ESQLTypeDef> typeDefs;

  /**
   * The cached value of the '{@link #getGenerators() <em>Generators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerators()
   * @generated
   * @ordered
   */
  protected EList<EGeneratorDef> generators;

  /**
   * The cached value of the '{@link #getDatabases() <em>Databases</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabases()
   * @generated
   * @ordered
   */
  protected EList<String> databases;

  /**
   * The default value of the '{@link #getColSort() <em>Col Sort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColSort()
   * @generated
   * @ordered
   */
  protected static final ColSort COL_SORT_EDEFAULT = ColSort.EMAP;

  /**
   * The cached value of the '{@link #getColSort() <em>Col Sort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColSort()
   * @generated
   * @ordered
   */
  protected ColSort colSort = COL_SORT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMappingBundleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EMapPackage.Literals.EMAPPING_BUNDLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, EMapPackage.EMAPPING_BUNDLE__IMPORTS);
    }
    return imports;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_BUNDLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMappingBundle getParentBundle()
  {
    if (parentBundle != null && parentBundle.eIsProxy())
    {
      InternalEObject oldParentBundle = (InternalEObject)parentBundle;
      parentBundle = (EMappingBundle)eResolveProxy(oldParentBundle);
      if (parentBundle != oldParentBundle)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.EMAPPING_BUNDLE__PARENT_BUNDLE, oldParentBundle, parentBundle));
      }
    }
    return parentBundle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMappingBundle basicGetParentBundle()
  {
    return parentBundle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentBundle(EMappingBundle newParentBundle)
  {
    EMappingBundle oldParentBundle = parentBundle;
    parentBundle = newParentBundle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_BUNDLE__PARENT_BUNDLE, oldParentBundle, parentBundle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EPredef> getPredef()
  {
    if (predef == null)
    {
      predef = new EObjectContainmentEList<EPredef>(EPredef.class, this, EMapPackage.EMAPPING_BUNDLE__PREDEF);
    }
    return predef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EBundleEntity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<EBundleEntity>(EBundleEntity.class, this, EMapPackage.EMAPPING_BUNDLE__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ESQLTypeDef> getTypeDefs()
  {
    if (typeDefs == null)
    {
      typeDefs = new EObjectContainmentEList<ESQLTypeDef>(ESQLTypeDef.class, this, EMapPackage.EMAPPING_BUNDLE__TYPE_DEFS);
    }
    return typeDefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EGeneratorDef> getGenerators()
  {
    if (generators == null)
    {
      generators = new EObjectContainmentEList<EGeneratorDef>(EGeneratorDef.class, this, EMapPackage.EMAPPING_BUNDLE__GENERATORS);
    }
    return generators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDatabases()
  {
    if (databases == null)
    {
      databases = new EDataTypeEList<String>(String.class, this, EMapPackage.EMAPPING_BUNDLE__DATABASES);
    }
    return databases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColSort getColSort()
  {
    return colSort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColSort(ColSort newColSort)
  {
    ColSort oldColSort = colSort;
    colSort = newColSort == null ? COL_SORT_EDEFAULT : newColSort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EMAPPING_BUNDLE__COL_SORT, oldColSort, colSort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EMapPackage.EMAPPING_BUNDLE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case EMapPackage.EMAPPING_BUNDLE__PREDEF:
        return ((InternalEList<?>)getPredef()).basicRemove(otherEnd, msgs);
      case EMapPackage.EMAPPING_BUNDLE__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case EMapPackage.EMAPPING_BUNDLE__TYPE_DEFS:
        return ((InternalEList<?>)getTypeDefs()).basicRemove(otherEnd, msgs);
      case EMapPackage.EMAPPING_BUNDLE__GENERATORS:
        return ((InternalEList<?>)getGenerators()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EMapPackage.EMAPPING_BUNDLE__IMPORTS:
        return getImports();
      case EMapPackage.EMAPPING_BUNDLE__NAME:
        return getName();
      case EMapPackage.EMAPPING_BUNDLE__PARENT_BUNDLE:
        if (resolve) return getParentBundle();
        return basicGetParentBundle();
      case EMapPackage.EMAPPING_BUNDLE__PREDEF:
        return getPredef();
      case EMapPackage.EMAPPING_BUNDLE__ENTITIES:
        return getEntities();
      case EMapPackage.EMAPPING_BUNDLE__TYPE_DEFS:
        return getTypeDefs();
      case EMapPackage.EMAPPING_BUNDLE__GENERATORS:
        return getGenerators();
      case EMapPackage.EMAPPING_BUNDLE__DATABASES:
        return getDatabases();
      case EMapPackage.EMAPPING_BUNDLE__COL_SORT:
        return getColSort();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EMapPackage.EMAPPING_BUNDLE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case EMapPackage.EMAPPING_BUNDLE__NAME:
        setName((String)newValue);
        return;
      case EMapPackage.EMAPPING_BUNDLE__PARENT_BUNDLE:
        setParentBundle((EMappingBundle)newValue);
        return;
      case EMapPackage.EMAPPING_BUNDLE__PREDEF:
        getPredef().clear();
        getPredef().addAll((Collection<? extends EPredef>)newValue);
        return;
      case EMapPackage.EMAPPING_BUNDLE__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends EBundleEntity>)newValue);
        return;
      case EMapPackage.EMAPPING_BUNDLE__TYPE_DEFS:
        getTypeDefs().clear();
        getTypeDefs().addAll((Collection<? extends ESQLTypeDef>)newValue);
        return;
      case EMapPackage.EMAPPING_BUNDLE__GENERATORS:
        getGenerators().clear();
        getGenerators().addAll((Collection<? extends EGeneratorDef>)newValue);
        return;
      case EMapPackage.EMAPPING_BUNDLE__DATABASES:
        getDatabases().clear();
        getDatabases().addAll((Collection<? extends String>)newValue);
        return;
      case EMapPackage.EMAPPING_BUNDLE__COL_SORT:
        setColSort((ColSort)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EMapPackage.EMAPPING_BUNDLE__IMPORTS:
        getImports().clear();
        return;
      case EMapPackage.EMAPPING_BUNDLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EMapPackage.EMAPPING_BUNDLE__PARENT_BUNDLE:
        setParentBundle((EMappingBundle)null);
        return;
      case EMapPackage.EMAPPING_BUNDLE__PREDEF:
        getPredef().clear();
        return;
      case EMapPackage.EMAPPING_BUNDLE__ENTITIES:
        getEntities().clear();
        return;
      case EMapPackage.EMAPPING_BUNDLE__TYPE_DEFS:
        getTypeDefs().clear();
        return;
      case EMapPackage.EMAPPING_BUNDLE__GENERATORS:
        getGenerators().clear();
        return;
      case EMapPackage.EMAPPING_BUNDLE__DATABASES:
        getDatabases().clear();
        return;
      case EMapPackage.EMAPPING_BUNDLE__COL_SORT:
        setColSort(COL_SORT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EMapPackage.EMAPPING_BUNDLE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case EMapPackage.EMAPPING_BUNDLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EMapPackage.EMAPPING_BUNDLE__PARENT_BUNDLE:
        return parentBundle != null;
      case EMapPackage.EMAPPING_BUNDLE__PREDEF:
        return predef != null && !predef.isEmpty();
      case EMapPackage.EMAPPING_BUNDLE__ENTITIES:
        return entities != null && !entities.isEmpty();
      case EMapPackage.EMAPPING_BUNDLE__TYPE_DEFS:
        return typeDefs != null && !typeDefs.isEmpty();
      case EMapPackage.EMAPPING_BUNDLE__GENERATORS:
        return generators != null && !generators.isEmpty();
      case EMapPackage.EMAPPING_BUNDLE__DATABASES:
        return databases != null && !databases.isEmpty();
      case EMapPackage.EMAPPING_BUNDLE__COL_SORT:
        return colSort != COL_SORT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", databases: ");
    result.append(databases);
    result.append(", colSort: ");
    result.append(colSort);
    result.append(')');
    return result.toString();
  }

} //EMappingBundleImpl

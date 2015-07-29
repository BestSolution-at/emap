/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EAttribute;
import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.ENamedQuery;
import at.bestsolution.persistence.emap.eMap.EValueGenerator;

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
 * An implementation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl#isPk <em>Pk</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl#isForcedFk <em>Forced Fk</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl#getValueGenerators <em>Value Generators</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl#getRelationTable <em>Relation Table</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl#getRelationColumn <em>Relation Column</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EAttributeImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAttributeImpl extends MinimalEObjectImpl.Container implements EAttribute
{
  /**
   * The default value of the '{@link #isPk() <em>Pk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPk()
   * @generated
   * @ordered
   */
  protected static final boolean PK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPk() <em>Pk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPk()
   * @generated
   * @ordered
   */
  protected boolean pk = PK_EDEFAULT;

  /**
   * The default value of the '{@link #isForcedFk() <em>Forced Fk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForcedFk()
   * @generated
   * @ordered
   */
  protected static final boolean FORCED_FK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isForcedFk() <em>Forced Fk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForcedFk()
   * @generated
   * @ordered
   */
  protected boolean forcedFk = FORCED_FK_EDEFAULT;

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
   * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnName()
   * @generated
   * @ordered
   */
  protected static final String COLUMN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnName()
   * @generated
   * @ordered
   */
  protected String columnName = COLUMN_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getValueGenerators() <em>Value Generators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueGenerators()
   * @generated
   * @ordered
   */
  protected EList<EValueGenerator> valueGenerators;

  /**
   * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResolved()
   * @generated
   * @ordered
   */
  protected static final boolean RESOLVED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResolved()
   * @generated
   * @ordered
   */
  protected boolean resolved = RESOLVED_EDEFAULT;

  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected ENamedQuery query;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<String> parameters;

  /**
   * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpposite()
   * @generated
   * @ordered
   */
  protected EAttribute opposite;

  /**
   * The default value of the '{@link #getRelationTable() <em>Relation Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationTable()
   * @generated
   * @ordered
   */
  protected static final String RELATION_TABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelationTable() <em>Relation Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationTable()
   * @generated
   * @ordered
   */
  protected String relationTable = RELATION_TABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getRelationColumn() <em>Relation Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationColumn()
   * @generated
   * @ordered
   */
  protected static final String RELATION_COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelationColumn() <em>Relation Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationColumn()
   * @generated
   * @ordered
   */
  protected String relationColumn = RELATION_COLUMN_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final String SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected String size = SIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EAttributeImpl()
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
    return EMapPackage.Literals.EATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPk()
  {
    return pk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPk(boolean newPk)
  {
    boolean oldPk = pk;
    pk = newPk;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EATTRIBUTE__PK, oldPk, pk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isForcedFk()
  {
    return forcedFk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForcedFk(boolean newForcedFk)
  {
    boolean oldForcedFk = forcedFk;
    forcedFk = newForcedFk;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EATTRIBUTE__FORCED_FK, oldForcedFk, forcedFk));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColumnName()
  {
    return columnName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnName(String newColumnName)
  {
    String oldColumnName = columnName;
    columnName = newColumnName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EATTRIBUTE__COLUMN_NAME, oldColumnName, columnName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EValueGenerator> getValueGenerators()
  {
    if (valueGenerators == null)
    {
      valueGenerators = new EObjectContainmentEList<EValueGenerator>(EValueGenerator.class, this, EMapPackage.EATTRIBUTE__VALUE_GENERATORS);
    }
    return valueGenerators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResolved()
  {
    return resolved;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResolved(boolean newResolved)
  {
    boolean oldResolved = resolved;
    resolved = newResolved;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EATTRIBUTE__RESOLVED, oldResolved, resolved));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamedQuery getQuery()
  {
    if (query != null && query.eIsProxy())
    {
      InternalEObject oldQuery = (InternalEObject)query;
      query = (ENamedQuery)eResolveProxy(oldQuery);
      if (query != oldQuery)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.EATTRIBUTE__QUERY, oldQuery, query));
      }
    }
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamedQuery basicGetQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(ENamedQuery newQuery)
  {
    ENamedQuery oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EATTRIBUTE__QUERY, oldQuery, query));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EDataTypeEList<String>(String.class, this, EMapPackage.EATTRIBUTE__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOpposite()
  {
    if (opposite != null && opposite.eIsProxy())
    {
      InternalEObject oldOpposite = (InternalEObject)opposite;
      opposite = (EAttribute)eResolveProxy(oldOpposite);
      if (opposite != oldOpposite)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMapPackage.EATTRIBUTE__OPPOSITE, oldOpposite, opposite));
      }
    }
    return opposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute basicGetOpposite()
  {
    return opposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpposite(EAttribute newOpposite)
  {
    EAttribute oldOpposite = opposite;
    opposite = newOpposite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EATTRIBUTE__OPPOSITE, oldOpposite, opposite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelationTable()
  {
    return relationTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationTable(String newRelationTable)
  {
    String oldRelationTable = relationTable;
    relationTable = newRelationTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EATTRIBUTE__RELATION_TABLE, oldRelationTable, relationTable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelationColumn()
  {
    return relationColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationColumn(String newRelationColumn)
  {
    String oldRelationColumn = relationColumn;
    relationColumn = newRelationColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EATTRIBUTE__RELATION_COLUMN, oldRelationColumn, relationColumn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(String newSize)
  {
    String oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EATTRIBUTE__SIZE, oldSize, size));
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
      case EMapPackage.EATTRIBUTE__VALUE_GENERATORS:
        return ((InternalEList<?>)getValueGenerators()).basicRemove(otherEnd, msgs);
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
      case EMapPackage.EATTRIBUTE__PK:
        return isPk();
      case EMapPackage.EATTRIBUTE__FORCED_FK:
        return isForcedFk();
      case EMapPackage.EATTRIBUTE__NAME:
        return getName();
      case EMapPackage.EATTRIBUTE__COLUMN_NAME:
        return getColumnName();
      case EMapPackage.EATTRIBUTE__VALUE_GENERATORS:
        return getValueGenerators();
      case EMapPackage.EATTRIBUTE__RESOLVED:
        return isResolved();
      case EMapPackage.EATTRIBUTE__QUERY:
        if (resolve) return getQuery();
        return basicGetQuery();
      case EMapPackage.EATTRIBUTE__PARAMETERS:
        return getParameters();
      case EMapPackage.EATTRIBUTE__OPPOSITE:
        if (resolve) return getOpposite();
        return basicGetOpposite();
      case EMapPackage.EATTRIBUTE__RELATION_TABLE:
        return getRelationTable();
      case EMapPackage.EATTRIBUTE__RELATION_COLUMN:
        return getRelationColumn();
      case EMapPackage.EATTRIBUTE__SIZE:
        return getSize();
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
      case EMapPackage.EATTRIBUTE__PK:
        setPk((Boolean)newValue);
        return;
      case EMapPackage.EATTRIBUTE__FORCED_FK:
        setForcedFk((Boolean)newValue);
        return;
      case EMapPackage.EATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case EMapPackage.EATTRIBUTE__COLUMN_NAME:
        setColumnName((String)newValue);
        return;
      case EMapPackage.EATTRIBUTE__VALUE_GENERATORS:
        getValueGenerators().clear();
        getValueGenerators().addAll((Collection<? extends EValueGenerator>)newValue);
        return;
      case EMapPackage.EATTRIBUTE__RESOLVED:
        setResolved((Boolean)newValue);
        return;
      case EMapPackage.EATTRIBUTE__QUERY:
        setQuery((ENamedQuery)newValue);
        return;
      case EMapPackage.EATTRIBUTE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends String>)newValue);
        return;
      case EMapPackage.EATTRIBUTE__OPPOSITE:
        setOpposite((EAttribute)newValue);
        return;
      case EMapPackage.EATTRIBUTE__RELATION_TABLE:
        setRelationTable((String)newValue);
        return;
      case EMapPackage.EATTRIBUTE__RELATION_COLUMN:
        setRelationColumn((String)newValue);
        return;
      case EMapPackage.EATTRIBUTE__SIZE:
        setSize((String)newValue);
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
      case EMapPackage.EATTRIBUTE__PK:
        setPk(PK_EDEFAULT);
        return;
      case EMapPackage.EATTRIBUTE__FORCED_FK:
        setForcedFk(FORCED_FK_EDEFAULT);
        return;
      case EMapPackage.EATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EMapPackage.EATTRIBUTE__COLUMN_NAME:
        setColumnName(COLUMN_NAME_EDEFAULT);
        return;
      case EMapPackage.EATTRIBUTE__VALUE_GENERATORS:
        getValueGenerators().clear();
        return;
      case EMapPackage.EATTRIBUTE__RESOLVED:
        setResolved(RESOLVED_EDEFAULT);
        return;
      case EMapPackage.EATTRIBUTE__QUERY:
        setQuery((ENamedQuery)null);
        return;
      case EMapPackage.EATTRIBUTE__PARAMETERS:
        getParameters().clear();
        return;
      case EMapPackage.EATTRIBUTE__OPPOSITE:
        setOpposite((EAttribute)null);
        return;
      case EMapPackage.EATTRIBUTE__RELATION_TABLE:
        setRelationTable(RELATION_TABLE_EDEFAULT);
        return;
      case EMapPackage.EATTRIBUTE__RELATION_COLUMN:
        setRelationColumn(RELATION_COLUMN_EDEFAULT);
        return;
      case EMapPackage.EATTRIBUTE__SIZE:
        setSize(SIZE_EDEFAULT);
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
      case EMapPackage.EATTRIBUTE__PK:
        return pk != PK_EDEFAULT;
      case EMapPackage.EATTRIBUTE__FORCED_FK:
        return forcedFk != FORCED_FK_EDEFAULT;
      case EMapPackage.EATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EMapPackage.EATTRIBUTE__COLUMN_NAME:
        return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
      case EMapPackage.EATTRIBUTE__VALUE_GENERATORS:
        return valueGenerators != null && !valueGenerators.isEmpty();
      case EMapPackage.EATTRIBUTE__RESOLVED:
        return resolved != RESOLVED_EDEFAULT;
      case EMapPackage.EATTRIBUTE__QUERY:
        return query != null;
      case EMapPackage.EATTRIBUTE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case EMapPackage.EATTRIBUTE__OPPOSITE:
        return opposite != null;
      case EMapPackage.EATTRIBUTE__RELATION_TABLE:
        return RELATION_TABLE_EDEFAULT == null ? relationTable != null : !RELATION_TABLE_EDEFAULT.equals(relationTable);
      case EMapPackage.EATTRIBUTE__RELATION_COLUMN:
        return RELATION_COLUMN_EDEFAULT == null ? relationColumn != null : !RELATION_COLUMN_EDEFAULT.equals(relationColumn);
      case EMapPackage.EATTRIBUTE__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
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
    result.append(" (pk: ");
    result.append(pk);
    result.append(", forcedFk: ");
    result.append(forcedFk);
    result.append(", name: ");
    result.append(name);
    result.append(", columnName: ");
    result.append(columnName);
    result.append(", resolved: ");
    result.append(resolved);
    result.append(", parameters: ");
    result.append(parameters);
    result.append(", relationTable: ");
    result.append(relationTable);
    result.append(", relationColumn: ");
    result.append(relationColumn);
    result.append(", size: ");
    result.append(size);
    result.append(')');
    return result.toString();
  }

} //EAttributeImpl

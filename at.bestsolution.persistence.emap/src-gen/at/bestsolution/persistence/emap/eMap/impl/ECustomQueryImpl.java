/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.ECustomQuery;
import at.bestsolution.persistence.emap.eMap.EMapPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECustom Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ECustomQueryImpl#getDbType <em>Db Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ECustomQueryImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ECustomQueryImpl#getFrom <em>From</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ECustomQueryImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ECustomQueryImpl#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ECustomQueryImpl#getOrderby <em>Orderby</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ECustomQueryImpl#getAll <em>All</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECustomQueryImpl extends MinimalEObjectImpl.Container implements ECustomQuery
{
  /**
   * The default value of the '{@link #getDbType() <em>Db Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbType()
   * @generated
   * @ordered
   */
  protected static final String DB_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbType() <em>Db Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbType()
   * @generated
   * @ordered
   */
  protected String dbType = DB_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected static final String COLUMNS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected String columns = COLUMNS_EDEFAULT;

  /**
   * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected static final String FROM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected String from = FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getWhere() <em>Where</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected static final String WHERE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWhere() <em>Where</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected String where = WHERE_EDEFAULT;

  /**
   * The default value of the '{@link #getGroupBy() <em>Group By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupBy()
   * @generated
   * @ordered
   */
  protected static final String GROUP_BY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroupBy() <em>Group By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupBy()
   * @generated
   * @ordered
   */
  protected String groupBy = GROUP_BY_EDEFAULT;

  /**
   * The default value of the '{@link #getOrderby() <em>Orderby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderby()
   * @generated
   * @ordered
   */
  protected static final String ORDERBY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrderby() <em>Orderby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderby()
   * @generated
   * @ordered
   */
  protected String orderby = ORDERBY_EDEFAULT;

  /**
   * The default value of the '{@link #getAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAll()
   * @generated
   * @ordered
   */
  protected static final String ALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAll()
   * @generated
   * @ordered
   */
  protected String all = ALL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ECustomQueryImpl()
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
    return EMapPackage.Literals.ECUSTOM_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbType()
  {
    return dbType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbType(String newDbType)
  {
    String oldDbType = dbType;
    dbType = newDbType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ECUSTOM_QUERY__DB_TYPE, oldDbType, dbType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColumns()
  {
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumns(String newColumns)
  {
    String oldColumns = columns;
    columns = newColumns;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ECUSTOM_QUERY__COLUMNS, oldColumns, columns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(String newFrom)
  {
    String oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ECUSTOM_QUERY__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWhere()
  {
    return where;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhere(String newWhere)
  {
    String oldWhere = where;
    where = newWhere;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ECUSTOM_QUERY__WHERE, oldWhere, where));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroupBy()
  {
    return groupBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupBy(String newGroupBy)
  {
    String oldGroupBy = groupBy;
    groupBy = newGroupBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ECUSTOM_QUERY__GROUP_BY, oldGroupBy, groupBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrderby()
  {
    return orderby;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrderby(String newOrderby)
  {
    String oldOrderby = orderby;
    orderby = newOrderby;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ECUSTOM_QUERY__ORDERBY, oldOrderby, orderby));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAll()
  {
    return all;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAll(String newAll)
  {
    String oldAll = all;
    all = newAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ECUSTOM_QUERY__ALL, oldAll, all));
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
      case EMapPackage.ECUSTOM_QUERY__DB_TYPE:
        return getDbType();
      case EMapPackage.ECUSTOM_QUERY__COLUMNS:
        return getColumns();
      case EMapPackage.ECUSTOM_QUERY__FROM:
        return getFrom();
      case EMapPackage.ECUSTOM_QUERY__WHERE:
        return getWhere();
      case EMapPackage.ECUSTOM_QUERY__GROUP_BY:
        return getGroupBy();
      case EMapPackage.ECUSTOM_QUERY__ORDERBY:
        return getOrderby();
      case EMapPackage.ECUSTOM_QUERY__ALL:
        return getAll();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EMapPackage.ECUSTOM_QUERY__DB_TYPE:
        setDbType((String)newValue);
        return;
      case EMapPackage.ECUSTOM_QUERY__COLUMNS:
        setColumns((String)newValue);
        return;
      case EMapPackage.ECUSTOM_QUERY__FROM:
        setFrom((String)newValue);
        return;
      case EMapPackage.ECUSTOM_QUERY__WHERE:
        setWhere((String)newValue);
        return;
      case EMapPackage.ECUSTOM_QUERY__GROUP_BY:
        setGroupBy((String)newValue);
        return;
      case EMapPackage.ECUSTOM_QUERY__ORDERBY:
        setOrderby((String)newValue);
        return;
      case EMapPackage.ECUSTOM_QUERY__ALL:
        setAll((String)newValue);
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
      case EMapPackage.ECUSTOM_QUERY__DB_TYPE:
        setDbType(DB_TYPE_EDEFAULT);
        return;
      case EMapPackage.ECUSTOM_QUERY__COLUMNS:
        setColumns(COLUMNS_EDEFAULT);
        return;
      case EMapPackage.ECUSTOM_QUERY__FROM:
        setFrom(FROM_EDEFAULT);
        return;
      case EMapPackage.ECUSTOM_QUERY__WHERE:
        setWhere(WHERE_EDEFAULT);
        return;
      case EMapPackage.ECUSTOM_QUERY__GROUP_BY:
        setGroupBy(GROUP_BY_EDEFAULT);
        return;
      case EMapPackage.ECUSTOM_QUERY__ORDERBY:
        setOrderby(ORDERBY_EDEFAULT);
        return;
      case EMapPackage.ECUSTOM_QUERY__ALL:
        setAll(ALL_EDEFAULT);
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
      case EMapPackage.ECUSTOM_QUERY__DB_TYPE:
        return DB_TYPE_EDEFAULT == null ? dbType != null : !DB_TYPE_EDEFAULT.equals(dbType);
      case EMapPackage.ECUSTOM_QUERY__COLUMNS:
        return COLUMNS_EDEFAULT == null ? columns != null : !COLUMNS_EDEFAULT.equals(columns);
      case EMapPackage.ECUSTOM_QUERY__FROM:
        return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
      case EMapPackage.ECUSTOM_QUERY__WHERE:
        return WHERE_EDEFAULT == null ? where != null : !WHERE_EDEFAULT.equals(where);
      case EMapPackage.ECUSTOM_QUERY__GROUP_BY:
        return GROUP_BY_EDEFAULT == null ? groupBy != null : !GROUP_BY_EDEFAULT.equals(groupBy);
      case EMapPackage.ECUSTOM_QUERY__ORDERBY:
        return ORDERBY_EDEFAULT == null ? orderby != null : !ORDERBY_EDEFAULT.equals(orderby);
      case EMapPackage.ECUSTOM_QUERY__ALL:
        return ALL_EDEFAULT == null ? all != null : !ALL_EDEFAULT.equals(all);
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
    result.append(" (dbType: ");
    result.append(dbType);
    result.append(", columns: ");
    result.append(columns);
    result.append(", from: ");
    result.append(from);
    result.append(", where: ");
    result.append(where);
    result.append(", groupBy: ");
    result.append(groupBy);
    result.append(", orderby: ");
    result.append(orderby);
    result.append(", all: ");
    result.append(all);
    result.append(')');
    return result.toString();
  }

} //ECustomQueryImpl

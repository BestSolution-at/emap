/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.ESQLDbType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESQL Db Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ESQLDbTypeImpl#getDbType <em>Db Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ESQLDbTypeImpl#getSqlTypeDef <em>Sql Type Def</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.ESQLDbTypeImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESQLDbTypeImpl extends MinimalEObjectImpl.Container implements ESQLDbType
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
   * The default value of the '{@link #getSqlTypeDef() <em>Sql Type Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSqlTypeDef()
   * @generated
   * @ordered
   */
  protected static final String SQL_TYPE_DEF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSqlTypeDef() <em>Sql Type Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSqlTypeDef()
   * @generated
   * @ordered
   */
  protected String sqlTypeDef = SQL_TYPE_DEF_EDEFAULT;

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
  protected ESQLDbTypeImpl()
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
    return EMapPackage.Literals.ESQL_DB_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESQL_DB_TYPE__DB_TYPE, oldDbType, dbType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSqlTypeDef()
  {
    return sqlTypeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSqlTypeDef(String newSqlTypeDef)
  {
    String oldSqlTypeDef = sqlTypeDef;
    sqlTypeDef = newSqlTypeDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESQL_DB_TYPE__SQL_TYPE_DEF, oldSqlTypeDef, sqlTypeDef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.ESQL_DB_TYPE__SIZE, oldSize, size));
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
      case EMapPackage.ESQL_DB_TYPE__DB_TYPE:
        return getDbType();
      case EMapPackage.ESQL_DB_TYPE__SQL_TYPE_DEF:
        return getSqlTypeDef();
      case EMapPackage.ESQL_DB_TYPE__SIZE:
        return getSize();
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
      case EMapPackage.ESQL_DB_TYPE__DB_TYPE:
        setDbType((String)newValue);
        return;
      case EMapPackage.ESQL_DB_TYPE__SQL_TYPE_DEF:
        setSqlTypeDef((String)newValue);
        return;
      case EMapPackage.ESQL_DB_TYPE__SIZE:
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
      case EMapPackage.ESQL_DB_TYPE__DB_TYPE:
        setDbType(DB_TYPE_EDEFAULT);
        return;
      case EMapPackage.ESQL_DB_TYPE__SQL_TYPE_DEF:
        setSqlTypeDef(SQL_TYPE_DEF_EDEFAULT);
        return;
      case EMapPackage.ESQL_DB_TYPE__SIZE:
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
      case EMapPackage.ESQL_DB_TYPE__DB_TYPE:
        return DB_TYPE_EDEFAULT == null ? dbType != null : !DB_TYPE_EDEFAULT.equals(dbType);
      case EMapPackage.ESQL_DB_TYPE__SQL_TYPE_DEF:
        return SQL_TYPE_DEF_EDEFAULT == null ? sqlTypeDef != null : !SQL_TYPE_DEF_EDEFAULT.equals(sqlTypeDef);
      case EMapPackage.ESQL_DB_TYPE__SIZE:
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
    result.append(" (dbType: ");
    result.append(dbType);
    result.append(", sqlTypeDef: ");
    result.append(sqlTypeDef);
    result.append(", size: ");
    result.append(size);
    result.append(')');
    return result.toString();
  }

} //ESQLDbTypeImpl

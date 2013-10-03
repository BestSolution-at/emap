/**
 */
package at.bestsolution.persistence.emap.eMap.impl;

import at.bestsolution.persistence.emap.eMap.EMapPackage;
import at.bestsolution.persistence.emap.eMap.EValueGenerator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EValue Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EValueGeneratorImpl#getDbType <em>Db Type</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EValueGeneratorImpl#isAutokey <em>Autokey</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EValueGeneratorImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.eMap.impl.EValueGeneratorImpl#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EValueGeneratorImpl extends MinimalEObjectImpl.Container implements EValueGenerator
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
   * The default value of the '{@link #isAutokey() <em>Autokey</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutokey()
   * @generated
   * @ordered
   */
  protected static final boolean AUTOKEY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAutokey() <em>Autokey</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutokey()
   * @generated
   * @ordered
   */
  protected boolean autokey = AUTOKEY_EDEFAULT;

  /**
   * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected static final String QUERY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected String query = QUERY_EDEFAULT;

  /**
   * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequence()
   * @generated
   * @ordered
   */
  protected static final String SEQUENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequence()
   * @generated
   * @ordered
   */
  protected String sequence = SEQUENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EValueGeneratorImpl()
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
    return EMapPackage.Literals.EVALUE_GENERATOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EVALUE_GENERATOR__DB_TYPE, oldDbType, dbType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAutokey()
  {
    return autokey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutokey(boolean newAutokey)
  {
    boolean oldAutokey = autokey;
    autokey = newAutokey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EVALUE_GENERATOR__AUTOKEY, oldAutokey, autokey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(String newQuery)
  {
    String oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EVALUE_GENERATOR__QUERY, oldQuery, query));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSequence()
  {
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSequence(String newSequence)
  {
    String oldSequence = sequence;
    sequence = newSequence;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EMapPackage.EVALUE_GENERATOR__SEQUENCE, oldSequence, sequence));
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
      case EMapPackage.EVALUE_GENERATOR__DB_TYPE:
        return getDbType();
      case EMapPackage.EVALUE_GENERATOR__AUTOKEY:
        return isAutokey();
      case EMapPackage.EVALUE_GENERATOR__QUERY:
        return getQuery();
      case EMapPackage.EVALUE_GENERATOR__SEQUENCE:
        return getSequence();
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
      case EMapPackage.EVALUE_GENERATOR__DB_TYPE:
        setDbType((String)newValue);
        return;
      case EMapPackage.EVALUE_GENERATOR__AUTOKEY:
        setAutokey((Boolean)newValue);
        return;
      case EMapPackage.EVALUE_GENERATOR__QUERY:
        setQuery((String)newValue);
        return;
      case EMapPackage.EVALUE_GENERATOR__SEQUENCE:
        setSequence((String)newValue);
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
      case EMapPackage.EVALUE_GENERATOR__DB_TYPE:
        setDbType(DB_TYPE_EDEFAULT);
        return;
      case EMapPackage.EVALUE_GENERATOR__AUTOKEY:
        setAutokey(AUTOKEY_EDEFAULT);
        return;
      case EMapPackage.EVALUE_GENERATOR__QUERY:
        setQuery(QUERY_EDEFAULT);
        return;
      case EMapPackage.EVALUE_GENERATOR__SEQUENCE:
        setSequence(SEQUENCE_EDEFAULT);
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
      case EMapPackage.EVALUE_GENERATOR__DB_TYPE:
        return DB_TYPE_EDEFAULT == null ? dbType != null : !DB_TYPE_EDEFAULT.equals(dbType);
      case EMapPackage.EVALUE_GENERATOR__AUTOKEY:
        return autokey != AUTOKEY_EDEFAULT;
      case EMapPackage.EVALUE_GENERATOR__QUERY:
        return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
      case EMapPackage.EVALUE_GENERATOR__SEQUENCE:
        return SEQUENCE_EDEFAULT == null ? sequence != null : !SEQUENCE_EDEFAULT.equals(sequence);
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
    result.append(", autokey: ");
    result.append(autokey);
    result.append(", query: ");
    result.append(query);
    result.append(", sequence: ");
    result.append(sequence);
    result.append(')');
    return result.toString();
  }

} //EValueGeneratorImpl

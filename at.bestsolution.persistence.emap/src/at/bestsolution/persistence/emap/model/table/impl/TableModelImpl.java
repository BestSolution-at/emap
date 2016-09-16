/**
 */
package at.bestsolution.persistence.emap.model.table.impl;

import at.bestsolution.persistence.emap.eMap.EMappingBundle;
import at.bestsolution.persistence.emap.model.table.Table;
import at.bestsolution.persistence.emap.model.table.TableModel;
import at.bestsolution.persistence.emap.model.table.TablePackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.impl.TableModelImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.impl.TableModelImpl#getNmTables <em>Nm Tables</em>}</li>
 *   <li>{@link at.bestsolution.persistence.emap.model.table.impl.TableModelImpl#getMappedBundle <em>Mapped Bundle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableModelImpl extends MinimalEObjectImpl.Container implements TableModel {
	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> tables;

	/**
	 * The cached value of the '{@link #getNmTables() <em>Nm Tables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNmTables()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> nmTables;

	/**
	 * The cached value of the '{@link #getMappedBundle() <em>Mapped Bundle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedBundle()
	 * @generated
	 * @ordered
	 */
	protected EMappingBundle mappedBundle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.Literals.TABLE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentEList<Table>(Table.class, this, TablePackage.TABLE_MODEL__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getNmTables() {
		if (nmTables == null) {
			nmTables = new EObjectResolvingEList<Table>(Table.class, this, TablePackage.TABLE_MODEL__NM_TABLES);
		}
		return nmTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMappingBundle getMappedBundle() {
		if (mappedBundle != null && mappedBundle.eIsProxy()) {
			InternalEObject oldMappedBundle = (InternalEObject)mappedBundle;
			mappedBundle = (EMappingBundle)eResolveProxy(oldMappedBundle);
			if (mappedBundle != oldMappedBundle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.TABLE_MODEL__MAPPED_BUNDLE, oldMappedBundle, mappedBundle));
			}
		}
		return mappedBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMappingBundle basicGetMappedBundle() {
		return mappedBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedBundle(EMappingBundle newMappedBundle) {
		EMappingBundle oldMappedBundle = mappedBundle;
		mappedBundle = newMappedBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_MODEL__MAPPED_BUNDLE, oldMappedBundle, mappedBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.TABLE_MODEL__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.TABLE_MODEL__TABLES:
				return getTables();
			case TablePackage.TABLE_MODEL__NM_TABLES:
				return getNmTables();
			case TablePackage.TABLE_MODEL__MAPPED_BUNDLE:
				if (resolve) return getMappedBundle();
				return basicGetMappedBundle();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TablePackage.TABLE_MODEL__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends Table>)newValue);
				return;
			case TablePackage.TABLE_MODEL__NM_TABLES:
				getNmTables().clear();
				getNmTables().addAll((Collection<? extends Table>)newValue);
				return;
			case TablePackage.TABLE_MODEL__MAPPED_BUNDLE:
				setMappedBundle((EMappingBundle)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case TablePackage.TABLE_MODEL__TABLES:
				getTables().clear();
				return;
			case TablePackage.TABLE_MODEL__NM_TABLES:
				getNmTables().clear();
				return;
			case TablePackage.TABLE_MODEL__MAPPED_BUNDLE:
				setMappedBundle((EMappingBundle)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TablePackage.TABLE_MODEL__TABLES:
				return tables != null && !tables.isEmpty();
			case TablePackage.TABLE_MODEL__NM_TABLES:
				return nmTables != null && !nmTables.isEmpty();
			case TablePackage.TABLE_MODEL__MAPPED_BUNDLE:
				return mappedBundle != null;
		}
		return super.eIsSet(featureID);
	}

} //TableModelImpl

/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.java;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.persistence.Callback;
import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.Session;

public interface JavaSession extends Session {
	public Connection checkoutConnection();
	public void returnConnection(Connection connection);
	public String getDatabaseType();
	public DatabaseSupport getDatabaseSupport();
	public SessionCache getCache();
	public ProxyFactory getProxyFactory();
	public Object convertType(Class<?> targetType, Object value);
	public Blob handleBlob(String tableName, String blobColumnName, String idColumnName, ResultSet set) throws SQLException;
	public boolean isTransaction();
	public Transaction getTransaction();
	public void scheduleRelationSQL(RelationSQL sql);
	
	public void scheduleAfterTransaction(AfterTxRunnable r);
	public <O, P> P getPrimaryKey(ObjectMapper<O> mapper, O object);
	public <O, P> void registerPrimaryKey(O object, P key);
	
	public void registerObject(Object object, Object id, long version);
	public void updateVersion(Object object, Object id, long version);
	public void unregisterObject(Object object, Object id);
	public List<ChangeDescription> getChangeDescription(Object object);
	public void clearChangeDescription(Object object);
	public Boolean runWithoutChangeTracking(Callback<Boolean> runnable);

	public interface ChangeDescription {
		public EStructuralFeature getFeature();
		public List<Object> getAdditions();
		public List<Object> getRemovals();
		public Object getNewValue();
		public Object geOldValue();
	}
}
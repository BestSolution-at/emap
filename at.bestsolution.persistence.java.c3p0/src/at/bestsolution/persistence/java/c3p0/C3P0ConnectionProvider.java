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
package at.bestsolution.persistence.java.c3p0;

import java.beans.PropertyVetoException;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import at.bestsolution.persistence.java.JDBCConfiguration;
import at.bestsolution.persistence.java.JDBCConnectionProvider;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0ConnectionProvider implements JDBCConnectionProvider {

	private Map<String,ComboPooledDataSource> cpds = new HashMap<String, ComboPooledDataSource>();
	private List<JDBCConfiguration> configurationList = new ArrayList<JDBCConfiguration>();
	
	private Map<String, C3P0BlobCreator> blobCreators = new HashMap<String, C3P0BlobCreator>();

	public void registerJDBCConfiguration(JDBCConfiguration configuration) {
		synchronized (configurationList) {
			this.configurationList.add(configuration);
		}
		
	}

	public void unregisterJDBCConfiguration(JDBCConfiguration configuration) {
		synchronized (configurationList) {
			this.configurationList.remove(configuration);	
		}
		
	}
	
	public void registerBlobCreator(C3P0BlobCreator creator) {
		synchronized (blobCreators) {
			blobCreators.put(creator.getDatabaseType(), creator);
		}
	}
	
	private JDBCConfiguration getConfiguration(String configurationId) throws SQLException {
		synchronized (configurationList) {
			for( JDBCConfiguration c : configurationList ) {
				if( c.getId().equals(configurationId) ) {
					return c;
				}
			}
		}
		throw new SQLException("Unknown database configuration '"+configurationId+"'");
	}
	
	@Override
	public Blob createTempBlob(String configurationId, Connection connection) throws SQLException {
		C3P0BlobCreator c;
		synchronized (blobCreators) {
			c = blobCreators.get(getConfiguration(configurationId).getDatabaseType());	
		}
		
		if( c != null ) {
			return c.createBlob(connection);
		}
		
		return connection.createBlob();
	}
	
	@Override
	public Clob createTempClob(String configurationId, Connection connection) throws SQLException {
		C3P0BlobCreator c;
		synchronized (blobCreators) {
			c = blobCreators.get(getConfiguration(configurationId).getDatabaseType());	
		}
		
		if( c != null ) {
			return c.createClob(connection);
		}
		
		return connection.createClob();
	}
	
	@Override
	public void releaseTempBlob(String configurationId, Connection connection, Blob blob)
			throws SQLException {
		C3P0BlobCreator c;
		synchronized (blobCreators) {
			c = blobCreators.get(getConfiguration(configurationId).getDatabaseType());	
		}
		
		if( c != null ) {
			c.releaseBlob(connection, blob);
		} else {
			blob.free();
		}
	}
	
	@Override
	public void releaseTempClob(String configurationId, Connection connection, Clob clob)
			throws SQLException {
		C3P0BlobCreator c;
		synchronized (blobCreators) {
			c = blobCreators.get(getConfiguration(configurationId).getDatabaseType());	
		}
		
		if( c != null ) {
			c.releaseClob(connection, clob);
		} else {
			clob.free();
		}
	}

	private synchronized ComboPooledDataSource initPool(String configurationId) throws SQLException {
		ComboPooledDataSource cpds = this.cpds.get(configurationId);
		if( cpds != null ) {
			return cpds;
		}

		cpds = new ComboPooledDataSource();
		JDBCConfiguration configuration = getConfiguration(configurationId);
		try {
			cpds.setDriverClass( configuration.getJDBCDriver().getName() );
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cpds.setJdbcUrl( configuration.getConnectionURL() );
		cpds.setUser(configuration.getUsername());
		cpds.setPassword(configuration.getPassword());

		cpds.setMinPoolSize(5);
		cpds.setAcquireIncrement(5);
		cpds.setMaxPoolSize(20);
		this.cpds.put(configurationId, cpds);
		return cpds;
	}

	@Override
	public String getDatabaseType(String configurationId) {
		try {
			return getConfiguration(configurationId).getDatabaseType();
		} catch (SQLException e) {
			throw new IllegalArgumentException("There's no configuration with the ID '"+configurationId+"'");
		}
	}

	@Override
	public Connection checkoutConnection(String configurationId) {
		try {
			return initPool(configurationId).getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void returnConnection(String configurationId, Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
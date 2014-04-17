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
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import at.bestsolution.persistence.java.JDBCConfiguration;
import at.bestsolution.persistence.java.JDBCConnectionProvider;

public class C3P0ConnectionProvider implements JDBCConnectionProvider {

	private ComboPooledDataSource cpds;
	private JDBCConfiguration configuration;

	public void registerJDBCConfiguration(JDBCConfiguration configuration) {
		this.configuration = configuration;
	}

	public void unregisterJDBCConfiguration(JDBCConfiguration configuration) {
		this.configuration = null;
	}

	private ComboPooledDataSource initPool() {
		if( cpds != null ) {
			return cpds;
		}

		cpds = new ComboPooledDataSource();
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
		return cpds;
	}

	@Override
	public String getDatabaseType() {
		return configuration.getDatabaseType();
	}

	@Override
	public Connection checkoutConnection() {
		try {
			return initPool().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void returnConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
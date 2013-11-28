package at.bestsolution.persistence.sample.app.impl;

import org.h2.Driver;

import at.bestsolution.persistence.java.JDBCConfiguration;

public class H2JDBCConfiguration implements JDBCConfiguration {

	@Override
	public String getUsername() {
		return "sample";
	}

	@Override
	public String getPassword() {
		return "sample";
	}

	@Override
	public String getConnectionURL() {
		return "jdbc:h2:~/sample";
	}

	@Override
	public Class<?> getJDBCDriver() {
		return Driver.class;
	}

	@Override
	public String getDatabaseType() {
		return "h2";
	}
	
}

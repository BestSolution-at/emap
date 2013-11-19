package at.bestsolution.persistence.java;

import java.sql.Connection;

public interface JDBCConnectionProvider {
	public String getDatabaseType();
	public Connection checkoutConnection();
	public void returnConnection(Connection connection);
}

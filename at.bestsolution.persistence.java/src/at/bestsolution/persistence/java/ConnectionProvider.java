package at.bestsolution.persistence.java;

import java.sql.Connection;

public interface ConnectionProvider {
	public Connection checkoutConnection();
	public void returnConnection(Connection connection);
}

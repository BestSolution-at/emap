package at.bestsolution.persistence.java;

import java.sql.Connection;

import at.bestsolution.persistence.Session;

public interface JavaSession extends Session {
	public Connection checkoutConnection();
	public void returnConnection(Connection connection);
	public String getDatabaseType();
	public SessionCache getCache();
	public ProxyFactory getProxyFactory();
}

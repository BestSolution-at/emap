package at.bestsolution.persistence.java;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}

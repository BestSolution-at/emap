package at.bestsolution.persistence.java;

public interface JDBCConfiguration {
	public String getUsername();
	public String getPassword();
	public String getConnectionURL();
	public Class<?> getJDBCDriver();
}

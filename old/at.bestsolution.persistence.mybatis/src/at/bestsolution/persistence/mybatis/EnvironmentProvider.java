package at.bestsolution.persistence.mybatis;

public interface EnvironmentProvider {
	public String getDatabaseType();
	public String getJDBCUrl();
	public String getDriverClass();
	public String getUsername();
	public String getPassword();
	public String getEnvironmentId();
}

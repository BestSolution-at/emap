package at.bestsolution.persistence.mybatis;

import org.apache.ibatis.mapping.Environment;

public interface EnvironmentProvider {
	public Environment getEnvironment();
	public String getDatabaseType();
}

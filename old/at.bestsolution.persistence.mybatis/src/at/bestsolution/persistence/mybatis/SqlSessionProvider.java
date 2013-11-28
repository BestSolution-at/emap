package at.bestsolution.persistence.mybatis;

import org.apache.ibatis.session.SqlSession;

public interface SqlSessionProvider {
	public SqlSession createSession();
}
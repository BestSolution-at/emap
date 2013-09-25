package at.bestsolution.persistence.mybatis.impl;

import org.apache.ibatis.session.SqlSession;

import at.bestsolution.persistence.Session;
import at.bestsolution.persistence.SessionFactory;
import at.bestsolution.persistence.mybatis.SqlSessionProvider;

public class SessionFactoryImpl implements SessionFactory {
	private SqlSessionProvider sqlSessionProvider;
	
	public void setSqlSessionProvider(SqlSessionProvider sqlSessionProvider) {
		this.sqlSessionProvider = sqlSessionProvider;
	}
	
	public void unsetSqlSessionProvider(SqlSessionProvider sqlSessionProvider) {
		this.sqlSessionProvider = null;
	}
	
	@Override
	public Session createSession() {
		return new SessionImpl(sqlSessionProvider.createSession());
	}

	static class SessionImpl implements Session  {
		private SqlSession session;
		
		public SessionImpl(SqlSession session) {
			this.session = session;
		}
		
		@Override
		public <O> O createMapper(Class<O> mapper) {
			O m = session.getMapper(mapper);
			//TODO We need to wrap this for inserts when we insert objects who are split in
			// multiple tables
			return m;
		}

		@Override
		public void close() {
			session.close();
			session = null;
		}
	}
}
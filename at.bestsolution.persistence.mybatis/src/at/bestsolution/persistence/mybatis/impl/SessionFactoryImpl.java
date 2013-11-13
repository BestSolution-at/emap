package at.bestsolution.persistence.mybatis.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.osgi.service.event.EventAdmin;

import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.Session;
import at.bestsolution.persistence.SessionFactory;
import at.bestsolution.persistence.mybatis.SqlSessionProvider;

public class SessionFactoryImpl implements SessionFactory {
	private SqlSessionProvider sqlSessionProvider;
	private EventAdmin eventAdmin;
	public static ThreadLocal<Connection> TRANSACTION_CONNECTION = new ThreadLocal<Connection>();
	private static final Logger LOGGER = Logger.getLogger(SessionFactoryImpl.class);

	public void setSqlSessionProvider(SqlSessionProvider sqlSessionProvider) {
		this.sqlSessionProvider = sqlSessionProvider;
	}

	public void unsetSqlSessionProvider(SqlSessionProvider sqlSessionProvider) {
		this.sqlSessionProvider = null;
	}

	public void setEventAdmin(EventAdmin eventAdmin) {
		this.eventAdmin = eventAdmin;
	}

	public void unsetEventAdmin(EventAdmin eventAdmin) {
		this.eventAdmin = null;
	}

	@Override
	public Session createSession() {
		return new SessionImpl(sqlSessionProvider.createSession());
	}

	class SessionImpl implements Session  {
		private SqlSession session;

		public SessionImpl(SqlSession session) {
			this.session = session;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <M extends ObjectMapper<?>> M createMapper(Class<M> mapper) {
			final M m = session.getMapper(mapper);
			//TODO We need to wrap this for inserts when we insert objects who are split in
			// multiple tables
			return (M) Proxy.newProxyInstance(mapper.getClassLoader(), new Class<?>[] {mapper}, new InvocationHandler() {

				@Override
				public Object invoke(Object proxy, Method method, Object[] args)
						throws Throwable {

					if( "update".equals(method.getName()) ) {
						if( TRANSACTION_CONNECTION.get() == null ) {
							throw new IllegalStateException("You can not execute an update outside of a transaction");
						}
					} else if( "insert".equals(method.getName()) ) {
						if( TRANSACTION_CONNECTION.get() == null ) {
							throw new IllegalStateException("You can not execute an insert outside of a transaction");
						}
					}

					return method.invoke(m, args);
				}
			});
		}

		@Override
		public void runInTransaction(Transaction transaction) {
			LOGGER.debug("Starting transaction");
			Connection connection = session.getConnection();
			TRANSACTION_CONNECTION.set(connection);
			try {
				if( transaction.execute() ) {
					LOGGER.debug("Committing transaction");
					connection.commit();
				} else {
					LOGGER.debug("Rollback transaction");
					connection.rollback();
				}
			} catch (Throwable e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					throw new RuntimeException("Unable to rollback thr transaction" , e);
				}
				throw new RuntimeException("An error occured while executing the transaction", e);
			} finally {
				TRANSACTION_CONNECTION.set(null);
				try {
					connection.close();
				} catch (SQLException e) {
					throw new RuntimeException("Unable to close connection", e);
				}
			}
		}

		@Override
		public void close() {
			session.close();
			session = null;
		}
	}
}
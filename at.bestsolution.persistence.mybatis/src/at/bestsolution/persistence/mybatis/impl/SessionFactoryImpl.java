package at.bestsolution.persistence.mybatis.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;

import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.Session;
import at.bestsolution.persistence.SessionFactory;
import at.bestsolution.persistence.mybatis.SqlSessionProvider;

public class SessionFactoryImpl implements SessionFactory {
	private SqlSessionProvider sqlSessionProvider;
	private EventAdmin eventAdmin;
	public static ThreadLocal<Stack<Connection>> TRANSACTION_CONNECTION = new ThreadLocal<Stack<Connection>>();
	public static ThreadLocal<Boolean> TRANSACTION_CONNECTION_RETRIEVAL = new ThreadLocal<Boolean>();
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
		private String id = UUID.randomUUID().toString();

		@Override
		public String getId() {
			return id;
		}

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

			Connection connection;
			// Make sure when we are in a nested transaction that it gets a new
			// connection
			try {
				TRANSACTION_CONNECTION_RETRIEVAL.set(Boolean.TRUE);
				connection = session.getConnection();
			} finally {
				TRANSACTION_CONNECTION_RETRIEVAL.set(Boolean.FALSE);
			}

			LOGGER.debug("Connection fetched");
			if( TRANSACTION_CONNECTION.get() == null ) {
				TRANSACTION_CONNECTION.set(new Stack<Connection>());
			}
			TRANSACTION_CONNECTION.get().push(connection);
			try {
				if( eventAdmin != null ) {
					Map<String, String> data = new HashMap<String, String>();
					data.put(Session.DATA_SESSION_ID_TOPIC_TRANSACTION_START, getId());
					eventAdmin.sendEvent(new Event("at/bestsolution/persistence/transaction/start", data));
				}
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
				Stack<Connection> stack = TRANSACTION_CONNECTION.get();
				stack.pop();
				if( stack.isEmpty() ) {
					TRANSACTION_CONNECTION.set(null);
				}
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
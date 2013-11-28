package sample.java;

import sample.PersonMapper;
import at.bestsolution.persistence.java.ObjectMapperFactory;
import at.bestsolution.persistence.java.JavaSession;
import at.bestsolution.persistence.java.Util;
import at.bestsolution.persistence.java.Util.ProcessedSQL;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import at.bestsolution.persistence.PersistanceException;
import sample.SampleFactory;
import sample.Person;
import at.bestsolution.persistence.model.ResolveDelegate;
import at.bestsolution.persistence.model.LazyEObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import at.bestsolution.persistence.java.Util;
import at.bestsolution.persistence.java.DatabaseSupport.QueryBuilder;
import org.apache.log4j.Logger;

public final class PersonMapperFactory implements ObjectMapperFactory<sample.PersonMapper,sample.Person> {
	@Override
	public sample.PersonMapper createMapper(JavaSession session) {
		return new PersonMapperImpl(session);
	}

	final static class PersonMapperImpl implements PersonMapper, ResolveDelegate {
		private final JavaSession session;
		private boolean inAutoResolve;
		private static final Logger LOGGER = Logger.getLogger(PersonMapperImpl.class);

		public PersonMapperImpl(JavaSession session) {
			this.session = session;
		}

		@Override
		public sample.Person selectById(long id) {
			boolean isDebug = LOGGER.isDebugEnabled();
			LOGGER.debug("Executing selectById");
			String query = Util.loadFile(getClass(), "Person_selectById_"+session.getDatabaseType()+".sql");
			if( query == null ) {
				query = Util.loadFile(getClass(), "Person_selectById_default.sql");
			}

			if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

			Connection connection = session.checkoutConnection();
			try {

				final ProcessedSQL processedSQL = Util.processSQL(query);
				if( isDebug ) {
					LOGGER.debug("	Processed-Query: " + processedSQL.sql);
				}

				if( isDebug ) LOGGER.debug("Preparing query");
				final PreparedStatement pStmt = connection.prepareStatement(processedSQL.sql);

				List<String> debugParams = new ArrayList<String>();
				for(int i = 0; i < processedSQL.dynamicParameterNames.size(); i++) {
					if( "id".equals(processedSQL.dynamicParameterNames.get(i)) ) {
						if( isDebug ) {
							debugParams.add("id = " + id);
						}
						pStmt.setLong(i+1,id);
					}
				}
				if( isDebug ) {
					LOGGER.debug(" Dynamic-Parameters: " + debugParams);
				}
				if( isDebug ) LOGGER.debug("Executing query");
				ResultSet set = pStmt.executeQuery();

				final Person rv;
				if( set.next() ) {
					rv = map_default_Person(set);
				} else {
					rv = null;
				}

				return rv;
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
		}

		@Override
		public java.util.List<sample.Person> selectAllForContactBook(long contactBookId) {
			boolean isDebug = LOGGER.isDebugEnabled();
			LOGGER.debug("Executing selectAllForContactBook");
			String query = Util.loadFile(getClass(), "Person_selectAllForContactBook_"+session.getDatabaseType()+".sql");
			if( query == null ) {
				query = Util.loadFile(getClass(), "Person_selectAllForContactBook_default.sql");
			}

			if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

			Connection connection = session.checkoutConnection();
			try {

				final ProcessedSQL processedSQL = Util.processSQL(query);
				if( isDebug ) {
					LOGGER.debug("	Processed-Query: " + processedSQL.sql);
				}

				if( isDebug ) LOGGER.debug("Preparing query");
				final PreparedStatement pStmt = connection.prepareStatement(processedSQL.sql);

				List<String> debugParams = new ArrayList<String>();
				for(int i = 0; i < processedSQL.dynamicParameterNames.size(); i++) {
					if( "contactBookId".equals(processedSQL.dynamicParameterNames.get(i)) ) {
						if( isDebug ) {
							debugParams.add("contactBookId = " + contactBookId);
						}
						pStmt.setLong(i+1,contactBookId);
					}
				}
				if( isDebug ) {
					LOGGER.debug(" Dynamic-Parameters: " + debugParams);
				}
				if( isDebug ) LOGGER.debug("Executing query");
				ResultSet set = pStmt.executeQuery();

				final List<Person> rv = new ArrayList<Person>();
				if( isDebug ) LOGGER.debug("Mapping results started");
				while(set.next()) {
					rv.add(map_default_Person(set));
				}
				if( isDebug ) LOGGER.debug("Mapping results ended. Mapped '"+rv.size()+"' objects.");

				return rv;
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
		}

		@Override
		public java.util.List<sample.Person> selectAll() {
			boolean isDebug = LOGGER.isDebugEnabled();
			LOGGER.debug("Executing selectAll");
			String query = Util.loadFile(getClass(), "Person_selectAll_"+session.getDatabaseType()+".sql");
			if( query == null ) {
				query = Util.loadFile(getClass(), "Person_selectAll_default.sql");
			}

			if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

			Connection connection = session.checkoutConnection();
			try {

				if( isDebug ) LOGGER.debug("Preparing query");
				final PreparedStatement pStmt = connection.prepareStatement(query);
				if( isDebug ) LOGGER.debug("Executing query");
				ResultSet set = pStmt.executeQuery();

				final List<Person> rv = new ArrayList<Person>();
				if( isDebug ) LOGGER.debug("Mapping results started");
				while(set.next()) {
					rv.add(map_default_Person(set));
				}
				if( isDebug ) LOGGER.debug("Mapping results ended. Mapped '"+rv.size()+"' objects.");

				return rv;
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
		}


		public Person map_default_Person(ResultSet set) throws SQLException {
			Object id = set.getObject("P_ID");
			EClass eClass = sample.SamplePackage.eINSTANCE.getPerson();
			Person rv = session.getCache().getObject(eClass,id);
			if( rv != null ) {
				return rv;
			}
			rv = session.getProxyFactory().createProxy(eClass);
			rv.setId(set.getLong("P_ID"));
			rv.setLastname(set.getString("P_LASTNAME"));
			rv.setFirstname(set.getString("P_FIRSTNAME"));
			((LazyEObject)rv).setProxyDelegate(this);
			session.getCache().putObject((EObject)rv,id);
			return rv;
		}

		@Override
		public void update(Person object) {
			QueryBuilder b = session.getDatabaseSupport().createQueryBuilder("PERSON");
			final LazyEObject leo = object instanceof LazyEObject ? (LazyEObject)object : null;
			b.addColumn("P_FIRSTNAME", "firstname");
			b.addColumn("P_LASTNAME", "lastname");
			ProcessedSQL psql = b.buildUpdate("P_ID","id");
			Connection connection = session.checkoutConnection();
			try {
				PreparedStatement pstmt = connection.prepareStatement(psql.sql);
				for( int i = 0; i < psql.dynamicParameterNames.size(); i++ ) {
					if("firstname".equals(psql.dynamicParameterNames.get(i))) {
						pstmt.setString(i+1,object.getFirstname());
					}
					if("lastname".equals(psql.dynamicParameterNames.get(i))) {
						pstmt.setString(i+1,object.getLastname());
					}
				}
				pstmt.execute();
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
		}

		@Override
		public void insert(Person object) {
			QueryBuilder b = session.getDatabaseSupport().createQueryBuilder("PERSON");
			b.addColumn("P_FIRSTNAME", "firstname");
			b.addColumn("P_LASTNAME", "lastname");
			b.addColumn("e_version","##e_version##");
			ProcessedSQL psql = null;

			Connection connection = session.checkoutConnection();
			try {
				PreparedStatement pstmt = connection.prepareStatement(psql.sql);
				for( int i = 0; i < psql.dynamicParameterNames.size(); i++ ) {
					if( "##e_version##".equals(psql.dynamicParameterNames.get(i)) ) {
						pstmt.setLong(i+1,0);
					}
					else if("firstname".equals(psql.dynamicParameterNames.get(i))) {
						pstmt.setString(i+1,object.getFirstname());
					}
					else if("lastname".equals(psql.dynamicParameterNames.get(i))) {
						pstmt.setString(i+1,object.getLastname());
					}
				}
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
		}

		public boolean resolve(LazyEObject eo, Object proxyData, EStructuralFeature f) {
			if( inAutoResolve ) {
				return true;
			}

			if(eo instanceof Person) {
				sample.Person target = (sample.Person)eo;
				switch(f.getFeatureID()) {
					case 3: {
						target.getAddressList().addAll(session.createMapper(sample.AddressMapper.class).selectAllForPerson(target.getId()));
						return true;
					}
					default : {
						return false;
					}
				}
			}
			return false;
		}
	}

	public NamedQuery<sample.Person> createNamedQuery(final JavaSession session, String name) {
		if( "selectById".equals(name) ) {
			return new NamedQuery<sample.Person>() {
				public List<sample.Person> queryForList(Object... parameters) {
					throw new UnsupportedOperationException("This is a single value query");
				}

				public sample.Person queryForOne(Object... parameters) {
					return createMapper(session).selectById(((Long)parameters[0]).longValue());
				}
			};
		}
		if( "selectAllForContactBook".equals(name) ) {
			return new NamedQuery<sample.Person>() {
				public List<sample.Person> queryForList(Object... parameters) {
					return createMapper(session).selectAllForContactBook(((Long)parameters[0]).longValue());
				}

				public sample.Person queryForOne(Object... parameters) {
					throw new UnsupportedOperationException("This is a list value query");
				}
			};
		}
		if( "selectAll".equals(name) ) {
			return new NamedQuery<sample.Person>() {
				public List<sample.Person> queryForList(Object... parameters) {
					return createMapper(session).selectAll();
				}

				public sample.Person queryForOne(Object... parameters) {
					throw new UnsupportedOperationException("This is a list value query");
				}
			};
		}
		throw new UnsupportedOperationException("Unknown query '"+getClass().getSimpleName()+"."+name+"'");
	}

}

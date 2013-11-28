package sample.java;

import sample.CountryMapper;
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
import sample.Country;
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

public final class CountryMapperFactory implements ObjectMapperFactory<sample.CountryMapper,sample.Country> {
	@Override
	public sample.CountryMapper createMapper(JavaSession session) {
		return new CountryMapperImpl(session);
	}

	final static class CountryMapperImpl implements CountryMapper, ResolveDelegate {
		private final JavaSession session;
		private boolean inAutoResolve;
		private static final Logger LOGGER = Logger.getLogger(CountryMapperImpl.class);

		public CountryMapperImpl(JavaSession session) {
			this.session = session;
		}

		@Override
		public sample.Country selectById(long id) {
			boolean isDebug = LOGGER.isDebugEnabled();
			LOGGER.debug("Executing selectById");
			String query = Util.loadFile(getClass(), "Country_selectById_"+session.getDatabaseType()+".sql");
			if( query == null ) {
				query = Util.loadFile(getClass(), "Country_selectById_default.sql");
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

				final Country rv;
				if( set.next() ) {
					rv = map_default_Country(set);
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


		public Country map_default_Country(ResultSet set) throws SQLException {
			Object id = set.getObject("CO_ID");
			EClass eClass = sample.SamplePackage.eINSTANCE.getCountry();
			Country rv = session.getCache().getObject(eClass,id);
			if( rv != null ) {
				return rv;
			}
			rv = session.getProxyFactory().createProxy(eClass);
			rv.setId(set.getLong("CO_ID"));
			rv.setName(set.getString("CO_NAME"));
			session.getCache().putObject((EObject)rv,id);
			return rv;
		}

		@Override
		public void update(Country object) {
			QueryBuilder b = session.getDatabaseSupport().createQueryBuilder("COUNTRY");
			final LazyEObject leo = object instanceof LazyEObject ? (LazyEObject)object : null;
			b.addColumn("CO_NAME", "name");
			ProcessedSQL psql = b.buildUpdate("CO_ID","id");
			Connection connection = session.checkoutConnection();
			try {
				PreparedStatement pstmt = connection.prepareStatement(psql.sql);
				for( int i = 0; i < psql.dynamicParameterNames.size(); i++ ) {
					if("name".equals(psql.dynamicParameterNames.get(i))) {
						pstmt.setString(i+1,object.getName());
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
		public void insert(Country object) {
			QueryBuilder b = session.getDatabaseSupport().createQueryBuilder("COUNTRY");
			b.addColumn("CO_NAME", "name");
			b.addColumn("e_version","##e_version##");
			ProcessedSQL psql = null;

			Connection connection = session.checkoutConnection();
			try {
				PreparedStatement pstmt = connection.prepareStatement(psql.sql);
				for( int i = 0; i < psql.dynamicParameterNames.size(); i++ ) {
					if( "##e_version##".equals(psql.dynamicParameterNames.get(i)) ) {
						pstmt.setLong(i+1,0);
					}
					else if("name".equals(psql.dynamicParameterNames.get(i))) {
						pstmt.setString(i+1,object.getName());
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

			if(eo instanceof Country) {
				sample.Country target = (sample.Country)eo;
			}
			return false;
		}
	}

	public NamedQuery<sample.Country> createNamedQuery(final JavaSession session, String name) {
		if( "selectById".equals(name) ) {
			return new NamedQuery<sample.Country>() {
				public List<sample.Country> queryForList(Object... parameters) {
					throw new UnsupportedOperationException("This is a single value query");
				}

				public sample.Country queryForOne(Object... parameters) {
					return createMapper(session).selectById(((Long)parameters[0]).longValue());
				}
			};
		}
		throw new UnsupportedOperationException("Unknown query '"+getClass().getSimpleName()+"."+name+"'");
	}

}

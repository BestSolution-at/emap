package sample.java;

import sample.ContactBookMapper;
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
import sample.ContactBook;
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

public final class ContactBookMapperFactory implements ObjectMapperFactory<sample.ContactBookMapper,sample.ContactBook> {
	@Override
	public sample.ContactBookMapper createMapper(JavaSession session) {
		return new ContactBookMapperImpl(session);
	}

	final static class ContactBookMapperImpl implements ContactBookMapper, ResolveDelegate {
		private final JavaSession session;
		private boolean inAutoResolve;
		private static final Logger LOGGER = Logger.getLogger(ContactBookMapperImpl.class);

		public ContactBookMapperImpl(JavaSession session) {
			this.session = session;
		}

		@Override
		public sample.ContactBook selectById(long id) {
			boolean isDebug = LOGGER.isDebugEnabled();
			LOGGER.debug("Executing selectById");
			String query = Util.loadFile(getClass(), "ContactBook_selectById_"+session.getDatabaseType()+".sql");
			if( query == null ) {
				query = Util.loadFile(getClass(), "ContactBook_selectById_default.sql");
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

				final ContactBook rv;
				if( set.next() ) {
					rv = map_default_ContactBook(set);
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


		public ContactBook map_default_ContactBook(ResultSet set) throws SQLException {
			Object id = set.getObject("CB_ID");
			EClass eClass = sample.SamplePackage.eINSTANCE.getContactBook();
			ContactBook rv = session.getCache().getObject(eClass,id);
			if( rv != null ) {
				return rv;
			}
			rv = session.getProxyFactory().createProxy(eClass);
			rv.setId(set.getLong("CB_ID"));
			session.getCache().putObject((EObject)rv,id);
			return rv;
		}

		@Override
		public void update(ContactBook object) {
			QueryBuilder b = session.getDatabaseSupport().createQueryBuilder("CONTACTBOOK");
			final LazyEObject leo = object instanceof LazyEObject ? (LazyEObject)object : null;
			ProcessedSQL psql = b.buildUpdate("CB_ID","id");
			Connection connection = session.checkoutConnection();
			try {
				PreparedStatement pstmt = connection.prepareStatement(psql.sql);
				for( int i = 0; i < psql.dynamicParameterNames.size(); i++ ) {
				}
				pstmt.execute();
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
		}

		@Override
		public void insert(ContactBook object) {
			QueryBuilder b = session.getDatabaseSupport().createQueryBuilder("CONTACTBOOK");
			b.addColumn("e_version","##e_version##");
			ProcessedSQL psql = null;

			Connection connection = session.checkoutConnection();
			try {
				PreparedStatement pstmt = connection.prepareStatement(psql.sql);
				for( int i = 0; i < psql.dynamicParameterNames.size(); i++ ) {
					if( "##e_version##".equals(psql.dynamicParameterNames.get(i)) ) {
						pstmt.setLong(i+1,0);
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

			if(eo instanceof ContactBook) {
				sample.ContactBook target = (sample.ContactBook)eo;
			}
			return false;
		}
	}

	public NamedQuery<sample.ContactBook> createNamedQuery(final JavaSession session, String name) {
		if( "selectById".equals(name) ) {
			return new NamedQuery<sample.ContactBook>() {
				public List<sample.ContactBook> queryForList(Object... parameters) {
					throw new UnsupportedOperationException("This is a single value query");
				}

				public sample.ContactBook queryForOne(Object... parameters) {
					return createMapper(session).selectById(((Long)parameters[0]).longValue());
				}
			};
		}
		throw new UnsupportedOperationException("Unknown query '"+getClass().getSimpleName()+"."+name+"'");
	}

}

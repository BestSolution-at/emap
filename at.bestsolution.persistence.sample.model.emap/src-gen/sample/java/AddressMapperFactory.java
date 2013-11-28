package sample.java;

import sample.AddressMapper;
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
import sample.Address;
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

public final class AddressMapperFactory implements ObjectMapperFactory<sample.AddressMapper,sample.Address> {
	@Override
	public sample.AddressMapper createMapper(JavaSession session) {
		return new AddressMapperImpl(session);
	}

	final static class AddressMapperImpl implements AddressMapper, ResolveDelegate {
		private final JavaSession session;
		private boolean inAutoResolve;
		private static final Logger LOGGER = Logger.getLogger(AddressMapperImpl.class);

		public AddressMapperImpl(JavaSession session) {
			this.session = session;
		}

		@Override
		public sample.Address selectById(long id) {
			boolean isDebug = LOGGER.isDebugEnabled();
			LOGGER.debug("Executing selectById");
			String query = Util.loadFile(getClass(), "Address_selectById_"+session.getDatabaseType()+".sql");
			if( query == null ) {
				query = Util.loadFile(getClass(), "Address_selectById_default.sql");
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

				final Address rv;
				if( set.next() ) {
					rv = map_default_Address(set);
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
		public java.util.List<sample.Address> selectAllForPerson(long personId) {
			boolean isDebug = LOGGER.isDebugEnabled();
			LOGGER.debug("Executing selectAllForPerson");
			String query = Util.loadFile(getClass(), "Address_selectAllForPerson_"+session.getDatabaseType()+".sql");
			if( query == null ) {
				query = Util.loadFile(getClass(), "Address_selectAllForPerson_default.sql");
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
					if( "personId".equals(processedSQL.dynamicParameterNames.get(i)) ) {
						if( isDebug ) {
							debugParams.add("personId = " + personId);
						}
						pStmt.setLong(i+1,personId);
					}
				}
				if( isDebug ) {
					LOGGER.debug(" Dynamic-Parameters: " + debugParams);
				}
				if( isDebug ) LOGGER.debug("Executing query");
				ResultSet set = pStmt.executeQuery();

				final List<Address> rv = new ArrayList<Address>();
				if( isDebug ) LOGGER.debug("Mapping results started");
				while(set.next()) {
					rv.add(map_default_Address(set));
				}
				if( isDebug ) LOGGER.debug("Mapping results ended. Mapped '"+rv.size()+"' objects.");

				return rv;
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
		}


		public Address map_default_Address(ResultSet set) throws SQLException {
			Object id = set.getObject("AD_ID");
			EClass eClass = sample.SamplePackage.eINSTANCE.getAddress();
			Address rv = session.getCache().getObject(eClass,id);
			if( rv != null ) {
				return rv;
			}
			rv = session.getProxyFactory().createProxy(eClass);
			rv.setId(set.getLong("AD_ID"));
			rv.setStreet(set.getString("AD_STREET"));
			rv.setCity(set.getString("AD_CITY"));
			rv.setZip(set.getString("AD_ZIP"));
			((LazyEObject)rv).setProxyData(new ProxyData_Address(set.getLong("AD_FK_PERSON"),set.getLong("AD_FK_COUNTRY")));
			((LazyEObject)rv).setProxyDelegate(this);
			session.getCache().putObject((EObject)rv,id);
			return rv;
		}

		@Override
		public void update(Address object) {
			QueryBuilder b = session.getDatabaseSupport().createQueryBuilder("ADDRESS");
			final LazyEObject leo = object instanceof LazyEObject ? (LazyEObject)object : null;
			b.addColumn("AD_CITY", "city");
			b.addColumn("AD_STREET", "street");
			b.addColumn("AD_ZIP", "zip");
			if( leo == null || leo.isResolved(sample.SamplePackage.eINSTANCE.getAddress_Country()) ) {
				b.addColumn("AD_FK_COUNTRY","country.id");
			}
			if( leo == null || leo.isResolved(sample.SamplePackage.eINSTANCE.getAddress_Person()) ) {
				b.addColumn("AD_FK_PERSON","person.id");
			}
			ProcessedSQL psql = b.buildUpdate("AD_ID","id");
			Connection connection = session.checkoutConnection();
			try {
				PreparedStatement pstmt = connection.prepareStatement(psql.sql);
				for( int i = 0; i < psql.dynamicParameterNames.size(); i++ ) {
					if("city".equals(psql.dynamicParameterNames.get(i))) {
						pstmt.setString(i+1,object.getCity());
					}
					if("street".equals(psql.dynamicParameterNames.get(i))) {
						pstmt.setString(i+1,object.getStreet());
					}
					if("zip".equals(psql.dynamicParameterNames.get(i))) {
						pstmt.setString(i+1,object.getZip());
					}
					if("country.id".equals(psql.dynamicParameterNames.get(i))) {
						if( object.getCountry() == null ) {
							pstmt.setObject(i+1,null);
						} else {
							pstmt.setLong(i+1,object.getCountry().getId());
						}
					}
					if("person.id".equals(psql.dynamicParameterNames.get(i))) {
						if( object.getPerson() == null ) {
							pstmt.setObject(i+1,null);
						} else {
							pstmt.setLong(i+1,object.getPerson().getId());
						}
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
		public void insert(Address object) {
			QueryBuilder b = session.getDatabaseSupport().createQueryBuilder("ADDRESS");
			b.addColumn("AD_CITY", "city");
			b.addColumn("AD_STREET", "street");
			b.addColumn("AD_ZIP", "zip");
			b.addColumn("AD_FK_COUNTRY","country.id");
			b.addColumn("AD_FK_PERSON","person.id");
			b.addColumn("e_version","##e_version##");
			ProcessedSQL psql = null;

			Connection connection = session.checkoutConnection();
			try {
				PreparedStatement pstmt = connection.prepareStatement(psql.sql);
				for( int i = 0; i < psql.dynamicParameterNames.size(); i++ ) {
					if( "##e_version##".equals(psql.dynamicParameterNames.get(i)) ) {
						pstmt.setLong(i+1,0);
					}
					else if("city".equals(psql.dynamicParameterNames.get(i))) {
						pstmt.setString(i+1,object.getCity());
					}
					else if("street".equals(psql.dynamicParameterNames.get(i))) {
						pstmt.setString(i+1,object.getStreet());
					}
					else if("zip".equals(psql.dynamicParameterNames.get(i))) {
						pstmt.setString(i+1,object.getZip());
					}
					else if("country.id".equals(psql.dynamicParameterNames.get(i))) {
						if( object.getCountry() == null ) {
							pstmt.setObject(i+1,null);
						} else {
							pstmt.setLong(i+1,object.getCountry().getId());
						}
					}
					else if("person.id".equals(psql.dynamicParameterNames.get(i))) {
						if( object.getPerson() == null ) {
							pstmt.setObject(i+1,null);
						} else {
							pstmt.setLong(i+1,object.getPerson().getId());
						}
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

			if(eo instanceof Address) {
				sample.Address target = (sample.Address)eo;
				switch(f.getFeatureID()) {
					case 5: {
						target.setPerson(session.createMapper(sample.PersonMapper.class).selectById(((ProxyData_Address)proxyData).person));
						return true;
					}
					case 4: {
						target.setCountry(session.createMapper(sample.CountryMapper.class).selectById(((ProxyData_Address)proxyData).country));
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

	public NamedQuery<sample.Address> createNamedQuery(final JavaSession session, String name) {
		if( "selectById".equals(name) ) {
			return new NamedQuery<sample.Address>() {
				public List<sample.Address> queryForList(Object... parameters) {
					throw new UnsupportedOperationException("This is a single value query");
				}

				public sample.Address queryForOne(Object... parameters) {
					return createMapper(session).selectById(((Long)parameters[0]).longValue());
				}
			};
		}
		if( "selectAllForPerson".equals(name) ) {
			return new NamedQuery<sample.Address>() {
				public List<sample.Address> queryForList(Object... parameters) {
					return createMapper(session).selectAllForPerson(((Long)parameters[0]).longValue());
				}

				public sample.Address queryForOne(Object... parameters) {
					throw new UnsupportedOperationException("This is a list value query");
				}
			};
		}
		throw new UnsupportedOperationException("Unknown query '"+getClass().getSimpleName()+"."+name+"'");
	}

	final static class ProxyData_Address {
		public final long person;
		public final long country;
		public ProxyData_Address(long person,long country) {
			this.person = person;
			this.country = country;
		}
	}
}

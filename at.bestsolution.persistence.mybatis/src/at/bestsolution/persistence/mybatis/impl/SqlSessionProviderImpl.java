package at.bestsolution.persistence.mybatis.impl;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.builder.xml.XMLMapperBuilder;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapper;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.bestsolution.persistence.mybatis.EnvironmentProvider;
import at.bestsolution.persistence.mybatis.MappingProvider;
import at.bestsolution.persistence.mybatis.MappingProvider.MappingUnit;
import at.bestsolution.persistence.mybatis.SqlSessionProvider;

public class SqlSessionProviderImpl implements SqlSessionProvider {
	
	private List<MappingProvider> mappingProviders = new ArrayList<MappingProvider>();
	private SqlSessionFactory sessionFactory;
	private Map<Class<?>, EClass> eClassCache = new HashMap<Class<?>, EClass>();
	
	private EnvironmentProvider environment;
	
	public SqlSession createSession() {
		return bootstrap().openSession();
	}
	
	public void setEnvironmentProvider(EnvironmentProvider environment) {
		this.environment = environment;
	}
	
	public void unsetEnvironmentProvider(EnvironmentProvider environment) {
		this.environment = null;
	}
	
	public void addMappingProvider(MappingProvider provider) {
		this.mappingProviders.add(provider);
	}
	
	public void removeMappingProvider(MappingProvider provider) {
		this.mappingProviders.remove(provider);
	}

	private synchronized SqlSessionFactory bootstrap() {
		if( sessionFactory != null ) {
			return sessionFactory;
		}
		
		Configuration cfg = new Configuration(environment.getEnvironment());
		final ObjectFactory objFactory = cfg.getObjectFactory();
		cfg.setObjectFactory(new ObjectFactory() {
			
			public void setProperties(Properties arg0) {
			}
			
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public boolean isCollection(Class arg0) {
				return objFactory.isCollection(arg0);
			}
			
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Object create(Class arg0, List arg1, List arg2) {
				return null;
			}
			
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Object create(Class arg0) {
				EClass e = eClassCache.get(arg0);
				if( e != null ) {
					return EcoreUtil.create(e);	
				}
				
				return objFactory.create(arg0);
			}
		});
		cfg.setCacheEnabled(true);
		final ObjectWrapperFactory orig = cfg.getObjectWrapperFactory();
		cfg.setLazyLoadingEnabled(true);
		cfg.setAggressiveLazyLoading(false);
		cfg.setObjectWrapperFactory(new ObjectWrapperFactory() {
			@Override
			public boolean hasWrapperFor(Object arg0) {
				if( arg0 instanceof EObject ) {
					return true;
				}
//				System.err.println("hasWrapperFor: " +arg0);
				// TODO Auto-generated method stub
				return orig.hasWrapperFor(arg0);
			}
			
			@Override
			public ObjectWrapper getWrapperFor(MetaObject arg0, Object arg1) {
//				System.err.println("getWrapperFor: " +arg0 + " => " + arg1);
				// TODO Auto-generated method stub
				if( arg1 instanceof EObject ) {
					return new EMFObjectWrapper(arg0, (EObject) arg1);
				}
				return orig.getWrapperFor(arg0, arg1);
			}
		});
		cfg.getTypeHandlerRegistry().register(Blob.class, new BaseTypeHandler<Blob>() {

			@Override
			  public void setNonNullParameter(PreparedStatement ps, int i, Blob parameter, JdbcType jdbcType)
			      throws SQLException {
				ps.setBlob(i, parameter.getBinaryStream());
			  }

			  @Override
			  public Blob getNullableResult(ResultSet rs, String columnName)
			      throws SQLException {
			    return rs.getBlob(columnName);
			  }

			  @Override
			  public Blob getNullableResult(ResultSet rs, int columnIndex)
			      throws SQLException {
			    return rs.getBlob(columnIndex);
			  }

			  @Override
			  public Blob getNullableResult(CallableStatement cs, int columnIndex)
			      throws SQLException {
			    return cs.getBlob(columnIndex);
			  }
			
		});
		for( MappingProvider p : mappingProviders ) {
			for( MappingUnit u : p.getMappingUnits() ) {
				cfg.getTypeAliasRegistry().registerAlias(u.getModelInterface().getName(),u.getModelInterface());
				cfg.addMapper(u.getMapperInterface());
				eClassCache.put(u.getModelInterface(), u.getEClass());				
			}
		}

		for( MappingProvider p : mappingProviders ) {
			for( MappingUnit u : p.getMappingUnits() ) {
				InputStream in = null;
				try {
					in = u.getMappingXML();
					XMLMapperBuilder b = new XMLMapperBuilder(in, cfg, u.getId(), cfg.getSqlFragments());
					b.parse();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if( in != null ) {
						try {
							in.close();
						} catch (IOException e) {
						}
					}
				}
			}
		}

		
		sessionFactory = new SqlSessionFactoryBuilder().build(cfg);
		
		return sessionFactory;
	}
}
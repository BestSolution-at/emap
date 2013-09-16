package at.bestsolution.persistence.mybatis.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.builder.xml.XMLMapperBuilder;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.eclipse.emf.ecore.EClass;
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
		for( MappingProvider p : mappingProviders ) {
			for( MappingUnit u : p.getMappingUnits() ) {
				cfg.getTypeAliasRegistry().registerAlias(u.getModelInterface().getName(),u.getModelInterface());
				cfg.addMapper(u.getMapperInterface());
				eClassCache.put(u.getModelInterface(), u.getEClass());
				
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
		final ObjectFactory objFactory = sessionFactory.getConfiguration().getObjectFactory();
		sessionFactory.getConfiguration().setObjectFactory(new ObjectFactory() {
			
			public void setProperties(Properties arg0) {
			}
			
			public boolean isCollection(Class arg0) {
				return objFactory.isCollection(arg0);
			}
			
			public Object create(Class arg0, List arg1, List arg2) {
				return null;
			}
			
			public Object create(Class arg0) {
				EClass e = eClassCache.get(arg0);
				if( e != null ) {
					return EcoreUtil.create(e);	
				}
				
				return objFactory.create(arg0);
			}
		});
		return sessionFactory;
	}
}
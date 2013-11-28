package at.bestsolution.persistence.mybatis.factories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.bestsolution.persistence.mybatis.MappingProvider;
import at.bestsolution.persistence.mybatis.MappingProvider.MappingUnit;


public class EMFObjectFactory extends DefaultObjectFactory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String,EClass> eClassCache = new HashMap<String,EClass>();
	
	public void registerMappingProvider(MappingProvider provider) {
		synchronized (eClassCache) {
			for( MappingUnit u : provider.getMappingUnits() ) {
				eClassCache.put(u.getEClass().getInstanceClassName(), u.getEClass());
			}	
		}
	}
	
	public void unregisterMappingProvider(MappingProvider provider) {
		synchronized (eClassCache) {
			for( MappingUnit u : provider.getMappingUnits() ) {
				eClassCache.remove(u.getEClass().getInstanceClassName());
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T create(Class<T> type) {
		EClass e = eClassCache.get(type.getName());
		if( e != null ) {
			return (T) EcoreUtil.create(e);
		}
		return super.create(type);
	}

	@Override
	public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
		return super.create(type, constructorArgTypes, constructorArgs);
	}

	@Override
	public <T> boolean isCollection(Class<T> type) {
		return super.isCollection(type);
	}

	@Override
	public void setProperties(Properties properties) {
		super.setProperties(properties);
	}
}
package at.bestsolution.persistence.java.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.persistence.java.SessionCache;
import at.bestsolution.persistence.java.SessionCacheFactory;

public class DefaultSessionCacheFactory implements SessionCacheFactory {

	@Override
	public SessionCache createCache() {
		return new SessionCacheImpl();
	}

	static class SessionCacheImpl implements SessionCache {
		private Map<EClass, Map<Object,EObject>> cacheMap = new HashMap<EClass, Map<Object,EObject>>();

		@SuppressWarnings("unchecked")
		@Override
		public <O extends EObject> O getObject(EClass eClass, Object id) {
			Map<Object, EObject> map = cacheMap.get(eClass);
			if( map != null ) {
				return (O) map.get(id);
			}
			return null;
		}

		@Override
		public void putObject(EObject object, Object id) {
			Map<Object, EObject> map = cacheMap.get(object.eClass());
			if( map == null ) {
				map = new HashMap<>();
				cacheMap.put(object.eClass(), map);
			}
			map.put(id, object);
		}

		@Override
		public void release() {
			cacheMap.clear();
		}

		@Override
		public void clear() {
			cacheMap.clear();
		}
	}
}
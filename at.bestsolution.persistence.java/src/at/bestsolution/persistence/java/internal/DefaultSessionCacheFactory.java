package at.bestsolution.persistence.java.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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

	static class VersionedEObject {
		private final EObject object;
		private long version;

		public VersionedEObject(EObject object, long version) {
			this.object = object;
			this.version = version;
		}
	}

	static class SessionCacheImpl implements SessionCache {
		private Map<EClass, Map<Object,VersionedEObject>> cacheMap = new HashMap<EClass, Map<Object,VersionedEObject>>();
		private Map<String, List<EObject>> queryResultCache = new HashMap<String, List<EObject>>();

		@SuppressWarnings("unchecked")
		@Override
		public <O extends EObject> O getObject(EClass eClass, Object id) {
			Map<Object, VersionedEObject> map = cacheMap.get(eClass);
			if( map != null ) {
				VersionedEObject vo = map.get(id);
				if( vo != null ) {
					return (O) vo.object;
				}
			}
			return null;
		}

		@Override
		public void evitObject(EObject object) {
			Map<Object, VersionedEObject> map = cacheMap.get(object.eClass());
			if( map != null ) {
				Iterator<VersionedEObject> it = map.values().iterator();
				while( it.hasNext() ) {
					if( it.next().object == object ) {
						it.remove();
						break;
					}
				}
			}
		}

		@Override
		public void putObject(EObject object, Object id, long version) {
			Map<Object, VersionedEObject> map = cacheMap.get(object.eClass());
			if( map == null ) {
				map = new HashMap<Object, VersionedEObject>();
				cacheMap.put(object.eClass(), map);
			}
			map.put(id, new VersionedEObject(object, version));
		}

		@Override
		public boolean isCached(EObject object) {
			Map<Object, VersionedEObject> map = cacheMap.get(object.eClass());
			if( map != null ) {
				Iterator<VersionedEObject> it = map.values().iterator();
				while( it.hasNext() ) {
					if( it.next().object == object ) {
						return true;
					}
				}
			}
			return false;
		}

		@Override
		public long getVersion(EObject object, Object id) {
			Map<Object, VersionedEObject> map = cacheMap.get(object.eClass());
			if( map != null ) {
				VersionedEObject o = map.get(id);
				if( o != null ) {
					return o.version;
				}
			}
			return -1;
		}

		@Override
		public boolean updateVersion(EObject object, Object id, long version) {
			Map<Object, VersionedEObject> map = cacheMap.get(object.eClass());
			if( map != null ) {
				VersionedEObject o = map.get(id);
				if( o != null ) {
					o.version = version;
					return true;
				}
			}
			return false;
		}

		@Override
		public void release() {
			cacheMap.clear();
		}

		@Override
		public void clear() {
			cacheMap.clear();
		}

		@SuppressWarnings("unchecked")
		@Override
		public <O extends EObject> List<O> getQueryResult(String query,
				Object... parameters) {
			return (List<O>) queryResultCache.get(createQueryKey(query, parameters));
		}

		@Override
		public void putQueryResult(List<EObject> list, String query,
				Object... parameters) {
			queryResultCache.put(createQueryKey(query, parameters), list);
		}

		private static String createQueryKey(String query, Object... parameters) {
			StringBuilder b = new StringBuilder(query);
			for( Object o : parameters ) {
				if( o == null ) {
					b.append("#null");
				} else {
					b.append("#"+o);
				}
			}
			return b.toString();
		}
	}
}
/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.java.internal;

import java.util.Arrays;
import java.util.Collections;
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
		final EObject object;
		long version;

		public VersionedEObject(EObject object, long version) {
			this.object = object;
			this.version = version;
		}
	}

	static class ParameterObject<D> {
		final String name;
		final D data;
		final Object[] parameters;

		public ParameterObject(String name, D data, Object[] parameter) {
			this.name = name;
			this.data = data;
			this.parameters = parameter;
		}
	}

	static class SessionCacheImpl implements SessionCache {
		private Map<EClass, Map<Object,VersionedEObject>> cacheMap = new HashMap<EClass, Map<Object,VersionedEObject>>();
		private Map<String, ParameterObject<List<EObject>>> queryResultCache = new HashMap<String, ParameterObject<List<EObject>>>();
		private Map<String, ParameterObject<Map<Object,EObject>>> queryMapResultCache = new HashMap<String, ParameterObject<Map<Object,EObject>>>();

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
		public void evictObject(EClass eClass, Object id) {
			Map<Object, VersionedEObject> map = cacheMap.get(eClass);
			map.remove(id);
		}

		@Override
		public void evictObjects(EClass eClass) {
			cacheMap.remove(eClass);
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
			queryResultCache.clear();
			queryMapResultCache.clear();
		}

		@Override
		public void clear() {
			cacheMap.clear();
			queryResultCache.clear();
			queryMapResultCache.clear();
		}

		@SuppressWarnings("unchecked")
		@Override
		public <O extends EObject> List<O> getQueryResult(String query,
				Object... parameters) {
			ParameterObject<List<EObject>> parameterObject = queryResultCache.get(createQueryKey(query, parameters));
			return parameterObject == null ? null : (List<O>) parameterObject.data;
		}

		@Override
		public void putQueryResult(List<EObject> list, String query,
				Object... parameters) {
			queryResultCache.put(createQueryKey(query, parameters), new ParameterObject<List<EObject>>(query,list,parameters));
		}

		@Override
		public void evitQueryResult(Selector<List<EObject>> selector) {
			Iterator<ParameterObject<List<EObject>>> it = queryResultCache.values().iterator();
			while( it.hasNext() ) {
				ParameterObject<List<EObject>> next = it.next();
				selector.select(next.name, Arrays.asList(next.parameters), Collections.unmodifiableList(next.data));
			}
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

		@SuppressWarnings("unchecked")
		@Override
		public <O extends EObject> Map<Object, O> getQueryMapResult(
				String query, Object... parameters) {
			ParameterObject<Map<Object, EObject>> parameterObject = queryMapResultCache.get(createQueryKey(query, parameters));
			return parameterObject == null ? null : (Map<Object, O>) parameterObject.data;
		}

		@Override
		public void putQueryMapResult(Map<Object, EObject> map, String query,
				Object... parameters) {
			queryMapResultCache.put(createQueryKey(query, parameters), new ParameterObject<Map<Object,EObject>>(query, map, parameters));
		}

		@Override
		public void evitQueryMapResult(Selector<Map<Object, EObject>> selector) {
			Iterator<ParameterObject<Map<Object,EObject>>> it = queryMapResultCache.values().iterator();
			while( it.hasNext() ) {
				ParameterObject<Map<Object,EObject>> next = it.next();
				selector.select(next.name, Arrays.asList(next.parameters), Collections.unmodifiableMap(next.data));
			}
		}
	}
}
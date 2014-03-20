package at.bestsolution.persistence.java.cglib;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.bestsolution.persistence.model.LazyEObject;
import at.bestsolution.persistence.model.PersistedEObject;
import at.bestsolution.persistence.model.ResolveDelegate;

public class CGLibObjectProxyInterceptor implements MethodInterceptor {
	private static Map<EClass, Map<String,EReference>> INTERCEPTED_METHODS = new HashMap<EClass, Map<String,EReference>>();
	private static Map<ClassLoader, ClassLoader> HOOKED_CLASSLOADERS = new HashMap<ClassLoader, ClassLoader>();

	private boolean intercepting;
	private Object proxyData;
	private ResolveDelegate proxyDelegate;
	private Map<EStructuralFeature,Boolean> resolvedAttributes = new HashMap<EStructuralFeature,Boolean>();


	public static EObject newInstance(EClass eClass) {
		CGLibObjectProxyInterceptor interceptor = new CGLibObjectProxyInterceptor();
		Enhancer h = new Enhancer();

		ClassLoader c = HOOKED_CLASSLOADERS.get(eClass.getInstanceClass().getClassLoader());
		if( c == null ) {
			c = new MultiParentClassloader(eClass.getInstanceClass().getClassLoader(), CGLibObjectProxyInterceptor.class.getClassLoader());
			HOOKED_CLASSLOADERS.put(eClass.getInstanceClass().getClassLoader(), c);
		}

		h.setClassLoader(c);

		//FIXME Can we get away without that???
		EObject eo = EcoreUtil.create(eClass);
//		System.err.println(eo.getClass());
		h.setSuperclass(eo.getClass());

		h.setInterfaces(new Class[] { LazyEObject.class });
		h.setCallback(interceptor);
		h.setUseCache(true);
		EObject o = (EObject) h.create();

		Map<String,EReference> methods = INTERCEPTED_METHODS.get(eClass);

		if( methods == null ) {
			methods = new HashMap<String,EReference>();
			for( EReference r : eClass.getEAllReferences() ) {
				String name = Character.toUpperCase(r.getName().charAt(0))+ r.getName().substring(1);
				methods.put("get" + name, r);
				if( ! r.isMany() ) {
					methods.put("set" + name, r);
				}
			}
			INTERCEPTED_METHODS.put(eClass, methods);
		}

		return o;
//		return object;
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		if( "isResolved".equals(method.getName()) ) {
			return resolvedAttributes.get(args[0]) == Boolean.TRUE;
		} else if( method.getName().equals("setProxyData") ) {
			proxyData = args[0];
			return null;
		} else if( method.getName().equals("setProxyDelegate") ) {
			proxyDelegate = (ResolveDelegate) args[0];
			return null;
		} else if( method.getName().startsWith("get") ) {
			Map<String, EReference> map = INTERCEPTED_METHODS.get(((EObject)obj).eClass());

			if( map != null ) {
				EReference r = map.get(method.getName());
				LazyEObject eo = (LazyEObject) obj;
//				System.err.println("R: " + r);
//				System.err.println(resolvedAttributes);
				if( r != null && ! (resolvedAttributes.get(r) == Boolean.TRUE) ) {
					if( intercepting ) {
						return proxy.invokeSuper(obj, args);
					}
					intercepting = true;
					try {
						if( proxyDelegate.resolve(eo, proxyData, r) ) {
							resolvedAttributes.put(r,Boolean.TRUE);
						}
					} finally {
						intercepting = false;
					}
				}
			}
			return proxy.invokeSuper(obj, args);
		}  else if ( method.getName().equals("eGet") && method.getParameterTypes()[0] == EStructuralFeature.class) {
			final EStructuralFeature f = (EStructuralFeature) args[0];
			
			if (f instanceof EReference) {
				final EReference r = (EReference) f;
				final LazyEObject eo = (LazyEObject) obj;
//					System.err.println("R: " + r);
//					System.err.println(resolvedAttributes);
				if( r != null && ! (resolvedAttributes.get(r) == Boolean.TRUE) ) {
					if( intercepting ) {
						return proxy.invokeSuper(obj, args);
					}
					intercepting = true;
					try {
						if( proxyDelegate.resolve(eo, proxyData, r) ) {
							resolvedAttributes.put(r,Boolean.TRUE);
						}
					} finally {
						intercepting = false;
					}
				}
			}
			return proxy.invokeSuper(obj, args);
		} else if(  method.getName().startsWith("set") ) {
			Map<String, EReference> map = INTERCEPTED_METHODS.get(((EObject)obj).eClass());

			if( map != null ) {
				EReference r = map.get(method.getName());
				EObject eo = (EObject) obj;
				if( r != null && ! (resolvedAttributes.get(r) == Boolean.TRUE) ) {
					proxy.invokeSuper(eo, args);
					Object rv = proxy.invokeSuper(obj, args);
					resolvedAttributes.put(r,Boolean.TRUE);
					return rv;
				} else {
					return proxy.invokeSuper(obj, args);
				}
			} else {
				return proxy.invokeSuper(obj, args);
			}
		} else {
			return proxy.invokeSuper(obj, args);
		}
	}

	public static class MultiParentClassloader extends ClassLoader {
		private ClassLoader[] additionalClassloader;

		public MultiParentClassloader(ClassLoader primaryClassloader, ClassLoader... additionalClassloader) {
			super(primaryClassloader);
			this.additionalClassloader = additionalClassloader;
		}

		@Override
		public URL getResource(String name) {
			URL url;
			for( ClassLoader c : additionalClassloader ) {
				url = c.getResource(name);
				if( url != null ) {
					return url;
				}
			}
			return super.getResource(name);
		}

		@Override
		public InputStream getResourceAsStream(String name) {
			InputStream in;
			for( ClassLoader c : additionalClassloader ) {
				in = c.getResourceAsStream(name);
				if( in != null ) {
					return in;
				}
			}
			return super.getResourceAsStream(name);
		}

		@Override
		public Enumeration<URL> getResources(String name) throws IOException {
			// TODO We need to make this more efficient guava????
			List<URL> list = new ArrayList<URL>();
			Enumeration<URL> e = super.getResources(name);
			while( e.hasMoreElements() ) {
				list.add(e.nextElement());
			}

			for( ClassLoader c : additionalClassloader ) {
				e = c.getResources(name);
				while( e.hasMoreElements() ) {
					list.add(e.nextElement());
				}
			}
			return Collections.enumeration(list);
		}

		@Override
		public Class<?> loadClass(String name) throws ClassNotFoundException {
			try {
				return super.loadClass(name);
			} catch(ClassNotFoundException e) {
				for( ClassLoader c : additionalClassloader ) {
					try {
						return c.loadClass(name);
					} catch(ClassNotFoundException t) {
					}
				}

				throw new ClassNotFoundException(e.getMessage(), e);
			}
		}
	}
}
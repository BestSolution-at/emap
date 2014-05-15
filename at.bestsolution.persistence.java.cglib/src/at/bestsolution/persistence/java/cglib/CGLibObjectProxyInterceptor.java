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
package at.bestsolution.persistence.java.cglib;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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
import at.bestsolution.persistence.model.ResolveDelegate;

public class CGLibObjectProxyInterceptor implements MethodInterceptor {
	private static Map<EClass, Map<String,EReference>> INTERCEPTED_METHODS = new HashMap<EClass, Map<String,EReference>>();
	private static Map<ClassLoader, ClassLoader> HOOKED_CLASSLOADERS = new HashMap<ClassLoader, ClassLoader>();

	private boolean intercepting;
	private Object proxyData;
	private ResolveDelegate proxyDelegate;
	private Map<EStructuralFeature,Boolean> resolvedAttributes = new HashMap<EStructuralFeature,Boolean>();
	private boolean inverseAddRunning;

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
	
	private EReference getInterceptedReference(EClass eClass, String methodName) {
		final Map<String, EReference> map = INTERCEPTED_METHODS.get(eClass);
		if( map != null ) {
			return map.get(methodName);
		}
		return null;
	}
	
	private EReference getInterceptedReference(EStructuralFeature feature) {
		if (feature instanceof EReference && !feature.isTransient()) {
			return (EReference) feature;
		}
		return null;
	}
	
	private boolean isResolved(EReference reference) {
		return resolvedAttributes.get(reference) == Boolean.TRUE;
	}
	
	private void markResolved(EReference reference) {
		resolvedAttributes.put(reference, Boolean.TRUE);
	}
	
	private void interceptResolve(LazyEObject object, EReference reference) {
		intercepting = true;
		try {
			if( proxyDelegate.resolve(object, proxyData, reference) ) {
				markResolved(reference);
			}
		} finally {
			intercepting = false;
		}
	}

	private boolean matches(Method method, String nameRegex, int numArgs) {
		return method.getName().matches(nameRegex) && method.getParameterTypes().length == numArgs;
	}
	
	private boolean matches(Method method, String name, Class<?>... argTypes) {
		return method.getName().equals(name) && argsEquals(method.getParameterTypes(), argTypes);
	}
	
	private boolean matchesNoArgCheck(Method method, String name) {
		return method.getName().equals(name);
	}
	
	private boolean argsEquals(Class<?>[] a, Class<?>[] b) {
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
//		System.out.println("PROXY " + obj.getClass().getSimpleName() + " " + method.getName() + " " + Arrays.toString(method.getParameterTypes()));
		//FIXME We need to detect calls from outside and only resolve if the call
		// is not from EMF-internal
		// stop eagerly resolving
		if( inverseAddRunning ) {
			return proxy.invokeSuper(obj, args);
		}

		if (matches(method, "isResolved", EReference.class)) {
			final EReference reference = (EReference) args[0];
			
			return isResolved(reference);
		}
		else if (matches(method, "setProxyData", Object.class)) {
			proxyData = args[0];
			return null;
		}
		else if (matches(method, "setProxyDelegate", ResolveDelegate.class)) {
			proxyDelegate = (ResolveDelegate) args[0];
			return null;
		}
		else if (matchesNoArgCheck(method, "eInverseAdd")) {
			try {
				inverseAddRunning = true;
				return proxy.invokeSuper(obj, args);
			} finally {
				inverseAddRunning = false;
			}
		}
		else if (matches(method, "^get.*$", 0)) {
			final EReference reference = getInterceptedReference(((EObject)obj).eClass(), method.getName());
			
			if ( reference != null && !isResolved(reference)) {
				if( intercepting ) {
					return proxy.invokeSuper(obj, args);
				}
				interceptResolve((LazyEObject) obj, reference);
			}
			return proxy.invokeSuper(obj, args);
		}
		else if (matches(method, "^set.*$", 1)) {
			final EReference reference = getInterceptedReference(((EObject)obj).eClass(), method.getName());
			
			if ( reference != null && !isResolved(reference)) {
				final Object rv = proxy.invokeSuper(obj, args);
				markResolved(reference);
				return rv;
			}
			return proxy.invokeSuper(obj, args);
		}
		else if (matches(method, "eSet", EStructuralFeature.class, Object.class)) { 
			final EReference reference = getInterceptedReference((EStructuralFeature) args[0]);
			
			if( reference != null && !isResolved(reference) ) {
				final Object rv = proxy.invokeSuper(obj, args);
				markResolved(reference);
				return rv;
			}
			return proxy.invokeSuper(obj, args);
		}
		else if (matches(method, "eIsSet", EStructuralFeature.class)) {
			final EReference reference = getInterceptedReference((EStructuralFeature) args[0]);
			
			if( reference != null && !isResolved(reference) ) {
				if( intercepting ) {
					return proxy.invokeSuper(obj, args);
				}
				interceptResolve((LazyEObject) obj, reference);
			}
			return proxy.invokeSuper(obj, args);
		}
		else if (matches(method, "eGet", EStructuralFeature.class)) {
			final EReference reference = getInterceptedReference((EStructuralFeature) args[0]);
			
			if( reference != null && !isResolved(reference) ) {
				if( intercepting ) {
					return proxy.invokeSuper(obj, args);
				}
				interceptResolve((LazyEObject) obj, reference);
			}
			return proxy.invokeSuper(obj, args);
		}
		else if (matches(method, "eGet", EStructuralFeature.class, Boolean.class)) {
			final EReference reference = getInterceptedReference((EStructuralFeature) args[0]);
			
			if ( reference != null && !isResolved(reference) ) {
				if( intercepting ) {
					return proxy.invokeSuper(obj, args);
				}
				interceptResolve((LazyEObject) obj, reference);
			}
			return proxy.invokeSuper(obj, args);
		}
		else {
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

package at.bestsolution.persistence.mybatis.impl;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.persistence.model.PersistedEObject;

public class CGLibObjectProxyInterceptor implements MethodInterceptor {
	private static Map<EClass, Map<String,EReference>> INTERCEPTED_METHODS = new HashMap<EClass, Map<String,EReference>>();
	private CGLibProxyResolve delegate;
	private boolean intercepting;

	public static EObject newInstance(EObject object, CGLibProxyResolve delegate) {
		CGLibObjectProxyInterceptor interceptor = new CGLibObjectProxyInterceptor();
		interceptor.delegate = delegate;
		Enhancer h = new Enhancer();
		h.setSuperclass(object.getClass());
		h.setInterfaces(new Class[] { PersistedEObject.class });
		h.setCallback(interceptor);
		h.setUseCache(true);
		EObject o = (EObject) h.create();
//		EObject o = (EObject) Enhancer.create(object.getClass(),new Class[] { PersistedEObject.class },interceptor);

		EClass eClass = o.eClass();
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
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		if( "isResolved".equals(method.getName()) ) {
			return delegate.isResolved((EObject)obj, (EStructuralFeature) args[0]);
//		} else if( "getPrimaryKey".equals(method.getName()) ) {
//			return delegate.isResolved((EObject)obj, (EStructuralFeature) args[0]);
		} else if( method.getName().startsWith("get") ) {
			Map<String, EReference> map = INTERCEPTED_METHODS.get(((EObject)obj).eClass());

			if( map != null ) {
				EReference r = map.get(method.getName());
				EObject eo = (EObject) obj;
				if( r != null && ! delegate.isResolved(eo, r) ) {
					if( intercepting ) {
						return proxy.invokeSuper(obj, args);
					}
					intercepting = true;
					try {
						if( delegate.resolve(eo, r) ) {
							delegate.markResolved(eo, r);
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
				if( r != null && ! delegate.isResolved(eo, r) ) {
					proxy.invokeSuper(eo, args);
					Object rv = proxy.invokeSuper(obj, args);
					delegate.markResolved(eo, r);
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

	public interface CGLibProxyResolve {
		public boolean isResolved(EObject object, EStructuralFeature f);
		public void markResolved(EObject object, EStructuralFeature f);
		public boolean resolve(EObject object, EStructuralFeature f);
	}
}
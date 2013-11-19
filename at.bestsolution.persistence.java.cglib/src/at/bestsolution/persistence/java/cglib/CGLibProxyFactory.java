package at.bestsolution.persistence.java.cglib;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.persistence.java.ProxyFactory;

public class CGLibProxyFactory implements ProxyFactory {

	@Override
	public <O extends EObject> O createProxy(EClass eClass) {
		return (O) CGLibObjectProxyInterceptor.newInstance(eClass);
	}

}

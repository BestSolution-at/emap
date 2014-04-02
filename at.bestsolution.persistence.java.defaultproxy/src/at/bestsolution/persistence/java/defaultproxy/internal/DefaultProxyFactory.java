package at.bestsolution.persistence.java.defaultproxy.internal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.bestsolution.persistence.java.ProxyFactory;

public class DefaultProxyFactory implements ProxyFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <O extends EObject> O createProxy(EClass eClass) {
		return (O) EcoreUtil.create(eClass);
	}

}
package at.bestsolution.persistence.java;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public interface ProxyFactory {
	public <O extends EObject> O createProxy(EClass eClass);
}

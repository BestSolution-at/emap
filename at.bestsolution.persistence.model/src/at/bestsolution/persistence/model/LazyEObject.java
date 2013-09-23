package at.bestsolution.persistence.model;

import org.eclipse.emf.ecore.EObject;

public interface LazyEObject extends EObject {
	public void setProxyDelegate(ResolveDelegate delegate);
	public Object getPrimaryKey();
	public boolean isEnhanced();
}

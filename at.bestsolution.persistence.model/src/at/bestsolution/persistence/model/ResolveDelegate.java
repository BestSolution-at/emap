package at.bestsolution.persistence.model;

import org.eclipse.emf.ecore.EStructuralFeature;

public interface ResolveDelegate {
	public boolean resolve(LazyEObject eo, Object proxyData, EStructuralFeature f);
}

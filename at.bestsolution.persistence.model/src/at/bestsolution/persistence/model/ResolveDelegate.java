package at.bestsolution.persistence.model;

import org.eclipse.emf.ecore.EStructuralFeature;

public interface ResolveDelegate {
	public void resolve(EStructuralFeature f);
}

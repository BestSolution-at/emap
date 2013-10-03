package at.bestsolution.persistence.model;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public abstract class LazyEObjectImpl extends EObjectImpl implements LazyEObject {

	private Map<EReference, Boolean> resolved = new HashMap<EReference, Boolean>();
	private ResolveDelegate delegate;
	
	@Override
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		if( delegate != null ) {
			if( eFeature instanceof EReference ) {
				if( ! resolved.containsKey(eFeature) ) {
					if( delegate.resolve(this,eFeature) ) {
						resolved.put((EReference) eFeature, Boolean.TRUE);
					}
				}
			}	
		}
		
		return super.eGet(eFeature, resolve);
	}
	
	@Override
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		super.eSet(eFeature, newValue);
		if( eFeature instanceof EReference ) {
			resolved.put((EReference) eFeature, Boolean.TRUE);	
		}
	}
	
	@Override
	public void setProxyDelegate(ResolveDelegate delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public boolean isEnhanced() {
		return delegate != null;
	}
	
	@Override
	public boolean isResolved(EReference f) {
		return resolved.get(f) == Boolean.TRUE;
	}
}
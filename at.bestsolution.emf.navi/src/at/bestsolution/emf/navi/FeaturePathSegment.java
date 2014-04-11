package at.bestsolution.emf.navi;

import org.eclipse.emf.ecore.EStructuralFeature;

public class FeaturePathSegment {

	public final EStructuralFeature feature;
	
	public final Condition condition;
	
	public FeaturePathSegment(EStructuralFeature feature, Condition condition) {
		this.feature = feature;
		this.condition = condition;
		
		if (this.feature.isMany()) {
			if (condition == null) {
				// TODO we may need to throw this out to support fetching whole lists
				throw new IllegalArgumentException("many feature needs a condition");
			}
		}
	}
	
	public FeaturePathSegment(EStructuralFeature feature) {
		this(feature, null);
	}
	
}

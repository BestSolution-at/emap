package at.bestsolution.emf.navi;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

public class FeaturePathBuilder {
	private List<FeaturePathSegment> segments = new ArrayList<FeaturePathSegment>();
	
	public FeaturePathBuilder segment(EStructuralFeature feature) {
		segments.add(new FeaturePathSegment(feature));
		return this;
	}
	
	public FeaturePathBuilder manySegment(EStructuralFeature feature, Condition condition) {
		segments.add(new FeaturePathSegment(feature, condition));
		return this;
	}
	
	public FeaturePath create() {
		return new FeaturePath(segments.toArray(new FeaturePathSegment[0]));
	}
}

package at.bestsolution.emf.navi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FeaturePath {

	private final List<FeaturePathSegment> segments;
	
	public FeaturePath(FeaturePathSegment... segments) {
		this.segments = Arrays.asList(segments);
	}
	
	public List<FeaturePathSegment> getSegments() {
		return Collections.unmodifiableList(segments);
	}
	
}

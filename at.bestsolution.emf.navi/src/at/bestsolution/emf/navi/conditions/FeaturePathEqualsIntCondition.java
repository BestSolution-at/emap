package at.bestsolution.emf.navi.conditions;

import org.eclipse.emf.ecore.EObject;

import at.bestsolution.emf.navi.FeaturePath;
import at.bestsolution.emf.navi.FeaturePathSegment;
import at.bestsolution.emf.navi.FeaturePathUtil;

public class FeaturePathEqualsIntCondition extends FeaturePathCondition {

	private final int equals;
	
	public FeaturePathEqualsIntCondition(FeaturePath path, int equals) {
		super(path);
		this.equals = equals;
		FeaturePathSegment lastSegment = path.getSegments().get(path.getSegments().size()-1);
		if (!lastSegment.feature.getEType().getInstanceClassName().equals("int")) {
			throw new IllegalArgumentException("feature path must point to an int value");
		}
	}

	@Override
	public boolean matches(EObject object) {
		final int result = ((Integer)FeaturePathUtil.get(object, path)).intValue();
		return result == equals;
	}

}

package at.bestsolution.emf.navi;

import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.emf.navi.conditions.AndCondition;
import at.bestsolution.emf.navi.conditions.FeaturePathEqualsCondition;
import at.bestsolution.emf.navi.conditions.FeaturePathEqualsIntCondition;
import at.bestsolution.emf.navi.conditions.FeaturePathEqualsLongCondition;
import at.bestsolution.emf.navi.conditions.OrCondition;

public class NaviFactory {

	public static FeaturePathBuilder featurePath() {
		return new FeaturePathBuilder();
	}
	
	/** creates a simple feature path */
	public static FeaturePath featurePath(EStructuralFeature feature) {
		return new FeaturePath(new FeaturePathSegment(feature));
	}
	
	public static Condition and(Condition...conditions) {
		return new AndCondition(conditions);
	}
	
	public static Condition or(Condition...conditions) {
		return new OrCondition(conditions);
	}
	
	public static Condition pathEquals(FeaturePath path, Object equals) {
		return new FeaturePathEqualsCondition(path, equals);
	}
	
	public static Condition pathEquals(FeaturePath path, int equals) {
		final FeaturePathSegment lastSegment = path.getSegments().get(path.getSegments().size()-1);
		if (lastSegment.feature.getEType().getInstanceClassName().equals("long")) {
			return pathEquals(path, (long)equals);
		}
		else {
			return new FeaturePathEqualsIntCondition(path, equals);
		}
	}
	
	public static Condition pathEquals(FeaturePath path, long equals) {
		return new FeaturePathEqualsLongCondition(path, equals);
	}
}

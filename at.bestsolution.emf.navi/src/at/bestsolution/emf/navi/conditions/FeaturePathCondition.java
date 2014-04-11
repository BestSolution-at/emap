package at.bestsolution.emf.navi.conditions;

import at.bestsolution.emf.navi.Condition;
import at.bestsolution.emf.navi.FeaturePath;


public abstract class FeaturePathCondition implements Condition {

	protected final FeaturePath path;
	
	public FeaturePathCondition(FeaturePath path) {
		this.path = path;
	}

}

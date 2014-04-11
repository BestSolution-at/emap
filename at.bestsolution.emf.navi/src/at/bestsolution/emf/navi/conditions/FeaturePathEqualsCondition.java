package at.bestsolution.emf.navi.conditions;

import org.eclipse.emf.ecore.EObject;

import at.bestsolution.emf.navi.FeaturePath;
import at.bestsolution.emf.navi.FeaturePathUtil;

public class FeaturePathEqualsCondition extends FeaturePathCondition {

	private final Object equals;
	
	public FeaturePathEqualsCondition(FeaturePath path, Object equals) {
		super(path);
		this.equals = equals;
	}

	@Override
	public boolean matches(EObject object) {
		final Object obj = FeaturePathUtil.get(object, path);
		return equals.equals(obj);
	}

}

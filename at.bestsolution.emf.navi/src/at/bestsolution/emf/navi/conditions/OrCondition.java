package at.bestsolution.emf.navi.conditions;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import at.bestsolution.emf.navi.Condition;

public class OrCondition implements Condition {

	private final List<Condition> conditions;
	
	public OrCondition(Condition... conditions) {
		this.conditions = Arrays.asList(conditions);
	}
	
	@Override
	public boolean matches(EObject object) {
		for (Condition c : conditions) {
			if (c.matches(object)) {
				return true;
			}
		}
		return false;
	}

}

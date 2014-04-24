package at.bestsolution.emf.navi.tests.conditions;

import org.eclipse.emf.ecore.EObject;

import at.bestsolution.emf.navi.Condition;
import at.bestsolution.emf.navi.tests.model.sample.Department;

public class DepartmentNameCondition implements Condition {
	private final String name;

	public DepartmentNameCondition(String name) {
		this.name = name;
	}

	public boolean matches(Object object) {
		if (object instanceof Department) {
			Department d = (Department) object;
			if (d.getName() == null) {
				return name == null;
			} else {
				return d.getName().equals(name);
			}
		}
		return false;
	}
}

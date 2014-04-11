package at.bestsolution.emf.navi;

import org.eclipse.emf.ecore.EObject;

public interface Condition {
	boolean matches(EObject object);
}

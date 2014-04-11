package at.bestsolution.emf.navi;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public class FeaturePathUtil {

	public static Object get(EObject owner, FeaturePath path) {
		Object current = owner;
		EObject eCurrent = owner;
		Iterator<FeaturePathSegment> it = path.getSegments().iterator();
		while (it.hasNext()) {
			final FeaturePathSegment segment = it.next();
			Object newCurrent = null;
			if (segment.feature.isMany()) {
				// handle collection
				Object many = eCurrent.eGet(segment.feature);
				if (many instanceof List) {
					@SuppressWarnings("unchecked")
					List<Object> manyList = (List<Object>) many;
					
					for (Object o : manyList) {
						if (o instanceof EObject) {
							EObject eo = (EObject) o;
							if (segment.condition.matches(eo)) {
								newCurrent = eo;
								break;
							}
						}
					}
				}
			}
			else {
				newCurrent = eCurrent.eGet(segment.feature);
			}
			
			current = newCurrent;
			
			if (it.hasNext()) {
				if (current instanceof EObject) {
					eCurrent = (EObject) current;
				}
//				if (current == null) {
//					throw new NullPointerException("last segment was null! " + eCurrent);
//				}
				else {
					throw new NullPointerException("could not resolve segment " +segment + " after " + eCurrent);
				}
				
			}
			
		}
		return current;
	}
	
	public static List<Object> filter(EObject owner, FeaturePath path) {
		// TODO to be implemented
		return null;
	}
}

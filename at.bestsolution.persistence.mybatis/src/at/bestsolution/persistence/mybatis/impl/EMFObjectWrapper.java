package at.bestsolution.persistence.mybatis.impl;

import java.util.Collection;
import java.util.List;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.reflection.wrapper.BeanWrapper;
import org.apache.ibatis.reflection.wrapper.ObjectWrapper;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.persistence.model.PersistedEObject;

public class EMFObjectWrapper implements ObjectWrapper {
	private BeanWrapper wrapper;
	private EObject object;
	private boolean isFilled;
	private static final String MODIFIED_PREFIX = "_isResolved_";
	
	public EMFObjectWrapper(MetaObject metaObject, EObject object) {
		this.wrapper = new BeanWrapper(metaObject, object);
		this.object = object;
		
		if( object instanceof PersistedEObject ) {
			this.isFilled = ((PersistedEObject)object).getPrimaryKey() != null;	
		}
	}
	
	@Override
	public void add(Object arg0) {
		wrapper.add(arg0);
	}

	@Override
	public <E> void addAll(List<E> arg0) {
		wrapper.addAll(arg0);
	}

	@Override
	public String findProperty(String arg0, boolean arg1) {
		return wrapper.findProperty(arg0, arg1);
	}

	@Override
	public Object get(PropertyTokenizer arg0) {
		if( arg0.getName().startsWith(MODIFIED_PREFIX) ) {
			if( object instanceof PersistedEObject ) {
				EReference f = (EReference) object.eClass().getEStructuralFeature(arg0.getName().substring(MODIFIED_PREFIX.length()));
				PersistedEObject peo = (PersistedEObject) object;
				return peo.isResolved(f);
			}
			// If it is not optimized we need to treat it as resolved
			// even if this means we'll resolve a proxy
			return true;
		}
		return object.eGet(object.eClass().getEStructuralFeature(arg0.getName()));
	}

	@Override
	public String[] getGetterNames() {
		return wrapper.getGetterNames();
	}

	@Override
	public Class<?> getGetterType(String arg0) {
		return object.eClass().getEStructuralFeature(arg0).getEType().getInstanceClass();
	}

	@Override
	public String[] getSetterNames() {
		return wrapper.getSetterNames();
	}

	@Override
	public Class<?> getSetterType(String arg0) {
		return object.eClass().getEStructuralFeature(arg0).getEType().getInstanceClass();
	}

	@Override
	public boolean hasGetter(String arg0) {
		if( arg0.startsWith(MODIFIED_PREFIX) ) {
			String attribute = arg0.substring(MODIFIED_PREFIX.length());
			return object.eClass().getEStructuralFeature(attribute) != null;
		}
		return object.eClass().getEStructuralFeature(arg0) != null;
	}

	@Override
	public boolean hasSetter(String arg0) {
		return object.eClass().getEStructuralFeature(arg0) != null;
	}

	@Override
	public MetaObject instantiatePropertyValue(String arg0,
			PropertyTokenizer arg1, ObjectFactory arg2) {
		return wrapper.instantiatePropertyValue(arg0, arg1, arg2);
	}

	@Override
	public boolean isCollection() {
		return wrapper.isCollection();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void set(PropertyTokenizer arg0, Object arg1) {
		if( isFilled ) {
			return;
		}
		EStructuralFeature feature = object.eClass().getEStructuralFeature(arg0.getName());
		
		if( feature == null ) {
			System.err.println(object.eClass().getName() + " no feature " + arg0.getName());
		}
		
		if( feature.isMany() ) {
			List<Object> l = (List<Object>)object.eGet(feature);
			System.err.println("Current:   " + l.size());
			System.err.println("Attaching: " + ((Collection<?>)arg1).size());
			l.addAll((Collection<? extends Object>) arg1);
			System.err.println("AFTER:   " + l.size());
		} else {
			if( feature instanceof EReference ) {
				object.eSet(feature, arg1);
			} else {
				object.eSet(feature, arg1);	
			}
			
		}
	}
}
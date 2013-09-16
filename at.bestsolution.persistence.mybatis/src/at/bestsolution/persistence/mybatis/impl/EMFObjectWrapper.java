package at.bestsolution.persistence.mybatis.impl;

import java.util.Collection;
import java.util.List;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.reflection.wrapper.BeanWrapper;
import org.apache.ibatis.reflection.wrapper.ObjectWrapper;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EMFObjectWrapper implements ObjectWrapper {
	private BeanWrapper wrapper;
	private EObject object;
	
	public EMFObjectWrapper(MetaObject metaObject, EObject object) {
		this.wrapper = new BeanWrapper(metaObject, object);
		this.object = object;
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
		return wrapper.get(arg0);
	}

	@Override
	public String[] getGetterNames() {
		return wrapper.getGetterNames();
	}

	@Override
	public Class<?> getGetterType(String arg0) {
		return wrapper.getGetterType(arg0);
	}

	@Override
	public String[] getSetterNames() {
		System.err.println("Fetching setter names");
		return wrapper.getSetterNames();
	}

	@Override
	public Class<?> getSetterType(String arg0) {
		return wrapper.getSetterType(arg0);
	}

	@Override
	public boolean hasGetter(String arg0) {
		return wrapper.hasGetter(arg0);
	}

	@Override
	public boolean hasSetter(String arg0) {
		System.err.println("Checking setter: " + arg0);
		return wrapper.hasSetter(arg0);
	}

	@Override
	public MetaObject instantiatePropertyValue(String arg0,
			PropertyTokenizer arg1, ObjectFactory arg2) {
		System.err.println("Create MetaObject: " + arg0 + "; " + arg1+"," +arg2);
		return wrapper.instantiatePropertyValue(arg0, arg1, arg2);
	}

	@Override
	public boolean isCollection() {
		return wrapper.isCollection();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void set(PropertyTokenizer arg0, Object arg1) {
		EStructuralFeature feature = object.eClass().getEStructuralFeature(arg0.getName());
		if( feature.isMany() ) {
			((List<Object>)object.eGet(feature)).addAll((Collection<? extends Object>) arg1);
		} else {
			object.eSet(feature, arg1);
		}
		
//		System.err.println("Setting: " + arg0.getName() + " => " + arg1);
//		wrapper.set(arg0, arg1);
	}

}

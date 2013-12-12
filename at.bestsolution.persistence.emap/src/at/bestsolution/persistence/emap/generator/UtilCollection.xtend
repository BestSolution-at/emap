package at.bestsolution.persistence.emap.generator

import org.eclipse.emf.ecore.EStructuralFeature
import at.bestsolution.persistence.emap.eMap.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import at.bestsolution.persistence.emap.eMap.EMappingEntity
import java.util.ArrayList
import java.util.TreeSet
import org.eclipse.xtext.xbase.lib.Functions.Function2

class UtilCollection {
	private EClass eClass;

	new(EClass eClass) {
		this.eClass = eClass;
	}

	def static <T> Iterable<T> filterDups(Iterable<T> unfiltered, Function2<T,T,Boolean> equals) {
		val s = new TreeSet<T>([T t1, T t2| if( equals.apply(t1,t2) ) return 0 else return 1 ] );
		val i = unfiltered.iterator;
		while( i.hasNext ) {
			s.add(i.next)
		}
		return s;
	}

	def static isBoolean(EStructuralFeature e) {
		return e.EType.instanceClassName == "boolean" || e.EType.instanceClassName == "java.lang.Boolean"
	}

	def static isPrimitive(EStructuralFeature e) {
		return newArrayList("int","long","double","float","boolean").contains(e.EType.instanceClassName)
	}

	def static isNumeric(EStructuralFeature e) {
		return newArrayList("int","long","double","float","java.lang.Integer","java.lang.Long","java.lang.Double","java.lang.Float").contains(e.EType.instanceClassName)
	}

	def static isString(EStructuralFeature e) {
		return "java.lang.String" == e.EType.instanceClassName;
	}

	def static isDouble(EStructuralFeature e) {
		return e.EType.instanceClassName == "double" || e.EType.instanceClassName == "java.lang.Double"
	}

	def static isInteger(EStructuralFeature e) {
		return e.EType.instanceClassName == "int" || e.EType.instanceClassName == "java.lang.Integer"
	}

	def static isLong(EStructuralFeature e) {
		return e.EType.instanceClassName == "long" || e.EType.instanceClassName == "java.lang.Long"
	}

	def static isFloat(EStructuralFeature e) {
		return e.EType.instanceClassName == "float" || e.EType.instanceClassName == "java.lang.Float"
	}

	def static getResolvedType(EAttribute attribute, EClass eClass) {
		val f = eClass.getEStructuralFeature(attribute.property)
		return f.EType.instanceClassName
	}

	def static getEAttribute(EAttribute attribute, EClass eClass) {
		val f = eClass.getEStructuralFeature(attribute.property)
		if( f instanceof EReference && attribute.resolved ) {
			val c = (f as EReference).EType as EClass
			return c.getEStructuralFeature((attribute.query.eContainer as EMappingEntity).getAllAttributes.findFirst[pk].property) as org.eclipse.emf.ecore.EAttribute
		}

		return f as org.eclipse.emf.ecore.EAttribute
	}

	def static getAllAttributes(EMappingEntity entity) {
		val l = new ArrayList<EAttribute>
		entity.findAllAttributes(l,false)
		val eClass = JavaHelper::getEClass(entity.etype)
		l.sort([ a,b | return sortAttributes(eClass,a,b)])
		return l
	}

	def static void findAllAttributes(EMappingEntity entity, ArrayList<EAttribute> l, boolean skipPrimary) {
		l.addAll(entity.attributes.filter[! skipPrimary || ! pk ])
		if( entity.parent != null ) {
			entity.parent.findAllAttributes(l, true)
		}
	}

	def static sortAttributes(EClass eClass, EAttribute a, EAttribute b) {
		if (a.pk)
			return -1
		else if (b.pk)
			return 1
		else
			if ( a.resolved && b.resolved ) {
				if( a.isSingleAttribute(eClass) && b.isSingleAttribute(eClass) ) {
					return a.property.compareToIgnoreCase(b.property)
				} else if( a.isSingleAttribute(eClass) ) {
					return -1;
				} else if( b.isSingleAttribute(eClass) ) {
					return 1;
				}
				return a.property.compareToIgnoreCase(b.property)
			}
			else if( ! a.resolved && !  b.resolved )
				return a.property.compareToIgnoreCase(b.property)
			else if( ! a.resolved )
				return -1
			else if( ! b.resolved )
				return 1
			else
				return a.property.compareToIgnoreCase(b.property)
	}

	def static isSingleAttribute(EAttribute attribute, EClass eclass) {
		if( eclass.getEStructuralFeature(attribute.property) == null ) {
			throw new IllegalStateException("Could not find attribute '"+attribute.property+"' in '"+eclass.name+"'")
		}
		return ! eclass.getEStructuralFeature(attribute.property).many
	}
}
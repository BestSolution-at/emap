package at.bestsolution.persistence.emap.generator

import org.eclipse.emf.ecore.EStructuralFeature
import at.bestsolution.persistence.emap.eMap.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import at.bestsolution.persistence.emap.eMap.EMappingEntity
import java.util.ArrayList
import java.util.TreeSet
import org.eclipse.xtext.xbase.lib.Functions.Function2
import at.bestsolution.persistence.emap.eMap.EParameter
import at.bestsolution.persistence.emap.eMap.EMappingAttribute
import at.bestsolution.persistence.emap.eMap.EObjectSection
import java.util.List
import java.util.HashSet
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import java.util.HashMap
import java.util.Map
import org.osgi.framework.FrameworkUtil
import at.bestsolution.persistence.emap.eMap.ENamedQuery
import at.bestsolution.persistence.emap.eMap.EMapping

class UtilCollection {
	static Map<String,DatabaseSupport> DB_SUPPORTS = new HashMap<String,DatabaseSupport>();

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
		val f = eClass.getEStructuralFeature(attribute.name)
		return f.EType.instanceClassName
	}

	def static getEAttribute(EAttribute attribute, EClass eClass) {
		val f = eClass.getEStructuralFeature(attribute.name)
		if( f instanceof EReference && attribute.resolved ) {
			val c = (f as EReference).EType as EClass
			return c.getEStructuralFeature((attribute.query.eContainer as EMappingEntity).getAllAttributes.findFirst[pk].name) as org.eclipse.emf.ecore.EAttribute
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
					return a.name.compareToIgnoreCase(b.name)
				} else if( a.isSingleAttribute(eClass) ) {
					return -1;
				} else if( b.isSingleAttribute(eClass) ) {
					return 1;
				}
				return a.name.compareToIgnoreCase(b.name)
			}
			else if( ! a.resolved && !  b.resolved )
				return a.name.compareToIgnoreCase(b.name)
			else if( ! a.resolved )
				return -1
			else if( ! b.resolved )
				return 1
			else
				return a.name.compareToIgnoreCase(b.name)
	}

	def static isSingleAttribute(EAttribute attribute, EClass eclass) {
		if( eclass.getEStructuralFeature(attribute.name) == null ) {
			throw new IllegalStateException("Could not find attribute '"+attribute.name+"' in '"+eclass.name+"'")
		}
		return ! eclass.getEStructuralFeature(attribute.name).many
	}

	def static parameterConversion(EParameter p, String name) {
		if( p.type == "long" ) {
			return "((Long)" + name + ").longValue()"
		} else if( p.type == "int" ) {
			return "((Integer)" + name + ").intValue()";
		} else if( p.type == "boolean" ) {
			return "((Boolean)" + name + ").booleanValue()";
		}
		return "("+p.type+")" + name;
	}

	static def jdbcType(org.eclipse.emf.ecore.EAttribute f) {
		if( f.EType.instanceClassName == "java.lang.String" ) {
			return "STRING";
		} else if( f.EType.instanceClassName == "long" ) {
			return "LONG";
		} else if( f.EType.instanceClassName == "double" ) {
			return "DOUBLE";
		} else if( f.EType.instanceClassName == "double" ) {
			return "FLOAT";
		} else if( f.EType.instanceClassName == "int" ) {
			return "INT";
		} else if( f.EType.instanceClassName == "boolean" ) {
			return "BOOLEAN";
		} else {
			return "UNKNOWN";
		}
	}

	static def jdbcType(EAttribute p, EClass eClass) {
		return getEAttribute(p,eClass).jdbcType;
	}

	static def collectMappings(Iterable<EMappingAttribute> attributeList) {
		val l = new ArrayList<EObjectSection>;
		attributeList.forEach[it.map.collectMappingsRec(l)]
		return l;
	}

	static def void collectMappingsRec(EObjectSection section, List<EObjectSection> list) {
		list.add(section);
		section.attributes.forEach[it.map.collectMappingsRec(list)]
	}

	static def collectEnities(EMappingEntity rootEntity) {
		val entities = new HashSet<EMappingEntity>;
		rootEntity.namedQueries.forEach[entities.addAll(it.queries.head.mapping.attributes.collectMappings.map[it.entity])]
		return entities;
	}

	def static compare(int x, int y) {
		if(x < y) {
			return -1
		}
		else if(x == y) {
			return 0
		} else {
			return 1;
		}
	}

	static def pstmtMethod(org.eclipse.emf.ecore.EAttribute f) {
		if( f.EType.instanceClassName == "java.lang.String" ) {
			return "setString";
		} else if( f.EType.instanceClassName == "long" ) {
			return "setLong";
		} else if( f.EType.instanceClassName == "int" ) {
			return "setInt";
		} else if( f.EType.instanceClassName == "boolean" ) {
			return "setBoolean";
		} else {
			return "setObject";
		}
	}

	static def resultMethod(EAttribute attribute, String varName, EClass eClass, String keyName, String prefix) {
		val f = eClass.getEStructuralFeature(attribute.name)
		if( f == null ) {
			throw new IllegalStateException("Unknown attribute '"+attribute.name+"'")
		}
		if( "java.lang.String" == f.EType.instanceClassName ) {
			return varName + '.getString("'+keyName+'")'
		} else if( "long" == f.EType.instanceClassName ) {
			return varName + '.getLong("'+keyName+'")'
		} else if( "int" == f.EType.instanceClassName ) {
			return varName + '.getInt("'+keyName+'")'
		} else if( "double" == f.EType.instanceClassName ) {
			return varName + '.getDouble("'+keyName+'")'
		} else if( "boolean" == f.EType.instanceClassName ) {
			return varName + '.getBoolean("'+keyName+'")'
		} else if( "java.sql.Blob" == f.EType.instanceClassName ) {
			return 'session.handleBlob("'+(attribute.eContainer as EMappingEntity).calcTableName+'","'+keyName+'","'+prefix+(attribute.eContainer as EMappingEntity).getAllAttributes.findFirst[pk].columnName+'",' +varName +')'
		} else {
			return "("+f.EType.instanceClassName+") session.convertType("+f.EType.instanceClassName+".class, " + varName + '.getObject("'+keyName+'"))'
		}
	}

	static def resultMethodType(EParameter p) {
		if( "String" == p.type ) {
			return "getString"
		} else if( "long" == p.type ) {
			return "getLong"
		} else if( "int" == p.type ) {
			return "getInt"
		} else {
			return "getObject"
		}
	}

	def static tableName(EMappingEntityDef entityDef) {
		if( entityDef.entity.tableName == null ) {
			return JavaHelper::getEClass(entityDef.entity.etype).name.toUpperCase
		}
		return entityDef.entity.tableName
	}

	def static calcTableName(EMappingEntity entity) {
		if( entity.tableName == null ) {
			return JavaHelper::getEClass(entity.etype).name.toUpperCase
		}
		return entity.tableName
	}

	static def pstmtMethod(EParameter p) {
		if( p.type == "String" ) {
			return "setString";
		} else if( p.type == "long" ) {
			return "setLong";
		} else if( p.type == "int" ) {
			return "setInt";
		} else if( p.type == "boolean" ) {
			return "setBoolean";
		} else {
			return "setObject";
		}
	}

	static def pstmtMethod(EAttribute p, EClass eClass) {
		val f = eClass.getEStructuralFeature(p.name);
		if( f instanceof org.eclipse.emf.ecore.EAttribute ) {
			return (f as org.eclipse.emf.ecore.EAttribute).pstmtMethod
		} else {
			val c = (f as EReference).EType as EClass
			return (c.getEStructuralFeature((p.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name) as org.eclipse.emf.ecore.EAttribute).pstmtMethod;
		}
	}

	static def packageName(EClass eClass) {
		return eClass.instanceClassName.substring(0,eClass.instanceClassName.lastIndexOf("."))
	}

	def static collectAllAttributes(EMappingEntity entity) {
		val l = new ArrayList<EAttribute>
		entity.allAttributes(l)
		val eClass = JavaHelper::getEClass(entity.etype);
		l.sort([ a,b | return sortAttributes(eClass,a,b)]);
		return l
	}

	def static void allAttributes(EMappingEntity entity, ArrayList<EAttribute> l) {
		l.addAll(entity.attributes)
		if( entity.parent != null ) {
			entity.parent.allAttributes(l)
		}
	}

	def static collectDerivedAttributes(EMappingEntity entity) {
		val map = new HashMap<String,EAttribute>
		entity.allDerivedAttributes(map)
		return map
	}

	def static void allDerivedAttributes(EMappingEntity entity, Map<String, EAttribute> map) {
		for( a : entity.attributes ) {
			map.put(a.name,a);
		}
		if( entity.parent != null && entity.extensionType == "derived" ) {
			entity.parent.allDerivedAttributes(map)
		}
	}

	def static isSingle(EAttribute attribute, EClass eclass) {
		if( eclass.getEStructuralFeature(attribute.name) == null ) {
			throw new IllegalStateException("Could not find attribute '"+attribute.name+"' in '"+eclass.name+"'")
		}
		return ! eclass.getEStructuralFeature(attribute.name).many
	}

	def static isBoolean(EAttribute attribute, EClass eclass) {
		if( eclass.getEStructuralFeature(attribute.name) == null ) {
			throw new IllegalStateException("Could not find attribute '"+attribute.name+"' in '"+eclass.name+"'")
		}
		return eclass.getEStructuralFeature(attribute.name).EType.name == "EBoolean"
	}

	def static isSingle(EMappingAttribute attribute, EClass eclass) {
		return ! eclass.getEStructuralFeature(attribute.property).many
	}

	def static List<DatabaseSupport> findDatabaseSupport(EAttribute attribute) {
		if( attribute == null ) {
			return null;
		}
		val rv = new ArrayList
		for( v : attribute.valueGenerators ) {
			val s = getDatabaseSupport(v.dbType)
			if( s != null ) {
				rv.add(s);
			}
		}

		return rv;
	}

		def static getDatabaseSupport(String name) {
		if( DB_SUPPORTS.containsKey(name) ) {
			return DB_SUPPORTS.get(name)
		} else {
			val bundle = FrameworkUtil::getBundle(typeof(EMapGenerator))
			val serviceRef = bundle.bundleContext.getServiceReferences(typeof(DatabaseSupport),null)
			for( sr : serviceRef ) {
				val s = bundle.bundleContext.getService(sr)
				if( name == s.databaseId ) {
					DB_SUPPORTS.put(name, s);
					return s;
				}
			}
		}
	}

	def static sortValue(EAttribute a, EClass eClass) {
		if( a.pk ) {
			return 0;
		} else if( a.resolved ) {
			if( a.isSingle(eClass) ) {
				return 2;
			} else {
				return 3;
			}
		} else {
			return 1;
		}
	}

	def static fqn(ENamedQuery e) {
		val r = (e.eResource.contents.head as EMapping).root
		if( r instanceof EMappingEntityDef ) {
			val d = r as EMappingEntityDef;
			return d.package.name + "." + d.entity.name + "Mapper." + e.name
		}
		return "NOX DA"
	}

	def static fqn(EMappingEntityDef e) {
		return e.package.name + "." + e.entity.name + "Mapper";
	}

	def static fqn(EMappingEntity e) {
		val r = (e.eResource.contents.head as EMapping).root
		if( r instanceof EMappingEntityDef ) {
			val d = r as EMappingEntityDef;
			return d.package.name + "." + d.entity.name + "Mapper"
		}
		return "NOX DA"
	}

		def static isPrimitive(String type) {
		switch(type) {
			case "long": return true
			case "int": return true
		}
		return false;
	}

	def static String mapColumns(EObjectSection s) {
		val atts = s.entity.collectAllAttributes
		val id = atts.findFirst[a|a.pk]

		val StringBuilder b = new StringBuilder;
		b.append(atts.filter[a| ! a.resolved || a.parameters.head != id.columnName ].join(",\n",[a| s.prefix(a) + ".\"" + (if(a.resolved) a.parameters.head else a.columnName) + "\"\t" + s.prefix + "_" + if(a.resolved) a.parameters.head else a.columnName]))

		for( es : s.attributes.filter[a|a.map!=null] ) {
			b.append(",\n\n" + es.map.mapColumns)
		}

		return b.toString;
	}

	def static String prefix(EObjectSection s, EAttribute attribute) {
		val allDerivedAttributes = s.entity.collectDerivedAttributes
		if( allDerivedAttributes.containsKey(attribute.name) ) {
			if( ! attribute.pk || s.entity == attribute.eContainer ) {
				return s.prefix;
			} else {
				val ownerType = getDbOwnerType(attribute.eContainer as EMappingEntity, attribute)
				return s.prefix + if (ownerType == null) "__UNKNOWN__" else "_" + ownerType.name.toLowerCase
			}
		}
		val ownerType = getDbOwnerType(s.entity, attribute)
		return s.prefix + if (ownerType == null) "__UNKNOWN__" else "_" + ownerType.name.toLowerCase
	}

	def static EClass getDbOwnerType(EMappingEntity childEntity, EAttribute attribute) {
		val allDerivedAttributes = childEntity.collectDerivedAttributes
		if( allDerivedAttributes.containsKey(attribute.name) ) {
			return JavaHelper::getEClass(childEntity.etype)
		} else if( childEntity.parent != null && childEntity.extensionType == "extends" ) {
			return getDbOwnerType(childEntity.parent, attribute)
		}
		return null;
	}

	def static getOpposite(EAttribute a, EClass owner) {
		val r = owner.getEStructuralFeature(a.name) as EReference
		return r.EOpposite
	}

	def static getEntity(EAttribute a) {
		val r = a.eResource.contents.get(0) as EMapping
		return (r.root as EMappingEntityDef).entity
	}

	static def objectType(org.eclipse.emf.ecore.EAttribute f) {
		val s = f.EType.instanceClassName
		if( s == "long" ) {
			return "Long";
		}
		return s
	}
}
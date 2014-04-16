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
import com.google.inject.Inject
import at.bestsolution.persistence.emap.eMap.EType
import org.eclipse.emf.ecore.EEnum

class UtilCollection {
	var Map<String,DatabaseSupport> DB_SUPPORTS = new HashMap<String,DatabaseSupport>();

	@Inject
	var EClassLookup eClassLookup;

	def lookupEClass(EType type) {
		 eClassLookup.getEClass(type);
	}

	def lookupEClass(EMappingEntity entity) {
		entity.etype.lookupEClass
	}

	def lookupEClass(EMappingEntityDef entityDef) {
		entityDef.entity.lookupEClass
	}

	def <T> Iterable<T> filterDups(Iterable<T> unfiltered, Function2<T,T,Boolean> equals) {
		val s = new TreeSet<T>([T t1, T t2| if( equals.apply(t1,t2) ) return 0 else return 1 ] );
		val i = unfiltered.iterator;
		while( i.hasNext ) {
			s.add(i.next)
		}
		return s;
	}

	def isBoolean(EStructuralFeature e) {
		return e.EType.instanceClassName == "boolean" || e.EType.instanceClassName == "java.lang.Boolean"
	}

	def isPrimitive(EStructuralFeature e) {
		return newArrayList("int","long","double","float","boolean").contains(e.EType.instanceClassName)
	}

	def isNumeric(EStructuralFeature e) {
		return newArrayList("int","long","double","float","java.lang.Integer","java.lang.Long","java.lang.Double","java.lang.Float").contains(e.EType.instanceClassName)
	}

	def isString(EStructuralFeature e) {
		return "java.lang.String" == e.EType.instanceClassName;
	}

	def isDouble(EStructuralFeature e) {
		return e.EType.instanceClassName == "double" || e.EType.instanceClassName == "java.lang.Double"
	}

	def isInteger(EStructuralFeature e) {
		return e.EType.instanceClassName == "int" || e.EType.instanceClassName == "java.lang.Integer"
	}

	def isLong(EStructuralFeature e) {
		return e.EType.instanceClassName == "long" || e.EType.instanceClassName == "java.lang.Long"
	}

	def isFloat(EStructuralFeature e) {
		return e.EType.instanceClassName == "float" || e.EType.instanceClassName == "java.lang.Float"
	}

	def getResolvedType(EAttribute attribute, EClass eClass) {
		val f = eClass.getEStructuralFeature(attribute.name)
		return f.EType.instanceClassName
	}

	def getEAttribute(EAttribute attribute, EClass eClass) {
		val f = eClass.getEStructuralFeature(attribute.name)
		if( f instanceof EReference && attribute.resolved ) {
			val c = (f as EReference).EType as EClass
			return c.getEStructuralFeature((attribute.query.eContainer as EMappingEntity).getAllAttributes.findFirst[pk].name) as org.eclipse.emf.ecore.EAttribute
		}

		return f as org.eclipse.emf.ecore.EAttribute
	}

	def getAllAttributes(EMappingEntity entity) {
		val l = new ArrayList<EAttribute>
		entity.findAllAttributes(l,false)
		val eClass = entity.etype.lookupEClass
		l.sort([ a,b | return sortAttributes(eClass,a,b)])
		return l
	}

	def void findAllAttributes(EMappingEntity entity, ArrayList<EAttribute> l, boolean skipPrimary) {
		l.addAll(entity.attributes.filter[! skipPrimary || ! pk ])
		if( entity.parent != null ) {
			entity.parent.findAllAttributes(l, true)
		}
	}

	def sortAttributes(EClass eClass, EAttribute a, EAttribute b) {
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

	def isSingleAttribute(EAttribute attribute, EClass eclass) {
		if( eclass.getEStructuralFeature(attribute.name) == null ) {
			throw new IllegalStateException("Could not find attribute '"+attribute.name+"' in '"+eclass.name+"'")
		}
		return ! eclass.getEStructuralFeature(attribute.name).many
	}

	def parameterConversion(EParameter p, String name) {
		if( p.type == "long" ) {
			return "((Long)" + name + ").longValue()"
		} else if( p.type == "int" ) {
			return "((Integer)" + name + ").intValue()";
		} else if( p.type == "boolean" ) {
			return "((Boolean)" + name + ").booleanValue()";
		}
		return "("+p.type+")" + name;
	}

	def jdbcType(org.eclipse.emf.ecore.EAttribute f) {
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

	def jdbcType(EAttribute p, EClass eClass) {
		return getEAttribute(p,eClass).jdbcType;
	}

	def collectMappings(Iterable<EMappingAttribute> attributeList) {
		val l = new ArrayList<EObjectSection>;
		attributeList.forEach[it.map.collectMappingsRec(l)]
		return l;
	}

	def void collectMappingsRec(EObjectSection section, List<EObjectSection> list) {
		list.add(section);
		section.attributes.forEach[it.map.collectMappingsRec(list)]
	}

	def collectEnities(EMappingEntity rootEntity) {
		val entities = new HashSet<EMappingEntity>;
		rootEntity.namedQueries.forEach[entities.addAll(it.queries.head.mapping.attributes.collectMappings.map[it.entity])]
		return entities;
	}

	def compare(int x, int y) {
		if(x < y) {
			return -1
		}
		else if(x == y) {
			return 0
		} else {
			return 1;
		}
	}

	def pstmtMethod(org.eclipse.emf.ecore.EAttribute f) {
		if( f.EType.instanceClassName == "java.lang.String" ) {
			return "setString";
		} else if( f.EType.instanceClassName == "long" ) {
			return "setLong";
		} else if( f.EType.instanceClassName == "int" ) {
			return "setInt";
		} else if( f.EType.instanceClassName == "boolean" ) {
			return "setBoolean";
		} else if ( f.EType.instanceClassName == "java.util.Date") {
			return "setTimestamp";
		} else {
			return "setObject";
		}
	}

	def resultMethod(EAttribute attribute, String varName, EClass eClass, String keyName, String prefix) {
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

	def resultMethodType(EParameter p) {
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

	def tableName(EMappingEntityDef entityDef) {
		if( entityDef.entity.tableName == null ) {
			return entityDef.lookupEClass.name.toUpperCase
		}
		return entityDef.entity.tableName
	}

	def calcTableName(EMappingEntity entity) {
		if( entity.tableName == null ) {
			return entity.etype.lookupEClass.name.toUpperCase
		}
		return entity.tableName
	}

	def pstmtMethod(EParameter p) {
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

	def pstmtMethodCall(EAttribute p, EClass eClass, String varName ) {
		val rv = new StringBuilder(p.pstmtMethod(eClass)+"(i+1,")
		if( p.isBoolean(eClass) ) {
			rv.append(varName+".is"+p.name.toFirstUpper+"()");
		} else if(eClass.getEStructuralFeature(p.name).EType instanceof EEnum) {
			rv.append("session.convertType(String.class,"+varName+".get"+p.name.toFirstUpper+"())");
		} else if (eClass.getEStructuralFeature(p.name).EType.instanceClassName == "java.util.Date") {
			val date = varName+".get"+p.name.toFirstUpper+"()";
			rv.append(date + " == null ? null : ");
			rv.append("new java.sql.Timestamp("+date+".getTime())");
		} else {
			rv.append(varName+".get"+p.name.toFirstUpper+"()");
		}
		rv.append(")");
		return rv;
	}

	def pstmtMethod(EAttribute p, EClass eClass) {
		val f = eClass.getEStructuralFeature(p.name);
		if( f instanceof org.eclipse.emf.ecore.EAttribute ) {
			return (f as org.eclipse.emf.ecore.EAttribute).pstmtMethod
		} else {
			val c = (f as EReference).EType as EClass
			return (c.getEStructuralFeature((p.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name) as org.eclipse.emf.ecore.EAttribute).pstmtMethod;
		}
	}

	def packageName(EClass eClass) {
		return eClass.instanceClassName.substring(0,eClass.instanceClassName.lastIndexOf("."))
	}

	def collectAllAttributes(EMappingEntity entity) {
		val l = new ArrayList<EAttribute>
		entity.allAttributes(l)
		val eClass = entity.etype.lookupEClass;
		l.sort([ a,b | return sortAttributes(eClass,a,b)]);
		return l
	}

	def void allAttributes(EMappingEntity entity, ArrayList<EAttribute> l) {
		l.addAll(entity.attributes)
		if( entity.parent != null ) {
			entity.parent.allAttributes(l)
		}
	}

	def collectDerivedAttributes(EMappingEntity entity) {
		val map = new HashMap<String,EAttribute>
		entity.allDerivedAttributes(map)
		return map
	}

	def void allDerivedAttributes(EMappingEntity entity, Map<String, EAttribute> map) {
		for( a : entity.attributes ) {
			map.put(a.name,a);
		}
		if( entity.parent != null && entity.extensionType == "derived" ) {
			entity.parent.allDerivedAttributes(map)
		}
	}

	def isSingle(EAttribute attribute, EClass eclass) {
		if( eclass.getEStructuralFeature(attribute.name) == null ) {
			throw new IllegalStateException("Could not find attribute '"+attribute.name+"' in '"+eclass.name+"'")
		}
		return ! eclass.getEStructuralFeature(attribute.name).many
	}

	def isBoolean(EAttribute attribute, EClass eclass) {
		if( eclass.getEStructuralFeature(attribute.name) == null ) {
			throw new IllegalStateException("Could not find attribute '"+attribute.name+"' in '"+eclass.name+"'")
		}
//		println("=============> " + eclass.getEStructuralFeature(attribute.name).EType.name)
		return
			eclass.getEStructuralFeature(attribute.name).EType.name == "EBoolean"
			|| eclass.getEStructuralFeature(attribute.name).EType.name == "Boolean" // where does this type come from??
	}

	def isSingle(EMappingAttribute attribute, EClass eclass) {
		return ! eclass.getEStructuralFeature(attribute.property).many
	}

	def List<DatabaseSupport> findDatabaseSupport(EAttribute attribute) {
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


	def getDatabaseSupport(String name) {
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

	def sortValue(EAttribute a, EClass eClass) {
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

	def fqn(ENamedQuery e) {
		val r = (e.eResource.contents.head as EMapping).root
		if( r instanceof EMappingEntityDef ) {
			val d = r as EMappingEntityDef;
			return d.package.name + "." + d.entity.name + "Mapper." + e.name
		}
		return "NOX DA"
	}

	def fqn(EMappingEntityDef e) {
		return e.package.name + "." + e.entity.name + "Mapper";
	}

	def fqn(EMappingEntity e) {
		val r = (e.eResource.contents.head as EMapping).root
		if( r instanceof EMappingEntityDef ) {
			val d = r as EMappingEntityDef;
			return d.package.name + "." + d.entity.name + "Mapper"
		}
		return "NOX DA"
	}

	def isPrimitive(String type) {
		switch(type) {
			case "long": return true
			case "int": return true
		}
		return false;
	}

	def String mapColumns(EObjectSection s) {
		val atts = s.entity.collectAllAttributes
		val id = atts.findFirst[a|a.pk]

		val StringBuilder b = new StringBuilder;
		b.append(atts.filter[a| ! a.resolved || a.parameters.head != id.columnName ].join(",\n",[a| s.prefix(a) + ".\"" + (if(a.resolved) a.parameters.head else a.columnName) + "\"\t" + s.prefix + "_" + if(a.resolved) a.parameters.head else a.columnName]))
		b.append(",\n"+s.prefix+".\"E_VERSION\"\t"+s.prefix+"_E_VERSION");
		for( es : s.attributes.filter[a|a.map!=null] ) {
			b.append(",\n\n" + es.map.mapColumns)
		}

		return b.toString;
	}

	def String prefix(EObjectSection s, EAttribute attribute) {
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

	def EClass getDbOwnerType(EMappingEntity childEntity, EAttribute attribute) {
		val allDerivedAttributes = childEntity.collectDerivedAttributes
		if( allDerivedAttributes.containsKey(attribute.name) ) {
			return childEntity.lookupEClass
		} else if( childEntity.parent != null && childEntity.extensionType == "extends" ) {
			return getDbOwnerType(childEntity.parent, attribute)
		}
		return null;
	}

	def getOpposite(EAttribute a, EClass owner) {
		val r = owner.getEStructuralFeature(a.name) as EReference
		return r.EOpposite
	}

	def getEntity(EAttribute a) {
		val r = a.eResource.contents.get(0) as EMapping
		return (r.root as EMappingEntityDef).entity
	}

	def objectType(org.eclipse.emf.ecore.EAttribute f) {
		val s = f.EType.instanceClassName
		if( s == "long" ) {
			return "Long";
		}
		return s
	}
}

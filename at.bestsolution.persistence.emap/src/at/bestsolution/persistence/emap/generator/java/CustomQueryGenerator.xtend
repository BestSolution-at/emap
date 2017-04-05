/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.emap.generator.java

import at.bestsolution.persistence.emap.eMap.ENamedCustomQuery
import at.bestsolution.persistence.emap.eMap.EPredefinedType
import at.bestsolution.persistence.emap.eMap.ETypeDef
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import com.google.inject.Inject
import at.bestsolution.persistence.emap.generator.UtilCollection
import at.bestsolution.persistence.emap.eMap.EReturnType
import at.bestsolution.persistence.emap.eMap.EValueTypeAttribute
import java.util.List
import at.bestsolution.persistence.emap.eMap.EModelTypeDef
import org.eclipse.emf.ecore.EClass
import at.bestsolution.persistence.emap.eMap.EMapping
import java.util.ArrayList
import at.bestsolution.persistence.emap.eMap.ECustomQuery

class CustomQueryGenerator {
	@Inject extension
  	var UtilCollection util;

	val generatorCredit = "by " + class.simpleName;

	def anyWhere(ENamedCustomQuery q) {
		return q.queries.findFirst[where != null] != null;
	}

	def anyGroupBy(ENamedCustomQuery q) {
		return q.queries.findFirst[groupBy != null] != null;
	}

	def hasSpecificQuery(ENamedCustomQuery q) {
		return q.queries.findFirst[!dbType.equals("default")] != null;
	}

	def zip(List<Object> a, List<Object> b) {
  		var result = new ArrayList<List<Object>>
  		
  		var max = Math.max(a.size, b.size);
  		
  		for (var i = 0; i < max; i++) {
  			var el = new ArrayList<Object>
  			
  			el.add(a.get(i))
  			el.add(b.get(i))
  			
  			result.add(el)
  		}
  		return result;
  	}

	def computeColumns(ENamedCustomQuery namedQuery, ECustomQuery query, ETypeDef typeDef) {
		return query.columns.split(",")
			.map(x|x.trim as Object)
			.zip(typeDef.types.map[x|x.name])
	}



	def generateCustomQuery(EMappingEntityDef entityDef, ENamedCustomQuery q) '''
	// «generatorCredit»
	«IF q.parameters.empty && q.list»
	public final MappedQuery<«q.returnType.handle.toObjectType»> «q.name»MappedQuery() {
		MappedQuery<«q.returnType.handle.toObjectType»> dbQuery = session.getDatabaseSupport().createMappedQuery(
				this, null,
				new ListDelegate<«q.returnType.handle.toObjectType»>() { public List<«q.returnType.handle.toObjectType»> list(MappedQuery<«q.returnType.handle.toObjectType»> criteria) { return «q.name»((MappedQueryImpl<«q.returnType.handle.toObjectType»>)criteria); } }
			);
			return dbQuery;
	}

	final List<«q.returnType.handle.toObjectType»> «q.name»(MappedQueryImpl<«q.returnType.handle.toObjectType»> criteria) {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) LOGGER.debug("Executing «q.name»");

		String query;
		«IF q.anyWhere»String where;«ENDIF»
		«IF q.anyGroupBy»String groupBy;«ENDIF»
		«IF q.hasSpecificQuery»
			query = Util.loadFile(getClass(), "«entityDef.entity.name»_«q.name»_criteria_"+session.getDatabaseType()+".sql");
			«IF q.anyWhere»where = Util.loadFile(getClass(), "«entityDef.entity.name»_«q.name»_criteria_where_"+session.getDatabaseType()+".sql");«ENDIF»
			«IF q.anyGroupBy»groupBy = Util.loadFile(getClass(), "«entityDef.entity.name»_«q.name»_criteria_groupBy_"+session.getDatabaseType()+".sql");«ENDIF»
			if( query == null ) {
		«ENDIF»
			query = Util.loadFile(getClass(), "«entityDef.entity.name»_«q.name»_criteria_default.sql");
			«IF q.anyWhere»where = Util.loadFile(getClass(), "«entityDef.entity.name»_«q.name»_criteria_where_default.sql");«ENDIF»
			«IF q.anyGroupBy»groupBy = Util.loadFile(getClass(), "«entityDef.entity.name»_«q.name»_criteria_groupBy_default.sql");«ENDIF»
		«IF q.hasSpecificQuery»
			}
		«ENDIF»

		if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

		String criteriaStr = criteria.getCriteria();
		if( criteriaStr != null && ! criteriaStr.isEmpty() ) {
			«IF (q.returnType instanceof ETypeDef)»
			
				// aliases
				final Map<String, Map<String, String>> aliases = new HashMap<String, Map<String, String>>();
				«FOR x : q.queries»
					// «x.dbType»
					{
						final Map<String, String> dbMap = new HashMap<String, String>();
						«FOR a : computeColumns(q, x, q.returnType as ETypeDef)»
							dbMap.put("«a.get(1)»", "«a.get(0)»");
						«ENDFOR»
						aliases.put("«x.dbType»", dbMap);
					}	
				«ENDFOR»
				
				// apply aliases
				Map<String, String> al = aliases.get(session.getDatabaseType());
				if (al == null) {
					al = aliases.get("default");
				}
				for (Map.Entry<String, String> e : al.entrySet()) {
					criteriaStr = criteriaStr.replaceAll("@"+e.getKey(), e.getValue());
				}
			«ENDIF»
			query += " WHERE (" + criteriaStr + ")";
			«IF q.anyWhere»
			if( where != null ) {
				query += " AND " + where;
			}
			«ENDIF»
		}«IF q.anyWhere» else if( where != null ) {
			query += " WHERE " + where;
		}«ENDIF»

		«IF q.anyGroupBy»
		if( groupBy != null ) {
			query += " GROUP BY " + groupBy;
		}
		«ENDIF»

		if( isDebug ) LOGGER.debug("	Constructed query: " + query);

		query = criteria.processSQL(query);

		if( isDebug ) LOGGER.debug("	Final query: " + query);

		Connection connection = session.checkoutConnection();
		«IF q.returnType instanceof EModelTypeDef»
			«FOR a : (q.returnType as EModelTypeDef).attributes.filter[a|a.query != null]»
			Map<Object,«((q.returnType as EModelTypeDef).eclassDef.lookupEClass.getEStructuralFeature(a.name).EType as EClass).instanceClassName»> «a.name»Objects;

			«IF a.cached»
			«a.name»Objects = (Map<Object,«((q.returnType as EModelTypeDef).eclassDef.lookupEClass.getEStructuralFeature(a.name).EType as EClass).instanceClassName»>)(Map<Object,?>)session.getCache().getQueryMapResult("«IF a.cacheName == null»«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn»«a.query.name»«ELSE»«a.cacheName»«ENDIF»");
			if( «a.name»Objects == null )«ENDIF»
			{
				«a.name»Objects = new HashMap<Object,«((q.returnType as EModelTypeDef).eclassDef.lookupEClass.getEStructuralFeature(a.name).EType as EClass).instanceClassName»>();
				«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn» mapper = session.createMapper(«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».class);

				for( «((q.returnType as EModelTypeDef).eclassDef.lookupEClass.getEStructuralFeature(a.name).EType as EClass).instanceClassName» o : mapper.«a.query.name»(«a.parameters.join(",")») ) {
					«a.name»Objects.put(mapper.getPrimaryKeyValue(o),o);
				}
				«IF a.cached»
				session.getCache().putQueryMapResult((Map<Object,EObject>)(Map<Object,?>)«a.name»Objects,"«IF a.cacheName == null»«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn»«a.query.name»«ELSE»«a.cacheName»«ENDIF»");
				«ENDIF»
			}
			«ENDFOR»
		«ENDIF»
		try {
			PreparedStatement pstmt = connection.prepareStatement(query);
			int idx = 1;
			for(TypedValue t : criteria.getParameters()) {
				Util.setValue(pstmt,idx++,t);
			}

			ResultSet set = pstmt.executeQuery();
			List<«q.returnType.handle.toObjectType»> rv = new ArrayList<«q.returnType.handle.toObjectType»>();
			while( set.next() ) {
				«IF q.returnType instanceof EModelTypeDef»
				rv.add(map_«q.name»(set«IF !(q.returnType as EModelTypeDef).attributes.filter[a|a.query != null].empty»,«(q.returnType as EModelTypeDef).attributes.filter[a|a.query != null].map[name+"Objects"].join(",")»«ENDIF»));
				«ELSE»
				rv.add(map_«q.name»(set));
				«ENDIF»
			}
			return rv;
		} catch(SQLException e) {
			throw new PersistanceException(e);
		} finally {
			session.returnConnection(connection);
		}
	}
	«ENDIF»

	public final «IF q.list»List<«q.returnType.handle.toObjectType»>«ELSE»«q.returnType.handle»«ENDIF» «q.name»(«q.parameters.join(",",[p|"final " + p.parameterType + " " + p.name])») {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) LOGGER.debug("Started '«q.name»'");
		«IF q.list»List<«q.returnType.handle.toObjectType»>«ELSE»«q.returnType.handle»«ENDIF» rv = «IF q.list»new ArrayList<«q.returnType.handle.toObjectType»>()«ELSE»«IF q.returnType.boolean»false«ELSEIF q.returnType.primitive»0«ELSE»null«ENDIF»«ENDIF»;

		Connection connection = session.checkoutConnection();
		«IF q.returnType instanceof EModelTypeDef»
			«FOR a : (q.returnType as EModelTypeDef).attributes.filter[a|a.query != null]»
			Map<Object,«((q.returnType as EModelTypeDef).eclassDef.lookupEClass.getEStructuralFeature(a.name).EType as EClass).instanceClassName»> «a.name»Objects;

			«IF a.cached»
			«a.name»Objects = (Map<Object,«((q.returnType as EModelTypeDef).eclassDef.lookupEClass.getEStructuralFeature(a.name).EType as EClass).instanceClassName»>)(Map<Object,?>)session.getCache().getQueryMapResult("«IF a.cacheName == null»«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn»«a.query.name»«ELSE»«a.cacheName»«ENDIF»");
			if( «a.name»Objects == null )«ENDIF»
			{
				«a.name»Objects = new HashMap<Object,«((q.returnType as EModelTypeDef).eclassDef.lookupEClass.getEStructuralFeature(a.name).EType as EClass).instanceClassName»>();
				«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn» mapper = session.createMapper(«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».class);

				for( «((q.returnType as EModelTypeDef).eclassDef.lookupEClass.getEStructuralFeature(a.name).EType as EClass).instanceClassName» o : mapper.«a.query.name»(«a.parameters.join(",")») ) {
					«a.name»Objects.put(mapper.getPrimaryKeyValue(o),o);
				}
				«IF a.cached»
				session.getCache().putQueryMapResult((Map<Object,EObject>)(Map<Object,?>)«a.name»Objects,"«IF a.cacheName == null»«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn»«a.query.name»«ELSE»«a.cacheName»«ENDIF»");
				«ENDIF»
			}
			«ENDFOR»
		«ENDIF»

		PreparedStatement pstmt = null;
		ResultSet set = null;

		String query;
		«IF q.hasSpecificQuery»
			query = Util.loadFile(getClass(), "«entityDef.entity.name»_«q.name»_"+session.getDatabaseType()+".sql");
			if( query == null ) {
		«ENDIF»
			query = Util.loadFile(getClass(), "«entityDef.entity.name»_«q.name»_default.sql");
		«IF q.hasSpecificQuery»
			}
		«ENDIF»
		if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

		try {
			«IF ! q.parameters.empty»
				«IF q.parameters.findFirst[list] != null»
					final ProcessedSQL processedSQL = Util.processSQL(query, new at.bestsolution.persistence.Function<String,List<?>>() {
						public List<?> execute(String name) {
							«val first = q.parameters.filter[list].head»
							«FOR p : q.parameters.filter[list]»
							«IF p != first»else «ENDIF»if( "«p.name»".equals(name)) {
								return «p.name»;
							}
							«ENDFOR»
							return null;
						}
					});
				«ELSE»
					final ProcessedSQL processedSQL = Util.processSQL(query);
				«ENDIF»
				if( isDebug ) {
					LOGGER.debug("	Processed-Query: " + processedSQL.sql);
				}

				if( isDebug ) LOGGER.debug("Preparing query");
				pstmt = connection.prepareStatement(processedSQL.sql);

				List<String> debugParams = new ArrayList<String>();
				int paramIndex = 1;
				for(int i = 0; i < processedSQL.dynamicParameterNames.size(); i++) {
					if( "«q.parameters.head.name»".equals(processedSQL.dynamicParameterNames.get(i)) ) {
						if( isDebug ) {
							debugParams.add("«q.parameters.head.name» = " + «q.parameters.head.name»);
						}
						«IF q.parameters.head.list»
							List<TypedValue> typedValues = processedSQL.listValueMaps.get("«q.parameters.head.name»");
							if( typedValues != null ) {
								for( TypedValue typedValue : typedValues ) {
									Util.setValue(pstmt,paramIndex++,typedValue);
								}
							}
						«ELSE»
							pstmt.«q.parameters.head.pstmtMethod("paramIndex++", q.parameters.head.name)»;
						«ENDIF»
					}
				«FOR p : q.parameters.filter[it!=q.parameters.head]»
					else if("«p.name»".equals(processedSQL.dynamicParameterNames.get(i))) {
						if( isDebug ) {
							debugParams.add("«p.name» = " + «p.name»);
						}
						«IF p.list»
							List<TypedValue> typedValues = processedSQL.listValueMaps.get("«p.name»");
							if( typedValues != null ) {
								for( TypedValue typedValue : typedValues ) {
									Util.setValue(pstmt,paramIndex++,typedValue);
								}
							}
						«ELSE»
							pstmt.«p.pstmtMethod("paramIndex++",p.name)»;
						«ENDIF»
					}
				«ENDFOR»
				}
				if( isDebug ) {
					LOGGER.debug(" Dynamic-Parameters: " + debugParams);
				}
           «ELSE»
				if( isDebug ) LOGGER.debug("Preparing query");
				pstmt = connection.prepareStatement(query);
			«ENDIF»
			if( isDebug ) LOGGER.debug("Executing query");
			set = pstmt.executeQuery();

			«IF q.list»
			while( set.next() ) {
				rv.add(map_«q.name»(set«q.returnType.createMapParamsForCall»));
			}
			«ELSE»
			if( set.next() ) {
				rv = map_«q.name»(set«q.returnType.createMapParamsForCall»);
			}
			«ENDIF»
			set.close();
			set = null;
			pstmt.close();
			pstmt = null;
			if( isDebug ) LOGGER.debug("Finished '«q.name»'");
			return rv;
		} catch(SQLException e) {
			throw new PersistanceException(e);
		} finally {
			try {
				if( set != null ) {
					set.close();
				}
				if( pstmt != null ) {
					pstmt.close();
				}
			} catch(SQLException e) {
				LOGGER.fatal("Unable to clean up resources", e);
			} finally {
				session.returnConnection(connection);
			}
		}
	}

	private final «q.returnType.handle» map_«q.name»(ResultSet set«q.returnType.createMapParamsForDecl») throws SQLException {
		«IF q.returnType.string»
			return set.getString(1);
		«ELSEIF q.returnType.map»
			return Util.mapResultSet(set);
		«ELSEIF q.returnType.primitive»
			return set.«(q.returnType as EPredefinedType).resultMethodType»(1);
		«ELSEIF q.returnType instanceof ETypeDef»
			return new «(q.returnType as ETypeDef).fqn(entityDef)»(«(q.returnType as ETypeDef).types.join(',', [valueAttributeHandle])»);
		«ELSEIF q.returnType instanceof EModelTypeDef»
			«q.returnType.handle» rv = («(q.returnType as EModelTypeDef).eclassDef.lookupEClass.instanceClassName»)EcoreUtil.create(«(q.returnType as EModelTypeDef).eclassDef.lookupEClass.toFullQualifiedJavaEClass»);
			«FOR a : (q.returnType as EModelTypeDef).attributes»
				«IF a.query != null»
					rv.set«a.name.toFirstUpper»(«a.name»Objects.get(set.getLong(«(q.returnType as EModelTypeDef).attributes.indexOf(a)»)));
				«ELSE»
					rv.set«a.name.toFirstUpper»(«(q.returnType as EModelTypeDef).eclassDef.lookupEClass.getEStructuralFeature(a.name).resultMethod("set",(q.returnType as EModelTypeDef).attributes.indexOf(a))»);
				«ENDIF»
			«ENDFOR»
			return rv;
		«ELSE»
			return «(q.returnType as EPredefinedType).ref».valueOf(set.getObject(1) == null ? null : set.getObject()+"");
		«ENDIF»
	}
	'''

	def createMapParamsForDecl(EReturnType returnType) '''
	«IF returnType.modelTypeDef»
		«var modelTypeDef = returnType as EModelTypeDef»
		«IF !modelTypeDef.attributes.filter[a|a.query != null].empty»
			«FOR a : modelTypeDef.attributes.filter[a|a.query != null]»,
			Map<Object,«(modelTypeDef.eclassDef.lookupEClass.getEStructuralFeature(a.name).EType as EClass).instanceClassName»>«a.name»Objects
			«ENDFOR»
		«ENDIF»
	«ENDIF»
	'''

	def createMapParamsForCall(EReturnType returnType) '''
	«IF returnType.modelTypeDef»
		«var modelTypeDef = returnType as EModelTypeDef»
		«IF !modelTypeDef.attributes.filter[a|a.query != null].empty»,
			«modelTypeDef.attributes.filter[a|a.query != null].map[name+"Objects"].join(",")»
		«ENDIF»
	«ENDIF»
	'''

	def isPredefinedType(EReturnType type) {
		type instanceof EPredefinedType
	}

	def isTypeDef(EReturnType type) {
		type instanceof ETypeDef
	}

	def isModelTypeDef(EReturnType type) {
		type instanceof EModelTypeDef
	}

	def fqn( ETypeDef d, EMappingEntityDef edf) {
		if(  d.name.indexOf('.') == -1 ) {
			return edf.package.name + "." + d.name
		}
		return d.name
	}

	def valueAttributeHandle(EValueTypeAttribute a) {
		return a.type.resultMethodType("set",((a.eContainer.eGet(a.eContainingFeature) as List<?>).indexOf(a)+1))
	}

	def resultMethodType(EPredefinedType p) {
		if( "String" == p.ref ) {
			return "getString"
		} else if( "long" == p.ref ) {
			return "getLong"
		} else if( "int" == p.ref ) {
			return "getInt"
		} else if( "double" == p.ref ) {
			return "getDouble"
		} else if( "float" == p.ref ) {
			return "getFloat"
		} else if( "boolean" == p.ref ) {
			return "getBoolean"
		}
	}

	def resultMethodType(EPredefinedType p, String resultName, int index) {
		if( "String" == p.ref ) {
			return resultName + ".getString("+index+")"
		} else if( "long" == p.ref ) {
			return resultName + ".getLong"
		} else if( "int" == p.ref ) {
			return resultName + ".getInt"
		} else if( "double" == p.ref ) {
			return resultName + ".getDouble"
		} else if( "float" == p.ref ) {
			return resultName + ".getFloat"
		} else if( "boolean" == p.ref ) {
			return resultName + ".getBoolean"
		} else {
			return "("+p.ref+")session.convertType("+p.ref+".class,"+resultName + ".getObject("+index+")"+")"
		}
	}

	def resultMethodType(String p) {
		if( "String" == p ) {
			return "getString"
		} else if( "long" == p ) {
			return "getLong"
		} else if( "int" == p ) {
			return "getInt"
		} else if( "double" == p ) {
			return "getDouble"
		} else if( "float" == p ) {
			return "getFloat"
		} else {
			return "getBoolean"
		}
	}

	def resultMethodType(String p, String resultName, int index) {
		if( "String" == p ) {
			return resultName + ".getString("+index+")"
		} else if( "long" == p ) {
			return resultName + ".getLong("+index+")"
		} else if( "int" == p ) {
			return resultName + ".getInt("+index+")"
		} else if( "double" == p ) {
			return resultName + ".getDouble("+index+")"
		} else if( "float" == p ) {
			return resultName + ".getFloat("+index+")"
		} else if( "boolean" == p ) {
			return resultName + ".getBoolean("+index+")"
		} else {
			return "("+p+")session.convertType("+p+".class,"+resultName + ".getObject("+index+")"+")"
		}
	}

	def isPrimitive(EReturnType t) {
		return t instanceof EPredefinedType && (t as EPredefinedType).ref.primitive
	}

	def isBoolean(EReturnType t) {
		return t instanceof EPredefinedType && (t as EPredefinedType).ref == 'boolean'
	}

	def isString(EReturnType t) {
		return t instanceof EPredefinedType && (t as EPredefinedType).ref == 'String'
	}

	def isMap(EReturnType t) {
		return t instanceof EPredefinedType && (t as EPredefinedType).ref == 'map'
	}

  	def static toObjectType(String type) {
		switch(type) {
			case "long": return "Long"
			case "int": return "Integer"
			case "double": return "Double"
			case "float": return "Float"
			case "boolean": return "Boolean"
			case "map": return "java.util.Map<String,Object>"
			default: return type
		}
  	}
}
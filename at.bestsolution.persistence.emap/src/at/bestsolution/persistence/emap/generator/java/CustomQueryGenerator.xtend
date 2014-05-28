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
import at.bestsolution.persistence.emap.eMap.EMapping

class CustomQueryGenerator {
	@Inject extension
  	var UtilCollection util;

	val generatorCredit = "by " + class.simpleName;

	def generateCustomQuery(EMappingEntityDef entityDef, ENamedCustomQuery q) '''
	// «generatorCredit»
	public final «IF q.list»List<«q.returnType.handle.toObjectType»>«ELSE»«q.returnType.handle»«ENDIF» «q.name»(«q.parameters.join(",",[p|p.type + " " + p.name])») {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) LOGGER.debug("Started '«q.name»'");
		«IF q.list»List<«q.returnType.handle.toObjectType»>«ELSE»«q.returnType.handle»«ENDIF» rv = «IF q.list»new ArrayList<«q.returnType.handle.toObjectType»>()«ELSE»«IF q.returnType.boolean»false«ELSEIF q.returnType.primitive»0«ELSE»null«ENDIF»«ENDIF»;

		Connection connection = session.checkoutConnection();
		PreparedStatement pstmt = null;
		ResultSet set = null;

		String query = Util.loadFile(getClass(), "«entityDef.entity.name»_«q.name»_"+session.getDatabaseType()+".sql");
		if( query == null ) {
			query = Util.loadFile(getClass(), "«entityDef.entity.name»_«q.name»_default.sql");
		}
		if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

		try {
			«IF ! q.parameters.empty»
				final ProcessedSQL processedSQL = Util.processSQL(query);
				if( isDebug ) {
					LOGGER.debug("	Processed-Query: " + processedSQL.sql);
				}

				if( isDebug ) LOGGER.debug("Preparing query");
				pstmt = connection.prepareStatement(processedSQL.sql);

				List<String> debugParams = new ArrayList<String>();
				for(int i = 0; i < processedSQL.dynamicParameterNames.size(); i++) {
					if( "«q.parameters.head.name»".equals(processedSQL.dynamicParameterNames.get(i)) ) {
						if( isDebug ) {
							debugParams.add("«q.parameters.head.name» = " + «q.parameters.head.name»);
						}
						pstmt.«q.parameters.head.pstmtMethod»(i+1,«q.parameters.head.name»);
					}
				«FOR p : q.parameters.filter[it!=q.parameters.head]»
					else if("«p.name»".equals(processedSQL.dynamicParameterNames.get(i))) {
						if( isDebug ) {
							debugParams.add("«p.name» = " + «p.name»);
						}
						pstmt.«p.pstmtMethod»(i+1,«p.name»);
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
				«IF q.returnType.string»
				rv.add(set.getString(1));
				«ELSEIF q.returnType.map»
				rv.add(Util.mapResultSet(set));
				«ELSEIF q.returnType.primitive»
				rv.add((«(q.returnType as EPredefinedType).ref.toObjectType»)set.getObject(1));
				«ELSEIF q.returnType instanceof ETypeDef»
				rv.add(new «(q.returnType as ETypeDef).handle»(«(q.returnType as ETypeDef).types.join(',', [valueAttributeHandle])»));
				«ELSE»
				rv.add(«(q.returnType as EPredefinedType).ref».valueOf(set.getObject(1) == null ? null : set.getObject()+""));
				«ENDIF»
			}
			«ELSE»
			if( set.next() ) {
				«IF q.returnType.string»
				rv = set.getString(1);
				«ELSEIF q.returnType.map»
				rv = Util.mapResultSet(set);
				«ELSEIF q.returnType.primitive»
				rv = set.«(q.returnType as EPredefinedType).resultMethodType»(1);
				«ELSEIF q.returnType instanceof ETypeDef»
				rv = new «(q.returnType as ETypeDef).fqn(entityDef)»(«(q.returnType as ETypeDef).types.join(',', [valueAttributeHandle])»);
				«ELSE»
				rv = «(q.returnType as EPredefinedType).ref».valueOf(set.getObject(1) == null ? null : set.getObject()+"");
				«ENDIF»
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
	'''

	def fqn( ETypeDef d, EMappingEntityDef edf) {
		if(  d.name.indexOf('.') == -1 ) {
			return edf.package.name + "." + d.name
		}
		return d.name
	}

	def valueAttributeHandle(EValueTypeAttribute a) {
		return "set." + a.type.resultMethodType() + "(" + ((a.eContainer.eGet(a.eContainingFeature) as List<?>).indexOf(a)+1) + ")"
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
		} else {
			return "getBoolean"
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

  	def static dispatch handle(EPredefinedType e) {
		return e.ref;
  	}

  	def static dispatch handle(ETypeDef e) {
		return if (e.name.indexOf('.') == -1) ((e.eResource.contents.head as EMapping).root as EMappingEntityDef).package.name+"."+e.name else e.name;
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
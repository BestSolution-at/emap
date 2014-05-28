package at.bestsolution.persistence.emap.generator.java

import at.bestsolution.persistence.emap.generator.UtilCollection
import com.google.inject.Inject
import at.bestsolution.persistence.emap.eMap.ENamedQuery
import at.bestsolution.persistence.emap.eMap.ReturnType
import org.eclipse.emf.ecore.EClass
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import at.bestsolution.persistence.emap.eMap.EObjectSection
import at.bestsolution.persistence.emap.eMap.EMappingAttribute

class QueryGenerator {
	@Inject extension
  	var UtilCollection util;
  	
  	@Inject
	var JavaUtilGenerator utilGen;

	val generatorCredit = "by " + class.simpleName;
	
	def generateQuery(EMappingEntityDef entityDef, EClass eClass, ENamedQuery query) '''
	// «generatorCredit»
	@Override
	public final «IF query.returnType == ReturnType.LIST»java.util.List<«ENDIF»«eClass.instanceClassName»«IF query.returnType == ReturnType::LIST»>«ENDIF» «query.name»(«query.parameters.join(",",[p|p.type + " " + p.name])») {
		final boolean isDebug = LOGGER.isDebugEnabled();
		«IF query.returnType == ReturnType.SINGLE && query.parameters.size == 1 && query.parameters.head.id»
			if( isDebug ) LOGGER.debug("Check id cache for object");
			{
				final EClass eClass = «eClass.toFullQualifiedJavaEClass»;
				final «eClass.name» rv = session.getCache().getObject(eClass,«query.parameters.head.name»);
				if( rv != null ) {
					if( isDebug ) LOGGER.debug("Using cached object");
					return rv;
				}
			}
		«ENDIF»
		if( isDebug ) LOGGER.debug("Executing «query.name»");

		String query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_"+session.getDatabaseType()+".sql");
		if( query == null ) {
			query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_default.sql");
		}

		if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

		Connection connection = session.checkoutConnection();
		PreparedStatement pStmt = null;
		ResultSet set = null;
		try {
		«IF !query.parameters.empty»
			final ProcessedSQL processedSQL = Util.processSQL(query);
			if( isDebug ) {
				LOGGER.debug("	Processed-Query: " + processedSQL.sql);
			}

			if( isDebug ) LOGGER.debug("Preparing query");
			pStmt = connection.prepareStatement(processedSQL.sql);

			List<String> debugParams = new ArrayList<String>();
			for(int i = 0; i < processedSQL.dynamicParameterNames.size(); i++) {
				if( "«query.parameters.head.name»".equals(processedSQL.dynamicParameterNames.get(i)) ) {
					if( isDebug ) {
						debugParams.add("«query.parameters.head.name» = " + «query.parameters.head.name»);
					}
					pStmt.«query.parameters.head.pstmtMethod»(i+1,«query.parameters.head.name»);
				}
			«FOR p : query.parameters.filter[it!=query.parameters.head]»
				else if("«p.name»".equals(processedSQL.dynamicParameterNames.get(i))) {
					if( isDebug ) {
						debugParams.add("«p.name» = " + «p.name»);
					}
					pStmt.«p.pstmtMethod»(i+1,«p.name»);
				}
			«ENDFOR»
			}
			if( isDebug ) {
				LOGGER.debug(" Dynamic-Parameters: " + debugParams);
			}
    	«ELSE»
			if( isDebug ) LOGGER.debug("Preparing query");
			pStmt = connection.prepareStatement(query);
    	«ENDIF»
		if( isDebug ) LOGGER.debug("Executing query");
		set = pStmt.executeQuery();

		«IF query.returnType == ReturnType.LIST»
			final List<«eClass.name»> rv = new ArrayList<«eClass.name»>();
			«mapListResult(query,eClass)»
        «ELSE»
			final «eClass.name» rv;
			«mapSingleResult(query, eClass)»
		«ENDIF»
			set.close();
			set = null;
			pStmt.close();
			pStmt = null;
			if( isDebug ) LOGGER.debug("Mapping result ended");
			return rv;
		} catch(SQLException e) {
			throw new PersistanceException(e);
		} finally {
			try {
				if( set != null ) {
					set.close();
				}

				if( pStmt != null ) {
					pStmt.close();
				}
			} catch(SQLException e) {
				LOGGER.fatal("Unable to clean up resources", e);
			} finally {
				session.returnConnection(connection);
			}
		}
	}
	«IF !query.queries.head.mapping.attributes.empty»
		// «generatorCredit»
		public final «eClass.name» map_«query.name»_«eClass.name»(Connection connection, ResultSet set) throws SQLException {
			Object id = set.getObject("«query.queries.head.mapping.prefix+"_"»«entityDef.entity.allAttributes.findFirst[pk].columnName»");
			final EClass eClass = «eClass.toFullQualifiedJavaEClass»;
			«eClass.name» rv = session.getCache().getObject(eClass,id);
			if( rv != null ) {
				if( LOGGER.isDebugEnabled() ) {
					LOGGER.debug("Using cached version");
				}
				return rv;
			}
			rv = session.getProxyFactory().createProxy(eClass);
			((EObject)rv).eSetDeliver(false);
			«attrib_resultMapContent("rv",query.queries.head.mapping,query.queries.head.mapping.entity.lookupEClass,query.queries.head.mapping.prefix+"_")»
			((EObject)rv).eSetDeliver(true);
			session.registerObject(rv,getPrimaryKeyValue(rv), getLockColumn() != null ? set.getLong("«query.queries.head.mapping.prefix+"_"»"+getLockColumn()) : -1);
			return rv;
		}

		«FOR section : query.queries.head.mapping.attributes.collectMappings»
			«var entityEClass = section.entity.lookupEClass»
			// «generatorCredit»
			public final «entityEClass.instanceClassName» map_«query.name»_«entityEClass.name»(Connection connection, ResultSet set) throws SQLException {
				Object id = set.getObject("«section.prefix+"_"»«section.entity.allAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.name] == null].findFirst[pk].columnName»");
				if( id == null ) {
					return null;
				}
				final EClass eClass = «entityEClass.toFullQualifiedJavaEClass»;
				«entityEClass.instanceClassName» rv = session.getCache().getObject(eClass,id);
				if( rv != null) {
					if( LOGGER.isDebugEnabled() ) {
						LOGGER.debug("Using cached version");
					}
					return rv;
				}
				rv = session.getProxyFactory().createProxy(eClass);
				((EObject)rv).eSetDeliver(false);
				«attrib_resultMapContent("rv", section, entityEClass, section.prefix+"_")»
				((EObject)rv).eSetDeliver(true);
				session.registerObject(rv, id, getLockColumn() != null ? set.getLong("«section.prefix+"_"»"+getLockColumn()) : -1);
				return rv;
			}
		«ENDFOR»
	«ENDIF»
	«IF query.parameters.empty»
		// «generatorCredit»
		public final MappedQuery<«eClass.name»> «query.name»MappedQuery() {
			MappedQuery<«eClass.name»> dbQuery = session.getDatabaseSupport().createMappedQuery(
				this, «IF query.queries.head.mapping.prefix != null»"«query.queries.head.mapping.prefix»"«ELSE»null«ENDIF»,
				new ListDelegate<«eClass.name»>() { public List<«eClass.name»> list(MappedQuery<«eClass.name»> criteria) { return «query.name»((MappedQueryImpl<«eClass.name»>)criteria); } }
			);
			return dbQuery;
		}

		final List<«eClass.name»> «query.name»(MappedQueryImpl<«eClass.name»> criteria) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) LOGGER.debug("Executing «query.name»");

			String query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_criteria_"+session.getDatabaseType()+".sql");
			if( query == null ) {
				query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_criteria_default.sql");
			}

			if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

			String criteriaStr = criteria.getCriteria();
			if( criteriaStr != null && ! criteriaStr.isEmpty() ) {
				query += " WHERE " + criteriaStr;
			}

			if( isDebug ) LOGGER.debug("	Final query: " + query);

			Connection connection = session.checkoutConnection();
			try {
				PreparedStatement pstmt = connection.prepareStatement(query);
				int idx = 1;
				for(TypedValue t : criteria.getParameters()) {
					Util.setValue(pstmt,idx++,t);
				}

				ResultSet set = pstmt.executeQuery();
				List<«eClass.name»> rv = new ArrayList<«eClass.name»>();
				«mapListResult(query,eClass)»
				return rv;
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
		}
	«ENDIF»
	'''
	
	def mapSingleResult(ENamedQuery query, EClass eClass) '''
	// «generatorCredit»
	«IF query.queries.head.mapping.attributes.empty»
		if( isDebug ) LOGGER.debug("Mapping result started");
		if( set.next() ) {
			rv = map_default_«eClass.name»(connection,set);
		} else {
			if( isDebug ) LOGGER.debug("No result for query");
			rv = null;
		}
		if( isDebug ) LOGGER.debug("Mapping result ended.");
	«ELSE»
		try {
			inAutoResolve = true;
			Set<«eClass.name»> rootSet = new HashSet<«eClass.name»>();
			«eClass.name» current_«eClass.name»;
			«FOR section : query.queries.head.mapping.attributes.collectMappings»
				«section.entity.lookupEClass.instanceClassName» current_«section.entity.lookupEClass.name»;
			«ENDFOR»
			if( isDebug ) LOGGER.debug("Mapping with nested results started");
			if (set.next()) {
				current_«eClass.name» = map_«query.name»_«eClass.name»(connection, set);
				((EObject)current_«eClass.name»).eSetDeliver(false);
				«FOR section : query.queries.head.mapping.attributes.collectMappings»
					«var entityEClass = section.entity.lookupEClass»
					current_«entityEClass.name» = map_«query.name»_«entityEClass.name»(connection, set);

					if( current_«entityEClass.name» != null ) {
						((EObject)current_«entityEClass.name»).eSetDeliver(false);
						«IF section.submapOwner.getEStructuralFeature((section.eContainer as EMappingAttribute).property).many»
							current_«section.submapOwner.name».get«(section.eContainer as EMappingAttribute).property.toFirstUpper»().add(current_«entityEClass.name»);
						«ELSE»
							current_«section.submapOwner.name».set«(section.eContainer as EMappingAttribute).property.toFirstUpper»(current_«entityEClass.name»);
						«ENDIF»
					}
				«ENDFOR»
				«FOR section : query.queries.head.mapping.attributes.collectMappings»
					«var entityEClass = section.entity.lookupEClass»
					if( current_«entityEClass.name» != null ) {
						((EObject)current_«entityEClass.name»).eSetDeliver(true);
					}
				«ENDFOR»

				((EObject)current_«eClass.name»).eSetDeliver(true);

				
				rv = current_«eClass.name»;

			}
			else {
				if( isDebug ) LOGGER.debug("No result for query");
				rv = null;
			}
			if( isDebug ) LOGGER.debug("Mapping with nested results ended.");
		}
		finally {
			inAutoResolve = false;
		}
    «ENDIF»
	'''
	
	
	def mapListResult(ENamedQuery query, EClass eClass) '''
	// «generatorCredit»
	«IF query.queries.head.mapping.attributes.empty»
		if( isDebug ) LOGGER.debug("Mapping results started");
		while(set.next()) {
			rv.add(map_default_«eClass.name»(connection, set));
		}
		if( isDebug ) LOGGER.debug("Mapping results ended. Mapped '"+rv.size()+"' objects.");
	«ELSE»
		try {
			inAutoResolve = true;
			Set<«eClass.name»> rootSet = new HashSet<«eClass.name»>();
			«eClass.name» current_«eClass.name»;
			«FOR section : query.queries.head.mapping.attributes.collectMappings»
				«section.entity.lookupEClass.instanceClassName» current_«section.entity.lookupEClass.name»;
			«ENDFOR»
			if( isDebug ) LOGGER.debug("Mapping with nested results started");
			while(set.next()) {
				current_«eClass.name» = map_«query.name»_«eClass.name»(connection, set);
				((EObject)current_«eClass.name»).eSetDeliver(false);
				«FOR section : query.queries.head.mapping.attributes.collectMappings»
					«var entityEClass = section.entity.lookupEClass»
					current_«entityEClass.name» = map_«query.name»_«entityEClass.name»(connection, set);

					if( current_«entityEClass.name» != null ) {
						((EObject)current_«entityEClass.name»).eSetDeliver(false);
						«IF section.submapOwner.getEStructuralFeature((section.eContainer as EMappingAttribute).property).many»
							current_«section.submapOwner.name».get«(section.eContainer as EMappingAttribute).property.toFirstUpper»().add(current_«entityEClass.name»);
						«ELSE»
							current_«section.submapOwner.name».set«(section.eContainer as EMappingAttribute).property.toFirstUpper»(current_«entityEClass.name»);
						«ENDIF»
					}
				«ENDFOR»
				«FOR section : query.queries.head.mapping.attributes.collectMappings»
					«var entityEClass = section.entity.lookupEClass»
					if( current_«entityEClass.name» != null ) {
						((EObject)current_«entityEClass.name»).eSetDeliver(true);
					}
				«ENDFOR»

				((EObject)current_«eClass.name»).eSetDeliver(true);

				// fill final list
				if(!rootSet.contains(current_«eClass.name»)) {
					rv.add(current_«eClass.name»);
					rootSet.add(current_«eClass.name»);
				}
			}
			if( isDebug ) LOGGER.debug("Mapping with nested results ended. Mapped '"+rv.size()+"' objects.");
		}
		finally {
			inAutoResolve = false;
		}
    «ENDIF»
	'''
  
	def attrib_resultMapContent(String varName, EObjectSection section, EClass eClass, String columnPrefix) '''
«««		TODO replace this filter with a utiltiy method
		«FOR a : section.entity.allAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.name] == null].sort([a,b|
			val iA = a.sortValue(eClass)
			val iB = b.sortValue(eClass)
			return compare(iA,iB);
		]).filter[!resolved]»
			«IF eClass.getEStructuralFeature(a.name).many»
				//TODO Should this be done lazily?
				«varName».get«a.name.javaReservedNameEscape.toFirstUpper»().addAll(«utilGen.getLoadPrimitiveMultiValueMethodName(eClass, a)»(connection,set.getObject("«columnPrefix»«section.entity.allAttributes.findFirst[pk].columnName»)"));
			«ELSE»
				«varName».set«a.name.javaReservedNameEscape.toFirstUpper»(«a.resultMethod("set",eClass,columnPrefix+a.columnName,columnPrefix)»);
			«ENDIF»
		«ENDFOR»
		«IF section.entity.allAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.name] == null].findFirst[resolved] != null»
			«IF section.entity.allAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.name] == null].findFirst[resolved && isSingle(eClass)] != null»
				((LazyEObject)rv).setProxyData(new ProxyData_«eClass.name»(«section.entity.allAttributes.filter[resolved && isSingle(eClass)].map['set.'+query.parameters.head.resultMethodType+'("'+columnPrefix+parameters.head+'")'].join(",")»));
			«ENDIF»
			((LazyEObject)rv).setProxyDelegate(this);
		«ENDIF»
	'''
  
	def submapName(EObjectSection section) {
		return section.submapOwner + "_" + (section.eContainer as EMappingAttribute).property
	}

	def submapOwner(EObjectSection section) {
		return (section.eContainer.eContainer as EObjectSection).entity.lookupEClass;
	}
	
}
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

	def anyWhere(ENamedQuery q) {
		return q.queries.findFirst[where != null] != null;
	}

	def anyGroupBy(ENamedQuery q) {
		return q.queries.findFirst[groupBy != null] != null;
	}
	def hasSpecificQuery(ENamedQuery q) {
		return q.queries.findFirst[!dbType.equals("default")] != null;
	}

	def generateRefreshQuery(EMappingEntityDef entityDef, EClass eClass) '''
		«IF entityDef.refreshableMapper»
		«var query = entityDef.entity.namedQueries.findFirst[q|q.name=="selectById"]»
		// «generatorCredit»
		public final void refresh(final «eClass.name» object, final at.bestsolution.persistence.Session.RefreshType refreshType) {
			switch( refreshType ) {
				case DATA_ONLY:
					refreshDataOnly(object,false);
					break;
				case DATA_ONLY_SYNC_VERSION:
					refreshDataOnly(object,true);
					break;
				case COMPLETE:
					refreshWithReferences(object, new HashSet<Object>());
					break;
			}
		}

		public final void refreshWithReferences(final «eClass.name» object, Set<Object> refreshedObjects) {
			if( ! (object instanceof LazyEObject) ) {
				LOGGER.error("Unable to refresh object '"+object+"' not loaded from database");
				return;
			}

			String query;
			«IF query.hasSpecificQuery»
				query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_"+session.getDatabaseType()+".sql");
				if( query == null ) {
			«ENDIF»
				query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_default.sql");
			«IF query.hasSpecificQuery»
				}
			«ENDIF»

			Connection connection = session.checkoutConnection();
			PreparedStatement pStmt = null;
			ResultSet set = null;
			try {
				final ProcessedSQL processedSQL = Util.processSQL(query);
				pStmt = connection.prepareStatement(processedSQL.sql);
				long id = ((Number)getPrimaryKeyValue(object)).longValue();
				pStmt.setLong(1, id);
				set = pStmt.executeQuery();
				if( set.next() ) {
					refreshedObjects.add(object);
					map_default_«eClass.name»_complete_refresh(object,connection,set,refreshedObjects);
					if( getLockColumn() != null ) {
						session.getCache().updateVersion((EObject)object,id,set.getLong(getLockColumn()));
					}
				} else {
					throw new PersistanceException("Object with id '"+id+"' not available");
				}
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

		private final void refreshDataOnly(final «eClass.name» object, boolean updateVersion) {
			String query;
			«IF query.hasSpecificQuery»
				query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_"+session.getDatabaseType()+".sql");
				if( query == null ) {
			«ENDIF»
				query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_default.sql");
			«IF query.hasSpecificQuery»
				}
			«ENDIF»

			Connection connection = session.checkoutConnection();
			PreparedStatement pStmt = null;
			ResultSet set = null;
			try {
				final ProcessedSQL processedSQL = Util.processSQL(query);
				pStmt = connection.prepareStatement(processedSQL.sql);
				long id = ((Number)getPrimaryKeyValue(object)).longValue();
				pStmt.setLong(1, id);
				set = pStmt.executeQuery();
				if( set.next() ) {
					map_default_«eClass.name»_data_refresh(object,connection,set);
					if( updateVersion && getLockColumn() != null ) {
						session.getCache().updateVersion((EObject)object,id,set.getLong(getLockColumn()));
					}
				} else {
					throw new PersistanceException("Object with id '"+id+"' not available");
				}
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
		«ENDIF»
	'''

	def generateQuery(EMappingEntityDef entityDef, EClass eClass, ENamedQuery query) '''
	// «generatorCredit»
	@Override
	public final «IF query.returnType == ReturnType.LIST»java.util.List<«ENDIF»«eClass.instanceClassName»«IF query.returnType == ReturnType::LIST»>«ENDIF» «query.name»(«query.parameters.join(", ",[p|"final "+ p.parameterType + " " + p.name])») {
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

		String query;
		«IF query.hasSpecificQuery»
			query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_"+session.getDatabaseType()+".sql");
			if( query == null ) {
		«ENDIF»
			query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_default.sql");
		«IF query.hasSpecificQuery»
			}
		«ENDIF»

		if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

		Connection connection = session.checkoutConnection();
		PreparedStatement pStmt = null;
		ResultSet set = null;
		try {
		«IF !query.parameters.empty»
			«IF query.parameters.findFirst[list] != null»
				final ProcessedSQL processedSQL = Util.processSQL(query, new at.bestsolution.persistence.Function<String,List<?>>() {
					public List<?> execute(String name) {
						«val first = query.parameters.filter[list].head»
						«FOR p : query.parameters.filter[list]»
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
			pStmt = connection.prepareStatement(processedSQL.sql);

			List<String> debugParams = new ArrayList<String>();
			int paramIndex = 1;
			for(int i = 0; i < processedSQL.dynamicParameterNames.size(); i++) {
				if( "«query.parameters.head.name»".equals(processedSQL.dynamicParameterNames.get(i)) ) {
					if( isDebug ) {
						debugParams.add("«query.parameters.head.name» = " + «query.parameters.head.name»);
					}
					«IF query.parameters.head.list»
						List<TypedValue> typedValues = processedSQL.listValueMaps.get("«query.parameters.head.name»");
						if( typedValues != null ) {
							for( TypedValue typedValue : typedValues ) {
								Util.setValue(pStmt,paramIndex++,typedValue);
							}
						}
					«ELSE»
						pStmt.«query.parameters.head.pstmtMethod("paramIndex++",query.parameters.head.name)»;
					«ENDIF»
				}
			«FOR p : query.parameters.filter[it!=query.parameters.head]»
				else if("«p.name»".equals(processedSQL.dynamicParameterNames.get(i))) {
					if( isDebug ) {
						debugParams.add("«p.name» = " + «p.name»);
					}
					«IF p.list»
						List<TypedValue> typedValues = processedSQL.listValueMaps.get("«p.name»");
						if( typedValues != null ) {
							for( TypedValue typedValue : typedValues ) {
								Util.setValue(pStmt,paramIndex++,typedValue);
							}
						}
					«ELSE»
						pStmt.«p.pstmtMethod("paramIndex++",p.name)»;
					«ENDIF»

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
			public final «entityEClass.instanceClassName» map_«query.name»_«section.prefix»_«entityEClass.name»(Connection connection, ResultSet set) throws SQLException {
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

			String query;
			«IF query.anyWhere»String where;«ENDIF»
			«IF query.anyGroupBy»String groupBy;«ENDIF»
			«IF query.hasSpecificQuery»
				query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_criteria_"+session.getDatabaseType()+".sql");
				«IF query.anyWhere»where = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_criteria_where_"+session.getDatabaseType()+".sql");«ENDIF»
				«IF query.anyGroupBy»groupBy = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_criteria_groupBy_"+session.getDatabaseType()+".sql");«ENDIF»
				if( query == null ) {
			«ENDIF»
				query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_criteria_default.sql");
				«IF query.anyWhere»where = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_criteria_where_default.sql");«ENDIF»
				«IF query.anyGroupBy»groupBy = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_criteria_groupBy_default.sql");«ENDIF»
			«IF query.hasSpecificQuery»
				}
			«ENDIF»

			if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

			String criteriaStr = criteria.getCriteria();
			if( criteriaStr != null && ! criteriaStr.isEmpty() ) {
				query += " WHERE (" + criteriaStr + ")";
				«IF query.anyWhere»
				if( where != null ) {
					query += " AND " + where;
				}
				«ENDIF»
			}«IF query.anyWhere» else if(where != null) {
				query += " WHERE " + where;
			}
			«ENDIF»

			«IF query.anyGroupBy»
			if( groupBy != null ) {
				query += " GROUP BY " + groupBy;
			}
			«ENDIF»

			if( isDebug ) LOGGER.debug("	Constructed query: " + query);

			query = criteria.processSQL(query);

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
			«val rootPrefix = "current_" + (if( query.queries.head.mapping.prefix == null ) "" else query.queries.head.mapping.prefix) + "_"»
			«eClass.name» «rootPrefix»«eClass.name»;
			«FOR section : query.queries.head.mapping.attributes.collectMappings»
				«section.entity.lookupEClass.instanceClassName» current_«section.prefix»_«section.entity.lookupEClass.name»;
			«ENDFOR»
			if( isDebug ) LOGGER.debug("Mapping with nested results started");
			if (set.next()) {
				«rootPrefix»«eClass.name» = map_«query.name»_«eClass.name»(connection, set);
				((EObject)«rootPrefix»«eClass.name»).eSetDeliver(false);
				«FOR section : query.queries.head.mapping.attributes.collectMappings»
					«var entityEClass = section.entity.lookupEClass»
					current_«section.prefix»_«entityEClass.name» = map_«query.name»_«section.prefix»_«entityEClass.name»(connection, set);

					if( current_«section.prefix»_«entityEClass.name» != null ) {
						((EObject)current_«section.prefix»_«entityEClass.name»).eSetDeliver(false);
						«IF section.submapOwner.getEStructuralFeature((section.eContainer as EMappingAttribute).property).many»
							current_«section.submapOwnerSection.prefix»_«section.submapOwner.name».get«(section.eContainer as EMappingAttribute).property.toFirstUpper»().add(current_«section.prefix»_«entityEClass.name»);
						«ELSE»
							current_«section.submapOwnerSection.prefix»_«section.submapOwner.name».set«(section.eContainer as EMappingAttribute).property.toFirstUpper»(current_«section.prefix»_«entityEClass.name»);
						«ENDIF»
					} else {
						// ensure that the value is marked resolved
						current_«section.submapOwnerSection.prefix»_«section.submapOwner.name».get«(section.eContainer as EMappingAttribute).property.toFirstUpper»();
					}
				«ENDFOR»
				«FOR section : query.queries.head.mapping.attributes.collectMappings»
					«var entityEClass = section.entity.lookupEClass»
					if( current_«section.prefix»_«entityEClass.name» != null ) {
						((EObject)current_«section.prefix»_«entityEClass.name»).eSetDeliver(true);
					}
				«ENDFOR»

				((EObject)«rootPrefix»«eClass.name»).eSetDeliver(true);


				rv = «rootPrefix»«eClass.name»;

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
			«val rootPrefix = "current_" + (if( query.queries.head.mapping.prefix == null ) "" else query.queries.head.mapping.prefix) + "_"»
			«eClass.name» «rootPrefix»«eClass.name»;
			«FOR section : query.queries.head.mapping.attributes.collectMappings»
				«section.entity.lookupEClass.instanceClassName» current_«section.prefix»_«section.entity.lookupEClass.name»;
			«ENDFOR»
			if( isDebug ) LOGGER.debug("Mapping with nested results started");
			while(set.next()) {
				«rootPrefix»«eClass.name» = map_«query.name»_«eClass.name»(connection, set);
				((EObject)«rootPrefix»«eClass.name»).eSetDeliver(false);
				«FOR section : query.queries.head.mapping.attributes.collectMappings»
					«var entityEClass = section.entity.lookupEClass»
					current_«section.prefix»_«entityEClass.name» = map_«query.name»_«section.prefix»_«entityEClass.name»(connection, set);

					if( current_«section.prefix»_«entityEClass.name» != null ) {
						((EObject)current_«section.prefix»_«entityEClass.name»).eSetDeliver(false);
						«IF section.submapOwner.getEStructuralFeature((section.eContainer as EMappingAttribute).property).many»
							current_«section.submapOwnerSection.prefix»_«section.submapOwner.name».get«(section.eContainer as EMappingAttribute).property.toFirstUpper»().add(current_«section.prefix»_«entityEClass.name»);
						«ELSE»
							current_«section.submapOwnerSection.prefix»_«section.submapOwner.name».set«(section.eContainer as EMappingAttribute).property.toFirstUpper»(current_«section.prefix»_«entityEClass.name»);
						«ENDIF»
					} else {
						// ensure that the value is marked resolved
						current_«section.submapOwnerSection.prefix»_«section.submapOwner.name».get«(section.eContainer as EMappingAttribute).property.toFirstUpper»();
					}
				«ENDFOR»
				«FOR section : query.queries.head.mapping.attributes.collectMappings»
					«var entityEClass = section.entity.lookupEClass»
					if( current_«section.prefix»_«entityEClass.name» != null ) {
						((EObject)current_«section.prefix»_«entityEClass.name»).eSetDeliver(true);
					}
				«ENDFOR»

				((EObject)«rootPrefix»«eClass.name»).eSetDeliver(true);

				// fill final list
				if(!rootSet.contains(«rootPrefix»«eClass.name»)) {
					rv.add(«rootPrefix»«eClass.name»);
					rootSet.add(«rootPrefix»«eClass.name»);
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

//	def submapName(EObjectSection section) {
//		return section.submapOwner + "_" + (section.eContainer as EMappingAttribute).property
//	}

	def submapOwner(EObjectSection section) {
		return (section.eContainer.eContainer as EObjectSection).entity.lookupEClass;
	}

	def submapOwnerSection(EObjectSection section) {
		return (section.eContainer.eContainer as EObjectSection);
	}
}
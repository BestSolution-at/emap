/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *     Christoph Caks <christoph.caks@bestsolution.at> - added support for extends
 *******************************************************************************/
package at.bestsolution.persistence.emap.generator.java

import com.google.inject.Inject
import at.bestsolution.persistence.emap.generator.UtilCollection
import org.eclipse.emf.ecore.EClass
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import org.eclipse.emf.ecore.EReference
import at.bestsolution.persistence.emap.eMap.EMappingEntity
import at.bestsolution.persistence.emap.eMap.EAttribute
import at.bestsolution.persistence.emap.eMap.EMapping
import org.eclipse.emf.ecore.EDataType

class JavaInsertUpdateGenerator {
	@Inject extension
  	var UtilCollection util;

  	@Inject extension
  	var JavaUtilGenerator utilGen;

	def generateUpdate(EMappingEntityDef entityDef, EClass eClass) '''
	«val simpleDirectMappedAttributes = 	entityDef.entity.findSimpleDirectMappedAttributes(eClass)»
	«val blobDirectMappedAttributes = 		entityDef.entity.findBlobDirectMappedAttributes(eClass)»
	«val primitiveMultiValuedAttributes = 	entityDef.entity.findPrimitiveMultiValuedAttributes(eClass)»
	«val oneToOneReferences = 				entityDef.entity.findOneToOneReferences(eClass)»
	«val manyToManyReferences = 			entityDef.entity.findManyToManyReferences(eClass)»
	@Override
	public final void update(final «eClass.name» object) {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) {
			LOGGER.debug("Starting insert of '"+object+"'");
		}

		«checkTx»

		// Inform session about the update
		session.preExecuteUpdate(this,object);

		// Built the query
		«val pkAttribute = entityDef.entity.allAttributes.findFirst[pk]»
		at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement stmt = session.getDatabaseSupport().createQueryBuilder(this,"«entityDef.tableName»").createUpdateStatement("«pkAttribute.columnName»", «IF entityDef.extendsEntity»null«ELSE»getLockColumn()«ENDIF»);
		// NEW:
«««		Handle simple direct mapped attributes
		«IF !simpleDirectMappedAttributes.empty»
			// simple direct mapped attributes
			«FOR a : simpleDirectMappedAttributes»
				«val aType = a.getEAttribute(eClass).EType»
				// * «a.name»
				«IF aType instanceof EDataType && (aType as EDataType).isCustomType»
				«val dat = aType as EDataType»
«««				// old: stmt.«a.statementMethod(eClass)»("«a.columnName»", («(eClass.getEStructuralFeature(a.name) as org.eclipse.emf.ecore.EAttribute).objectType»)session.getTransactionAttribute(object,«eClass.getEStructuralFeature(a.name).toFullQualifiedJavaEStructuralFeature»));
				{
					final EDataType eDataType = «dat.toFullQualifiedJavaEDataType»;
					«dat.instanceClassName» v = session.getTransactionAttribute(object, «eClass.getEStructuralFeature(a.name).toFullQualifiedJavaEStructuralFeature»);
					if (v != null) {
						stmt.addString("«a.columnName»", EcoreUtil.convertToString(eDataType, v));
					}
				}
				«ELSE»
					stmt.«a.statementMethod(eClass)»("«a.columnName»", («(eClass.getEStructuralFeature(a.name) as org.eclipse.emf.ecore.EAttribute).objectType»)session.getTransactionAttribute(object,«eClass.getEStructuralFeature(a.name).toFullQualifiedJavaEStructuralFeature»));
				«ENDIF»
			«ENDFOR»
		«ENDIF»
«««		Handle blob direct mapped attributes
		«IF !blobDirectMappedAttributes.empty»
			// blob direct mapped attributes
			«FOR a : blobDirectMappedAttributes»
				// * «a.name»
				if( object.get«a.name.javaReservedNameEscape.toFirstUpper»() != null ) {
					if( Util.isModified(session, object, "«a.name»") ) {
						stmt.addBlob("«a.columnName»", object.get«a.name.javaReservedNameEscape.toFirstUpper»());
					}
				} else {
					stmt.addNull("«a.columnName»",getJDBCType("«a.name»"));
				}
			«ENDFOR»
		«ENDIF»
«««		Handle primitive multi valued attributes
		«IF !primitiveMultiValuedAttributes.empty»
			// primitive multi valued attributes
			«FOR a : primitiveMultiValuedAttributes»
				// * «a.name»
				if( session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
					// TODO Support array storage
				}
			«ENDFOR»
		«ENDIF»
«««		Handle one to one references
		«IF !oneToOneReferences.empty»
			// one to one references
			«FOR a : oneToOneReferences»
			«IF a.parameters.head != pkAttribute.columnName»
				// * «a.name»
				if( object.get«a.name.toFirstUpper»() != null ) {
					«val entity = (a.query.eContainer as EMappingEntity)»
					final «entity.fqn» refMapper = session.createMapper(«entity.fqn».class);
					final «a.type(eClass)» refKey = session.getPrimaryKey(refMapper, object.get«a.name.javaReservedNameEscape.toFirstUpper»());
					stmt.«a.statementMethod(eClass)»("«a.parameters.head»", refKey);
				} else {
					stmt.addNull("«a.parameters.head»",getJDBCType("«a.name»"));
				}
			«ELSE»
				// * skipping «a.name», because it would overwrite the primary key column
			«ENDIF»
			«ENDFOR»
		«ENDIF»

		// Execute the query
		Connection connection = session.checkoutConnection();
		try {
			«IF entityDef.extendsEntity»
				long version = getLockColumn() != null ? getVersionForTx(object) : -1;
				session.createMapper(«(entityDef.entity.parent.eContainer as EMappingEntityDef).fqn».class).update(object);
			«ELSE»
				long version = getLockColumn() != null ? getVersionForTx(object) : -1;
			«ENDIF»
			boolean success = stmt.execute(connection, object.get«entityDef.entity.allAttributes.findFirst[pk].name.javaReservedNameEscape.toFirstUpper»(),version);

			if( getLockColumn() != null && ! success ) {
				throw new PersistanceException("The entity '"+object.getClass().getName()+"' is stale");
			} else if( getLockColumn() != null ) {
				session.updateVersion(object,version+1);
			}

««« 		primitive multi value
			«IF !primitiveMultiValuedAttributes.empty»
				// handle primitive multi values
				«FOR a : primitiveMultiValuedAttributes»
					// * «a.name»
					if( !session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
						if( Util.isModified(session,object,"«a.name»") ) {
							«utilGen.getClearPrimitiveMultiValueMethodName(eClass, a)»(connection, object);
							«utilGen.getInsertPrimitiveMultiValue(eClass, a)»(connection, getPrimaryKeyForTx(object), object.get«a.name.javaReservedNameEscape.toFirstUpper»());
						}
					}
				«ENDFOR»
			«ENDIF»

«««			update many to many references
			«IF !manyToManyReferences.empty»
				// update many to many references
				«FOR a : manyToManyReferences»
					// * «a.name»
					«val oppositeA = a.opposite»
					«val oppositeMapper = oppositeA.entity.fqn»
					«val eReference = a.getEStructuralFeature(eClass)»
					«val oppositeType = eReference.EType.instanceClassName»
					{
						JavaSession.ChangeDescription delta = null;
						List<JavaSession.ChangeDescription> changes = session.getChangeDescription(object);
						for (JavaSession.ChangeDescription change : changes) {
							if (change.getFeature() == «eReference.toFullQualifiedJavaEStructuralFeature») {
								delta = change;
								break;
							}
						}

						if (delta != null) {
							final «oppositeMapper» oppositeMapper = session.createMapper(«oppositeMapper».class);
							if (isDebug) {
								LOGGER.debug("delta: additions=" + delta.getAdditions().size() + " and removals=" + delta.getRemovals().size());
								LOGGER.trace("additions: " + delta.getAdditions());
								LOGGER.trace("removals: " + delta.getRemovals());
							}

							for (Object addition : delta.getAdditions()) {
								final Object oppositePK = oppositeMapper.getPrimaryKeyValue((«oppositeType»)addition);
								// TODO test for new object?
								session.scheduleRelationSQL(«getCreateInsertManyToManyRelationSQLMethodName(eClass, a)»(session, connection, object, («oppositeType»)addition));
							}

							for (Object removal : delta.getRemovals()) {
								final Object oppositePK = oppositeMapper.getPrimaryKeyValue((«oppositeType»)removal);
								// TODO test for new object?
								session.scheduleRelationSQL(«getCreateDeleteManyToManyRelationSQLMethodName(eClass, a)»(session, connection, object, («oppositeType»)removal));
							}

						}
						else {
							if (isDebug) {
								LOGGER.debug("no delta recorded => nothing to update for «a.name»");
							}
						}
					}
				«ENDFOR»
			«ENDIF»
			session.scheduleAfterTransaction(new at.bestsolution.persistence.java.ClearChangeDescriptionAfterTx(object));
			session.scheduleAfterTransaction(new at.bestsolution.persistence.java.VersionUpdaterAfterTx(object,getPrimaryKeyForTx(object),getVersionForTx(object)));
		} catch(SQLException e) {
			throw new PersistanceException(e);
		} finally {
			session.returnConnection(connection);
		}
	}
	'''

	def generateInsert(EMappingEntityDef entityDef, EClass eClass) '''
	«val simpleDirectMappedAttributes = 	entityDef.entity.findSimpleDirectMappedAttributes(eClass)»
	«val blobDirectMappedAttributes = 		entityDef.entity.findBlobDirectMappedAttributes(eClass)»
	«val primitiveMultiValuedAttributes = 	entityDef.entity.findPrimitiveMultiValuedAttributes(eClass)»
	«val oneToOneReferences = 				entityDef.entity.findOneToOneReferences(eClass)»
	«val manyToManyReferences = 			entityDef.entity.findManyToManyReferences(eClass)»
	@Override
	public final void insert(final «eClass.name» object) {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) {
			LOGGER.debug("Starting insert of '"+object+"'");
		}

		«checkTx»

		// Inform session about the insert
		session.preExecuteInsert(this,object);

		«val pkAttribute = entityDef.entity.collectDerivedAttributes.values.findFirst[pk]»

		«IF !entityDef.extendsEntity»
		// Handle Expressions
		String sequenceExpression = null;
		«val dbSupport = pkAttribute.findDatabaseSupport»
		«FOR d : dbSupport»
		if( "«d.databaseId»".equals(session.getDatabaseType()) ) {
			sequenceExpression = «IF d.getSequenceStatementNextVal(pkAttribute)!=null»"«d.getSequenceStatementNextVal(pkAttribute)»"«ELSE»null«ENDIF»;
		}
		«ENDFOR»
		// Build the SQL
		at.bestsolution.persistence.java.DatabaseSupport.InsertStatement stmt = session.getDatabaseSupport().createQueryBuilder(this,"«entityDef.tableName»").createInsertStatement("«pkAttribute.columnName»", sequenceExpression, getLockColumn());
		«ELSE»
		// Build the SQL
		at.bestsolution.persistence.java.DatabaseSupport.ExtendsInsertStatement stmt = session.getDatabaseSupport().createQueryBuilder(this,"«entityDef.tableName»").createExtendsInsertStatement("«pkAttribute.columnName»");
		«ENDIF»


«««		Handle simple direct mapped attributes
		«IF !simpleDirectMappedAttributes.empty»
			// handle simple direct mapped attributes
			«FOR a : simpleDirectMappedAttributes»
			«val aType = a.getEAttribute(eClass).EType»
			// * «a.name»
			«IF aType.instanceClassName.primitive || aType.instanceClassName == "java.math.BigDecimal"»
				stmt.«a.statementMethod(eClass)»("«a.columnName»", («(eClass.getEStructuralFeature(a.name) as org.eclipse.emf.ecore.EAttribute).objectType»)session.getTransactionAttribute(object,«eClass.getEStructuralFeature(a.name).toFullQualifiedJavaEStructuralFeature»));
			«ELSEIF aType instanceof EDataType && (aType as EDataType).isCustomType»
				«val dat = aType as EDataType»
«««				// old: stmt.«a.statementMethod(eClass)»("«a.columnName»", («(eClass.getEStructuralFeature(a.name) as org.eclipse.emf.ecore.EAttribute).objectType»)session.getTransactionAttribute(object,«eClass.getEStructuralFeature(a.name).toFullQualifiedJavaEStructuralFeature»));
				{
					final EDataType eDataType = «dat.toFullQualifiedJavaEDataType»;
					«dat.instanceClassName» v = session.getTransactionAttribute(object, «eClass.getEStructuralFeature(a.name).toFullQualifiedJavaEStructuralFeature»);
					if (v != null) {
						stmt.addString("«a.columnName»", EcoreUtil.convertToString(eDataType, v));
					}
				}
			«ELSE»
				{
					Object o = session.getTransactionAttribute(object,«eClass.getEStructuralFeature(a.name).toFullQualifiedJavaEStructuralFeature»);
					if( o != null ) {
						stmt.«a.statementMethod(eClass)»("«a.columnName»", («(eClass.getEStructuralFeature(a.name) as org.eclipse.emf.ecore.EAttribute).objectType»)o);
					}
				}
			«ENDIF»
			«ENDFOR»
		«ENDIF»

«««		Handle Blob attributes
		«IF !blobDirectMappedAttributes.empty»
			// handle blob attributes
			«FOR a : blobDirectMappedAttributes»
			// * «a.name»
			if( object.get«a.name.toFirstUpper»() != null ) {
				stmt.addBlob("«a.columnName»", object.get«a.name.toFirstUpper»());
			}
			«ENDFOR»
		«ENDIF»

«««		Handle primitive multi valued attributes
		«IF !primitiveMultiValuedAttributes.empty»
			// handle primitive multi valued attributes
			«FOR a : primitiveMultiValuedAttributes»
			// * «a.name»
			if( session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
				//TODO Support array storage
			}
			«ENDFOR»
		«ENDIF»

«««		Handle one to one references
		«IF !oneToOneReferences.empty»
			// handle one to one references
			«FOR a : oneToOneReferences»
			«IF a.parameters.head != pkAttribute.columnName»
				// * «a.name»
				if( object.get«a.name.toFirstUpper»() != null ) {
					«val entity = (a.query.eContainer as EMappingEntity)»
					final «entity.fqn» refMapper = session.createMapper(«entity.fqn».class);
					final «a.type(eClass)» refKey = session.getPrimaryKey(refMapper, object.get«a.name.javaReservedNameEscape.toFirstUpper»());
					stmt.«a.statementMethod(eClass)»("«a.parameters.head»", refKey);
					//stmt.«a.statementMethod(eClass)»("«a.parameters.head»",object.get«a.name.toFirstUpper»().get«(a.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name.toFirstUpper»());
				}
			«ELSE»
				// * skipping «a.name», because it would overwrite the primary key column
			«ENDIF»
			«ENDFOR»
		«ENDIF»

		// Execute the query
		final Connection connection = session.checkoutConnection();
		try {
			«IF entityDef.extendsEntity»
				«val parentMapper = (entityDef.entity.parent.eContainer as EMappingEntityDef).fqn»
				// This entity extends another one
				// insert parent
				session.createMapper(«parentMapper».class).insert(object);
				// insert self
				stmt.execute(connection, (Long)getPrimaryKeyForTx(object));
			«ELSE»
				final long primaryKey = stmt.execute(connection);
				session.registerPrimaryKey(object, primaryKey);
				session.updateVersion(object,0);
				session.scheduleAfterTransaction(new at.bestsolution.persistence.java.AfterTxRunnable() {
					@Override
					public void runAfterTx(JavaSession session) {
						object.set«pkAttribute.name.toFirstUpper»(primaryKey);
					}
				});
			«ENDIF»

«««			Handle primitive multi value
			«IF !primitiveMultiValuedAttributes.empty»
				// handle primitive multi value attributes
				«FOR a : primitiveMultiValuedAttributes»
					if( !session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
						«utilGen.getInsertPrimitiveMultiValue(eClass, a)»(connection,getPrimaryKeyForTx(object),object.get«a.name.toFirstUpper»());
					}
				«ENDFOR»
			«ENDIF»

«««			Handle many to many references
			«IF !manyToManyReferences.empty»
				// handle many to many references
				«FOR e : manyToManyReferences»
					// «e.name»
					for(«e.getOpposite(eClass).EContainingClass.instanceClassName» e : object.get«e.name.toFirstUpper»()) {
						session.scheduleRelationSQL(«getCreateInsertManyToManyRelationSQLMethodName(eClass, e)»(session, connection, object, e));
					}
				«ENDFOR»
			«ENDIF»

			«IF !entityDef.extendsEntity»
			session.scheduleAfterTransaction(new at.bestsolution.persistence.java.RegisterObjectAfterTx(object, primaryKey, getLockColumn() != null ? 0 : -1));
			«ENDIF»
		} catch(SQLException e) {
			throw new PersistanceException(e);
		} finally {
			session.returnConnection(connection);
		}
	}
	'''



	def attributeFilter(EAttribute it, EClass eClass) {
		if( pk ) {
			return false;
		} else if(forcedFk) {
			return true;
		} else if(eClass.getEStructuralFeature(name) instanceof EReference) {
			val r = eClass.getEStructuralFeature(name) as EReference;
			if( r.containment ) {
				return false;
			}
			// check if the opposite is a forced FK (bug in teneo generated DDL)
			if( ! r.many && r.EOpposite != null && ! r.EOpposite.many ) {
				val edef = query.eResource.contents.head as EMapping
				val opp = (edef.root as EMappingEntityDef).entity.attributes.findFirst[name == r.EOpposite.name]
				if( opp != null && opp.forcedFk ) {
					return false;
				}
			}
			return true;
		} else {
			return true;
		}
	}

	def String generateDeleteByIdsExtends(EMappingEntity entity, String paramListName) '''
		«val entityDef = entity.eContainer as EMappingEntityDef»
		«IF entity.extendsEntity»
			«val parentEntity = entity.parent»
			«val parentEntityDef = parentEntity.eContainer as EMappingEntityDef»

			«val sqlName = "sql_" + parentEntity.name»
			«val stmtName = "stmt_" + parentEntity.name»
			«utilGen.generateDeleteInSql(sqlName, parentEntityDef.tableName, parentEntity.PKAttribute.columnName, paramListName)»
			«utilGen.generateExecuteInStatement(stmtName, sqlName, paramListName)»

			«generateDeleteByIdsExtends(entity.parent, paramListName)»
		«ENDIF»
	'''

	def isSelfRecursive(EMappingEntityDef entityDef, EClass eClass) {
		return getSelfRecursionFK(entityDef, eClass) != null
	}


	def getSelfRecursionFK(EMappingEntityDef entityDef, EClass eClass) {
		for (EAttribute attribute : entityDef.entity.allAttributes) {
// TODO enable container test
//			val feature = attribute.getEStructuralFeature(eClass)
//			if (feature instanceof EReference) {
//				val ref = feature as EReference
				if (/*ref.container &&*/ attribute.resolved) {
					if (attribute.query.eContainer == entityDef.entity && attribute != entityDef.PKAttribute) {
						return attribute.parameters.head
					}
				}
//			}
		}
		return null;
	}

	def generateDelete(EMappingEntityDef entityDef, EClass eClass) '''
	«val primitiveMultiValuedAttributes = 	entityDef.entity.findPrimitiveMultiValuedAttributes(eClass)»
	«val manyToManyReferences = 			entityDef.entity.findManyToManyReferences(eClass)»
	@Override
	public final void delete(«eClass.name» object) {
		delete(new «eClass.name»[] { object });
	}

	final int deleteAll(InternalQueryCriteria criteria) {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if (isDebug) LOGGER.debug("Executing deleteAll");

		final String criteriaStr = criteria.getCriteria();
		session.preExecuteDeleteMany(«eClass.toFullQualifiedJavaEClass»);

		// build delete query
		String deleteQuery;
		if( session.getDatabaseSupport().isDefaultLowerCase() ) {
			deleteQuery = "DELETE FROM \"«entityDef.tableName.toLowerCase»\"";
		} else {
			deleteQuery = "DELETE FROM \"«entityDef.tableName.toUpperCase»\"";
		}

		if (isDebug) LOGGER.debug("Plain delete query: " + deleteQuery);
		if( criteriaStr != null && ! criteriaStr.isEmpty() ) {
			deleteQuery += " WHERE " + criteriaStr;
		}
		if (isDebug) LOGGER.debug("Final delete query: " + deleteQuery);

		Connection connection = session.checkoutConnection();
		try {
			«IF !manyToManyReferences.empty»
				// build select query
				String selectQuery = "SELECT «entityDef.PKAttribute.columnName» FROM \"«entityDef.tableName»\"";
				if (isDebug) LOGGER.debug("Plain Select query: " + selectQuery);
				if( criteriaStr != null && ! criteriaStr.isEmpty() ) {
					selectQuery += " WHERE " + criteriaStr;
				}
				if (isDebug) LOGGER.debug("Final select query: " + selectQuery);

				// execute select
				List<Object> objectIds = new ArrayList<Object>();
				PreparedStatement pstmtSelect = null;
				ResultSet resultSetSelect = null;
				try {
					pstmtSelect = connection.prepareStatement(selectQuery);
					int idx = 1;
					for(TypedValue t : criteria.getParameters()) {
						Util.setValue(pstmtSelect, idx++, t);
					}

					resultSetSelect = pstmtSelect.executeQuery();
					while (resultSetSelect.next()) {
						objectIds.add(resultSetSelect.getLong("«entityDef.PKAttribute.columnName»"));
					}
				}
				finally {
					if (resultSetSelect != null) {
						resultSetSelect.close();
					}
					if (pstmtSelect != null) {
						pstmtSelect.close();
					}
				}

				// execute clear many to many relations
				«FOR a : manyToManyReferences»
					«utilGen.getClearManyToManyByIdMethodName(eClass, a)»(connection, objectIds);
				«ENDFOR»
			«ENDIF»
			// execute delete
			PreparedStatement pstmt = null;
			try {
				pstmt = connection.prepareStatement(deleteQuery);
				int idx = 1;
				for(TypedValue t : criteria.getParameters()) {
					Util.setValue(pstmt, idx++, t);
				}
				final int n = pstmt.executeUpdate();
				if (isDebug) LOGGER.debug("executed query " + n + " records were affected");
				return n;
			}
			finally {
				if (pstmt != null) {
					pstmt.close();
				}
			}


		}
		catch (SQLException e) {
			throw new PersistanceException(e);
		}
		finally {
			session.returnConnection(connection);
		}


	}

	@Override
	public final void deleteAll() {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) {
			LOGGER.debug("deleteAll()");
		}

		«checkTx»

		session.preExecuteDeleteMany(«eClass.toFullQualifiedJavaEClass»);

		// we need to clean up the session
		session.scheduleAfterTransaction(new at.bestsolution.persistence.java.UnregisterAllObjectsAfterTx(«eClass.toFullQualifiedJavaEClass»));

		final Connection connection = session.checkoutConnection();
		try {

			// find all object ids
			String objectIdSQL;

			if( session.getDatabaseSupport().isDefaultLowerCase() ) {
				objectIdSQL = "SELECT \"«entityDef.PKAttribute.columnName.toLowerCase»\" FROM \"«entityDef.tableName.toLowerCase»\"";
			} else {
				objectIdSQL = "SELECT \"«entityDef.PKAttribute.columnName.toUpperCase»\" FROM \"«entityDef.tableName.toUpperCase»\"";
			}

			PreparedStatement objectIdStmt = null;
			ResultSet objectIdResultSet = null;
			List<Object> objectIds = new ArrayList<Object>();
			try {
				objectIdStmt = connection.prepareStatement(objectIdSQL);
				objectIdResultSet = objectIdStmt.executeQuery();
				while (objectIdResultSet.next()) {
					objectIds.add(objectIdResultSet.getLong("«entityDef.PKAttribute.columnName»"));
				}
			}
			finally {
				if (objectIdResultSet != null) {
					objectIdResultSet.close();
				}
				if (objectIdStmt != null) {
					objectIdStmt.close();
				}
			}

			// self-recursive: «entityDef.isSelfRecursive(eClass)»
			«IF entityDef.isSelfRecursive(eClass)»
				// this table is self-recursive
				// we need to clear the fks first
				String updateSQL;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					updateSQL = "UPDATE «entityDef.tableName.toLowerCase» SET «entityDef.getSelfRecursionFK(eClass).toLowerCase» = null";
				} else {
					updateSQL = "UPDATE «entityDef.tableName.toUpperCase» SET «entityDef.getSelfRecursionFK(eClass).toUpperCase» = null";
				}

				«utilGen.generateExecuteStatement("updateStmt", "updateSQL")»

			«ENDIF»

			«IF !primitiveMultiValuedAttributes.empty»
				// handle primitive multi valued attributes
				«FOR a : primitiveMultiValuedAttributes»
					if( ! session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
						«utilGen.getClearPrimitiveMultiValueForAllMethodName(eClass, a)»(connection);
					}
				«ENDFOR»
			«ENDIF»

			«FOR a : manyToManyReferences»
				«utilGen.getClearManyToManyForAllMethodName(eClass, a)»(connection);
			«ENDFOR»

			String sql;
			if( session.getDatabaseSupport().isDefaultLowerCase() ) {
				sql = "DELETE FROM \"«entityDef.tableName.toLowerCase»\"";
			} else {
				sql = "DELETE FROM \"«entityDef.tableName.toUpperCase»\"";
			}

			«utilGen.generateExecuteStatement("stmt", "sql")»

			«generateDeleteByIdsExtends(entityDef.entity, "objectIds")»
		} catch(SQLException e) {
			if( isDebug ) {
				LOGGER.debug("deleteAll() failed", e);
			}
			throw new PersistanceException(e);
		} finally {
			session.returnConnection(connection);
		}

		if( isDebug ) {
			LOGGER.debug("deleteAll() done.");
		}
	}

	@Override
	public void deleteById(Object... id) {
		deleteById(Arrays.asList(id));
	}

	public final void deleteById(List<Object> objectIds) {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) {
			LOGGER.debug("deleteById("+objectIds+")");
		}

		«checkTx»
		final EClass eClass = «eClass.toFullQualifiedJavaEClass»;
		session.preExecuteDeleteById(eClass,objectIds);

		for(Object id : objectIds) {
			session.scheduleAfterTransaction(new at.bestsolution.persistence.java.UnregisterObjectByIdAfterTx(eClass, id));
		}

		final Connection connection = session.checkoutConnection();
		try {

«««			Handle primitive multi valued attributes
			«IF !primitiveMultiValuedAttributes.empty»
				// handle primitive multi valued attributes
				«FOR a : primitiveMultiValuedAttributes»
					if( ! session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
						«utilGen.getClearPrimitiveMultiValueByIdMethodName(eClass, a)»(connection, objectIds);
					}
				«ENDFOR»
			«ENDIF»
«««			Handle many to many attributes
			«IF !manyToManyReferences.empty»
				// handle many to many attributes
				«FOR a : entityDef.entity.filterAllAttributes[isManyToManyAttribute(eClass)]»
					«utilGen.getClearManyToManyByIdMethodName(eClass, a)»(connection, objectIds);
				«ENDFOR»
			«ENDIF»
«««			Handle forced FK
			«val oppositeFk = entityDef.entity.findOppositeForcedFKAttributes(eClass) »
			«IF !oppositeFk.empty»
				// handle forced FK and update the opposite with NULL

				«FOR a : oppositeFk»
					// update «a.entity.calcTableName».«a.parameters.head» to null
					{
						StringBuilder sqlBuilder;
						if( session.getDatabaseSupport().isDefaultLowerCase() ) {
							sqlBuilder = new StringBuilder("UPDATE \"«a.entity.calcTableName.toLowerCase»\" SET «a.parameters.head.toLowerCase» = NULL WHERE «a.parameters.head.toLowerCase» IN (");
						} else {
							sqlBuilder = new StringBuilder("UPDATE \"«a.entity.calcTableName.toUpperCase»\" SET «a.parameters.head.toUpperCase» = NULL WHERE «a.parameters.head.toUpperCase» IN (");
						}

						Iterator<Object> sqlobjectIdsIterator = objectIds.iterator();
						while( sqlobjectIdsIterator.hasNext() ) {
							sqlobjectIdsIterator.next();
							sqlBuilder.append("?");
							if (sqlobjectIdsIterator.hasNext()) {
								sqlBuilder.append(", ");
							}
						}
						sqlBuilder.append(")");

						final String sql = sqlBuilder.toString();
						if (!objectIds.isEmpty()) {
							if (isDebug) {
								LOGGER.debug(" Executing SQL: " + sql);
							}

							PreparedStatement stmt = connection.prepareStatement(sql);
							try {
								int sqlobjectIdsIdx = 1;
								Iterator<Object> stmtParamIt = objectIds.iterator();
								while (stmtParamIt.hasNext()) {
									final Object obj = stmtParamIt.next();
									if (isDebug) {
										LOGGER.debug(" With Parameter " + sqlobjectIdsIdx + ": " + obj);
									}
									stmt.setLong(sqlobjectIdsIdx, (Long)obj);
									sqlobjectIdsIdx++;
								}
								stmt.execute();
							} finally {
								if (stmt != null) {
									stmt.close();
								}
							}
						}
					}
				«ENDFOR»
			«ENDIF»

			«utilGen.generateDeleteInSql("sql", entityDef.tableName, entityDef.entity.PKAttribute.columnName, "objectIds")»
			«utilGen.generateExecuteInStatement("stmt", "sql", "objectIds")»

			«generateDeleteByIdsExtends(entityDef.entity, "objectIds")»
		} catch(SQLException e) {
			if( isDebug ) {
				LOGGER.debug("delete() failed", e);
			}
			throw new PersistanceException(e);
		} finally {
			session.returnConnection(connection);
		}

		if( isDebug ) {
			LOGGER.debug("delete() done");
		}
	}

	@Override
	public final void delete(«eClass.name»... object) {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) {
			LOGGER.debug("delete("+Arrays.toString(object)+")");
		}

		List<Object> ids = new ArrayList<Object>();
		for («eClass.name» o : object) {
			ids.add(getPrimaryKeyValue(o));
		}
		deleteById(ids);

«««		«checkTx»
«««
«««		final List<Object> objectIds = extractObjectIds(object);
«««		session.preExecuteDeleteById(«eClass.toFullQualifiedJavaEClass»,objectIds);
«««
«««		for(«eClass.name» o : object) {
«««			session.scheduleAfterTransaction(new at.bestsolution.persistence.java.UnregisterObjectAfterTx(o, getPrimaryKeyValue(o)));
«««		}
«««
«««		final Connection connection = session.checkoutConnection();
«««		try {
«««
««««««			Handle primitive multi valued attributes
«««			«IF !primitiveMultiValuedAttributes.empty»
«««				// handle primitive multi valued attributes
«««				«FOR a : primitiveMultiValuedAttributes»
«««					if( ! session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
«««						«utilGen.getClearPrimitiveMultiValueByIdMethodName(eClass, a)»(connection, objectIds);
«««					}
«««				«ENDFOR»
«««			«ENDIF»
««««««			Handle many to many attributes
«««			«IF !manyToManyReferences.empty»
«««				// handle many to many attributes
«««				«FOR a : entityDef.entity.filterAllAttributes[isManyToManyAttribute(eClass)]»
«««					«utilGen.getClearManyToManyMethodName(eClass, a)»(connection, object);
«««				«ENDFOR»
«««			«ENDIF»
«««
«««			«utilGen.generateDeleteInSql("sql", entityDef.tableName, entityDef.entity.PKAttribute.columnName, "objectIds")»
«««			«utilGen.generateExecuteInStatement("stmt", "sql", "objectIds")»
«««
«««			«generateDeleteByIdsExtends(entityDef.entity, "objectIds")»
«««		} catch(SQLException e) {
«««			if( isDebug ) {
«««				LOGGER.debug("delete() failed", e);
«««			}
«««			throw new PersistanceException(e);
«««		} finally {
«««			session.returnConnection(connection);
«««		}
«««
«««		if( isDebug ) {
«««			LOGGER.debug("delete() done");
«««		}
	}
	'''


}

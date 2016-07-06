/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <christoph.caks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.emap.generator.java

import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import org.eclipse.emf.ecore.EClass
import com.google.inject.Inject
import at.bestsolution.persistence.emap.generator.UtilCollection
import at.bestsolution.persistence.emap.eMap.EAttribute

class JavaUtilGenerator {
	@Inject extension
  	var UtilCollection util;

	def checkTx() '''
	if( session.getTransaction() == null ) {
		throw new PersistanceException("You can only modify data while in a transaction");
	}
	'''

	def generate(EMappingEntityDef entityDef, EClass eClass) '''
	// Utilities

	private List<Object> extractObjectIds(«eClass.name»... object) {
		List<Object> objectIds = new ArrayList<Object>();
		for («eClass.name» o : object) {
			objectIds.add(getPrimaryKeyForTx(o));
		}
		return objectIds;
	}

	«generateUtils(entityDef, eClass)»
	'''

	def getClearPrimitiveMultiValueMethodName(EClass eClass, EAttribute attribute) {
		return "clearPrimitiveMultiValue_" + eClass.name + "_" + attribute.name;
	}

	def getClearPrimitiveMultiValueByIdMethodName(EClass eClass, EAttribute attribute) {
		return "clearPrimitiveMultiValueById_" + eClass.name + "_" + attribute.name;
	}

	def getClearPrimitiveMultiValueForAllMethodName(EClass eClass, EAttribute attribute) {
		return "clearPrimitiveMultiValueForAll_" + attribute.name.toFirstUpper;
	}

	def generateClearPrimitiveMultiValueForAll(EClass eClass, EAttribute attribute) '''
	private final void «getClearPrimitiveMultiValueForAllMethodName(eClass, attribute)»(Connection connection) throws SQLException {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) {
			LOGGER.debug("clear many primitive «attribute.name.toFirstUpper» for all");
		}

		String sql = "DELETE FROM \"«attribute.primitiveMultiValuedTableName»\"";
		«generateExecuteStatement("stmt", "sql")»
	}
	'''

	def generateClearPrimitiveMultiValue(EClass eClass, EAttribute attribute) '''
	private final void «getClearPrimitiveMultiValueMethodName(eClass, attribute)»(Connection connection, «eClass.name»... objects) throws SQLException {
		«getClearPrimitiveMultiValueByIdMethodName(eClass, attribute)»(connection, extractObjectIds(objects));
	}

	private final void «getClearPrimitiveMultiValueByIdMethodName(eClass, attribute)»(Connection connection, List<Object> objectIds) throws SQLException {
		boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) {
			LOGGER.debug("clearPrimitiveMultiValueById «eClass.name»#«attribute.name» " + objectIds);
		}
		«generateDeleteInSql("sql", attribute.primitiveMultiValuedTableName, attribute.primitiveMultiValuedFKColName, "objectIds")»
		«generateExecuteInStatement("stmt", "sql", "objectIds")»
«««		PreparedStatement stmt = null;
«««		try {
«««
«««			String sql = "DELETE FROM «eClass.name.toUpperCase»_«attribute.name.toUpperCase» WHERE FK_«eClass.name.toUpperCase»_«attribute.name.toUpperCase» = ?";
«««			if( isDebug ) {
«««				LOGGER.debug("Preparing statement: " + sql);
«««			}
«««			stmt = connection.prepareStatement(sql);
«««			stmt.setObject(1,sid);
«««			stmt.execute();
«««			if( isDebug ) {
«««				LOGGER.debug("Finished clearing items");
«««			}
«««		} finally {
«««			if( stmt != null ) {
«««				stmt.close();
«««			}
«««		}
	}
	'''

	def getClearManyToManyMethodName(EClass eClass, EAttribute attribute) {
		return "clearManyToMany_" + attribute.name.toFirstUpper;
	}

	def getClearManyToManyByIdMethodName(EClass eClass, EAttribute attribute) {
		return "clearManyToManyById_" + attribute.name.toFirstUpper;
	}

	def generateClearManyToManyFor(EMappingEntityDef entityDef, EClass eClass, EAttribute attribute) '''
	private final void «getClearManyToManyMethodName(eClass, attribute)»(Connection connection, «eClass.name»... object) throws SQLException {
		«getClearManyToManyByIdMethodName(eClass, attribute)»(connection, extractObjectIds(object));
	}

	private final void «getClearManyToManyByIdMethodName(eClass, attribute)»(Connection connection, List<Object> objectIds) throws SQLException {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) {
			LOGGER.debug("clear many to many «attribute.name.toFirstUpper» for "+objectIds);
		}

		if (objectIds.isEmpty()) {
			if( isDebug ) {
				LOGGER.debug("nothing to clear.");
			}
			return;
		}

		final StringBuilder b = new StringBuilder();
		Iterator<Object> it = objectIds.iterator();
		while (it.hasNext()) {
			it.next();
			b.append("?");
			if (it.hasNext()) {
				b.append(", ");
			}
		}
		
		String sql;
		if( session.getDatabaseSupport().isDefaultLowerCase() ) {
			sql = "DELETE FROM \"«attribute.findRelationTable.toLowerCase»\" WHERE \"«attribute.findRelationColumn.toLowerCase»\" IN ("+b.toString()+")";
		} else {
			sql = "DELETE FROM \"«attribute.findRelationTable.toUpperCase»\" WHERE \"«attribute.findRelationColumn.toUpperCase»\" IN ("+b.toString()+")";
		}

		if (isDebug) {
			LOGGER.debug("Executing Query: " + sql);
		}

		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement(sql);
			int idx = 1;
			it = objectIds.iterator();
			while (it.hasNext()) {
				final Object obj = it.next();
				if (isDebug) {
					LOGGER.debug(" With Parameter " + idx + ": " + obj);
				}
				stmt.setLong(idx, (Long)obj);
				idx++;
			}
			stmt.execute();
		}
		finally {
			if (stmt != null) {
				stmt.close();
			}
		}
	}
	'''

	def getClearManyToManyForAllMethodName(EClass eClass, EAttribute attribute) {
		return "clearManyToMany_" + attribute.name.toFirstUpper + "_ForAll"
	}

	def generateClearManyToManyForAll(EMappingEntityDef entityDef, EClass eClass, EAttribute attribute) '''
	private final void «getClearManyToManyForAllMethodName(eClass, attribute)»(Connection connection) throws SQLException {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) {
			LOGGER.debug("clear many to many «attribute.name.toFirstUpper» for all");
		}
		String sql;
		if( session.getDatabaseSupport().isDefaultLowerCase() ) {
			sql = "DELETE FROM \"«attribute.findRelationTable.toLowerCase»\"";
		} else {
			sql = "DELETE FROM \"«attribute.findRelationTable.toUpperCase»\"";
		}
		
		«generateExecuteStatement("stmt", "sql")»
	}
	'''

	def getCreateInsertManyToManyRelationSQLMethodName(EClass eClass, EAttribute attribute) {
		return "createInsertManyToManyRelationSQL_" + attribute.name;
	}

	def generateCreateInsertManyToManyRelationSQL(EMappingEntityDef entityDef, EClass eClass, EAttribute attribute) '''
	«val oppositeEntity = attribute.opposite.getEntity»
	«val oppositeEntityDef = oppositeEntity.eContainer as EMappingEntityDef»
	private final RelationSQL «getCreateInsertManyToManyRelationSQLMethodName(eClass, attribute)»(final JavaSession session, final Connection c, final «eClass.name» self, final «attribute.getOpposite(eClass).EContainingClass.instanceClassName» opposite) {
		final String sql;
		if( session.getDatabaseSupport().isDefaultLowerCase() ) {
			sql = "INSERT INTO \"«attribute.findRelationTable.toLowerCase»\" (\"«attribute.findRelationColumn.toLowerCase»\",\"«attribute.findOppositeRelationColumn.toLowerCase»\") VALUES (?,?)";
		} else {
			sql = "INSERT INTO \"«attribute.findRelationTable.toUpperCase»\" (\"«attribute.findRelationColumn.toUpperCase»\",\"«attribute.findOppositeRelationColumn.toUpperCase»\") VALUES (?,?)";
		}
			return new RelationSQL() {
				public EObject getSelf() {
					return (EObject)self;
				}

				public EObject getOpposite() {
					return (EObject)opposite;
				}

				public String getTableName() {
					return "«attribute.relationTable»";
				}

				public void execute() throws PersistanceException {
					boolean isDebug = LOGGER.isDebugEnabled();
					final «entityDef.fqn» selfMapper = session.createMapper(«entityDef.fqn».class);
					final «oppositeEntityDef.fqn» oppositeMapper = session.createMapper(«oppositeEntityDef.fqn».class);
					final Object selfId = session.getPrimaryKey(selfMapper, self);
					final Object oppositeId = session.getPrimaryKey(oppositeMapper, opposite);
					if( isDebug ) {
						LOGGER.debug("Started creating relation");
						LOGGER.debug("Executing Relation Insert SQL: " + sql);
						LOGGER.debug("Parameter: " + selfId + ", " + oppositeId);
«««						LOGGER.debug("Parameter: " + self.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»()+ "," + opposite.get«oppositeEntity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
					}
					PreparedStatement pstmt = null;
					try {
						pstmt = c.prepareStatement(sql);
						pstmt.setLong(1, (Long) selfId);
						pstmt.setLong(2, (Long) oppositeId);

«««						pstmt.setLong(1, self.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
«««						pstmt.setLong(2, opposite.get«oppositeEntity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
						pstmt.execute();
						if( isDebug ) {
						LOGGER.debug("Finished creating relation");
						}
					} catch( Exception e ) {
						if( pstmt != null ) {
						try {
							pstmt.close();
						} catch(SQLException e1) {
							LOGGER.error("Unable to close prepared statement", e1);
						}
					}
					throw new PersistanceException(e);
				}
			}

			public Action getAction() {
				return Action.INSERT;
			}
		};
	}
	'''

	def getCreateDeleteManyToManyRelationSQLMethodName(EClass eClass, EAttribute eAttribute) {
		return "createDeleteManyToManyRelationSQL_" + eAttribute.name;
	}

	def generateCreateDeleteManyToManyRelationSQL(EMappingEntityDef entityDef, EClass eClass, EAttribute attribute) '''
	«val oppositeEntity = attribute.opposite.getEntity»
	«val oppositeEntityDef = oppositeEntity.eContainer as EMappingEntityDef»
	private final RelationSQL «getCreateDeleteManyToManyRelationSQLMethodName(eClass, attribute)»(final JavaSession session, final Connection c, final «eClass.name» self, final «attribute.getOpposite(eClass).EContainingClass.instanceClassName» opposite) {
		final String sql;
		if( session.getDatabaseSupport().isDefaultLowerCase() ) {
			sql = "DELETE FROM \"«attribute.findRelationTable.toLowerCase»\" WHERE \"«attribute.findRelationColumn.toLowerCase»\" = ? AND \"«attribute.findOppositeRelationColumn.toLowerCase»\" = ?";
		} else {
			sql = "DELETE FROM \"«attribute.findRelationTable.toUpperCase»\" WHERE \"«attribute.findRelationColumn.toUpperCase»\" = ? AND \"«attribute.findOppositeRelationColumn.toUpperCase»\" = ?";
		}
			return new RelationSQL() {
				public EObject getSelf() {
					return (EObject)self;
				}

				public String getTableName() {
					return "«attribute.relationTable»";
				}

				public EObject getOpposite() {
					return (EObject)opposite;
				}

				public void execute() throws PersistanceException {
					boolean isDebug = LOGGER.isDebugEnabled();
					final «entityDef.fqn» selfMapper = session.createMapper(«entityDef.fqn».class);
					final «oppositeEntityDef.fqn» oppositeMapper = session.createMapper(«oppositeEntityDef.fqn».class);
					final Object selfId = session.getPrimaryKey(selfMapper, self);
					final Object oppositeId = session.getPrimaryKey(oppositeMapper, opposite);
					if( isDebug ) {
						LOGGER.debug("Started deleteing relation");
						LOGGER.debug("Executing Relation SQL: " + sql);
						LOGGER.debug("Parameter: " + selfId + ", " + oppositeId);
«««						LOGGER.debug("Parameter: " + self.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»()+ "," + opposite.get«oppositeEntity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
					}

					PreparedStatement pstmt = null;
					try {
						pstmt = c.prepareStatement(sql);
						pstmt.setLong(1, (Long) selfId);
						pstmt.setLong(2, (Long) oppositeId);
«««						pstmt.setLong(1, self.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
«««						pstmt.setLong(2, opposite.get«oppositeEntity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
						pstmt.execute();
						if( isDebug ) {
							LOGGER.debug("Finished deleteing relation");
						}
						} catch(Exception e) {
							if( pstmt != null ) {
								try {
									pstmt.close();
							} catch(SQLException e1) {
								LOGGER.error("Unable to close prepared statement", e1);
							}
						}
						throw new PersistanceException(e);
					}
				}

			public Action getAction() {
				return Action.DELETE;
			}
		};
	}
	'''

	def getCreateClearManyToManyRelationSQLMethodName(EClass eClass, EAttribute eAttribute) {
		return "createClearManyToManyRelationSQL_" + eAttribute.name;
	}

	def generateCreateClearManyToManyRelationSQL(EMappingEntityDef entityDef, EClass eClass, EAttribute attribute) '''
	private final RelationSQL «getCreateClearManyToManyRelationSQLMethodName(eClass, attribute)»(final JavaSession session, final Connection c, final «eClass.name» self) {
		final String sql;
		if( session.getDatabaseSupport().isDefaultLowerCase() ) {
			sql = "DELETE FROM \"«attribute.findRelationTable.toLowerCase»\" WHERE \"«attribute.findRelationColumn.toLowerCase»\" = ?";
		} else {
			sql = "DELETE FROM \"«attribute.findRelationTable.toUpperCase»\" WHERE \"«attribute.findRelationColumn.toUpperCase»\" = ?";
		}
		
		return new RelationSQL() {
			public EObject getSelf() {
				return (EObject)self;
			}

			public EObject getOpposite() {
				return null;
			}

			public String getTableName() {
				return "«attribute.relationTable»";
			}

			public void execute() throws PersistanceException {
				boolean isDebug = LOGGER.isDebugEnabled();
				final «entityDef.fqn» selfMapper = session.createMapper(«entityDef.fqn».class);
				final Object selfId = session.getPrimaryKey(selfMapper, self);
				if( isDebug ) {
					LOGGER.debug("Started clearing relation");
					LOGGER.debug("Executing Relation SQL: " + sql);
					LOGGER.debug("Parameter: " + selfId );
«««					LOGGER.debug("Parameter: " + self.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
				}

				PreparedStatement pstmt = null;
				try {
					pstmt = c.prepareStatement(sql);
					pstmt.setLong(1, (Long) selfId);
«««					pstmt.setLong(1, self.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
					pstmt.execute();
					if( isDebug ) {
						LOGGER.debug("Finished clearing relation");
					}
				} catch(Exception e) {
					if( pstmt != null ) {
						try {
							pstmt.close();
						} catch(SQLException e1) {
							LOGGER.error("Unable to close prepared statement", e1);
						}
					}
					throw new PersistanceException(e);
				}
			}

			public Action getAction() {
				return Action.DELETE_ALL;
			}
		};
	}
	'''

	def getLoadPrimitiveMultiValueMethodName(EClass eClass, EAttribute attribute) {
		return "loadPrimitiveMultiValue_" + eClass.name + "_" + attribute.name;
	}

	def generateLoadPrimitiveMultiValue(EClass eClass, EAttribute attribute) '''
	private final Collection<«(eClass.getEStructuralFeature(attribute.name) as org.eclipse.emf.ecore.EAttribute).objectType»> «getLoadPrimitiveMultiValueMethodName(eClass, attribute)»(Connection connection, Object sid) throws SQLException {
		boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) {
			LOGGER.debug("Loading primitive multi valued feature «eClass.name»#«attribute.name» for parent id '"+sid+"'");
		}

		if(!session.getDatabaseSupport().isNestedResultSetsSupported()) {
			if( isDebug ) {
				LOGGER.debug("Database does not support nested result sets - opening 2nd connection");
			}
			connection = session.checkoutConnection();
		}

		PreparedStatement stmt = null;
		ResultSet s = null;
		try {
			String sql = "SELECT * FROM \"«attribute.primitiveMultiValuedTableName»\" WHERE \"«attribute.primitiveMultiValuedFKColName»\" = ?";
			if( isDebug ) {
				LOGGER.debug("Preparing query: '"+sql+"'");
			}
			stmt = connection.prepareStatement(sql);
			stmt.setObject(1,sid);
			s = stmt.executeQuery();
			List<«(eClass.getEStructuralFeature(attribute.name) as org.eclipse.emf.ecore.EAttribute).objectType»> rv = new ArrayList<«(eClass.getEStructuralFeature(attribute.name) as org.eclipse.emf.ecore.EAttribute).objectType»>();
			while( s.next() ) {
			rv.add(«attribute.resultMethod("s",eClass,"ELT","")»);
		}
		if( isDebug ) {
			LOGGER.debug("Loaded primitive values are: " + rv);
		}
			return rv;
		} finally {
			try {
			if( s != null ) {
				s.close();
			}

			if( stmt != null ) {
				stmt.close();
				}
			} catch(SQLException e) {
				LOGGER.fatal("Failed to clean up resources", e);
			} finally {
				if(!session.getDatabaseSupport().isNestedResultSetsSupported()) {
					session.returnConnection(connection);
				}
			}
		}
	}
	'''

	def getInsertPrimitiveMultiValue(EClass eClass, EAttribute attribute) {
		return "insertPrimitiveMultiValue_" + eClass.name + "_" + attribute.name;
	}

	def generateInsertPrimitiveMultiValue(EClass eClass, EAttribute attribute) '''
	private final void «getInsertPrimitiveMultiValue(eClass, attribute)»(Connection connection, Object sid, Collection<«(eClass.getEStructuralFeature(attribute.name) as org.eclipse.emf.ecore.EAttribute).objectType»> data) throws SQLException {
		boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) {
			LOGGER.debug("Inserting primitive multi values «eClass.name»#«attribute.name» for parent id "+sid+" : " + data);
		}
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO \"«attribute.primitiveMultiValuedTableName»\" (\"«attribute.primitiveMultiValuedFKColName»\",\"ELT\") VALUES (?,?)";
			if( isDebug ) {
				LOGGER.debug("Preparing statement " + sql);
			}
			stmt = connection.prepareStatement(sql);
			stmt.setObject(1,sid);
			for( «(eClass.getEStructuralFeature(attribute.name) as org.eclipse.emf.ecore.EAttribute).objectType» o : data ) {
				stmt.setObject(2, o);
				stmt.execute();
			}
			if( isDebug ) {
				LOGGER.debug("Finished storing items");
			}
		} finally {
			if( stmt != null ) {
				stmt.close();
			}
		}
	}
	'''


	def generateUtils(EMappingEntityDef entityDef, EClass eClass) '''
	// Utility Methods
	«val primitiveMultiValuedAttributes = entityDef.entity.findPrimitiveMultiValuedAttributes(eClass)»
	«val manyToManyReferences = entityDef.entity.findManyToManyReferences(eClass)»

	«IF !primitiveMultiValuedAttributes.empty»
		// helpers for primitive multi valued attributes
		«FOR a : primitiveMultiValuedAttributes»
			«generateClearPrimitiveMultiValue(eClass, a)»
			«generateLoadPrimitiveMultiValue(eClass, a)»
			«generateInsertPrimitiveMultiValue(eClass, a)»
			«generateClearPrimitiveMultiValueForAll(eClass,a)»
		«ENDFOR»
	«ENDIF»

	«IF !manyToManyReferences.empty»
		// helpers for many to many relations
		«FOR a : manyToManyReferences»
			«generateClearManyToManyFor(entityDef, eClass, a)»
			«generateClearManyToManyForAll(entityDef, eClass, a)»
			«generateCreateDeleteManyToManyRelationSQL(entityDef, eClass, a)»
			«generateCreateInsertManyToManyRelationSQL(entityDef, eClass, a)»
			«generateCreateClearManyToManyRelationSQL(entityDef, eClass, a)»
		«ENDFOR»
	«ENDIF»
	'''



	def generateDeleteInSql(String sqlName, String tableName, String keyName, String paramListName) '''
	// building query begin
	«var builderName = sqlName + "Builder"»
	final StringBuilder «builderName» = new StringBuilder();
	if( session.getDatabaseSupport().isDefaultLowerCase() ) {
		«builderName».append("DELETE FROM \"«tableName.toLowerCase»\" WHERE \"«keyName.toLowerCase»\" IN (");
	} else {
		«builderName».append("DELETE FROM \"«tableName.toUpperCase»\" WHERE \"«keyName.toUpperCase»\" IN (");
	}

	«var itName = sqlName + paramListName + "Iterator"»
	Iterator<Object> «itName» = «paramListName».iterator();
	while («itName».hasNext()) {
		«itName».next();
		«builderName».append("?");
		if («itName».hasNext()) {
			«builderName».append(", ");
		}
	}
	«builderName».append(")");
	final String «sqlName» = «builderName».toString();
	// building query end
	'''

	def generateExecuteStatement(String stmtName, String sqlName) '''
	// executing query begin
	if (isDebug) {
		LOGGER.debug(" Executing SQL: " + «sqlName»);
	}
	PreparedStatement «stmtName» = connection.prepareStatement(«sqlName»);
	try {
		«stmtName».execute();
	}
	finally {
		if («stmtName» != null) {
			«stmtName».close();
		}
	}
	// executing query end
	'''

	def generateExecuteInStatement(String stmtName, String sqlName, String paramListName) '''
	if (!«paramListName».isEmpty()) {
		// executing query begin
		if (isDebug) {
			LOGGER.debug(" Executing SQL: " + «sqlName»);
		}
		PreparedStatement «stmtName» = connection.prepareStatement(«sqlName»);
		try {
			«var idxName = sqlName + paramListName + "Idx"»
			int «idxName» = 1;
			Iterator<Object> «stmtName»ParamIt = «paramListName».iterator();
					while («stmtName»ParamIt.hasNext()) {
						final Object obj = «stmtName»ParamIt.next();
						if (isDebug) {
							LOGGER.debug(" With Parameter " + «idxName» + ": " + obj);
						}
						«stmtName».setLong(«idxName», (Long)obj);
						«idxName»++;
					}
			«stmtName».execute();
		}
		finally {
			if («stmtName» != null) {
				«stmtName».close();
			}
		}
		// executing query end
	}
	'''

}
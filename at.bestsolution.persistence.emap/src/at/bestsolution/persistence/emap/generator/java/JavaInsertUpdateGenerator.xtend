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

class JavaInsertUpdateGenerator {
	@Inject extension
  	var UtilCollection util;

	def generateUpdate(EMappingEntityDef entityDef, EClass eClass) '''
	@Override
	public final void update(«eClass.name» object) {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) {
			LOGGER.debug("Starting insert of '"+object+"'");
		}

		if( session.getTransaction() == null ) {
			throw new PersistanceException("You can only modify data while in a transaction");
		}

		// Built the query
		at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement stmt = session.getDatabaseSupport().createQueryBuilder("«entityDef.tableName»").createUpdateStatement("«entityDef.entity.allAttributes.findFirst[pk].columnName»", «IF entityDef.extendsEntity»null«ELSE»getLockColumn()«ENDIF»);
		«FOR a : entityDef.entity.collectDerivedAttributes.values.filter[attributeFilter(eClass)].sort([a,b|return sortAttributes(eClass,a,b)])»
			«IF a.columnName != null»
				«IF eClass.getEStructuralFeature(a.name).many»
					if( session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
						// TODO Support array storage
					}
				«ELSEIF "java.sql.Blob" == eClass.getEStructuralFeature(a.name).EType.instanceClassName»
					if( object.get«a.name.toFirstUpper»() != null ) {
						if( Util.isModified(session, object, "«a.name»") ) {
							stmt.addBlob("«a.columnName»", object.get«a.name.toFirstUpper»());
						}
					} else {
						stmt.addNull("«a.columnName»",getJDBCType("«a.name»"));
					}
				«ELSE»
					stmt.«a.statementMethod(eClass)»("«a.columnName»", object.«IF a.isBoolean(eClass)»is«ELSE»get«ENDIF»«a.name.toFirstUpper»());
				«ENDIF»
			«ELSEIF a.isSingle(eClass)»
				if( object.get«a.name.toFirstUpper»() != null ) {
					stmt.«a.statementMethod(eClass)»("«a.parameters.head»",object.get«a.name.toFirstUpper»().get«(a.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name.toFirstUpper»());
				} else {
					stmt.addNull("«a.parameters.head»",getJDBCType("«a.name»"));
				}
			«ENDIF»
		«ENDFOR»

		// Execute the query
		Connection connection = session.checkoutConnection();
		try {
			«IF entityDef.extendsEntity»
			session.createMapper(«(entityDef.entity.parent.eContainer as EMappingEntityDef).fqn».class).update(object);
			«ENDIF»
			boolean success = stmt.execute(connection, object.get«entityDef.entity.allAttributes.findFirst[pk].name.toFirstUpper»());
			if( getLockColumn() != null && ! success ) {
				throw new PersistanceException("The entity '"+object.getClass().getName()+"' is stale");
			}

			«FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
				if(eClass.getEStructuralFeature(name) instanceof EReference) {
					val r = eClass.getEStructuralFeature(name) as EReference;
					if( r.containment ) {
						return false;
					}
					return true;
				} else {
					return true;
				}
			].sort([a,b|return sortAttributes(eClass,a,b)])»
				«IF a.columnName != null»
					«IF eClass.getEStructuralFeature(a.name).many»
						if( ! session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
							if( Util.isModified(session,object,"«a.name»") ) {
								clear_«eClass.name»_«a.name»(connection,getPrimaryKeyValue(object));
								insert_«eClass.name»_«a.name»(connection,getPrimaryKeyValue(object),object.get«a.name.toFirstUpper»());
							}
						}
					«ENDIF»
				«ENDIF»
			«ENDFOR»

			session.clearChangeDescription(object);
		} catch(SQLException e) {
			throw new PersistanceException(e);
		} finally {
			session.returnConnection(connection);
		}
	}
	'''

	def generateInsert(EMappingEntityDef entityDef, EClass eClass) '''
	@Override
	public final void insert(«eClass.name» object) {
		final boolean isDebug = LOGGER.isDebugEnabled();
		if( isDebug ) {
			LOGGER.debug("Starting insert of '"+object+"'");
		}

		if( session.getTransaction() == null ) {
			throw new PersistanceException("You can only modify data while in a transaction");
		}

		«val pkAttribute = entityDef.entity.collectDerivedAttributes.values.findFirst[pk]»
«««		«IF pkAttribute == null || entityDef.extended»

«««			// TODO WHAT TO GENERATE


«««		«ELSE»
			// Handle Expressions
			String sequenceExpression = null;
			«val dbSupport = pkAttribute.findDatabaseSupport»
			«FOR d : dbSupport»
			if( "«d.databaseId»".equals(session.getDatabaseType()) ) {
				sequenceExpression = «IF d.getSequenceStatementNextVal(pkAttribute)!=null»"«d.getSequenceStatementNextVal(pkAttribute)»"«ELSE»null«ENDIF»;
			}
			«ENDFOR»

			// Build the SQL
			«IF !entityDef.extendsEntity»
			at.bestsolution.persistence.java.DatabaseSupport.InsertStatement stmt = session.getDatabaseSupport().createQueryBuilder("«entityDef.tableName»").createInsertStatement("«pkAttribute.columnName»", sequenceExpression, getLockColumn());
			«ELSE»
			at.bestsolution.persistence.java.DatabaseSupport.ExtendsInsertStatement stmt = session.getDatabaseSupport().createQueryBuilder("«entityDef.tableName»").createExtendsInsertStatement("«pkAttribute.columnName»");
			«ENDIF»
			«FOR a : entityDef.entity.collectDerivedAttributes.values.filter[attributeFilter(eClass)].sort([a,b|return sortAttributes(eClass,a,b)])»
				«IF a.columnName != null»
					«IF eClass.getEStructuralFeature(a.name).many»
						if( session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
							//TODO Support array storage
						}
					«ELSEIF "java.sql.Blob" == eClass.getEStructuralFeature(a.name).EType.instanceClassName»
						if( object.get«a.name.toFirstUpper»() != null ) {
							stmt.addBlob("«a.columnName»", object.get«a.name.toFirstUpper»());
						}
					«ELSE»
						«IF a.getEAttribute(eClass).EType.instanceClassName.primitive»
							stmt.«a.statementMethod(eClass)»("«a.columnName»", object.«IF a.isBoolean(eClass)»is«ELSE»get«ENDIF»«a.name.toFirstUpper»());
						«ELSE»
							if( object.get«a.name.toFirstUpper»() != null ) {
								stmt.«a.statementMethod(eClass)»("«a.columnName»", object.«IF a.isBoolean(eClass)»is«ELSE»get«ENDIF»«a.name.toFirstUpper»());
							}
						«ENDIF»
					«ENDIF»
				«ELSEIF a.isSingle(eClass)»
					if( object.get«a.name.toFirstUpper»() != null ) {
						stmt.«a.statementMethod(eClass)»("«a.parameters.head»",object.get«a.name.toFirstUpper»().get«(a.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name.toFirstUpper»());
					}
				«ENDIF»
			«ENDFOR»

			// Execute the query
			Connection connection = session.checkoutConnection();
			try {
				«IF entityDef.extendsEntity»
				«val parentMapper = (entityDef.entity.parent.eContainer as EMappingEntityDef).fqn»
				session.createMapper(«parentMapper».class).insert(object);
				stmt.execute(connection, object.getSid());
				«ELSE»
				object.set«pkAttribute.name.toFirstUpper»(stmt.execute(connection));
				«ENDIF»

				«FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
					if( pk ) {
						return false;
					} else if(eClass.getEStructuralFeature(name) instanceof EReference) {
						val r = eClass.getEStructuralFeature(name) as EReference;
						if( r.containment ) {
							return false;
						}
						return true;
					} else {
						return true;
					}
				].sort([a,b|return sortAttributes(eClass,a,b)])»
					«IF a.columnName != null»
						«IF eClass.getEStructuralFeature(a.name).many»
							if( ! session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
								insert_«eClass.name»_«a.name»(connection,object.get«pkAttribute.name.toFirstUpper»(),object.get«a.name.toFirstUpper»());
							}
						«ENDIF»
					«ENDIF»
				«ENDFOR»
				«IF entityDef.entity.collectAllAttributes.findFirst[!isSingle(eClass) && resolved && opposite != null && opposite.opposite == it && relationTable != null ] != null»
					«FOR e : entityDef.entity.collectAllAttributes.filter[!isSingle(eClass) && resolved && opposite != null && opposite.opposite == it && relationTable != null ]»
						for(«e.getOpposite(eClass).EContainingClass.instanceClassName» e : object.get«e.name.toFirstUpper»()) {
							session.scheduleRelationSQL(createInsertRelationSQL_«e.name»(connection,object,e));
						}
					«ENDFOR»
				«ENDIF»

				«IF !entityDef.extendsEntity»
				session.registerObject(object, getPrimaryKeyValue(object), getLockColumn() != null ? 0 : -1);
				«ENDIF»
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
«««		«ENDIF»
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
}
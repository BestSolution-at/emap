/*******************************************************************************
 * Copyright (c) 2016 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     ccaks <FIRSTNAME.LASTNAME@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.emap.model

import at.bestsolution.persistence.emap.eMap.EAttribute
import at.bestsolution.persistence.emap.eMap.EMapPackage
import at.bestsolution.persistence.emap.eMap.EMappingEntity
import at.bestsolution.persistence.emap.generator.UtilCollection
import at.bestsolution.persistence.emap.model.table.Column
import at.bestsolution.persistence.emap.model.table.ForeignKey
import at.bestsolution.persistence.emap.model.table.Table
import at.bestsolution.persistence.emap.model.table.TableFactory
import at.bestsolution.persistence.emap.model.table.TableModel
import com.google.inject.Inject
import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import at.bestsolution.persistence.emap.eMap.EMappingBundle
import org.eclipse.emf.ecore.EDataType
import at.bestsolution.persistence.emap.eMap.ESQLTypeDef
import at.bestsolution.persistence.emap.generator.DatabaseSupport
import org.eclipse.emf.ecore.EcorePackage

class TableModelConverter {
	
	@Inject
	var ResourceDescriptionsProvider rdp;
	
	@Inject extension
	var UtilCollection
	
	static class GenContext {
		val Map<EMappingEntity, Table> tableCache = new HashMap
	}
	
	
	def createTableModel(Resource resource) {
		val resourceSet = resource.resourceSet
		val resourceDescriptions = rdp.getResourceDescriptions(resourceSet)
		val knownEntities = resourceDescriptions.getExportedObjectsByType(EMapPackage.Literals.EMAPPING_ENTITY)
		
		val bundles = resourceDescriptions.getExportedObjectsByType(EMapPackage.Literals.EMAPPING_BUNDLE);
		println(bundles)
		
		val bundle = resourceSet.getEObject(bundles.head.EObjectURI, true) as EMappingBundle
		
		println(bundle.entities)
		
		
		
		val allEntities = knownEntities.map[
			resourceSet.getEObject(it.getEObjectURI(), true) as EMappingEntity
		].toSet
		
		println("all entities: " + allEntities.size) 
		
		val filteredEntities = allEntities.filter[e | bundle.entities.exists[be|be.entity == e]].toSet
		
		println("filtered entities: " + filteredEntities.size)
		
		filteredEntities.forEach[println(" * " + it.name + " -> " + it)]
		
		val TableModel tableModel = TableFactory.eINSTANCE.createTableModel
		tableModel.mappedBundle = bundle
		
		val GenContext ctx = new GenContext
		
		// add normal tables
		filteredEntities.forEach[
			tableModel.tables += createTable(ctx, it)
		]
		
		// add n:m tables
		val tt = createNMTables(ctx, filteredEntities)
		tableModel.tables += tt
		tableModel.nmTables += tt
		
		// resolve fks
		filteredEntities.forEach[
			resolveForeignKeys(ctx, it)
		]
		
		println(toString(tableModel))
		return tableModel
	}
	
	def toString(TableModel model) '''
		«FOR table : model.tables»
		Table «table.name»
			«FOR c : table.columns»
			Column «c.name» («c.dataType.name»)«IF table.lockColumn == c» [LOCK COLUMN]«ENDIF»
			«ENDFOR»
			«IF table.key != null»
			Primary Key («table.key.columns.map[name].join(", ")»)
			«ENDIF»
			«FOR fk : table.foreignKeys» 
			Foreign Key «fk.refKey.table.name»(«fk.refKey.columns.map[name].join(", ")») («fk.columns.map[name].join(", ")»)
			«ENDFOR»
		«ENDFOR»
	'''
	
	def createTable(GenContext ctx, EMappingEntity entity) {
		createTable(ctx, entity, entity.etype.lookupEClass)
	} 
	
	def createNMTables(GenContext ctx, Set<EMappingEntity> entities) {
		val Set<Table> tables = new HashSet
		val Set<EAttribute> nmAttribs = new HashSet
		
		// first find nmAttribs
		for (e : entities) {
			for (a : e.allAttributes) {
				if (a.isManyToManyAttribute((a.eContainer as EMappingEntity).lookupEClass)) {
					if (!nmAttribs.contains(a.opposite)) {
						nmAttribs.add(a)
					}
				}
			}
		}
		
		println("found n:m")
		nmAttribs.forEach[
			println((it.eContainer as EMappingEntity).name + " -> " + it.name + " vs " + (it.opposite.eContainer as EMappingEntity).name + " -> " + it.opposite.name)
		]
		
		for (a : nmAttribs) {
			val Table nmTable = TableFactory.eINSTANCE.createTable
			nmTable.name = a.relationTable
			
			// cur side
			
			val EMappingEntity curEntity = a.eContainer as EMappingEntity
			val EClass curEClass = curEntity.lookupEClass
			val Table curTable = ctx.tableCache.get(curEntity)
			
			val Column col = TableFactory.eINSTANCE.createColumn
			col.name = a.relationColumn
			col.notNull = true
			col.dataType = curEClass.getEStructuralFeature(curEntity.PKAttribute.name).EType as EDataType
			col.dataTypeSize = a.size // TODO seems wrong
//			col.type = curEClass.getEStructuralFeature(curEntity.PKAttribute.name).EType.instanceClassName
//			col.jdbcType = curEntity.PKAttribute.jdbcType(curEClass)
			nmTable.columns += col
			
			val ForeignKey curFK = TableFactory.eINSTANCE.createForeignKey
			curFK.columns += col
			curFK.refKey = curTable.key
			curFK.name = "FK_" + curTable.name + "_" + a.name
			nmTable.foreignKeys += curFK
			
			// opposite side
			
			val EMappingEntity oppositeEntity = a.query.eContainer as EMappingEntity
			val EClass oppositeEClass = oppositeEntity.lookupEClass
			val Table oppositeTable = ctx.tableCache.get(oppositeEntity)
			
			val Column oppositeCol = TableFactory.eINSTANCE.createColumn
			oppositeCol.notNull = true
			oppositeCol.name = a.opposite.relationColumn
			oppositeCol.dataType = oppositeEClass.getEStructuralFeature(oppositeEntity.PKAttribute.name).EType as EDataType
			oppositeCol.dataTypeSize = a.opposite.size // TODO seems wrong
//			oppositeCol.type = oppositeEClass.getEStructuralFeature(oppositeEntity.PKAttribute.name).EType.instanceClassName
//			oppositeCol.jdbcType = oppositeEntity.PKAttribute.jdbcType(oppositeEClass)
			nmTable.columns += oppositeCol
			
			val ForeignKey oppositeFK = TableFactory.eINSTANCE.createForeignKey
			oppositeFK.columns += oppositeCol
			oppositeFK.refKey = oppositeTable.key
			oppositeFK.name = "FK_" + oppositeTable.name + "_" + a.opposite.name
			
			nmTable.foreignKeys += oppositeFK
			
			tables.add(nmTable)
		}
		
		//	def findNMRelations(EMappingBundle bundleDef) {
//		val relations = new LinkedHashSet<NMMapping>()
//		for( e : bundleDef.entities.filter([entity.attributes.findFirst[it.opposite != null] != null]) ) {
//			for( a : e.entity.attributes.filter[opposite != null] ) {
//				val eopposite = a.opposite.entity.findBundleEntity(bundleDef)
//				relations.add(new NMMapping(e,a,eopposite,a.opposite))
//			}
//		}
//		return relations;
//	}
		return tables;
	}
	
	def resolveForeignKeys(GenContext ctx, EMappingEntity entity) {
		val EClass eClass = entity.etype.lookupEClass
		val Table table = ctx.tableCache.get(entity)
		
		entity.allAttributes.forEach[a|
			val eA = eClass.getEStructuralFeature(a.name)
			if (a.resolved) {
				if (a.isManyToManyAttribute(eClass)) {
					// n:m relation
				}
				else if (eA instanceof EReference && !(eA as EReference).many) {
					// 1:n on the 1 side
					val singleFK = a.parameters.head
					
					println(table)
					val fkCol = table.columns.findFirst[it.name == singleFK]
					
					
					val oppositeEntity = a.query.eContainer as EMappingEntity
					val oppositeTable = ctx.tableCache.get(oppositeEntity)
					
					val ForeignKey fk = TableFactory.eINSTANCE.createForeignKey
					fk.columns += fkCol
					fk.refKey = oppositeTable.key 
					fk.name = "FK_" + table.name + "_" + a.name
					
					fkCol.dataType = oppositeTable.key.columns.head.dataType
					fkCol.dataTypeSize = oppositeTable.key.columns.head.dataTypeSize
					table.foreignKeys += fk
					
				}
			}
		]
	}
	
	def createTable(GenContext ctx, EMappingEntity entity, EClass eClass) {
		val Table table = TableFactory.eINSTANCE.createTable
		table.name = entity.calcTableName
		
		table.key = TableFactory.eINSTANCE.createPrimaryKey
		table.key.name = "PK_" + table.name
		
		entity.allAttributes.forEach[a|
			val f = eClass.getEStructuralFeature(a.name)
			if (a.resolved) {
				if (a.opposite != null) {
					// n:m relation
				}
				else {
					if (f instanceof EReference && !(f as EReference).many) {
						// we are at the one side of a 1:n
						val singleFK = a.parameters.head
						
						val Column col = TableFactory.eINSTANCE.createColumn
						col.name = singleFK
						col.notNull = true
						table.columns += col
					}
				}
			}
			else {
				val Column col = TableFactory.eINSTANCE.createColumn
				col.name = a.columnName
				col.dataType = f.EType as EDataType
				col.dataTypeSize = a.size
				
				table.columns += col
				if (a.pk) {
					col.notNull = true
					table.key.columns += col
				}
				if (a.valueGenerators != null) {
					// TODO store gen info
				}
			}
		]
		
		// add lock column
		val Column col = TableFactory.eINSTANCE.createColumn
		col.name = "e_version"
		col.dataType = EcorePackage.Literals.EINT
		col.notNull = true
		
		table.columns += col
		table.lockColumn = col
		
		ctx.tableCache.put(entity, table)
		return table
	}
	
	def buildBundleETypeMapping(EMappingBundle bundle) {
		val Map<EDataType, ESQLTypeDef> mapping = new HashMap
		recBuildBundleETypeMapping(bundle, mapping)
		return mapping
	}
	
	def getETypeMapping(DatabaseSupport db, EMappingBundle bundle) {
		val mapping = db.databaseTypeMapping
		mapping.putAll(bundle.buildBundleETypeMapping)
		return mapping
	}
	
	private def recBuildBundleETypeMapping(EMappingBundle bundle, Map<EDataType, ESQLTypeDef> mapping) {
		if (bundle.parentBundle != null) {
			recBuildBundleETypeMapping(bundle.parentBundle, mapping)
		}
		for (t : bundle.typeDefs) {
			val type = t.etype.lookupEDataType
			mapping.put(type, t)
		}
	}
	
}
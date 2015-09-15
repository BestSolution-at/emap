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
package at.bestsolution.persistence.emap.generator

import at.bestsolution.persistence.emap.eMap.EMappingBundle
import org.eclipse.emf.ecore.EDataType
import at.bestsolution.persistence.emap.eMap.EMappingEntity
import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import at.bestsolution.persistence.emap.eMap.EAttribute
import at.bestsolution.persistence.emap.eMap.ESQLDbType
import org.apache.commons.lang.text.StrSubstitutor
import java.util.Collections
import at.bestsolution.persistence.emap.eMap.EBundleEntity
import at.bestsolution.persistence.emap.eMap.ColSort
import at.bestsolution.persistence.emap.eMap.ESQLAttTypeDef
import java.util.LinkedHashSet

class DDLGenerator {

	@Inject extension
	var UtilCollection util;

	def ESQLDbType findSqlDefs(EDataType type, EMappingBundle bundleDef, DatabaseSupport db) {
		val t = bundleDef.typeDefs.findFirst[t|t.etype.lookupEDataType == type]
		if( t == null ) {
			if( bundleDef.parentBundle != null ) {
				return type.findSqlDefs(bundleDef.parentBundle, db);
			}
			return null;
		}
		val d = t.dbTypes.findFirst[d|d.dbType == db.databaseId]
		if( d != null ) {
			return d;
		} else {
			val dd = t.dbTypes.findFirst[dd|dd.dbType == "default"]
			if( dd != null ) {
				return dd;
			}
			return null;
		}
	}

	def EBundleEntity findBundleEntity(EMappingEntity entity, EMappingBundle bundleDef) {
		val bundleEntity = bundleDef.entities.findFirst[it.entity == entity]
		if( bundleEntity == null ) {
			if( bundleDef.parentBundle != null ) {
				return findBundleEntity(entity,bundleDef.parentBundle)
			}
		}
		return bundleEntity;
	}

	def ESQLAttTypeDef findSQLAttTypeDef(EAttribute a, EMappingEntity e, EMappingBundle bundleDef, String name) {
		if( e.parent != null ) {
			val be = findBundleEntity(e.parent,bundleDef)
			if( be != null ) {
//				println("=================> Bundle-Entity: " + a.columnName + " => " + (be.eContainer as EMappingBundle).name )

				var redef = be.typeDefs.findFirst[it.attribute == a ]
//				println("FOUND: " + be.typeDefs.head?.attribute)
//				println("SEARCHED: " + a)
//				println(redef)
//				println("REDEF: " + redef)
//				println(be.entity.parent)
				if( (redef == null || redef.dbTypes.findFirst[it.dbType == name] == null ) && be.entity.parent != null ) {
					return findSQLAttTypeDef(a,be.entity,bundleDef,name);
				}
//				println(redef.dbTypes)
//				println("================> " + redef.dbTypes.findFirst[it.dbType == name])
				if( redef != null && redef.dbTypes.findFirst[it.dbType == name] != null ) {
					return redef;
				}
				return null;
			}
		}
	}

	def getDataType(EAttribute a, boolean fkResolve, EBundleEntity be, DatabaseSupport db, EMappingBundle bundleDef, EClass eClass) {
//		println("====> Working for " + a)
		if( be != null ) {
			val redef = be.typeDefs.findFirst[it.attribute == a]
			if( redef != null ) {
				val d = redef.dbTypes.findFirst[d|d.dbType == db.databaseId]
				if( d != null ) {
					var size = a.size
					if( size == null ) {
						size = d.size
					}
					return StrSubstitutor.replace(d.sqlTypeDef,Collections.singletonMap("size",size));
				} else {
					val dd = redef.dbTypes.findFirst[dd|dd.dbType == "default"]
					if( dd != null ) {
						var size = a.size
						if( size == null ) {
							size = dd.size
						}
						return StrSubstitutor.replace(dd.sqlTypeDef,Collections.singletonMap("size",size));
					}
				}
			}

			val inheritedSpecific = findSQLAttTypeDef(a,be.entity,bundleDef,db.databaseId)
			if( inheritedSpecific != null ) {
				val sqlDef = inheritedSpecific.dbTypes.findFirst[it.dbType == db.databaseId].sqlTypeDef;
				println(StrSubstitutor.replace(sqlDef,Collections.singletonMap("size",a.size)))
				return StrSubstitutor.replace(sqlDef,Collections.singletonMap("size",a.size));
			}

			var inheritedDefault = findSQLAttTypeDef(a,be.entity,bundleDef,"default")
	//		println("DEFAULT;" + inheritedDefault)
			if( inheritedDefault != null ) {
				val sqlDef = inheritedDefault.dbTypes.findFirst[it.dbType == "default"].sqlTypeDef;
				return StrSubstitutor.replace(sqlDef,Collections.singletonMap("size",a.size));
			}
		}

		val dataType = eClass.getEStructuralFeature(a.name).EType as EDataType;
//		println("DATA-TYPE: " + dataType)
		val d = dataType.findSqlDefs(bundleDef,db);
		if( d != null ) {
			var size = a.size
			if( size == null ) {
				size = d.size
			}
			return StrSubstitutor.replace(d.sqlTypeDef,Collections.singletonMap("size",size));
		}
		return db.getDatabaseType(a, fkResolve, dataType)
	}

	def sortByOwnerGroups(ColSort sort, EClass eClass, EAttribute a, EAttribute b) {
		if( sort == ColSort::ALPHABETIC ) {
			return sortAttributes(eClass,a,b)
		} else if( sort == ColSort::ECORE_REVERSED ) {
			if (a.pk)
				return -1
			else if (b.pk)
				return 1
			else {
				val idxA = eClass.EAllStructuralFeatures.indexOf(eClass.getEStructuralFeature(a.name));
				val idxB = eClass.EAllStructuralFeatures.indexOf(eClass.getEStructuralFeature(b.name));
				return idxA.compare(idxB)
			}
		} else if( sort == ColSort::ECORE ) {
			if (a.pk)
				return -1
			else if (b.pk)
				return 1
			else {
				val idxA = eClass.EAllStructuralFeatures.indexOf(eClass.getEStructuralFeature(a.name));
				val idxB = eClass.EAllStructuralFeatures.indexOf(eClass.getEStructuralFeature(b.name));
				return idxB.compare(idxA)
			}
		} else {
			if (a.pk)
				return -1
			else if (b.pk)
				return 1
			else {
				if( a.entity == b.entity ) {
					val idxA = a.entity.attributes.indexOf(a);
					val idxB = b.entity.attributes.indexOf(b);
					return idxA.compare(idxB)
				} else {
					val eOwnerA = a.entity.lookupEClass
					val eOwnerB = b.entity.lookupEClass
					if( eOwnerA.EAllSuperTypes.contains(eOwnerB) ) {
						return -1;
					} else {
						return 1;
					}
				}
			}
		}
	}

	def findNMRelations(EMappingBundle bundleDef) {
		val relations = new LinkedHashSet<NMMapping>()
		for( e : bundleDef.entities.filter([entity.attributes.findFirst[it.opposite != null] != null]) ) {
			for( a : e.entity.attributes.filter[opposite != null] ) {
				val eopposite = a.opposite.entity.findBundleEntity(bundleDef)
				relations.add(new NMMapping(e,a,eopposite,a.opposite))
			}
		}
		return relations;
	}

	def CharSequence generatedDDL(EMappingBundle bundleDef, DatabaseSupport db) '''
	/* ------------------------------------
	 * Tables
	 * ------------------------------------
	 */
	«FOR e : bundleDef.entities.filter([entity.allAttributes.findFirst[pk] != null])»
	«val eClass = e.entity.lookupEClass»
	/*
	 * Table for «e.entity.name»
	 */
	create table "«e.entity.calcTableName.toDefaultCase(db)»" (
		«var flag = false»
		«val pk = e.entity.collectDerivedAttributes.values.findFirst[pk]»
		«FOR a : e.entity.collectDerivedAttributes.values.sort[a,b|sortByOwnerGroups(bundleDef.colSort, eClass,a,b)].filter[it.pk]»
			«IF a.columnName != null»
				«IF flag», «ENDIF»"«a.calcColumnName(db)»" «a.getDataType(false,e,db,bundleDef,eClass)»«IF ! a.valueGenerators.empty && a.valueGenerators.findFirst[it.dbType==db.databaseId].autokey» «db.getAutokeyDefinition(a)»«ENDIF»«IF a.pk» not null«ENDIF»«IF a.pk && db.isPrimaryKeyPartOfColDef(a)» PRIMARY KEY«ENDIF»
				«dummy(flag = true)»
			«ELSEIF a.parameters.size == 1 && a.parameters.head != pk.columnName»
				«val pkEClass = (a.query.eContainer as EMappingEntity).lookupEClass»
				«IF flag», «ENDIF» «a.parameters.head» «(a.query.eContainer as EMappingEntity).attributes.findFirst[it.pk].getDataType(true,e,db,bundleDef,pkEClass)» not null
				«dummy(flag = true)»
			«ENDIF»
		«ENDFOR»
		«IF flag && ! e.entity.extendsEntity», "«IF db.isDefaultLowerCase»e_version«ELSE»E_VERSION«ENDIF»" integer not null«ENDIF»
		«FOR a : e.entity.collectDerivedAttributes.values.sort[a,b|sortByOwnerGroups(bundleDef.colSort, eClass,a,b)].filter[!it.pk]»
			«val f = a.getEStructuralFeature(eClass)»
			«IF ! f.many»
				«IF a.columnName != null»
					«IF flag», «ENDIF»"«a.calcColumnName(db)»" «a.getDataType(false,e,db,bundleDef,eClass)»«IF f.lowerBound > 0» not null«ENDIF»
					«dummy(flag = true)»
				«ELSEIF a.parameters.size == 1 && a.parameters.head != pk.columnName»
					«val pkEClass = (a.query.eContainer as EMappingEntity).lookupEClass»
					«IF flag», «ENDIF»"«a.parameters.head.toDefaultCase(db)»" «(a.query.eContainer as EMappingEntity).attributes.findFirst[it.pk].getDataType(true,e,db,bundleDef,pkEClass)»«IF f.lowerBound > 0» not null«ENDIF»
					«dummy(flag = true)»
				«ENDIF»
			«ENDIF»
		«ENDFOR»
		«IF e.entity.descriminationColumn != null»
«««			, «e.descriminationColumn» «db.getDatabaseType(EcorePackage::eINSTANCE.EString)»
		«ENDIF»
		«IF ! db.isPrimaryKeyPartOfColDef(pk)»
		, «db.getPrimaryKeyAsConstraint(util,e,pk)»
		«ENDIF»
		«FOR u : e.uniqueContraints»
		, constraint «IF u.name != null»«u.name»«ELSE»uk_«u.attributes.join("_",[it.columnName])»«ENDIF» UNIQUE («u.attributes.map['"'+it.calcColumnName(db)+'"'].join(", ")»)
		«ENDFOR»
	);

	«IF ! db.isArrayStoreSupported(null)»
		«val primtiveMulti = e.entity.findPrimitiveMultiValuedAttributes(e.entity.lookupEClass)»
		«IF ! primtiveMulti.empty»
			«FOR p : primtiveMulti»
			create table "«p.primitiveMultiValuedTableName.toDefaultCase(db)»" (
				"«p.primitiveMultiValuedFKColName.toDefaultCase(db)»" «e.entity.PKAttribute.getDataType(true,e, db, bundleDef, e.entity.lookupEClass)» not null,
				«"ELT".toDefaultCase(db)» «p.getDataType(false,e,db,bundleDef,e.entity.lookupEClass)»
			);

			«ENDFOR»
		«ENDIF»
	«ENDIF»
	«ENDFOR»

	/*
	 * N:M Tables
	 */
	«val nmRelations = bundleDef.findNMRelations»
	«FOR r : nmRelations»
		create table "«r.a1.relationTable.toDefaultCase(db)»" (
			"«r.a1.relationColumn.toDefaultCase(db)»" «r.a1.opposite.entity.attributes.findFirst[pk].getDataType(true,null,db,bundleDef,r.a1.opposite.entity.lookupEClass)» not null,
			"«r.a2.relationColumn.toDefaultCase(db)»" «r.a2.opposite.entity.attributes.findFirst[pk].getDataType(true,null,db,bundleDef,r.a2.opposite.entity.lookupEClass)» not null
		);
	«ENDFOR»

	/* ------------------------------------
	 * Constraints
	 * ------------------------------------
	 */
	«FOR e : bundleDef.entities.filter([entity.allAttributes.findFirst[pk] != null])»
		«val eClass = e.entity.lookupEClass»
		«val pkCol = e.entity.collectDerivedAttributes.values.findFirst[pk]»
		«val pk = pkCol?.columnName»
		«FOR a : e.entity.collectDerivedAttributes.values.filter[resolved && parameters.size == 1 && parameters.head != pk].sort[a,b|sortAttributes(eClass,a,b)]»
			«val fkConstraint = e.fkConstraints.findFirst[it.attribute == a]»

			alter table "«e.entity.calcTableName.toDefaultCase(db)»"
				add constraint «IF fkConstraint != null»«fkConstraint.name»«ELSE»fk_«e.entity.name»_«a.name»«ENDIF»
				foreign key ("«a.parameters.head.toDefaultCase(db)»")
				references "«(a.query.eContainer as EMappingEntity).calcTableName.toDefaultCase(db)»" ("«(a.query.eContainer as EMappingEntity).attributes.findFirst[it.pk].calcColumnName(db)»");
		«ENDFOR»
		«IF e.entity.extensionType == "extends"»
		«val localPk = e.entity.attributes.findFirst[it.pk]»
		«val fkConstraint = e.fkConstraints.findFirst[it.attribute == localPk]»

		/* Extend constraint */
		alter table "«e.entity.calcTableName.toDefaultCase(db)»"
			add «IF fkConstraint != null»constraint «fkConstraint.name»«ENDIF»
			foreign key ("«pk.toDefaultCase(db)»")
			references "«e.entity.parent.calcTableName.toDefaultCase(db)»" ("«e.entity.parent.attributes.findFirst[it.pk].calcColumnName(db)»");
		«ENDIF»
	«ENDFOR»

	/* N:M relation constraints */
	«FOR r : nmRelations»
		«val fkConstraint1 = r.e1.fkConstraints.findFirst[it.attribute == r.a1]»
		alter table "«r.a1.relationTable.toDefaultCase(db)»"
			add constraint «IF fkConstraint1 != null»«fkConstraint1.name»«ELSE»fk_«r.a1.opposite.entity.name»_«r.a1.opposite.name»«ENDIF»
			foreign key ("«r.a1.relationColumn.toDefaultCase(db)»")
			references "«r.a1.entity.calcTableName.toDefaultCase(db)»" ("«r.a1.parameters.head.toDefaultCase(db)»");

		«val fkConstraint2 = r.e2.fkConstraints.findFirst[it.attribute == r.a2]»
		alter table "«r.a2.relationTable.toDefaultCase(db)»"
			add constraint «IF fkConstraint2 != null»«fkConstraint2.name»«ELSE»fk_«r.a2.opposite.entity.name»_«r.a2.opposite.name»«ENDIF»
			foreign key ("«r.a2.relationColumn.toDefaultCase(db)»")
			references "«r.a2.entity.calcTableName.toDefaultCase(db)»" ("«r.a2.parameters.head.toDefaultCase(db)»");

	«ENDFOR»

	/* FK-Constraints for multi-valued primitive attributes */
	«FOR e : bundleDef.entities.filter([entity.allAttributes.findFirst[pk] != null])»
		«IF ! db.isArrayStoreSupported(null)»
			«val primtiveMulti = e.entity.findPrimitiveMultiValuedAttributes(e.entity.lookupEClass)»
			«IF ! primtiveMulti.empty»
				«FOR p : primtiveMulti»
				«val fkConstraint = e.fkConstraints.findFirst[it.attribute == p]»
				/* «e.entity.name»#«p.name» */
				alter table "«p.primitiveMultiValuedTableName.toDefaultCase(db)»"
					add constraint «IF fkConstraint != null»«fkConstraint.name»«ELSE»fk_«p.primitiveMultiValuedTableName»«ENDIF»
					foreign key ("«("FK_"+ p.primitiveMultiValuedTableName).toDefaultCase(db)»")
					references "«p.entity.calcTableName.toDefaultCase(db)»" ("«p.entity.attributes.findFirst[pk].calcColumnName(db)»");

				«ENDFOR»
			«ENDIF»
		«ENDIF»
	«ENDFOR»

	«IF ! db.supportsGeneratedKeys»

		/* ------------------------------------
		 * Create sequences
		 * ------------------------------------
		 */
		«FOR e : bundleDef.entities.filter([entity.allAttributes.findFirst[pk] != null])»
			«val pkCol = e.entity.collectDerivedAttributes.values.findFirst[pk]»
			«IF ! db.supportsGeneratedKeys && pkCol != null && ! pkCol.valueGenerators.empty»
			/* Sequence for «e.entity.calcTableName.toDefaultCase(db)» */
			create sequence «pkCol.valueGenerators.findFirst[dbType==db.databaseId].sequence»;

			«ENDIF»
		«ENDFOR»
	«ENDIF»

	/* ------------------------------------
	 * Create indices
	 * ------------------------------------
	 */
	«FOR e : bundleDef.entities»
		«FOR i : e.indices»
			create index «i.name» on "«e.entity.calcTableName.toDefaultCase(db)»" ( «i.attributes.map['"'+columnName.toDefaultCase(db)+'"'].join(",")» );
		«ENDFOR»
	«ENDFOR»
	'''

	def CharSequence generatedDropDDL(EMappingBundle bundleDef, DatabaseSupport db) '''
		«val nmRelations = bundleDef.findNMRelations»

		«FOR e : bundleDef.entities.filter([entity.allAttributes.findFirst[pk] != null])»
			«val eClass = e.entity.lookupEClass»
			«val pkCol = e.entity.collectDerivedAttributes.values.findFirst[pk]»
			«val pk = pkCol?.columnName»
			«FOR a : e.entity.collectDerivedAttributes.values.filter[resolved && parameters.size == 1 && parameters.head != pk].sort[a,b|sortAttributes(eClass,a,b)]»
				«val fkConstraint = e.fkConstraints.findFirst[it.attribute == a]»

				alter table "«e.entity.calcTableName.toDefaultCase(db)»"
					drop constraint «IF fkConstraint != null»«fkConstraint.name»«ELSE»fk_«e.entity.name»_«a.name»«ENDIF»;
			«ENDFOR»
			«IF e.entity.extensionType == "extends"»
			«val localPk = e.entity.attributes.findFirst[it.pk]»
			«val fkConstraint = e.fkConstraints.findFirst[it.attribute == localPk]»

			/* Extend constraint */
			alter table "«e.entity.calcTableName.toDefaultCase(db)»"
				drop «IF fkConstraint != null»constraint «fkConstraint.name»«ENDIF»;
			«ENDIF»
		«ENDFOR»

		«FOR r : nmRelations»
			«val fkConstraint1 = r.e1.fkConstraints.findFirst[it.attribute == r.a1]»
			alter table "«r.a1.relationTable»"
				drop constraint «IF fkConstraint1 != null»«fkConstraint1.name»«ELSE»fk_«r.a1.opposite.entity.name»_«r.a1.opposite.name»«ENDIF»;

			«val fkConstraint2 = r.e2.fkConstraints.findFirst[it.attribute == r.a2]»
			alter table "«r.a2.relationTable»"
				drop constraint «IF fkConstraint2 != null»«fkConstraint2.name»«ELSE»fk_«r.a2.opposite.entity.name»_«r.a2.opposite.name»«ENDIF»;
		«ENDFOR»

		«FOR e : bundleDef.entities.filter([entity.allAttributes.findFirst[pk] != null])»
			«IF ! db.isArrayStoreSupported(null)»
				«val primtiveMulti = e.entity.findPrimitiveMultiValuedAttributes(e.entity.lookupEClass)»
				«IF ! primtiveMulti.empty»
					«FOR p : primtiveMulti»
					«val fkConstraint = e.fkConstraints.findFirst[it.attribute == p]»
					/* «e.entity.name»#«p.name» */
					alter table "«p.primitiveMultiValuedTableName»"
						drop constraint «IF fkConstraint != null»«fkConstraint.name»«ELSE»fk_«p.primitiveMultiValuedTableName»«ENDIF»;
					«ENDFOR»
				«ENDIF»
			«ENDIF»
		«ENDFOR»

		«IF ! db.supportsGeneratedKeys»
			«FOR e : bundleDef.entities.filter([entity.allAttributes.findFirst[pk] != null])»
				«val pkCol = e.entity.collectDerivedAttributes.values.findFirst[pk]»
				«IF ! db.supportsGeneratedKeys && pkCol != null && ! pkCol.valueGenerators.empty»
				DROP sequence «pkCol.valueGenerators.findFirst[dbType==db.databaseId].sequence»;
				«ENDIF»
			«ENDFOR»
		«ENDIF»

		«FOR e : bundleDef.entities»
			«FOR i : e.indices»
				drop index «i.name»;
			«ENDFOR»
		«ENDFOR»

		«FOR e : bundleDef.entities.filter([entity.allAttributes.findFirst[pk] != null])»
			«FOR u : e.uniqueContraints»
			ALTER TABLE "«e.entity.calcTableName.toDefaultCase(db)»" DROP constraint «IF u.name != null»«u.name»«ELSE»uk_«u.attributes.join("_",[it.columnName])»«ENDIF»;
			«ENDFOR»
		«ENDFOR»

		«FOR e : bundleDef.entities.filter([entity.allAttributes.findFirst[pk] != null])»
			DROP TABLE "«e.entity.calcTableName.toDefaultCase(db)»";

			«IF ! db.isArrayStoreSupported(null)»
				«val primtiveMulti = e.entity.findPrimitiveMultiValuedAttributes(e.entity.lookupEClass)»
				«IF ! primtiveMulti.empty»
					«FOR p : primtiveMulti»
					DROP TABLE "«p.primitiveMultiValuedTableName»";
					«ENDFOR»
				«ENDIF»
			«ENDIF»
		«ENDFOR»

		«FOR r : nmRelations»
			DROP TABLE "«r.a1.relationTable»";
		«ENDFOR»
	'''

	def void dummy(boolean b) {

	}

	def String calcColumnName(EAttribute e, DatabaseSupport dbSupport) {
		if( dbSupport.isDefaultLowerCase ) {
			return e.columnName.toLowerCase
		} else {
			return e.columnName.toUpperCase
		}
	}

	def String toDefaultCase(String columnName, DatabaseSupport dbSupport) {
		if( dbSupport.isDefaultLowerCase ) {
			return columnName.toLowerCase
		} else {
			return columnName.toUpperCase
		}
	}
}
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
package at.bestsolution.persistence.emap.validation

import org.eclipse.xtext.validation.Check
import at.bestsolution.persistence.emap.eMap.EMappingEntity
import com.google.inject.Inject
import at.bestsolution.persistence.emap.generator.UtilCollection
import at.bestsolution.persistence.emap.eMap.EMapPackage
import at.bestsolution.persistence.emap.eMap.ENamedQuery
import at.bestsolution.persistence.emap.eMap.EFkConstraint
import at.bestsolution.persistence.emap.eMap.EAttribute
import at.bestsolution.persistence.emap.eMap.EValueGenerator

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class EMapValidator extends AbstractEMapValidator {

	@Inject extension
	UtilCollection util;
//  public static val INVALID_NAME = 'invalidName'

//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character::isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital',
//					MyDslPackage$Literals::GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	public static final String ATTRIBUTE_MISSING = "ATTRIBUTE_MISSING";
	public static final String ATTRIBUTE_UNKNOWN = "ATTRIBUTE_UNKNOWN";
	public static final String SELECT_ALL_MISSING = "SELECT_ALL_MISSING";
	public static final String NAME_TOO_LONG = "NAME_TOO_LONG";

	@Check
	def checkMissingSelectAllQuery(EMappingEntity entity) {
		if (!entity.namedQueries.exists[it.name == "selectAll"]) {
			warning("No 'selectAll' query defined!", entity, EMapPackage$Literals::EMAPPING_ENTITY__NAME, SELECT_ALL_MISSING);

		}
	}

	@Check
	def checkUnknownAttributes(EAttribute attrib) {
		val type = attrib.entity.etype;
		val eClass = type.lookupEClass;
		val unknown = !eClass.EAllStructuralFeatures.map[x|x.name].contains(attrib.name)
		if (unknown) {
			error("Unknown attribute: '" + attrib.name + "'. Please check if your eClass (" + eClass.name + ") really contains it", attrib, EMapPackage$Literals::EATTRIBUTE__NAME, ATTRIBUTE_UNKNOWN, attrib.name);
		}
	}

	@Check
	def checkMissingAttributes(EMappingEntity entity) {
		val type = entity.etype;
		val eClass = type.lookupEClass;
		val missing = eClass.EAllStructuralFeatures.filter[f|!f.transient && entity.allAttributes.findFirst[it.name == f.name] == null]
		if (!missing.empty) {
			for (m : missing) {
				warning("Missing attribute: '" + m.name + "'", entity, EMapPackage$Literals::EMAPPING_ENTITY__NAME, ATTRIBUTE_MISSING, m.name);
			}
		}
	}

	@Check
	def checkMissingPrimaryKey(ENamedQuery q) {
		if( "selectById" == q.name && q.parameters.size == 1 ) {
			if( ! q.parameters.head.id ) {
				warning("Performance: Missing primarykey def for parameter",q,EMapPackage$Literals::ENAMED_QUERY__NAME);
			}
		}
	}

	// TODO we need to execute the following checks only if we support firebird


	@Check
	def checkTableNameLength(EMappingEntity entity) {
		if (!entity.findPrimitiveMultiValuedAttributes(entity.lookupEClass).empty) {
			if (entity.calcTableName.length > 14) {
				if (entity.tableName != null) {
					warning("Firebird: Tables containing MultiValue Attributes:  tablename may not be longer than 14 characters", entity, EMapPackage$Literals::EMAPPING_ENTITY__TABLE_NAME, NAME_TOO_LONG, entity.calcTableName, entity.name);
				}
				else {
					warning("Firebird: Tables containing MultiValue Attributes:  tablename may not be longer than 14 characters", entity, EMapPackage$Literals::EMAPPING_ENTITY__NAME, NAME_TOO_LONG, entity.calcTableName, entity.name);
				}
			}
		}
		else {
			if (entity.calcTableName.length > 31) {
				if (entity.tableName != null) {
					warning("Firebird: Identifiers may not be longer than 31 characters", entity, EMapPackage$Literals::EMAPPING_ENTITY__TABLE_NAME, NAME_TOO_LONG, entity.calcTableName, entity.name);
				}
				else {
					warning("Firebird: Identifiers may not be longer than 31 characters", entity, EMapPackage$Literals::EMAPPING_ENTITY__NAME, NAME_TOO_LONG, entity.calcTableName, entity.name);
				}
			}
		}
	}

	@Check
	def checkColumnNameLength(EAttribute attrib) {
		if (attrib.isPrimitiveMultiValuedAttribute(attrib.entity.lookupEClass)) {
			if (attrib.columnName.length > 13) {
				warning("Firebird: MultiValue Attributes names may not be longer than 13 characters", attrib, EMapPackage$Literals::EATTRIBUTE__COLUMN_NAME, NAME_TOO_LONG, attrib.columnName, attrib.name);
			}
		}
		else {
			if (attrib.columnName.length > 31) {
				warning("Firebird: Identifiers may not be longer than 31 characters", attrib, EMapPackage$Literals::EATTRIBUTE__COLUMN_NAME, NAME_TOO_LONG, attrib.columnName, attrib.name);
			}
		}
	}

	@Check
	def checkFBSeqName(EValueGenerator generator) {
		if ("Firebird".equals(generator.dbType)) {
			if (generator.sequence.length > 31) {
				warning("Firebird: Identifiers may not be longer than 31 characters", generator, EMapPackage$Literals::EVALUE_GENERATOR__SEQUENCE, NAME_TOO_LONG, generator.sequence, generator.sequence);
			}
		}
	}

	@Check
	def checkFkConstraintName(EFkConstraint constraint) {
		if (constraint.name.length > 31) {
			warning("Firebird: Identifiers may not be longer than 31 characters", constraint, EMapPackage$Literals::EFK_CONSTRAINT__NAME, NAME_TOO_LONG, constraint.name, constraint.attribute.name);
		}
	}
}

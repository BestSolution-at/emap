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
	public static final String SELECT_ALL_MISSING = "SELECT_ALL_MISSING";

	@Check
	def checkMissingSelectAllQuery(EMappingEntity entity) {
		if (!entity.namedQueries.exists[it.name == "selectAll"]) {
			warning("No 'selectAll' query defined!", entity, EMapPackage$Literals::EMAPPING_ENTITY__NAME, SELECT_ALL_MISSING);

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
}

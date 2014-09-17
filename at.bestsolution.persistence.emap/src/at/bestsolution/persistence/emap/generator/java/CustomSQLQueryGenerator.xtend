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

import at.bestsolution.persistence.emap.eMap.ECustomQuery
import com.google.inject.Inject
import at.bestsolution.persistence.emap.generator.UtilCollection
import at.bestsolution.persistence.emap.eMap.ENamedCustomQuery

class CustomSQLQueryGenerator {
	@Inject extension
  	var UtilCollection util;
  	
  	def generate(ENamedCustomQuery namedQuery, ECustomQuery query) {
  		return generate(namedQuery,query,false)
  	}

	def generate(ENamedCustomQuery namedQuery, ECustomQuery query, boolean removeInsets)'''
	SELECT
		«IF removeInsets»«query.columns.sanitiesString»«ELSE»«query.columns»«ENDIF»
	FROM
		«IF removeInsets»«query.from.replaceSqlParameters(namedQuery.parameters).sanitiesString»«ELSE»«query.from.replaceSqlParameters(namedQuery.parameters)»«ENDIF»
    «IF query.where != null»WHERE
      «IF removeInsets»«query.where.replaceSqlParameters(namedQuery.parameters).sanitiesString»«ELSE»«query.where.replaceSqlParameters(namedQuery.parameters)»«ENDIF»«ENDIF»
    «IF query.groupBy != null»GROUP BY
      «IF removeInsets»«query.groupBy.replaceSqlParameters(namedQuery.parameters).sanitiesString»«ELSE»«query.groupBy.replaceSqlParameters(namedQuery.parameters)»«ENDIF»«ENDIF»
    «IF query.orderby != null»ORDER BY
      «IF removeInsets»«query.orderby.replaceSqlParameters(namedQuery.parameters).sanitiesString»«ELSE»«query.orderby.replaceSqlParameters(namedQuery.parameters)»«ENDIF»«ENDIF»
	'''

	def generateCriteriaSQL(ENamedCustomQuery namedQuery, ECustomQuery query)'''
	SELECT
		«query.columns»
	FROM
		«query.from.replaceSqlParameters(namedQuery.parameters)»
	'''
}
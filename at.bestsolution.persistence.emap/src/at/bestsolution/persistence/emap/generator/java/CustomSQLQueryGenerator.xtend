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
import at.bestsolution.persistence.emap.eMap.ETypeDef
import java.util.List
import java.util.ArrayList

class CustomSQLQueryGenerator {
	@Inject extension
  	var UtilCollection util;
  	
  	def generate(ENamedCustomQuery namedQuery, ECustomQuery query) {
  		return generate(namedQuery,query,false)
  	}
  	
  	def zip(List<Object> a, List<Object> b) {
  		var result = new ArrayList<List<Object>>
  		
  		var max = Math.max(a.size, b.size);
  		
  		for (var i = 0; i < max; i++) {
  			var el = new ArrayList<Object>
  			
  			el.add(a.get(i))
  			el.add(b.get(i))
  			
  			result.add(el)
  		}
  		return result;
  	}

	def computeColumns(ENamedCustomQuery namedQuery, ECustomQuery query) {
//		if (namedQuery.returnType instanceof ETypeDef) {
//			var t = namedQuery.returnType as ETypeDef
//			return query.columns.split(",")
//				.zip(t.types.map[x|x.name])
//				.map[x|x.get(0) + " as " + x.get(1)]
//				.join(",")
//		}
//		else {
			return query.columns;
//		}
	}

	def generate(ENamedCustomQuery namedQuery, ECustomQuery query, boolean removeInsets)'''
	«var cols = computeColumns(namedQuery, query)»
	SELECT
		«IF removeInsets»«cols.sanitiesString»«ELSE»«cols»«ENDIF»
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
	«var cols = computeColumns(namedQuery, query)»
	SELECT
		«cols»
	FROM
		«query.from.replaceSqlParameters(namedQuery.parameters)»
	'''
}
/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.java.query;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.persistence.expr.Expression;
import at.bestsolution.persistence.expr.GroupExpression;
import at.bestsolution.persistence.expr.PropertyExpression;
import at.bestsolution.persistence.java.JavaObjectMapper;
import at.bestsolution.persistence.order.OrderColumn;

public class MappedBaseQuery<O> {

	protected void appendValue(List<TypedValue> rv, JavaObjectMapper<O> mapper, Expression<O> expression) {
		switch (expression.type) {
		case AND:
		case OR:
			for (Expression<O> e : ((GroupExpression<O>) expression).expressions) {
				appendValue(rv, mapper, e);
			}
			break;
		case IN:
		{
			PropertyExpression<O> e = (PropertyExpression<O>)expression;
			JDBCType jdbcType = mapper.getJDBCType(e.property);
			if( ! jdbcType.numeric ) {
				for( Object data : e.data ) {
					rv.add( new TypedValue( data instanceof EObject ? ((EObject)data).eGet(mapper.getReferenceId(e.property)) : data, jdbcType));
				}
			}
			break;
		}
		case IS_NOT_NULL:
		case IS_NULL:
			// skip it
			break;
		case LIKE:
		case ILIKE:
		case NOT_ILIKE:
		case NOT_LIKE:
		{
			PropertyExpression<O> e = (PropertyExpression<O>)expression;
			for( Object data : e.data ) {
				rv.add( new TypedValue( data instanceof EObject ? ((EObject)data).eGet(mapper.getReferenceId(e.property)) : data, JDBCType.STRING));
			}
			break;
		}
		default:
		{
			PropertyExpression<O> e = (PropertyExpression<O>)expression;
			for( Object data : e.data ) {
				rv.add( new TypedValue( data instanceof EObject ? ((EObject)data).eGet(mapper.getReferenceId(e.property)) : data, mapper.getJDBCType(e.property)));
			}
			break;
		}
		}
	}

	protected void appendOrderColumn(StringBuilder b, OrderColumn<O> column) {
		if( b.length() != 0 ) {
			b.append(",");
		}
		b.append(column.column + (column.asc ? "ASC" : "DESC"));
	}

	protected void appendCriteria(StringBuilder b, JavaObjectMapper<O> mapper, String colPrefix, Expression<O> expression) {
		if (expression instanceof PropertyExpression) {
			PropertyExpression<O> propertyExpression = (PropertyExpression<O>) expression;
			if (propertyExpression.property.contains(".")) {
				throw new UnsupportedOperationException("joins not yet implemented (" + propertyExpression.property + " needs join)");
			}
		}

		switch (expression.type) {
		case AND: {
			b.append("(");
			boolean flag = false;
			for (Expression<O> e : ((GroupExpression<O>) expression).expressions) {
				if (flag) {
					b.append(" AND ");
				}
				appendCriteria(b, mapper, colPrefix, e);
				flag = true;
			}
			b.append(")");
			break;
		}
		case OR:
		{
			b.append("(");
			boolean flag = false;
			for (Expression<O> e : ((GroupExpression<O>) expression).expressions) {
				if (flag) {
					b.append(" OR ");
				}
				appendCriteria(b, mapper, colPrefix, e);
				flag = true;
			}
			b.append(")");
			break;
		}
		case EQUALS:
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" = ?");
			break;
		case IEQUALS:
			b.append( "lower( " + colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property) + " )");
			b.append(" = lower( ? )");
			break;
		case NOT_EQUALS:
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" <> ?");
			break;
		case INOT_EQUALS:
			b.append( "lower( " + colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property) + " )");
			b.append(" <> lower( ? )");
			break;
		case IS_NOT_NULL:
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" IS NOT NULL");
			break;
		case IS_NULL:
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" IS NULL");
			break;
		case ILIKE:
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" ILIKE ?");
			break;
		case LIKE:
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" LIKE ?");
			break;
		case NOT_ILIKE:
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" NOT ILIKE ?");
			break;
		case NOT_LIKE:
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" NOT LIKE ?");
			break;
		case IN:
		{
			//TODO We could replace with a BETWEEN or >= & <= QUERY
			PropertyExpression<O> propExpression = (PropertyExpression<O>)expression;
			b.append( colPrefix + mapper.getColumnName(propExpression.property));
			JDBCType jdbcType = mapper.getJDBCType(propExpression.property);
			if( jdbcType.numeric ) {
				b.append(" IN ( "+ StringUtils.join(((PropertyExpression<O>)expression).data,',') +" )");
			} else {
				b.append(" IN ( ");
				boolean flag = false;
				for( int i = 0; i < propExpression.data.size(); i++ ) {
					if( flag ) {
						b.append(",");
					}
					b.append("?");
				}
				b.append(" )");
			}
		}
		default:
			break;
		}
	}
}

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
package at.bestsolution.persistence.java.query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.expr.Expression;
import at.bestsolution.persistence.expr.GroupExpression;
import at.bestsolution.persistence.expr.PropertyExpression;
import at.bestsolution.persistence.java.JavaObjectMapper;
import at.bestsolution.persistence.java.Util;
import at.bestsolution.persistence.order.OrderColumn;

public abstract class MappedQueryImpl<O> implements MappedQuery<O> {
	private final ListDelegate<O> listDelegate;
	private Expression<O> expression;
	private final JavaObjectMapper<O> rootMapper;
	private final String rootPrefix;
	private List<OrderColumn<O>> orderColumns;
	private int maxRows = -1;

	public MappedQueryImpl(JavaObjectMapper<O> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
		this.rootMapper = rootMapper;
		this.rootPrefix = rootPrefix;
		this.listDelegate = listDelegate;
	}

	@Override
	public List<O> list() {
		List<O> l = listDelegate.list(this);
		if( maxRows != -1 ) {
			if( l.size() > maxRows ) {
				Util.trimToSize(l, maxRows);
			}
		}
		return l;
	}

	@Override
	public MappedQuery<O> maxRows(int maxRows) {
		this.maxRows = maxRows;
		return this;
	}

	public abstract String processSQL(String sql);

	/**
	 * @return the maxRows
	 */
	public int getMaxRows() {
		return maxRows;
	}

	@Override
	public O unique() {
		List<O> l = list();
		if( l.size() == 1 ) {
			return l.get(0);
		} else if( l.size() > 1 ) {
			throw new IllegalStateException("More than one result");
		}
		return null;
	}

	@Override
	public MappedQuery<O> where(Expression<O> expression) {
		this.expression = expression;
		return this;
	}

	public String getCriteria() {
		StringBuilder b = new StringBuilder();
		if (expression != null) {
			appendCriteria(b, rootMapper, rootPrefix == null ? "" : rootPrefix + ".", expression);
		}
		return b.toString();
	}

	public String getOrderBy() {
		StringBuilder b = new StringBuilder();
		if( orderColumns != null && ! orderColumns.isEmpty() ) {

		}
		return b.toString();
	}

	protected void appendOrderColumn(StringBuilder b, OrderColumn<O> column) {
		if( b.length() != 0 ) {
			b.append(",");
		}
		b.append(column.column + (column.asc ? "ASC" : "DESC"));
	}

	public TypedValue[] getParameters() {
		List<TypedValue> rv = new ArrayList<TypedValue>();
		if( expression != null) {
			appendValue(rv, rootMapper, expression);
		}
		return rv.toArray(new TypedValue[0]);
	}

	protected void appendValue(List<TypedValue> rv, JavaObjectMapper<O> mapper, Expression<O> expression) {
		switch (expression.type) {
		case AND:
		case OR:
			for (Expression<O> e : ((GroupExpression<O>) expression).expressions) {
				appendValue(rv, mapper, e);
			}
			break;
		case IN:
		case IS_NOT_NULL:
		case IS_NULL:
			// skip it
			break;
		default:
			PropertyExpression<O> e = (PropertyExpression<O>)expression;
			for( Object data : e.data ) {
				rv.add( new TypedValue( data instanceof EObject ? ((EObject)data).eGet(mapper.getReferenceId(e.property)) : data, mapper.getJDBCType(e.property)));
			}
			break;
		}
	}

	protected void appendCriteria(StringBuilder b, JavaObjectMapper<O> mapper, String colPrefix, Expression<O> expression) {
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
			// We could replace with a BETWEEN or >= & <= QUERY
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" IN ( "+ StringUtils.join(((PropertyExpression<O>)expression).data,',') +" )");
		default:
			break;
		}
	}

	@Override
	public MappedQuery<O> orderBy(OrderColumn<O>... columns) {
		orderColumns = Arrays.asList(columns);
		return this;
	}
}
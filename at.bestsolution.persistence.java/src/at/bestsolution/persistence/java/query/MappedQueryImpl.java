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
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.expr.Expression;
import at.bestsolution.persistence.expr.GroupExpression;
import at.bestsolution.persistence.expr.PropertyExpression;
import at.bestsolution.persistence.java.JavaObjectMapper;
import at.bestsolution.persistence.java.Util;
import at.bestsolution.persistence.order.OrderColumn;

public abstract class MappedQueryImpl<O> extends MappedBaseQuery<O> implements MappedQuery<O>, InternalSelectQueryCriteria {
	private final ListDelegate<O> listDelegate;
	private Expression<O> expression;
	private final JavaObjectMapper<?> rootMapper;
	private final String rootPrefix;
	private List<OrderColumn<O>> orderColumns;
	private int maxRows = -1;

	public MappedQueryImpl(JavaObjectMapper<?> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
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
	
	public String getCriteriaJoin() {
		StringBuilder b = new StringBuilder();
		if (expression != null) {
			LinkedHashSet<Join> joins = new LinkedHashSet<Join>();
			appendJoinCriteria(joins, rootMapper, rootPrefix == null ? "" : rootPrefix, expression);
			for( Join j : joins ) {
				b.append("INNER JOIN " + quoteColumnName(j.joinTable) + " " + quoteColumnName(j.joinAlias) + " ON " + quoteColumnName(j.joinAlias) + "." + quoteColumnName(j.joinColumn) + " = " + ( j.otherAlias != null ? quoteColumnName(j.otherAlias) + "." : "") + quoteColumnName(j.otherColumn) + " \n");
			}
		}
		return b.toString();
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

	public TypedValue[] getParameters() {
		List<TypedValue> rv = new ArrayList<TypedValue>();
		if( expression != null) {
			appendValue(rv, rootMapper, expression);
		}
		return rv.toArray(new TypedValue[0]);
	}

	@Override
	public MappedQuery<O> orderBy(OrderColumn<O>... columns) {
		orderColumns = Arrays.asList(columns);
		return this;
	}
}
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

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.persistence.MappedUpdateQuery;
import at.bestsolution.persistence.expr.Expression;
import at.bestsolution.persistence.java.DatabaseSupport;
import at.bestsolution.persistence.java.JavaObjectMapper;

public abstract class MappedUpdateQueryImpl<O> extends MappedBaseQuery<O> implements MappedUpdateQuery<O>, InternalQueryCriteria {
	private final UpdateDelegate<O> updateDelegate;
	private Expression<O> expression;
	private final JavaObjectMapper<O> rootMapper;
	private final String rootPrefix;

	public MappedUpdateQueryImpl(DatabaseSupport db, JavaObjectMapper<O> rootMapper, String rootPrefix, UpdateDelegate<O> updateDelegate) {
		super(db);
		this.rootMapper = rootMapper;
		this.rootPrefix = rootPrefix;
		this.updateDelegate = updateDelegate;
	}

	@Override
	public int execute() {
		return updateDelegate.execute(this);
	}

	@Override
	public MappedUpdateQuery<O> where(Expression<O> expression) {
		this.expression = expression;
		return this;
	}

	@Override
	public String getCriteria() {
		StringBuilder b = new StringBuilder();
		if (expression != null) {
			appendCriteria(b, rootMapper, rootPrefix == null ? "" : rootPrefix + ".", expression);
		}
		return b.toString();
	}

	@Override
	public TypedValue[] getParameters() {
		List<TypedValue> rv = new ArrayList<TypedValue>();
		if( expression != null) {
			appendValue(rv, rootMapper, expression);
		}
		return rv.toArray(new TypedValue[0]);
	}

}

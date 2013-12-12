package at.bestsolution.persistence.expressions;

import at.bestsolution.persistence.Criteria;

public interface BooleanExpression<C extends Criteria<?>> extends Expression<C> {
	public C eq(boolean value);
}

package at.bestsolution.persistence.expressions;

import at.bestsolution.persistence.Criteria;

public interface LongExpression<C extends Criteria<?>> extends Expression<C> {
	public C eq(long value);
}

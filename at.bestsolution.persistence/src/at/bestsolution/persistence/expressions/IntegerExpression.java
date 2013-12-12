package at.bestsolution.persistence.expressions;

import at.bestsolution.persistence.Criteria;

public interface IntegerExpression<C extends Criteria<?>> extends Expression<C> {
	public C eq(int value);
}

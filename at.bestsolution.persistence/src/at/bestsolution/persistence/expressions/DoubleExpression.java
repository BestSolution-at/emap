package at.bestsolution.persistence.expressions;

import at.bestsolution.persistence.Criteria;

public interface DoubleExpression<C extends Criteria<?>> extends Expression<C> {
	public C eq(double value);
}

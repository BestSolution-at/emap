package at.bestsolution.persistence.expressions;

import at.bestsolution.persistence.Criteria;

public interface GenericExpression<C extends Criteria<?>, O> extends Expression<C> {
	public C eq(O value);
}

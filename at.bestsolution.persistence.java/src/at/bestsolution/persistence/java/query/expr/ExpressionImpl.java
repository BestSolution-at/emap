package at.bestsolution.persistence.java.query.expr;

import at.bestsolution.persistence.Criteria;
import at.bestsolution.persistence.expressions.Expression;

public class ExpressionImpl<C extends Criteria<?>> implements Expression<C> {
	protected final C criteria;
	protected final String property;

	public ExpressionImpl(C criteria, String property) {
		this.criteria = criteria;
		this.property = property;
	}

	protected C _eq(Object value) {
		criteria.eq(property, value);
		return criteria;
	}
}

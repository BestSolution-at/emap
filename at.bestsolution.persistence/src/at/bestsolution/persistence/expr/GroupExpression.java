package at.bestsolution.persistence.expr;

import java.util.Collection;

public abstract class GroupExpression<O> extends Expression<O> {
	public final Collection<Expression<O>> expressions;

	GroupExpression(ExpressionType type, Collection<Expression<O>> expressions) {
		super(type);
		this.expressions = expressions;
	}
}

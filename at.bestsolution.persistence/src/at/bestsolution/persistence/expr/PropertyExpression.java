package at.bestsolution.persistence.expr;

import java.util.Arrays;
import java.util.Collection;

public abstract class PropertyExpression<O> extends Expression<O> {
	public final String property;
	public final Collection<Object> data;

	public PropertyExpression(ExpressionType type, String property, Object... data) {
		super(type);
		this.property = property;
		this.data = Arrays.asList(data);
	}
}

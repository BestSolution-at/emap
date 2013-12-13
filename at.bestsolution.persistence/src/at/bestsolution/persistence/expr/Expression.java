package at.bestsolution.persistence.expr;


public abstract class Expression<O> {
	public final ExpressionType type;

	Expression(ExpressionType type) {
		this.type = type;
	}
}

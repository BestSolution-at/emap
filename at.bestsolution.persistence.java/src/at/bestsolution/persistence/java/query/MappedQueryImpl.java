package at.bestsolution.persistence.java.query;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.expr.Expression;
import at.bestsolution.persistence.expr.GroupExpression;
import at.bestsolution.persistence.expr.PropertyExpression;

public class MappedQueryImpl<O> implements MappedQuery<O> {
	private final ColumnDelegate columnDelegate;
	private final TypeDelegate typeDelegate;
	private final ListDelegate<O> listDelegate;
	private Expression<O> expression;

	public MappedQueryImpl(ColumnDelegate columnDelegate,
			TypeDelegate typeDelegate, ListDelegate<O> listDelegate) {
		this.columnDelegate = columnDelegate;
		this.typeDelegate = typeDelegate;
		this.listDelegate = listDelegate;
	}

	public TypeDelegate getTypeDelegate() {
		return typeDelegate;
	}

	public ColumnDelegate getColumnDelegate() {
		return columnDelegate;
	}

	@Override
	public List<O> list() {
		return listDelegate.list(this);
	}

	@Override
	public O unique() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MappedQuery<O> where(Expression<O> expression) {
		this.expression = expression;
		return this;
	}

	public String getCriteria() {
		StringBuilder b = new StringBuilder();
		if (expression != null) {
			appendCriteria(b, expression);
		}
		return b.toString();
	}

	public TypedValue[] getParameters() {
		List<TypedValue> rv = new ArrayList<TypedValue>();
		if( expression != null) {
			appendValue(rv, expression);
		}
		return rv.toArray(new TypedValue[0]);
	}

	protected void appendValue(List<TypedValue> rv, Expression<O> expression) {
		switch (expression.type) {
		case AND:
		case OR:
			for (Expression<O> e : ((GroupExpression<O>) expression).expressions) {
				appendValue(rv, e);
			}
			break;
		default:
			PropertyExpression<O> e = (PropertyExpression<O>)expression;
			for( Object data : e.data ) {
				rv.add(typeDelegate.get(e.property, data));
			}
			break;
		}
	}

	protected void appendCriteria(StringBuilder b, Expression<O> expression) {
		switch (expression.type) {
		case AND: {
			b.append("(");
			boolean flag = false;
			for (Expression<O> e : ((GroupExpression<O>) expression).expressions) {
				if (flag) {
					b.append(" AND ");
				}
				appendCriteria(b, e);
				flag = true;
			}
			b.append(")");
			break;
		}
		case OR:
			b.append("(");
			boolean flag = false;
			for (Expression<O> e : ((GroupExpression<O>) expression).expressions) {
				if (flag) {
					b.append(" OR ");
				}
				appendCriteria(b, e);
				flag = true;
			}
			b.append(")");
			break;
		case EQUALS:
			b.append(columnDelegate.get(((PropertyExpression<O>)expression).property));
			b.append(" = ?");
			break;
		case NOT_EQUALS:
			b.append(columnDelegate.get(((PropertyExpression<O>)expression).property));
			b.append(" <> ?");
			break;
		case ILIKE:
			b.append(columnDelegate.get(((PropertyExpression<O>)expression).property));
			b.append(" ILIKE ?");
			break;
		case LIKE:
			b.append(columnDelegate.get(((PropertyExpression<O>)expression).property));
			b.append(" LIKE ?");
			break;
		default:
			break;
		}
	}
}
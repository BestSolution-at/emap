package at.bestsolution.persistence.java.query;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.expr.Expression;
import at.bestsolution.persistence.expr.GroupExpression;
import at.bestsolution.persistence.expr.PropertyExpression;
import at.bestsolution.persistence.java.JavaObjectMapper;

public class MappedQueryImpl<O> implements MappedQuery<O> {
	private final ListDelegate<O> listDelegate;
	private Expression<O> expression;
	private final JavaObjectMapper<O> rootMapper;
	private final String rootPrefix;

	public MappedQueryImpl(JavaObjectMapper<O> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
		this.rootMapper = rootMapper;
		this.rootPrefix = rootPrefix;
		this.listDelegate = listDelegate;
	}

	@Override
	public List<O> list() {
		return listDelegate.list(this);
	}

	@Override
	public O unique() {
		List<O> l = list();
		if( l.size() == 1 ) {
			return l.get(0);
		} else if( l.size() > 1 ) {
			throw new IllegalStateException("More than one result");
		}
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
			appendCriteria(b, rootMapper, rootPrefix == null ? "" : rootPrefix + ".", expression);
		}
		return b.toString();
	}

	public TypedValue[] getParameters() {
		List<TypedValue> rv = new ArrayList<TypedValue>();
		if( expression != null) {
			appendValue(rv, rootMapper, expression);
		}
		return rv.toArray(new TypedValue[0]);
	}

	protected void appendValue(List<TypedValue> rv, JavaObjectMapper<O> mapper, Expression<O> expression) {
		switch (expression.type) {
		case AND:
		case OR:
			for (Expression<O> e : ((GroupExpression<O>) expression).expressions) {
				appendValue(rv, mapper, e);
			}
			break;
		case IN:
			// skip it
			break;
		default:
			PropertyExpression<O> e = (PropertyExpression<O>)expression;
			for( Object data : e.data ) {
				rv.add( new TypedValue( data instanceof EObject ? ((EObject)data).eGet(mapper.getReferenceId(e.property)) : data, mapper.getJDBCType(e.property)));
			}
			break;
		}
	}

	protected void appendCriteria(StringBuilder b, JavaObjectMapper<O> mapper, String colPrefix, Expression<O> expression) {
		switch (expression.type) {
		case AND: {
			b.append("(");
			boolean flag = false;
			for (Expression<O> e : ((GroupExpression<O>) expression).expressions) {
				if (flag) {
					b.append(" AND ");
				}
				appendCriteria(b, mapper, colPrefix, e);
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
				appendCriteria(b, mapper, colPrefix, e);
				flag = true;
			}
			b.append(")");
			break;
		case EQUALS:
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" = ?");
			break;
		case NOT_EQUALS:
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" <> ?");
			break;
		case ILIKE:
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" ILIKE ?");
			break;
		case LIKE:
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" LIKE ?");
			break;
		case IN:
			// We could replace with a BETWEEN or >= & <= QUERY
			b.append( colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property));
			b.append(" IN ( "+ StringUtils.join(((PropertyExpression<O>)expression).data,',') +" )");
		default:
			break;
		}
	}
}
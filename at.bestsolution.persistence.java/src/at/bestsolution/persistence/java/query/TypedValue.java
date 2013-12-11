package at.bestsolution.persistence.java.query;

public class TypedValue {
	public Object value;
	public JDBCType type;

	public TypedValue(Object value, JDBCType type) {
		this.value = value;
		this.type = type;
	}
}
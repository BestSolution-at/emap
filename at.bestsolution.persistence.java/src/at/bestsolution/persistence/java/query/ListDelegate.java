package at.bestsolution.persistence.java.query;

import java.util.List;

public interface ListDelegate<O> {
	public List<O> list(DBCriteria<O> criteria);
}

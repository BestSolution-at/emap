package at.bestsolution.persistence.java.query;

import java.util.List;

import at.bestsolution.persistence.MappedQuery;

public interface ListDelegate<O> {
	public List<O> list(MappedQuery<O> criteria);
}

/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence;

import java.io.Closeable;
import java.sql.Blob;
import java.util.List;
import java.util.Map;

public interface Session extends Closeable {
	public static final String TOPIC_ROOT = "at/bestsolution/persistence";

	public static final String TOPIC_TRANSACTION = TOPIC_ROOT + "/transaction" ;
	public static final String TOPIC_TRANSACTION_START = TOPIC_ROOT + "/start";
	public static final String TOPIC_TRANSACTION_END = TOPIC_ROOT + "/end";

	public static final String DATA_SESSION_ID_TOPIC_TRANSACTION_START = "session-id";
	public static final String DATA_SESSION_ID_TOPIC_TRANSACTION_END = "session-id";
	public static final String DATA_STATUS_TOPIC_TRANSACTION_END = "status";
	public static final String VALUE_COMMIT = "commit";
	public static final String VALUE_ROLLBACK = "rollback";

	public String getId();
	public <M extends ObjectMapper<?>> M createMapper(Class<M> mapper);
	public <O> List<O> queryForList(String fqnMapper, String queryName, Object... parameters);
	public <O> List<O> queryForList(String fqnMapper, String queryName, Map<String,Object> parameterMap);

	public <O> O queryForOne(String fqnMapper, String queryName, Object... parameters);
	public <O> O queryForOne(String fqnMapper, String queryName, Map<String,Object> parameterMap);

	public <O> MappedQuery<O> mappedQuery(String fqnMapper, String queryName);
	public void runInTransaction(Transaction transaction);
	public void close();
	public void clear();
	public void persist(Object... o);
	public void delete(Object... o);

	public boolean isAttached(Object o);
//	public Object getVersion(Object o);

	public interface Transaction {
		public boolean execute();
	}

	public interface ExecutableSQL {
		public void execute() throws PersistanceException;
	}

	/**
	 * @param object
	 * @return
	 */
	public long getMemoryObjectVersion(Object object);
	/**
	 * @param object
	 * @return
	 */
	public long getPersistedObjectVersion(Object object);
}

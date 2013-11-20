package at.bestsolution.persistence;

public interface Session {
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
	public void runInTransaction(Transaction transaction);
	public void close();

	public interface Transaction {
		public boolean execute();
	}
}

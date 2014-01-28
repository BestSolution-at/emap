package at.bestsolution.persistence;

public class PersistanceException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public PersistanceException(Throwable cause) {
		super(cause);
	}

	public PersistanceException(String message) {
		super(message);
	}

	public PersistanceException(String message, Throwable cause) {
		super(message, cause);
	}
}

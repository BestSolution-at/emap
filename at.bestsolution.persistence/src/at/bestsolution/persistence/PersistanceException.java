package at.bestsolution.persistence;

public class PersistanceException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public PersistanceException(Throwable wrapped) {
		super(wrapped);
	}

}

package at.bestsolution.persistence.compat;

public interface CompatTransaction {
	public void commit();
	public void rollback();
}

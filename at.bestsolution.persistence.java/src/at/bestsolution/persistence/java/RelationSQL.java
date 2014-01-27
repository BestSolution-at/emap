package at.bestsolution.persistence.java;

import org.eclipse.emf.ecore.EObject;

import at.bestsolution.persistence.PersistanceException;

public interface RelationSQL {
	public enum Action {
		INSERT,
		DELETE,
		DELETE_ALL
	}
	public EObject getSelf();
	public EObject getOpposite();
	public Action getAction();
	public String getTableName();
	public void execute() throws PersistanceException;
}

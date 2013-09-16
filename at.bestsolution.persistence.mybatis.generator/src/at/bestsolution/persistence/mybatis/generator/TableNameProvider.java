package at.bestsolution.persistence.mybatis.generator;

import org.eclipse.emf.ecore.EClass;

public interface TableNameProvider {
	public String getTableName(EClass eClass);
}

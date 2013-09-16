package at.bestsolution.persistence.mybatis.generator.providers;

import org.eclipse.emf.ecore.EClass;

import at.bestsolution.persistence.mybatis.generator.TableNameProvider;


public class DefTableNameProvider implements TableNameProvider {

	@Override
	public String getTableName(EClass eClass) {
		return eClass.getName().toUpperCase();
	}
}

package at.bestsolution.persistence.mybatis.generator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface ColumnInfoProvider {
	public boolean isPrimaryKey(EStructuralFeature feature, EClass eClass);
	public String getPrimaryKeySequenceName(EStructuralFeature feature, EClass eClass);
	public String getColumnName(EStructuralFeature feature, EClass eClass);
}

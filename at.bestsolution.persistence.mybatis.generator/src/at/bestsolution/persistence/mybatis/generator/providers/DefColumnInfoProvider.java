package at.bestsolution.persistence.mybatis.generator.providers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.persistence.mybatis.generator.ColumnInfoProvider;
import at.bestsolution.persistence.mybatis.generator.TableNameProvider;

public class DefColumnInfoProvider implements ColumnInfoProvider {
	
	private TableNameProvider tableNameProvider;
	private String primaryKeyPrefix = "sid";
	private String primaryKeySeqPrefix = "seq";
	private String fkPrefix = "fk";
	
	public void setTableNameProvider(TableNameProvider tableNameProvider) {
		this.tableNameProvider = tableNameProvider;
	}
	
	public void unsetTableNameProvider(TableNameProvider tableNameProvider) {
		
	}
	
	@Override
	public String getColumnName(EStructuralFeature feature, EClass eClass) {
		if( feature instanceof EAttribute ) {
			if( isPrimaryKey(feature, eClass) ) {
				return (primaryKeyPrefix + "_" +tableNameProvider.getTableName(eClass)).toUpperCase();
			} else {
				return feature.getName().toUpperCase();
			}
		} else {
			EReference ref = (EReference) feature;
			if( ref == null ) {
				System.err.println(ref);
			}
			return (fkPrefix + "_" + ref.getEReferenceType().getName()).toUpperCase();
		}
	}
	
	@Override
	public String getPrimaryKeySequenceName(EStructuralFeature feature,
			EClass eClass) {
		return (primaryKeySeqPrefix + "_" + getColumnName(feature, eClass)).toUpperCase();
	}
	
	@Override
	public boolean isPrimaryKey(EStructuralFeature feature, EClass eClass) {
		return "sid".equals(feature.getName());
	}
}

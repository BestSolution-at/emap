package at.bestsolution.persistence.mybatis;

import java.io.InputStream;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

public interface MappingProvider {
	public interface MappingUnit {
		public Class<?> getModelInterface();
		public Class<?> getMapperInterface();
		public EClass getEClass();
		public InputStream getMappingXML();
		public String getId();
	}
	
	public List<MappingUnit> getMappingUnits();
}

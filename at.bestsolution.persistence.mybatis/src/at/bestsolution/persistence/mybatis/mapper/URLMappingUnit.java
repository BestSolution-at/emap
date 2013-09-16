package at.bestsolution.persistence.mybatis.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.emf.ecore.EClass;

import at.bestsolution.persistence.mybatis.MappingProvider.MappingUnit;

public class URLMappingUnit implements MappingUnit {
	private final String id;
	private final Class<?> modelInterface;
	private final Class<?> mapperInterface;
	private final EClass eclass;
	private URL xmlURL;
	
	public URLMappingUnit(String id, Class<?> modelInterface, Class<?> mapperInterface, EClass eclass, URL xmlURL) {
		this.id = id;
		this.modelInterface = modelInterface;
		this.mapperInterface = mapperInterface;
		this.eclass = eclass;
		this.xmlURL = xmlURL;
	}
	
	@Override
	public Class<?> getModelInterface() {
		return modelInterface;
	}

	@Override
	public Class<?> getMapperInterface() {
		return mapperInterface;
	}

	@Override
	public EClass getEClass() {
		return eclass;
	}

	@Override
	public InputStream getMappingXML() throws IOException {
		return xmlURL.openStream();
	}

	@Override
	public String getId() {
		return id;
	}

}

/*******************************************************************************
 * Copyright (c) 2015 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     tomschindl <FIRSTNAME.LASTNAME@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.emap.generator.rest

import at.bestsolution.persistence.emap.eMap.EServiceMapping
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import at.bestsolution.persistence.emap.eMap.EMappingEntity
import com.google.inject.Inject
import at.bestsolution.persistence.emap.generator.UtilCollection
import org.eclipse.emf.ecore.EClass
import at.bestsolution.persistence.emap.eMap.ReturnType
import at.bestsolution.persistence.emap.eMap.EServiceParam
import at.bestsolution.persistence.emap.eMap.EPathParam

class RestGenerator {
	@Inject extension
  	var UtilCollection util;

  	def generateCustomImpl(EServiceMapping mapping, EClass eClass) '''
  	package «mapping.package.name»;

  	@javax.ws.rs.Path("/«mapping.entity.name.toLowerCase»")
  	@org.osgi.service.component.annotations.Component(service={«mapping.entity.name»Service.class, «mapping.package.name».base.Base«mapping.entity.name»Service.class})
  	public class «mapping.entity.name»Service extends «mapping.package.name».base.Base«mapping.entity.name»Service {
  		@org.osgi.service.component.annotations.Reference(
  			cardinality=org.osgi.service.component.annotations.ReferenceCardinality.MANDATORY,
  			policyOption=org.osgi.service.component.annotations.ReferencePolicyOption.GREEDY
  		)
  		@Override
  		public void setSessionFactory(at.bestsolution.persistence.SessionFactory sessionFactory) {
  			super.setSessionFactory(sessionFactory);
  		}

  		@Override
  		public void unsetSessionFactory(at.bestsolution.persistence.SessionFactory sessionFactory) {
  			super.unsetSessionFactory(sessionFactory);
  		}
  	}
  	'''

	def generateBaseClass(EServiceMapping mapping, EClass eClass) '''
	package «mapping.package.name».base;

	public abstract class Base«mapping.entity.name»Service {
		private at.bestsolution.persistence.SessionFactory sessionFactory;

		public void setSessionFactory(at.bestsolution.persistence.SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

		public void unsetSessionFactory(at.bestsolution.persistence.SessionFactory sessionFactory) {
			if( this.sessionFactory != sessionFactory ) {
				this.sessionFactory = null;
			}
		}

		«IF mapping.isList»
			@javax.ws.rs.GET
			public java.util.List<«mapping.package.name».dto.DTO«eClass.name»> list() {
				try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
					«mapping.entity.packageName».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.entity.packageName».«mapping.entity.name»Mapper.class);
					return «mapping.package.name».mapper.«mapping.entity.lookupEClass.name»DTOMapper.toDTO(
						mapper.selectAll(),
						«mapping.package.name».mapper.«mapping.entity.lookupEClass.name»DTOMapper::fillAllProxyRefs
					);
				}
			}

		«ENDIF»
		«IF mapping.isGet»
			@javax.ws.rs.GET
			@javax.ws.rs.Path("{id}")
			public «mapping.package.name».dto.DTO«eClass.name» get(@javax.ws.rs.PathParam("id") long id) {
				try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
					«mapping.entity.packageName».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.entity.packageName».«mapping.entity.name»Mapper.class);
					«mapping.entity.lookupEClass.instanceClassName» entity = mapper.selectById(id);
					if(entity == null) {
						throw new javax.ws.rs.WebApplicationException("Entity '«eClass.name»' with ID '"+id+" is unknown.'",javax.ws.rs.core.Response.Status.NOT_FOUND);
					}
					return «mapping.package.name».mapper.«mapping.entity.lookupEClass.name»DTOMapper.toDTO( entity, «mapping.package.name».mapper.«mapping.entity.lookupEClass.name»DTOMapper::fillAllProxyRefs );
				}
			}

			«FOR r : eClass.EAllReferences»
				@javax.ws.rs.GET
				@javax.ws.rs.Path("{id}/«r.name»")
				«IF r.isMany»
					public java.util.List<«mapping.package.name».dto.DTO«r.EReferenceType.name»> get«r.name.toFirstUpper»(@javax.ws.rs.PathParam("id") long id) {
				«ELSE»
					public «mapping.package.name».dto.DTO«r.EReferenceType.name» get«r.name.toFirstUpper»(@javax.ws.rs.PathParam("id") long id) {
				«ENDIF»
					try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
						«mapping.entity.packageName».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.entity.packageName».«mapping.entity.name»Mapper.class);
						«mapping.entity.lookupEClass.instanceClassName» entity = mapper.selectById(id);
						if( entity == null ) {
							throw new javax.ws.rs.WebApplicationException("Entity '«eClass.name»' with ID '"+id+" is unknown.'",javax.ws.rs.core.Response.Status.NOT_FOUND);
						}
						return «mapping.package.name».mapper.«r.EReferenceType.name»DTOMapper.toDTO(
							entity.get«r.name.toFirstUpper»(),
							«mapping.package.name».mapper.«r.EReferenceType.name»DTOMapper::fillAllProxyRefs
						);
					}
				}
			«ENDFOR»

			«FOR bin : eClass.EAllAttributes.filter[ a | a.EAttributeType.instanceClassName == "java.sql.Blob"]»
			@javax.ws.rs.GET
			@javax.ws.rs.Path("{id}/«bin.name»")
			public javax.ws.rs.core.Response get«bin.name.toFirstUpper»(@javax.ws.rs.PathParam("id") long id) {
				try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
					«mapping.entity.packageName».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.entity.packageName».«mapping.entity.name»Mapper.class);
					«mapping.entity.lookupEClass.instanceClassName» entity = mapper.selectById(id);
					if( entity == null ) {
						throw new javax.ws.rs.WebApplicationException("Entity '«eClass.name»' with ID '"+id+" is unknown.'",javax.ws.rs.core.Response.Status.NOT_FOUND);
					}

					java.sql.Blob blob = entity.get«bin.name.toFirstUpper»();
					try {
						if( blob != null ) {
							return javax.ws.rs.core.Response.ok().entity(blob.getBinaryStream()).build();
						}
						return javax.ws.rs.core.Response.ok().build();
					} catch(java.sql.SQLException e) {
						throw new javax.ws.rs.WebApplicationException(e);
					}

				}
			}
			«ENDFOR»
		«ENDIF»

		«IF mapping.isInsert»
			@javax.ws.rs.PUT
			@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
			public long create(«mapping.package.name».dto.DTO«eClass.name» dto) {
				«mapping.entity.lookupEClass.instanceClassName» entity = «mapping.package.name».mapper.«mapping.entity.lookupEClass.name»DTOMapper.mergeToEntity(
					«mapping.package.name».mapper.«mapping.entity.lookupEClass.name»DTOMapper.create(),
					dto
				);
				try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
					«mapping.entity.packageName».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.entity.packageName».«mapping.entity.name»Mapper.class);
					s.runInTransaction(se -> {
						mapper.insert(entity);
						return true;
					});

					return «mapping.package.name».mapper.«mapping.entity.lookupEClass.name»DTOMapper.getId(entity);
				}
			}
		«ENDIF»

		«IF mapping.isUpdate»
			@javax.ws.rs.PUT
			@javax.ws.rs.Path("{id}")
			@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
			public void update(@javax.ws.rs.PathParam("id") long id, «mapping.package.name».dto.DTO«eClass.name» dto) {
				try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
					«mapping.entity.packageName».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.entity.packageName».«mapping.entity.name»Mapper.class);
					«mapping.entity.lookupEClass.instanceClassName» entity = mapper.selectById(id);
					«mapping.package.name».mapper.«mapping.entity.lookupEClass.name»DTOMapper.mergeToEntity( entity, dto );
					s.runInTransaction(se -> {
						mapper.update(entity);
						return true;
					});
				}
			}

		«ENDIF»

«««		«IF mapping.isUpdate || mapping.isInsert»
«««			«FOR bin : eClass.EAllAttributes.filter[ a | a.EAttributeType.instanceClassName == "java.sql.Blob"]»
«««			@javax.ws.rs.POST
«««			@javax.ws.rs.Path("{id}/«bin.name»")
«««			@javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.MULTIPART_FORM_DATA})
«««			public void upload«bin.name.toFirstUpper»(@javax.ws.rs.PathParam("id") long id, @org.glassfish.jersey.media.multipart.FormDataParam("file") java.io.InputStream fileInputStream, @org.glassfish.jersey.media.multipart.FormDataParam("file") org.glassfish.jersey.media.multipart.FormDataContentDisposition cdh) {
«««				try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
«««					«mapping.entity.packageName».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.entity.packageName».«mapping.entity.name»Mapper.class);
«««					«mapping.entity.lookupEClass.instanceClassName» entity = mapper.selectById(id);
«««					java.sql.Blob blob = sessionFactory.createBlob();
«««					java.io.OutputStream writeStream = blob.setBinaryStream(0);
«««					byte[] buf = new byte[1024];
«««					int l;
«««					while( (l = fileInputStream.read(buf)) != -1 ) {
«««						writeStream.write(buf,0,l);
«««					}
«««					entity.set«bin.name.toFirstUpper»(blob);
«««
«««				} catch( java.io.IOException e) {
«««					throw new javax.ws.rs.WebApplicationException(e);
«««				} catch( java.sql.SQLException e) {
«««					throw new javax.ws.rs.WebApplicationException(e);
«««				}
«««			}
«««			«ENDFOR»
«««		«ENDIF»

		«IF mapping.isDelete»
			@javax.ws.rs.DELETE
			@javax.ws.rs.Path("{id}")
			public void delete(@javax.ws.rs.PathParam("id") long id) {
				try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
					«mapping.entity.packageName».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.entity.packageName».«mapping.entity.name»Mapper.class);
					mapper.deleteById(id);
				}
			}

		«ENDIF»

		«IF mapping.isDelete»
			@javax.ws.rs.DELETE
			public void deleteAll() {
				try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
					«mapping.entity.packageName».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.entity.packageName».«mapping.entity.name»Mapper.class);
					mapper.deleteAll();
				}
			}
		«ENDIF»

		«FOR sm : mapping.serviceMethods»
		@javax.ws.rs.GET
		@javax.ws.rs.Path("«sm.path»")
		public «IF sm.query.returnType == ReturnType::LIST»java.util.List<«mapping.package.name».dto.DTO«eClass.name»>«ELSE»«mapping.package.name».dto.DTO«eClass.name»«ENDIF» «sm.query.name»(«sm.parameters.map[p | p.toRestAnnotation + " " + p.param.parameterType + " " + p.param.name].join(", ")») {
			try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
				«mapping.entity.packageName».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.entity.packageName».«mapping.entity.name»Mapper.class);
				return «mapping.package.name».mapper.«mapping.entity.lookupEClass.name»DTOMapper.toDTO(
					mapper.«sm.query.name»(«sm.parameters.map[p|p.param.name].join(", ")»),
					«mapping.package.name».mapper.«mapping.entity.lookupEClass.name»DTOMapper::fillAllProxyRefs
				);
			}
		}
		«ENDFOR»
	}
	'''

	def packageName(EMappingEntity entity) {
		(entity.eContainer as EMappingEntityDef).package.name
	}

	def static toRestAnnotation(EServiceParam p) {
		if( p instanceof EPathParam ) {
			return '@javax.ws.rs.PathParam("'+ (if( p.name == null ) { p.param.name } else { p.name }) +'")'
		} else {
			return '@javax.ws.rs.QueryParam("'+ (if( p.name == null ) { p.param.name } else { p.name }) +'")'
		}
	}
}
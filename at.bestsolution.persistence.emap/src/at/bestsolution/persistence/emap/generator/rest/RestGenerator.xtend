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

import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import at.bestsolution.persistence.emap.eMap.EMappingEntity
import com.google.inject.Inject
import at.bestsolution.persistence.emap.generator.UtilCollection
import org.eclipse.emf.ecore.EClass
import at.bestsolution.persistence.emap.eMap.ReturnType
import at.bestsolution.persistence.emap.eMap.EServiceParam
import at.bestsolution.persistence.emap.eMap.EPathParam
import at.bestsolution.persistence.emap.eMap.ERestServiceMapping
import at.bestsolution.persistence.emap.eMap.ENamedServiceQuery
import at.bestsolution.persistence.emap.eMap.EQueryParam

class RestGenerator {
	@Inject extension
  	var UtilCollection util;

  	def generateCustomImpl(EMappingEntityDef mapping, EClass eClass) '''
  	package «mapping.packageName»;

  	@javax.ws.rs.Path("/«mapping.entity.name.toLowerCase»")
  	@org.osgi.service.component.annotations.Component(service={«mapping.entity.name»Service.class})
  	public class «mapping.entity.name»Service extends «mapping.packageName».base.Base«mapping.entity.name»Service {
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

	def generateBaseClass(EMappingEntityDef mapping, ERestServiceMapping restMapping, EClass eClass) '''
	package «mapping.packageName».base;

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

		@javax.ws.rs.GET
		public java.util.List<«mapping.packageName».dto.DTO«eClass.name»> list() {
			try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
				«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
				return «mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.toDTO(
					mapper.selectAll(),
					«mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper::fillAllProxyRefs
				);
			}
		}

		@javax.ws.rs.GET
		@javax.ws.rs.Path("{id}")
		public «mapping.packageName».dto.DTO«eClass.name» get(@javax.ws.rs.PathParam("id") long id) {
			try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
				«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
				«mapping.entity.lookupEClass.instanceClassName» entity = mapper.selectById(id);
				if(entity == null) {
					throw new javax.ws.rs.WebApplicationException("Entity '«eClass.name»' with ID '"+id+" is unknown.'",javax.ws.rs.core.Response.Status.NOT_FOUND);
				}
				return «mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.toDTO( entity, «mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper::fillAllProxyRefs );
			}
		}

		«FOR r : eClass.EAllReferences»
			@javax.ws.rs.GET
			@javax.ws.rs.Path("{id}/«r.name»")
			«IF r.isMany»
				public java.util.List<«mapping.packageName».dto.DTO«r.EReferenceType.name»> get«r.name.toFirstUpper»(@javax.ws.rs.PathParam("id") long id) {
			«ELSE»
				public «mapping.packageName».dto.DTO«r.EReferenceType.name» get«r.name.toFirstUpper»(@javax.ws.rs.PathParam("id") long id) {
			«ENDIF»
				try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
					«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
					«mapping.entity.lookupEClass.instanceClassName» entity = mapper.selectById(id);
					if( entity == null ) {
						throw new javax.ws.rs.WebApplicationException("Entity '«eClass.name»' with ID '"+id+" is unknown.'",javax.ws.rs.core.Response.Status.NOT_FOUND);
					}
					return «mapping.packageName».mapper.«r.EReferenceType.name»DTOMapper.toDTO(
						entity.get«r.name.toFirstUpper»(),
						«mapping.packageName».mapper.«r.EReferenceType.name»DTOMapper::fillAllProxyRefs
					);
				}
			}
		«ENDFOR»

		«FOR bin : eClass.EAllAttributes.filter[ a | a.EAttributeType.instanceClassName == "java.sql.Blob"]»
		@javax.ws.rs.GET
		@javax.ws.rs.Path("{id}/«bin.name»")
		public javax.ws.rs.core.Response get«bin.name.toFirstUpper»(@javax.ws.rs.PathParam("id") long id) {
			try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
				«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
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

		@javax.ws.rs.PUT
		@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public LongWrapper create(«mapping.packageName».dto.DTO«eClass.name» dto) {
			«mapping.entity.lookupEClass.instanceClassName» entity = «mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.mergeToEntity(
				«mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.create(),
				dto
			);
			try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
				«FOR r : eClass.EAllReferences.filter[r | ! r.isMany]»
				entity.set«r.name.toFirstUpper»( dto.get«r.name.toFirstUpper»() != null ? s.get(«r.EReferenceType.instanceClassName».class, dto.get«r.name.toFirstUpper»().get«mapping.entity.PKAttribute.name.toFirstUpper»()) : null );
				«ENDFOR»
				«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
				s.runInTransaction(se -> {
					mapper.insert(entity);
					return true;
				});

				return LongWrapper.valueOf(«mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.getId(entity));
			}
		}

		@javax.ws.rs.PUT
		@javax.ws.rs.Path("{id}")
		@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public void update(@javax.ws.rs.PathParam("id") long id, «mapping.packageName».dto.DTO«eClass.name» dto) {
			try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
				«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
				«mapping.entity.lookupEClass.instanceClassName» entity = mapper.selectById(id);
				«mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.mergeToEntity( entity, dto );
				s.runInTransaction(se -> {
					mapper.update(entity);
					return true;
				});
			}
		}


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

		@javax.ws.rs.DELETE
		@javax.ws.rs.Path("{id}")
		public void delete(@javax.ws.rs.PathParam("id") long id) {
			try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
				«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
				mapper.deleteById(id);
			}
		}


		@javax.ws.rs.DELETE
		public void deleteAll() {
			try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
				«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
				mapper.deleteAll();
			}
		}

		«FOR sm : restMapping.serviceMethods»
		@javax.ws.rs.GET
		@javax.ws.rs.Path("«sm.path»")
		public «IF sm.query.returnType == ReturnType::LIST»java.util.List<«mapping.packageName».dto.DTO«eClass.name»>«ELSE»«mapping.packageName».dto.DTO«eClass.name»«ENDIF» «sm.query.name»(«sm.parameters.map[p | p.toRestAnnotation + " " + p.param.parameterType + " " + p.param.name].join(", ")») {
			try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
				«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
				return «mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.toDTO(
					mapper.«sm.query.name»(«sm.parameters.map[p|p.param.name].join(", ")»),
					«mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper::fillAllProxyRefs
				);
			}
		}
		«ENDFOR»

		public static class LongWrapper {
			private long value;

			public void setValue(long value) {
				this.value = value;
			}

			public long getValue() {
				return this.value;
			}

			public static LongWrapper valueOf(long value) {
				LongWrapper rv = new LongWrapper();
				rv.setValue(value);
				return rv;
			}
		}
	}
	'''

	def generateTypeScriptServiceClass(ERestServiceMapping restMapping, EClass eClass) '''
	/// <reference path="../../typings/jquery/jquery.d.ts"/>

	/// <reference path="«eClass.name».ts"/>

	interface «eClass.name»ValueCallback {
		( entity : «eClass.name», err: any ) : void
	}

	interface «eClass.name»ListCallback {
		( entity : «eClass.name»[], err: any ) : void
	}

	interface «eClass.name»CreationCallback {
		( id : number, err : any ) : void
	}

	class «eClass.name»Service {
		urlPrefix : string

		constructor(urlPrefix : string) {
			this.urlPrefix = urlPrefix
		}

		getAll( callback : «eClass.name»ListCallback ) {
			this.listRequest(this.urlPrefix + "/«eClass.name.toLowerCase»", callback);
		}

		get( id : number, callback : «eClass.name»ValueCallback ) {
			this.valueRequest(this.urlPrefix + "/«eClass.name.toLowerCase»/"+id, callback);
		}

		create( entity : «eClass.name», callback : «eClass.name»CreationCallback ) {
			$.ajax({
	    		url: this.urlPrefix + "/«eClass.name.toLowerCase»",
	    		type: "PUT",
	    		data: JSON.stringify(entity),
	    		contentType: "application/json"
			}).done( function(data : any) {
				callback(data.value, null);
			} );
		}

		private listRequest(path : string, callback : «eClass.name»ListCallback ) {
			$.ajax({
				dataType: "json",
				type: "GET",
				url: path,
				data: {},
				cache : false
			}).done(function(data : any[]) {
				var entityList : «eClass.name»[] = data.map( function( o ) { return new «eClass.name»(o); } );
				callback(entityList, null);
			});
		}

		private valueRequest(path : string, callback : «eClass.name»ValueCallback ) {
			$.ajax({
				dataType: "json",
				type: "GET",
				url: path,
				data: {},
				cache : false
			}).done(function(data : any) {
				var entity : «eClass.name»;
				if( data ) {
					entity = new «eClass.name»(data);
				}
				callback(entity, null);
			});
		}

		«FOR sm : restMapping.serviceMethods»
			«IF sm.query.returnType == ReturnType::LIST»
				«sm.query.name»( «sm.parameters.map[p | p.param.name + " : " + p.param.parameterType.toTypeScriptType].join(",")»«IF !sm.parameters.isEmpty», «ENDIF»callback : «eClass.name»ListCallback ) {
					this.listRequest( this.urlPrefix + "/«eClass.name.toLowerCase»/«sm.createPathString»", callback  );
				}
			«ELSE»
				«sm.query.name»( «sm.parameters.map[p | p.param.name + " : " + p.param.parameterType.toTypeScriptType].join(",")»«IF !sm.parameters.isEmpty», «ENDIF»callback : «eClass.name»ValueCallback ) {
					this.valueRequest( this.urlPrefix + "/«eClass.name.toLowerCase»/«sm.createPathString»", callback  );
				}
			«ENDIF»
		«ENDFOR»
	}'''

	def packageName(EMappingEntity entity) {
		(entity.eContainer as EMappingEntityDef).packageName
	}

	def createPathString(ENamedServiceQuery sm) {
		var path = sm.path
		for( p : sm.parameters.filter(typeof(EPathParam)) ) {
			path = path.replace("{"+p.toRestParamName+"}", '"+'+p.param.name+'+"')
		}
		for( p : sm.parameters.filter(typeof(EQueryParam)).indexed ) {
			if( p.key == 0 ) {
				path += "?"
			} else {
				path += "&"
			}
			path += p.value.toRestParamName + "=" + '"+'+p.value.param.name +'+"'
		}

		return path
	}

	def toTypeScriptType(String t) {
		if( t.isNumeric ) {
			return "number"
		} else if( t == "boolean" ) {
			return "boolean"
		} else if( t == "java.lang.String" || t == "String" ) {
			return "string"
		} else {
			return "any"
		}
	}

	def static toRestAnnotation(EServiceParam p) {
		if( p instanceof EPathParam ) {
			return '@javax.ws.rs.PathParam("'+ p.toRestParamName +'")'
		} else {
			return '@javax.ws.rs.QueryParam("'+ p.toRestParamName +'")'
		}
	}

	def static toRestParamName(EServiceParam p) {
		return if( p.name == null ) { p.param.name } else { p.name }
	}

	def static packageName(EMappingEntityDef entityDef) {
		return entityDef.package.name + ".webservice"
	}
}
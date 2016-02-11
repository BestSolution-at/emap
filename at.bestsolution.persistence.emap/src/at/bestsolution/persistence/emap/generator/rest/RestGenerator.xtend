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
import at.bestsolution.persistence.emap.eMap.EGreedyAttributePath
import java.util.ArrayList
import java.util.List
import at.bestsolution.persistence.emap.eMap.ECustomServiceMethods
import at.bestsolution.persistence.emap.eMap.EParameter

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
		protected at.bestsolution.persistence.SessionFactory sessionFactory;

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
				java.util.List<«mapping.entity.lookupEClass.instanceClassName»> list = checkAccess_list(mapper.selectAll(), s);
				return «mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.toDTO(
					list,
					«mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper::fillAllProxyRefs
				);
			}
		}

		protected java.util.List<«mapping.entity.lookupEClass.instanceClassName»> checkAccess_list(java.util.List<«mapping.entity.lookupEClass.instanceClassName»> list, at.bestsolution.persistence.Session session) {
			return list;
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
				entity = checkAccess_get(entity, s);
				return «mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.toDTO( entity, «mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper::fillAllProxyRefs );
			}
		}

		protected «mapping.entity.lookupEClass.instanceClassName» checkAccess_get(«mapping.entity.lookupEClass.instanceClassName» entity, at.bestsolution.persistence.Session session) {
			return entity;
		}

		«FOR r : eClass.EAllReferences.filter[r|!r.transient]»
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
						checkAccess_get«r.name.toFirstUpper»(entity, entity.get«r.name.toFirstUpper»(), s),
						«mapping.packageName».mapper.«r.EReferenceType.name»DTOMapper::fillAllProxyRefs
					);
				}
			}

			«IF r.isMany»
				protected java.util.List<«r.EType.instanceClassName»> checkAccess_get«r.name.toFirstUpper»(«mapping.entity.lookupEClass.instanceClassName» entity, java.util.List<«r.EType.instanceClassName»> list, at.bestsolution.persistence.Session session) {
					return list;
				}
			«ELSE»
				protected «r.EType.instanceClassName» checkAccess_get«r.name.toFirstUpper»(«mapping.entity.lookupEClass.instanceClassName» entity, «r.EType.instanceClassName» value, at.bestsolution.persistence.Session session) {
					return value;
				}
			«ENDIF»
		«ENDFOR»

		«FOR bin : eClass.EAllAttributes.filter[ a | !a.transient && a.EAttributeType.instanceClassName == "java.sql.Blob"]»
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
		public «mapping.packageName».dto.DTO«eClass.name» create(«mapping.packageName».dto.DTO«eClass.name» dto) {
			try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
				«mapping.entity.lookupEClass.instanceClassName» entity = checkAccess_create(«mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.mergeToEntity(
					«mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.create(),
					dto
				), s);
				«FOR r : eClass.EAllReferences.filter[r | ! r.isMany]»
				entity.set«r.name.toFirstUpper»( dto.get«r.name.toFirstUpper»() != null ? s.get(«r.EReferenceType.instanceClassName».class, dto.get«r.name.toFirstUpper»().get«mapping.entity.PKAttribute.name.toFirstUpper»()) : null );
				«ENDFOR»
				«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
				s.runInTransaction(se -> {
					mapper.insert(entity);
					return true;
				});

				return get(«mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.getId(entity));
			}
		}

		protected «mapping.entity.lookupEClass.instanceClassName» checkAccess_create(«mapping.entity.lookupEClass.instanceClassName» entity, at.bestsolution.persistence.Session session) {
			return entity;
		}

		@javax.ws.rs.PUT
		@javax.ws.rs.Path("{id}")
		@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public «mapping.packageName».dto.DTO«eClass.name» update(@javax.ws.rs.PathParam("id") long id, «mapping.packageName».dto.DTO«eClass.name» dto) {
			try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
				«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
				«mapping.entity.lookupEClass.instanceClassName» entity = checkAccess_update(mapper.selectById(id), s);
				«mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.mergeToEntity( entity, dto );
				«FOR r : eClass.EAllReferences.filter[r | ! r.isMany && ! r.isContainment]»
				entity.set«r.name.toFirstUpper»( dto.get«r.name.toFirstUpper»() != null ? s.get(«r.EReferenceType.instanceClassName».class, dto.get«r.name.toFirstUpper»().get«mapping.entity.PKAttribute.name.toFirstUpper»()) : null );
				«ENDFOR»
				s.runInTransaction(se -> {
					mapper.update(entity);
					return true;
				});
				return get(«mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.getId(entity));
			}
		}

		protected «mapping.entity.lookupEClass.instanceClassName» checkAccess_update(«mapping.entity.lookupEClass.instanceClassName» entity, at.bestsolution.persistence.Session session) {
			return entity;
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
				checkAccess_delete(id, s);
				«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
				mapper.deleteById(id);
			}
		}

		protected void checkAccess_delete(long id, at.bestsolution.persistence.Session session) {
			// do nothing by default
		}

		@javax.ws.rs.DELETE
		public void deleteAll() {
			try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
				checkAccess_deleteAll(s);
				«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
				mapper.deleteAll();
			}
		}

		protected void checkAccess_deleteAll(at.bestsolution.persistence.Session session) {
			// do nothing by default
		}

		«FOR sm : restMapping.serviceMethods»
			@javax.ws.rs.GET
			@javax.ws.rs.Path("«sm.path»")
			public «IF sm.query.returnType == ReturnType::LIST»java.util.List<«mapping.packageName».dto.DTO«eClass.name»>«ELSE»«mapping.packageName».dto.DTO«eClass.name»«ENDIF» «sm.name»(«sm.parameters.map[p | p.toRestAnnotation + " " + p.param.parameterType + " " + p.param.name].join(", ")») {
				try( at.bestsolution.persistence.Session s = sessionFactory.createSession() ) {
					«mapping.package.name».«mapping.entity.name»Mapper mapper = s.createMapper(«mapping.package.name».«mapping.entity.name»Mapper.class);
					«IF sm.query.returnType == ReturnType::LIST»
						java.util.List<«mapping.packageName».dto.DTO«eClass.name»> rv;
						java.util.List<«eClass.instanceClassName»> result;
					«ELSE»
						«mapping.packageName».dto.DTO«eClass.name» rv;
						«eClass.instanceClassName» result;
					«ENDIF»
					result = checkAccess_«sm.name»(mapper.«sm.query.name»(«sm.parameters.map[p|p.param.name].join(", ")»), s);
					rv = «mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper.toDTO(
						result,
						«mapping.packageName».mapper.«mapping.entity.lookupEClass.name»DTOMapper::fillAllProxyRefs
					);
					«FOR ga : sm.greedyAttributePathList»
						«IF sm.query.returnType == ReturnType::LIST»
							for( int i = 0; i < rv.size(); i++ ) {
								resolveGreedy_«sm.name»_«ga.greedyAttribute.entity.name»_«ga.greedyAttribute.name»(rv.get(i), result.get(i));
							}
						«ELSE»
							resolveGreedy_«sm.name»_«ga.greedyAttribute.entity.name»_«ga.greedyAttribute.name»(rv,result);
						«ENDIF»
					«ENDFOR»
					return rv;
				}
			}

			protected «IF sm.query.returnType == ReturnType::LIST»java.util.List<«eClass.instanceClassName»>«ELSE»«eClass.instanceClassName»«ENDIF» checkAccess_«sm.name»(«IF sm.query.returnType == ReturnType::LIST»java.util.List<«eClass.instanceClassName»> list «ELSE»«eClass.instanceClassName» value«ENDIF», at.bestsolution.persistence.Session session) {
				return «IF sm.query.returnType == ReturnType::LIST»list«ELSE»value«ENDIF»;
			}

			«FOR gp : collectAllGreedyPaths(sm)»
			private static void resolveGreedy_«sm.name»_«gp.greedyAttribute.entity.name»_«gp.greedyAttribute.name»(
				«mapping.packageName».dto.DTO«gp.greedyAttribute.entity.name» dto,
				«gp.greedyAttribute.entity.lookupEClass.instanceClassName» entity) {
				dto.set«gp.greedyAttribute.name.toFirstUpper»(«gp.greedyAttribute.entity.packageName».mapper.«gp.greedyAttribute.getEStructuralFeature(gp.greedyAttribute.entity.lookupEClass).EType.name»DTOMapper.toDTO(entity.get«gp.greedyAttribute.name.toFirstUpper»()));
				«FOR subgp: gp.subPathList»
					«IF gp.greedyAttribute.isSingle(gp.greedyAttribute.entity.lookupEClass)»
						resolveGreedy_«sm.name»_«subgp.greedyAttribute.entity.name»_«subgp.greedyAttribute.name»(
							dto.get«gp.greedyAttribute.name.toFirstUpper»(),
							entity.get«gp.greedyAttribute.name.toFirstUpper»()
						);
					«ELSE»
					int i = 0;
					for(«mapping.packageName».dto.DTO«subgp.greedyAttribute.entity.name» subDTO : dto.get«gp.greedyAttribute.name.toFirstUpper»()) {
						resolveGreedy_«sm.name»_«subgp.greedyAttribute.entity.name»_«subgp.greedyAttribute.name»(subDTO, entity.get«gp.greedyAttribute.name.toFirstUpper»().get(i++));
					}
					«ENDIF»
				«ENDFOR»
			}
			«ENDFOR»
		«ENDFOR»

		«FOR sm : restMapping.customServiceMethods»
			@javax.ws.rs.GET
			@javax.ws.rs.Path("«sm.path»")
			public java.util.List<«mapping.packageName».dto.DTO«eClass.name»> «sm.name»(«sm.parameters.map[p | p.toRestAnnotation + " " + p.parameterType + " " + p.name].join(", ")») {
				throw new UnsupportedOperationException();
			}
		«ENDFOR»
	}
	'''
	def static List<EGreedyAttributePath> collectAllGreedyPaths(ENamedServiceQuery query) {
		val rv = new ArrayList<EGreedyAttributePath>
		query.greedyAttributePathList.forEach[p|rv.addAll(collectAllGreedyPaths(p))]
		return rv;
	}

	def static List<EGreedyAttributePath> collectAllGreedyPaths(EGreedyAttributePath greedyPath) {
		val rv = new ArrayList<EGreedyAttributePath>
		rv.add(greedyPath)
		greedyPath.subPathList.forEach[p | rv.addAll(collectAllGreedyPaths(p))]

		return rv;
	}

	def generateTypeScriptServiceClass(EMappingEntityDef entityDef, ERestServiceMapping restMapping, EClass eClass, boolean usePromise) '''
	/// <reference path="../../typings/jquery/jquery.d.ts"/>
	/// <reference path="../../typings/es6-promise/es6-promise.d.ts"/>
	/// <reference path="DTO«eClass.name».ts"/>

	class «eClass.name»Service {
		urlPrefix : string

		constructor(urlPrefix : string) {
			this.urlPrefix = urlPrefix
		}

		«IF usePromise»
			getAll() : Promise<DTO«eClass.name»[]> {
				var self = this;
				return new Promise<DTO«eClass.name»[]>( ( resolve, reject ) => {
					self.listRequest( this.urlPrefix + "/«eClass.name.toLowerCase»", ( v, err ) => {
						if( err ) {
							reject( err );
						} else {
							resolve( v );
						}
					} );
				} );
			}

			get( id : number ) {
				var self = this;
				return new Promise<DTO«eClass.name»>( ( resolve, reject ) => {
					self.valueRequest( this.urlPrefix + "/«eClass.name.toLowerCase»/"+id, ( v, err ) => {
						if( err ) {
							reject( err );
						} else {
							resolve( v );
						}
					} );
				} );
			}

			create( entity : DTO«eClass.name» ) {
				return new Promise<DTO«eClass.name»>( ( resolve, reject ) => {
					$.ajax({
						url: this.urlPrefix + "/«eClass.name.toLowerCase»",
						type: "PUT",
						data: JSON.stringify(entity),
						contentType: "application/json"
					}).done( function(data : any) {
						var entity : DTO«eClass.name»;
						if( data ) {
							entity = new DTO«eClass.name»(data);
						}
						resolve(entity);
					} );
				});
			}

			update( entity : DTO«eClass.name» ) {
				return new Promise<DTO«eClass.name»>( ( resolve, reject ) => {
					$.ajax({
						url: this.urlPrefix + "/«eClass.name.toLowerCase»/"+entity.«entityDef.PKAttribute.name»,
						type: "PUT",
						data: JSON.stringify(entity),
						contentType: "application/json"
					}).done( function(data : any) {
						var entity : DTO«eClass.name»;
						if( data ) {
							entity = new DTO«eClass.name»(data);
						}
						resolve(entity, null);
					} );
				});
			}
		«ELSE»
			getAll( callback : ( rv : DTO«eClass.name»[], err : any ) => void ) {
				this.listRequest(this.urlPrefix + "/«eClass.name.toLowerCase»", callback);
			}

			get( id : number, callback : ( rv : DTO«eClass.name», err : any ) => void ) {
				this.valueRequest(this.urlPrefix + "/«eClass.name.toLowerCase»/"+id, callback);
			}

			create( entity : DTO«eClass.name», callback : ( rv : DTO«eClass.name», err : any ) => void ) {
				$.ajax({
					url: this.urlPrefix + "/«eClass.name.toLowerCase»",
					type: "PUT",
					data: JSON.stringify(entity),
					contentType: "application/json"
				}).done( function(data : any) {
					var entity : DTO«eClass.name»;
					if( data ) {
						entity = new DTO«eClass.name»(data);
					}
					callback(entity, null);
				} );
			}

			update( entity : DTO«eClass.name», callback : ( rv : DTO«eClass.name», err : any ) => void ) {
				$.ajax({
					url: this.urlPrefix + "/«eClass.name.toLowerCase»/"+entity.«entityDef.PKAttribute.name»,
					type: "PUT",
					data: JSON.stringify(entity),
					contentType: "application/json"
				}).done( function(data : any) {
					var entity : DTO«eClass.name»;
					if( data ) {
						entity = new DTO«eClass.name»(data);
					}
					callback(entity, null);
				} );
			}
		«ENDIF»

		private listRequest(path : string, callback : ( rv : DTO«eClass.name»[], err : any ) => void ) {
			$.ajax({
				dataType: "json",
				type: "GET",
				url: path,
				data: {},
				cache : false
			}).done(function(data : any[]) {
				var entityList : DTO«eClass.name»[] = data.map( function( o ) { return new DTO«eClass.name»(o); } );
				callback(entityList, null);
			});
		}

		private valueRequest(path : string, callback : ( rv : DTO«eClass.name», err : any ) => void ) {
			$.ajax({
				dataType: "json",
				type: "GET",
				url: path,
				data: {},
				cache : false
			}).done(function(data : any) {
				var entity : DTO«eClass.name»;
				if( data ) {
					entity = new DTO«eClass.name»(data);
				}
				callback(entity, null);
			});
		}

		«FOR sm : restMapping.serviceMethods»
			«IF usePromise»
				«IF sm.query.returnType == ReturnType::LIST»
					«sm.name»( «sm.parameters.map[p | p.param.name + " : " + p.param.parameterType.toTypeScriptType].join(",")») : Promise<DTO«eClass.name»[]> {
						var self = this;
						return new Promise<DTO«eClass.name»[]>( ( resolve, reject ) => {
							self.listRequest( this.urlPrefix + "/«eClass.name.toLowerCase»/«sm.createPathString»", ( v, err ) => {
								if( err ) {
									reject( err );
								} else {
									resolve( v );
								}
							} );
						} );
					}
				«ELSE»
					«sm.name»( «sm.parameters.map[p | p.param.name + " : " + p.param.parameterType.toTypeScriptType].join(",")»() : Promise<DTO«eClass.name»> {
						var self = this;
						return new Promise<DTO«eClass.name»>( ( resolve, reject ) => {
							self.valueRequest( this.urlPrefix + "/«eClass.name.toLowerCase»/«sm.createPathString»", ( v, err ) => {
								if( err ) {
									reject( err );
								} else {
									resolve( v );
								}
							} );
						} );
					}
				«ENDIF»
			«ELSE»
				«IF sm.query.returnType == ReturnType::LIST»
					«sm.name»( «sm.parameters.map[p | p.param.name + " : " + p.param.parameterType.toTypeScriptType].join(",")»«IF !sm.parameters.isEmpty», «ENDIF»callback : Consumer<DTO«eClass.name»[]> ) {
						this.listRequest( this.urlPrefix + "/«eClass.name.toLowerCase»/«sm.createPathString»", callback  );
					}
				«ELSE»
					«sm.name»( «sm.parameters.map[p | p.param.name + " : " + p.param.parameterType.toTypeScriptType].join(",")»«IF !sm.parameters.isEmpty», «ENDIF»callback : Consumer<DTO«eClass.name»> ) {
						this.valueRequest( this.urlPrefix + "/«eClass.name.toLowerCase»/«sm.createPathString»", callback  );
					}
				«ENDIF»
			«ENDIF»
		«ENDFOR»
		«FOR sm : restMapping.customServiceMethods»
			«IF usePromise»
				«sm.name»( «sm.parameters.map[p | p.name + " : " + p.parameterType.toTypeScriptType].join(",")»«IF !sm.parameters.isEmpty», «ENDIF»callback : Promise<DTO«eClass.name»[]> ) {
					var self = this;
					return new Promise<DTO«eClass.name»[]>( ( resolve, reject ) => {
						self.listRequest( listRequest( this.urlPrefix + "/«eClass.name.toLowerCase»/«sm.createPathString»", ( v, err ) => {
							if( err ) {
								reject( err );
							} else {
								resolve( v );
							}
						} );
					} );
				}
			«ELSE»
				«sm.name»( «sm.parameters.map[p | p.name + " : " + p.parameterType.toTypeScriptType].join(",")»«IF !sm.parameters.isEmpty», «ENDIF»callback : Consumer<DTO«eClass.name»[]> ) {
					this.listRequest( this.urlPrefix + "/«eClass.name.toLowerCase»/«sm.createPathString»", callback  );
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

	def createPathString(ECustomServiceMethods sm) {
		var path = sm.path
//		for( p : sm.parameters.filter(typeof(EPathParam)) ) {
//			path = path.replace("{"+p.toRestParamName+"}", '"+'+p.param.name+'+"')
//		}
		for( p : sm.parameters.indexed ) {
			if( p.key == 0 ) {
				path += "?"
			} else {
				path += "&"
			}
			path += p.value.name + "=" + '"+'+p.value.name +'+"'
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

	def static toRestAnnotation(EParameter p) {
		return '@javax.ws.rs.QueryParam("'+ p.name +'")'
	}

	def static toRestParamName(EServiceParam p) {
		return if( p.name == null ) { p.param.name } else { p.name }
	}

	def static packageName(EMappingEntityDef entityDef) {
		return entityDef.package.name + ".webservice"
	}
}
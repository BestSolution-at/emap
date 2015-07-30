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

import org.eclipse.emf.ecore.EClass
import com.google.inject.Inject
import at.bestsolution.persistence.emap.generator.UtilCollection
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef

class DTOGenerator {
	@Inject extension
	var UtilCollection util;

	def generateDTO(EMappingEntityDef entityDef, EClass eClass) '''
	package «entityDef.packageName».dto;

	public class DTO«eClass.name» {
		/*
		 * Meta data
		 */
		private String metaClassname = "«eClass.name»";
		private boolean metaProxy;

		public void setMetaProxy(boolean metaProxy) {
			this.metaProxy = metaProxy;
		}

		public boolean isMetaProxy() {
			return metaProxy;
		}

		public void setMetaClassname(String metaClassname) {
			this.metaClassname = metaClassname;
		}

		public String getMetaClassname() {
			return metaClassname;
		}

		public static DTO«eClass.name» newProxy(long id) {
			DTO«eClass.name» dto = new DTO«eClass.name»();
			dto.set«entityDef.entity.PKAttribute.name.toFirstUpper»(id);
			dto.setMetaProxy(true);
			return dto;
		}

		/*
		 * Attributes
		 */
		«FOR a : eClass.EAllAttributes.filter[ a | a.EAttributeType.instanceClassName != "java.sql.Blob"]»
			«IF a.many»
				private java.util.List<«a.EAttributeType.instanceClassName»> «a.name»;
			«ELSE»
				private «a.EAttributeType.instanceClassName» «a.name»;
			«ENDIF»
		«ENDFOR»

		/*
		 * References
		 */
		«FOR r : eClass.EAllReferences»
			«IF r.many»
			private java.util.List<DTO«r.EType.name»> «r.name»;
			«ELSE»
			private DTO«r.EType.name» «r.name»;
			«ENDIF»
		«ENDFOR»

		«FOR a : eClass.EAllAttributes.filter[ a | a.EAttributeType.instanceClassName != "java.sql.Blob"]»
			«IF a.many»
				public java.util.List<«a.EAttributeType.instanceClassName»> «a.name» get«a.name.toFirstUpper»() {
					return this.«a.name»;
				}

				public void set«a.name.toFirstUpper»(java.util.List<«a.EAttributeType.instanceClassName»> «a.name») {
					this.«a.name» = «a.name»;
				}
			«ELSE»
				«IF a.EAttributeType.instanceClassName == "boolean"»
				public «a.EAttributeType.instanceClassName» is«a.name.toFirstUpper»() {
					return this.«a.name»;
				}
				«ELSE»
				public «a.EAttributeType.instanceClassName» get«a.name.toFirstUpper»() {
					return this.«a.name»;
				}
				«ENDIF»

				public void set«a.name.toFirstUpper»(«a.EAttributeType.instanceClassName» «a.name») {
					this.«a.name» = «a.name»;
				}
			«ENDIF»
		«ENDFOR»

		«FOR r : eClass.EAllReferences»
			«IF r.many»
			public java.util.List<DTO«r.EType.name»> get«r.name.toFirstUpper»() {
				return this.«r.name»;
			}

			public void set«r.name.toFirstUpper»(java.util.List<DTO«r.EType.name»> «r.name») {
				this.«r.name» = «r.name»;
			}

			«ELSE»
			public DTO«r.EType.name» get«r.name.toFirstUpper»() {
				return this.«r.name»;
			}

			public void set«r.name.toFirstUpper»(DTO«r.EType.name» «r.name») {
				this.«r.name» = «r.name»;
			}

			«ENDIF»
		«ENDFOR»
	}
	'''

	def generateMapper(EMappingEntityDef entityDef, EClass eClass) '''
	package «entityDef.packageName».mapper;

	public class «eClass.name»DTOMapper {
		public static long getId(«eClass.instanceClassName» entity) {
			return entity.get«entityDef.entity.PKAttribute.name.toFirstUpper»();
		}

		public static «entityDef.entity.lookupEClass.instanceClassName» create() {
			return («entityDef.entity.lookupEClass.instanceClassName»)org.eclipse.emf.ecore.util.EcoreUtil.create(«entityDef.entity.lookupEClass.toFullQualifiedJavaEClass»);
		}

		public static java.util.List<«entityDef.packageName».dto.DTO«eClass.name»> toDTO(java.util.List<«eClass.instanceClassName»> entityList, java.util.function.BiFunction<«entityDef.packageName».dto.DTO«eClass.name», «eClass.instanceClassName»,«entityDef.packageName».dto.DTO«eClass.name»> processor) {
			if( processor == null ) {
				return entityList.stream().map( «eClass.name»DTOMapper::toDTO ).collect(java.util.stream.Collectors.toList());
			} else {
				return entityList.stream().map( c -> processor.apply(«eClass.name»DTOMapper.toDTO(c), c) ).collect(java.util.stream.Collectors.toList());
			}
		}

		public static java.util.List<«entityDef.packageName».dto.DTO«eClass.name»> toDTO(java.util.List<«eClass.instanceClassName»> entityList) {
			return toDTO(entityList,null);
		}

		public static «entityDef.packageName».dto.DTO«eClass.name» fillAllProxyRefs(«entityDef.packageName».dto.DTO«eClass.name» dto, «eClass.instanceClassName» entity) {
			«FOR r : eClass.EAllReferences»
			set«r.name.toFirstUpper»Proxy( dto, entity );
			«ENDFOR»
			return dto;
		}

		public static «entityDef.packageName».dto.DTO«eClass.name» toDTO(«eClass.instanceClassName» entity) {
			return toDTO( entity, null );
		}

		public static «entityDef.packageName».dto.DTO«eClass.name» toDTO(«eClass.instanceClassName» entity, java.util.function.BiFunction<«entityDef.packageName».dto.DTO«eClass.name», «eClass.instanceClassName»,«entityDef.packageName».dto.DTO«eClass.name»> processor) {
			if( entity == null ) {
				return null;
			}
			«entityDef.packageName».dto.DTO«eClass.name» dto = new «entityDef.packageName».dto.DTO«eClass.name»();
			«FOR a : eClass.EAllAttributes.filter[ a | a.EAttributeType.instanceClassName != "java.sql.Blob"]»
				«IF a.EAttributeType.instanceClassName == "boolean"»
					dto.set«a.name.toFirstUpper»( entity.is«a.name.toFirstUpper»() );
				«ELSE»
					dto.set«a.name.toFirstUpper»( entity.get«a.name.toFirstUpper»() );
				«ENDIF»
			«ENDFOR»
			if( processor != null ) {
				dto = processor.apply( dto, entity );
			}
			return dto;
		}

		«FOR r : eClass.EAllReferences»
		public static void set«r.name.toFirstUpper»Proxy(«entityDef.packageName».dto.DTO«eClass.name» dto, «eClass.instanceClassName» entity) {
			«IF r.isMany»
				dto.set«r.name.toFirstUpper»(
					entity.get«r.name.toFirstUpper»().stream()
						.map( c -> «entityDef.packageName».dto.DTO«r.EReferenceType.name».newProxy(«entityDef.packageName».mapper.«r.EReferenceType.name»DTOMapper.getId(c)) )
						.collect(java.util.stream.Collectors.toList())
				);
			«ELSE»
				dto.set«r.name.toFirstUpper»(
					entity.get«r.name.toFirstUpper»() == null ? null : «entityDef.packageName».dto.DTO«r.EReferenceType.name».newProxy( «entityDef.packageName».mapper.«r.EReferenceType.name»DTOMapper.getId(entity.get«r.name.toFirstUpper»()) )
				);
			«ENDIF»
		}

		public static void set«r.name.toFirstUpper»(«entityDef.packageName».dto.DTO«eClass.name» dto, «eClass.instanceClassName» entity, java.util.function.BiFunction<«entityDef.packageName».dto.DTO«r.EReferenceType.name», «r.EReferenceType.instanceClassName»,«entityDef.packageName».dto.DTO«r.EReferenceType.name»> processor) {
			«IF r.isMany»
				if( processor == null ) {
					dto.set«r.name.toFirstUpper»(
						entity.get«r.name.toFirstUpper»().stream()
							.map( «r.EReferenceType.name»DTOMapper::toDTO )
							.collect(java.util.stream.Collectors.toList())
					);
				} else {
					dto.set«r.name.toFirstUpper»(
						entity.get«r.name.toFirstUpper»().stream()
							.map( c -> processor.apply(«r.EReferenceType.name»DTOMapper.toDTO(c), c ) )
							.collect(java.util.stream.Collectors.toList())
					);
				}
			«ELSE»
				if( processor == null ) {
					dto.set«r.name.toFirstUpper»( «r.EReferenceType.name»DTOMapper.toDTO(entity.get«r.name.toFirstUpper»()) );
				} else {
					dto.set«r.name.toFirstUpper»( processor.apply(«r.EReferenceType.name»DTOMapper.toDTO(entity.get«r.name.toFirstUpper»()), entity.get«r.name.toFirstUpper»() ) );
				}
			«ENDIF»
		}

		public static void set«r.name.toFirstUpper»(«entityDef.packageName».dto.DTO«eClass.name» dto, «eClass.instanceClassName» entity) {
			set«r.name.toFirstUpper»(dto,entity,null);
		}
		«ENDFOR»
		public static «eClass.instanceClassName» mergeToEntity(«eClass.instanceClassName» entity, «entityDef.packageName».dto.DTO«eClass.name» dto) {
			«FOR a : eClass.EAllAttributes.filter[ a | a.EAttributeType.instanceClassName != "java.sql.Blob"]»
				«IF a.EAttributeType.instanceClassName == "boolean"»
					entity.set«a.name.toFirstUpper»(dto.is«a.name.toFirstUpper»());
				«ELSE»
					entity.set«a.name.toFirstUpper»(dto.get«a.name.toFirstUpper»());
				«ENDIF»
			«ENDFOR»
			return entity;
		}

	}
	'''

	def generateTypeScriptClass(EClass eClass) '''
	«FOR r : eClass.EAllReferences.map[EReferenceType].filter[t | t != eClass].filterDups[p1, p2| p1.equals(p2)]»
	/// <reference path="«r.name».ts"/>
	«ENDFOR»

	class «eClass.name» {
		metaClassname : String = "«eClass.name»"
		metaProxy : boolean = false

		// simple attributes
		«FOR a : eClass.EAllAttributes.filter[ a | a.EAttributeType.instanceClassName != "java.sql.Blob"]»
		«a.name» : «IF a.isNumeric»number«ELSEIF a.isBoolean»boolean«ELSEIF a.isString»string«ELSE»any«ENDIF»
		«ENDFOR»

		// reference attributes
		«FOR r : eClass.EAllReferences»
			«r.name» : «r.EReferenceType.name»«IF r.isMany»[]«ENDIF»
		«ENDFOR»
		constructor(jsonObject? : any) {
			if(jsonObject) {
				this.metaProxy = jsonObject.metaProxy

				«FOR a : eClass.EAllAttributes.filter[ a | a.EAttributeType.instanceClassName != "java.sql.Blob"]»
				this.«a.name» = jsonObject.«a.name»;
				«ENDFOR»

				«FOR r : eClass.EAllReferences»
					«IF r.isMany»
					if( jsonObject.«r.name» ) {
						this.«r.name» = jsonObject.«r.name».map( function( o ) { return new «r.EReferenceType.name»(o); } );
					}
					«ELSE»
					this.«r.name» = jsonObject.«r.name» ? new «r.EReferenceType.name»(jsonObject.«r.name») : null;
					«ENDIF»
				«ENDFOR»
			}
		}
	}
	'''

	def static packageName(EMappingEntityDef entityDef) {
		return entityDef.package.name + ".webservice"
	}
}
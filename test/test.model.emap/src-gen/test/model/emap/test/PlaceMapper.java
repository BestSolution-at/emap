package test.model.emap.test;

import test.model.test.Place;

public interface PlaceMapper extends at.bestsolution.persistence.ObjectMapper<test.model.test.Place> {
	/**
	 * Find elements managed Domain-Elements with a query like this:
	 * <pre>
	 * SELECT
	 *   *
	 * FROM
	 *   PLACE
	 *   WHERE
	 *     ID = #{id}
	 * </pre>
	 * 
	 * @param id
	 * 
	 */
	public test.model.test.Place selectById(long id);
	/**
	 * Find elements managed Domain-Elements with a query like this:
	 * <pre>
	 * SELECT
	 *   *
	 * FROM
	 *   PLACE, LIKES_PERSON_PLACE
	 *   WHERE
	 *     PLACE.ID = LIKES_PERSON_PLACE.FK_PLACE AND LIKES_PERSON_PLACE.FK_PERSON = #{personId}
	 * </pre>
	 * 
	 * @param personId
	 * 
	 */
	public java.util.List<test.model.test.Place> selectAllForPerson(long personId);


		/**
		 * Build dynamic query filters
		 */
		public static final class Expression {
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Place,test.model.test.Place> self_obj() {
				return new at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Place,test.model.test.Place>("id") {
					protected long getSid(test.model.test.Place value) {
						return value.getId();
					}
				};
			}

			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Place,test.model.test.Place> Place_self_obj() {
					return self_obj();
			}

			/**
			 * Filter on id
			 */
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Place> id() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Place>("id");}
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Place> Place_id() { return id();}
			/**
			 * Filter on name
			 */
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Place> name() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Place>("name");}
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Place> Place_name() { return name();}
			/**
			 * Join with Person
			 */
			public static final test.model.emap.test.PersonMapper.Join<Place> likedBy() { return new test.model.emap.test.PersonMapper.Join<Place>("likedBy");};
			public static final test.model.emap.test.PersonMapper.Join<Place> Place_likedBy() { return likedBy(); }
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Place,test.model.test.Person> likedBy_obj() {
				return new at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Place,test.model.test.Person>("likedBy."+likedBy().id().getProperty()) {
					protected long getSid(test.model.test.Person value) {
						return value.getId();
					}
				};
			}

			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Place,test.model.test.Person> Place_likedBy_obj() {
				return likedBy_obj();
			}
		}

		/**
		 * Do not create instances of this class but use {@link PlaceMapper#metaData()}
		 */
		public static class MetaData {
			public at.bestsolution.persistence.AttributeMetaData<Place,Long,at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Place>> id() {
				return new at.bestsolution.persistence.AttributeMetaData<>(Place.class,long.class,Expression.id(),Order.id());
			}
			public at.bestsolution.persistence.AttributeMetaData<Place,java.lang.String,at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Place>> name() {
				return new at.bestsolution.persistence.AttributeMetaData<>(Place.class,java.lang.String.class,Expression.name(),Order.name());
			}
			public at.bestsolution.persistence.ReferenceMetaData<Place,test.model.test.Person,at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Place,test.model.test.Person>> likedBy() {
				return new at.bestsolution.persistence.ReferenceMetaData<>(Place.class,test.model.test.Person.class,Expression.likedBy_obj());
			}
		}

		public MetaData metaData();

		/**
		 * Build dynamic query order by
		 */
		public static final class Order {
			/**
			 * Order by for id
			 */
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Place> id() { return new at.bestsolution.persistence.order.OrderColumnFactory<Place>("id");};
			/**
			 * Order by for name
			 */
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Place> name() { return new at.bestsolution.persistence.order.OrderColumnFactory<Place>("name");};
		}

		/**
		 * Build join expressions
		 */
		public static final class Join<O> {
			private final String path;
			public Join(String path) {
				this.path = path;
			}

			/**
			 * Filter on id
			 */
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O> id() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O>(path+".id");};
			/**
			 * Filter on name
			 */
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> name() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".name");};
			/**
			 * Join with Person
			 */
			public final test.model.emap.test.PersonMapper.Join<O> likedBy() {return new test.model.emap.test.PersonMapper.Join<O>(path+".likedBy");};
		}
		/**
		 * Build a delete query
		 */
		public at.bestsolution.persistence.MappedUpdateQuery<Place> deleteAllMappedQuery();

}

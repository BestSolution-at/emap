package test.model.emap.test;

import test.model.test.Person;

public interface PersonMapper extends at.bestsolution.persistence.ObjectMapper<test.model.test.Person> {
	/**
	 * Find elements managed Domain-Elements with a query like this:
	 * <pre>
	 * SELECT
	 *   *
	 * FROM
	 *   PERSON
	 *   WHERE
	 *     ID = #{id}
	 * </pre>
	 * 
	 * @param id
	 * 
	 */
	public test.model.test.Person selectById(long id);
	/**
	 * Find elements managed Domain-Elements with a query like this:
	 * <pre>
	 * SELECT
	 *   *
	 * FROM
	 *   PERSON, LIKES_PERSON_PLACE
	 *   WHERE
	 *     PERSON.ID = LIKES_PERSON_PLACE.FK_PERSON AND LIKES_PERSON_PLACE.FK_PLACE = #{placeId}
	 * </pre>
	 * 
	 * @param placeId
	 * 
	 */
	public java.util.List<test.model.test.Person> selectAllForPlace(long placeId);


		/**
		 * Build dynamic query filters
		 */
		public static final class Expression {
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Person,test.model.test.Person> self_obj() {
				return new at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Person,test.model.test.Person>("id") {
					protected long getSid(test.model.test.Person value) {
						return value.getId();
					}
				};
			}

			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Person,test.model.test.Person> Person_self_obj() {
					return self_obj();
			}

			/**
			 * Filter on id
			 */
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Person> id() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Person>("id");}
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Person> Person_id() { return id();}
			/**
			 * Filter on name
			 */
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Person> name() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Person>("name");}
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Person> Person_name() { return name();}
			/**
			 * Join with Address
			 */
			public static final test.model.emap.test.AddressMapper.Join<Person> addresses() { return new test.model.emap.test.AddressMapper.Join<Person>("addresses");};
			public static final test.model.emap.test.AddressMapper.Join<Person> Person_addresses() { return addresses(); }
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Person,test.model.test.Address> addresses_obj() {
				return new at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Person,test.model.test.Address>("addresses."+addresses().id().getProperty()) {
					protected long getSid(test.model.test.Address value) {
						return value.getId();
					}
				};
			}

			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Person,test.model.test.Address> Person_addresses_obj() {
				return addresses_obj();
			}
			/**
			 * Join with Place
			 */
			public static final test.model.emap.test.PlaceMapper.Join<Person> likes() { return new test.model.emap.test.PlaceMapper.Join<Person>("likes");};
			public static final test.model.emap.test.PlaceMapper.Join<Person> Person_likes() { return likes(); }
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Person,test.model.test.Place> likes_obj() {
				return new at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Person,test.model.test.Place>("likes."+likes().id().getProperty()) {
					protected long getSid(test.model.test.Place value) {
						return value.getId();
					}
				};
			}

			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Person,test.model.test.Place> Person_likes_obj() {
				return likes_obj();
			}
		}

		/**
		 * Do not create instances of this class but use {@link PersonMapper#metaData()}
		 */
		public static class MetaData {
			public at.bestsolution.persistence.AttributeMetaData<Person,Long,at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Person>> id() {
				return new at.bestsolution.persistence.AttributeMetaData<>(Person.class,long.class,Expression.id(),Order.id());
			}
			public at.bestsolution.persistence.AttributeMetaData<Person,java.lang.String,at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Person>> name() {
				return new at.bestsolution.persistence.AttributeMetaData<>(Person.class,java.lang.String.class,Expression.name(),Order.name());
			}
			public at.bestsolution.persistence.ReferenceMetaData<Person,test.model.test.Address,at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Person,test.model.test.Address>> addresses() {
				return new at.bestsolution.persistence.ReferenceMetaData<>(Person.class,test.model.test.Address.class,Expression.addresses_obj());
			}
			public at.bestsolution.persistence.ReferenceMetaData<Person,test.model.test.Place,at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Person,test.model.test.Place>> likes() {
				return new at.bestsolution.persistence.ReferenceMetaData<>(Person.class,test.model.test.Place.class,Expression.likes_obj());
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
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Person> id() { return new at.bestsolution.persistence.order.OrderColumnFactory<Person>("id");};
			/**
			 * Order by for name
			 */
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Person> name() { return new at.bestsolution.persistence.order.OrderColumnFactory<Person>("name");};
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
			 * Join with Address
			 */
			public final test.model.emap.test.AddressMapper.Join<O> addresses() {return new test.model.emap.test.AddressMapper.Join<O>(path+".addresses");};
			/**
			 * Join with Place
			 */
			public final test.model.emap.test.PlaceMapper.Join<O> likes() {return new test.model.emap.test.PlaceMapper.Join<O>(path+".likes");};
		}
		/**
		 * Build a delete query
		 */
		public at.bestsolution.persistence.MappedUpdateQuery<Person> deleteAllMappedQuery();

}

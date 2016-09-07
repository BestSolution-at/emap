package test.model.emap.test;

import test.model.test.Address;

public interface AddressMapper extends at.bestsolution.persistence.ObjectMapper<test.model.test.Address> {
	/**
	 * Find elements managed Domain-Elements with a query like this:
	 * <pre>
	 * SELECT
	 *   *
	 * FROM
	 *   ADDRESS
	 *   WHERE
	 *     ID = #{id}
	 * </pre>
	 * 
	 * @param id
	 * 
	 */
	public test.model.test.Address selectById(long id);
	/**
	 * Find elements managed Domain-Elements with a query like this:
	 * <pre>
	 * SELECT
	 *   *
	 * FROM
	 *   ADDRESS
	 *   WHERE
	 *     FK_PERSON = #{personId}
	 * </pre>
	 * 
	 * @param personId
	 * 
	 */
	public java.util.List<test.model.test.Address> selectAllForPerson(long personId);


		/**
		 * Build dynamic query filters
		 */
		public static final class Expression {
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Address,test.model.test.Address> self_obj() {
				return new at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Address,test.model.test.Address>("id") {
					protected long getSid(test.model.test.Address value) {
						return value.getId();
					}
				};
			}

			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Address,test.model.test.Address> Address_self_obj() {
					return self_obj();
			}

			/**
			 * Filter on id
			 */
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Address> id() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Address>("id");}
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Address> Address_id() { return id();}
			/**
			 * Filter on street
			 */
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Address> street() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Address>("street");}
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Address> Address_street() { return street();}
			/**
			 * Join with Person
			 */
			public static final test.model.emap.test.PersonMapper.Join<Address> person() { return new test.model.emap.test.PersonMapper.Join<Address>("person");};
			public static final test.model.emap.test.PersonMapper.Join<Address> Address_person() { return person(); }
			/**
			 * Join directly on the fk avoiding unneeded joins
			 */
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Address> person_fk() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Address>("person"); };
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Address> Address_person_fk() { return person_fk(); };

			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Address,test.model.test.Person> person_obj() {
				return new at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Address,test.model.test.Person>("person") {
					protected long getSid(test.model.test.Person value) {
						return value.getId();
					}
				};
			}
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Address,test.model.test.Person> Address_person_obj() {
				return person_obj();
			}
		}

		/**
		 * Do not create instances of this class but use {@link AddressMapper#metaData()}
		 */
		public static class MetaData {
			public at.bestsolution.persistence.AttributeMetaData<Address,Long,at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Address>> id() {
				return new at.bestsolution.persistence.AttributeMetaData<>(Address.class,long.class,Expression.id(),Order.id());
			}
			public at.bestsolution.persistence.AttributeMetaData<Address,java.lang.String,at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Address>> street() {
				return new at.bestsolution.persistence.AttributeMetaData<>(Address.class,java.lang.String.class,Expression.street(),Order.street());
			}
			public at.bestsolution.persistence.ReferenceMetaData<Address,test.model.test.Person,at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<Address,test.model.test.Person>> person() {
				return new at.bestsolution.persistence.ReferenceMetaData<>(Address.class,test.model.test.Person.class,Expression.person_obj());
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
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Address> id() { return new at.bestsolution.persistence.order.OrderColumnFactory<Address>("id");};
			/**
			 * Order by for street
			 */
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Address> street() { return new at.bestsolution.persistence.order.OrderColumnFactory<Address>("street");};
			/**
			 * Order by for person
			 */
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
			 * Filter on street
			 */
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> street() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".street");};
			/**
			 * Join with Person
			 */
			public final test.model.emap.test.PersonMapper.Join<O> person() {return new test.model.emap.test.PersonMapper.Join<O>(path+".person");};
		}
		/**
		 * Build a delete query
		 */
		public at.bestsolution.persistence.MappedUpdateQuery<Address> deleteAllMappedQuery();

}

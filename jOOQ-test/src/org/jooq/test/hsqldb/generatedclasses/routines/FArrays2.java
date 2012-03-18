/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class FArrays2 extends org.jooq.impl.AbstractRoutine<java.lang.Long[]> {

	private static final long serialVersionUID = -400489581;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Long[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Long[]> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public FArrays2() {
		super("F_ARRAYS2", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the routine
	 */
	public void setInArray(java.lang.Long[] value) {
		setValue(IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setInArray(org.jooq.Field<java.lang.Long[]> field) {
		setField(IN_ARRAY, field);
	}
}

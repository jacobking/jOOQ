/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
public class FArrays1 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord> {

	private static final long serialVersionUID = -811085095;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public FArrays1() {
		super("F_ARRAYS1", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the routine
	 */
	public void setInArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord value) {
		setValue(IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setInArray(org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord> field) {
		setField(IN_ARRAY, field);
	}
}

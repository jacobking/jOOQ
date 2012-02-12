/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PArrays2 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1703526312;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Long[]> IN_ARRAY = createParameter("in_array", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Long[]> OUT_ARRAY = createParameter("out_array", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public PArrays2() {
		super(org.jooq.SQLDialect.POSTGRES, "p_arrays", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
		setOverloaded(true);
	}

	/**
	 * Set the <code>in_array</code> parameter to the routine
	 */
	public void setInArray(java.lang.Long[] value) {
		setValue(IN_ARRAY, value);
	}

	public java.lang.Long[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}

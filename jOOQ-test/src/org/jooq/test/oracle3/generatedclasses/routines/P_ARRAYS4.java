/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class P_ARRAYS4 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -443013413;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY> OUT_ARRAY = createParameter("OUT_ARRAY", org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY.class));

	/**
	 * Create a new routine call instance
	 */
	public P_ARRAYS4() {
		super("P_ARRAYS4", org.jooq.test.oracle3.generatedclasses.TEST.TEST);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the routine
	 */
	public void setIN_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY value) {
		setValue(IN_ARRAY, value);
	}

	public org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY getOUT_ARRAY() {
		return getValue(OUT_ARRAY);
	}
}

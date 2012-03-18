/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class P_GET_ONE_CURSOR extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -866935722;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> TOTAL = createParameter("TOTAL", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> BOOKS = createParameter("BOOKS", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY> BOOK_IDS = createParameter("BOOK_IDS", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY.class));

	/**
	 * Create a new routine call instance
	 */
	public P_GET_ONE_CURSOR() {
		super("P_GET_ONE_CURSOR", org.jooq.test.oracle3.generatedclasses.TEST.TEST);

		addOutParameter(TOTAL);
		addOutParameter(BOOKS);
		addInParameter(BOOK_IDS);
	}

	/**
	 * Set the <code>BOOK_IDS</code> parameter to the routine
	 */
	public void setBOOK_IDS(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY value) {
		setValue(BOOK_IDS, value);
	}

	public java.math.BigDecimal getTOTAL() {
		return getValue(TOTAL);
	}

	public org.jooq.Result<org.jooq.Record> getBOOKS() {
		return getValue(BOOKS);
	}
}

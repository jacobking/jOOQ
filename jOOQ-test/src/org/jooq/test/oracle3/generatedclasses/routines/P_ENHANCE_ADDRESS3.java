/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class P_ENHANCE_ADDRESS3 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1589518579;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> ADDRESS = createParameter("ADDRESS", org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.U_ADDRESS_TYPE.getDataType());

	/**
	 * Create a new routine call instance
	 */
	public P_ENHANCE_ADDRESS3() {
		super("P_ENHANCE_ADDRESS3", org.jooq.test.oracle3.generatedclasses.TEST.TEST);

		addInOutParameter(ADDRESS);
	}

	/**
	 * Set the <code>ADDRESS</code> parameter to the routine
	 */
	public void setADDRESS(org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE value) {
		setValue(ADDRESS, value);
	}

	public org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE getADDRESS() {
		return getValue(ADDRESS);
	}
}

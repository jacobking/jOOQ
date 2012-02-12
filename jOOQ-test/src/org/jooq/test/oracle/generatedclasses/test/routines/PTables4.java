/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
public class PTables4 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 2010861960;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord> IN_TABLE = createParameter("IN_TABLE", org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord> OUT_TABLE = createParameter("OUT_TABLE", org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public PTables4() {
		super(org.jooq.SQLDialect.ORACLE, "P_TABLES4", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		addInParameter(IN_TABLE);
		addOutParameter(OUT_TABLE);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter to the routine
	 */
	public void setInTable(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord value) {
		setValue(IN_TABLE, value);
	}

	public org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord getOutTable() {
		return getValue(OUT_TABLE);
	}
}

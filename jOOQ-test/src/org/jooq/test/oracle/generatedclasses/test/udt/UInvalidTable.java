/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt;

/**
 * This class is generated by jOOQ.
 */
public class UInvalidTable extends org.jooq.impl.UDTImpl<org.jooq.test.oracle.generatedclasses.test.udt.records.UInvalidTableRecord> {

	private static final long serialVersionUID = -1097523452;

	/**
	 * The singleton instance of TEST.U_INVALID_TABLE
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.udt.UInvalidTable U_INVALID_TABLE = new org.jooq.test.oracle.generatedclasses.test.udt.UInvalidTable();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.test.udt.records.UInvalidTableRecord> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.test.udt.records.UInvalidTableRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.udt.records.UInvalidTableRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * No further instances allowed
	 */
	private UInvalidTable() {
		super("U_INVALID_TABLE", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}
}

/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_785 extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.T_785Record> {

	private static final long serialVersionUID = 859603464;

	/**
	 * The singleton instance of t_785
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.T_785 T_785 = new org.jooq.test.mysql2.generatedclasses.tables.T_785();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.T_785Record> __RECORD_TYPE = org.jooq.test.mysql2.generatedclasses.tables.records.T_785Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.T_785Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_785Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_785Record, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_785Record, java.lang.String> VALUE = createField("VALUE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private T_785() {
		super("t_785", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * No further instances allowed
	 */
	private T_785(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.T_785.T_785);
	}

	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.T_785 as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.T_785(alias);
	}
}

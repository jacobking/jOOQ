/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class Syssequence extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1976477654;

	/**
	 * The singleton instance of sys.SYSSEQUENCE
	 */
	public static final org.jooq.util.sybase.sys.tables.Syssequence SYSSEQUENCE = new org.jooq.util.sybase.sys.tables.Syssequence();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> OWNER = createField("owner", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> MIN_VALUE = createField("min_value", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> MAX_VALUE = createField("max_value", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> INCREMENT_BY = createField("increment_by", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> START_WITH = createField("start_with", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> CACHE = createField("cache", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> CYCLE = createField("cycle", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> RESUME_AT = createField("resume_at", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SEQUENCE_NAME = createField("sequence_name", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * No further instances allowed
	 */
	private Syssequence() {
		super("SYSSEQUENCE", org.jooq.util.sybase.sys.Sys.SYS);
	}

	/**
	 * No further instances allowed
	 */
	private Syssequence(java.lang.String alias) {
		super(alias, org.jooq.util.sybase.sys.Sys.SYS, org.jooq.util.sybase.sys.tables.Syssequence.SYSSEQUENCE);
	}

	@Override
	public org.jooq.util.sybase.sys.tables.Syssequence as(java.lang.String alias) {
		return new org.jooq.util.sybase.sys.tables.Syssequence(alias);
	}
}

/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
public class Language extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord> {

	private static final long serialVersionUID = 1447539917;

	/**
	 * The singleton instance of sakila.language
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Language LANGUAGE = new org.jooq.examples.mysql.sakila.tables.Language();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.LanguageRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord, java.lang.Byte> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Language() {
		super("language", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * No further instances allowed
	 */
	private Language(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord, java.lang.Byte> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_LANGUAGE;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_LANGUAGE_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_LANGUAGE_PRIMARY);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.Language as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.Language(alias);
	}
}

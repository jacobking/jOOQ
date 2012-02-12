/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
public class City extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.CityRecord> {

	private static final long serialVersionUID = 132256521;

	/**
	 * The singleton instance of city
	 */
	public static final org.jooq.examples.mysql.sakila.tables.City CITY = new org.jooq.examples.mysql.sakila.tables.City();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.CityRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.CityRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.CityRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CityRecord, java.lang.Short> CITY_ID = createField("city_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CityRecord, java.lang.String> CITY_ = createField("city", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.city.country_id]
	 * REFERENCES country [sakila.country.country_id]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CityRecord, java.lang.Short> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CityRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private City() {
		super("city", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * No further instances allowed
	 */
	private City(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.City.CITY);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.CityRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_city;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CityRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_city_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CityRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CityRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_city_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.CityRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.CityRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.fk_city_country);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.City as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.City(alias);
	}
}

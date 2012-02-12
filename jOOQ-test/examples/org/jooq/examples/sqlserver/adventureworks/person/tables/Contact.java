/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
public class Contact extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord> {

	private static final long serialVersionUID = 468305199;

	/**
	 * The singleton instance of Contact
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.Contact CONTACT = new org.jooq.examples.sqlserver.adventureworks.person.tables.Contact();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.Integer> CONTACTID = createField("ContactID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.Boolean> NAMESTYLE = createField("NameStyle", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.String> TITLE = createField("Title", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.String> FIRSTNAME = createField("FirstName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.String> MIDDLENAME = createField("MiddleName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.String> LASTNAME = createField("LastName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.String> SUFFIX = createField("Suffix", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.String> EMAILADDRESS = createField("EmailAddress", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.Integer> EMAILPROMOTION = createField("EmailPromotion", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.String> PHONE = createField("Phone", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.String> PASSWORDHASH = createField("PasswordHash", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.String> PASSWORDSALT = createField("PasswordSalt", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.Object> ADDITIONALCONTACTINFO = createField("AdditionalContactInfo", org.jooq.util.sqlserver.SQLServerDataType.getDefaultDataType("xml"), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.String> ROWGUID = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Contact() {
		super("Contact", org.jooq.examples.sqlserver.adventureworks.person.Person.PERSON);
	}

	/**
	 * No further instances allowed
	 */
	private Contact(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.PERSON, org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.IDENTITY_Contact;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Contact_ContactID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Contact_ContactID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.Contact as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.Contact(alias);
	}
}

/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "x_unused", schema = "test2", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ID", "NAME"})
})
public class XUnused implements java.io.Serializable {

	private static final long serialVersionUID = 92980481;

	private java.lang.Integer    id;
	private java.lang.String     name;
	private java.math.BigInteger bigInteger;
	private java.lang.Integer    idRef;
	private java.lang.String     nameRef;
	private java.lang.Integer    class_;
	private java.lang.Integer    fields;
	private java.lang.Integer    configuration;
	private java.lang.Integer    uDT;
	private java.lang.Integer    metaData;
	private java.lang.Integer    type0;
	private java.lang.Integer    primaryKey;
	private java.lang.Integer    primarykey;
	private java.math.BigDecimal field_737;

	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "NAME", nullable = false, length = 10)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "BIG_INTEGER", precision = 25)
	public java.math.BigInteger getBigInteger() {
		return this.bigInteger;
	}

	public void setBigInteger(java.math.BigInteger bigInteger) {
		this.bigInteger = bigInteger;
	}

	@javax.persistence.Column(name = "ID_REF", precision = 10)
	public java.lang.Integer getIdRef() {
		return this.idRef;
	}

	public void setIdRef(java.lang.Integer idRef) {
		this.idRef = idRef;
	}

	@javax.persistence.Column(name = "NAME_REF", length = 10)
	public java.lang.String getNameRef() {
		return this.nameRef;
	}

	public void setNameRef(java.lang.String nameRef) {
		this.nameRef = nameRef;
	}

	@javax.persistence.Column(name = "CLASS", precision = 10)
	public java.lang.Integer getClass_() {
		return this.class_;
	}

	public void setClass_(java.lang.Integer class_) {
		this.class_ = class_;
	}

	@javax.persistence.Column(name = "FIELDS", precision = 10)
	public java.lang.Integer getFields_() {
		return this.fields;
	}

	public void setFields_(java.lang.Integer fields) {
		this.fields = fields;
	}

	@javax.persistence.Column(name = "CONFIGURATION", precision = 10)
	public java.lang.Integer getConfiguration_() {
		return this.configuration;
	}

	public void setConfiguration_(java.lang.Integer configuration) {
		this.configuration = configuration;
	}

	@javax.persistence.Column(name = "U_D_T", precision = 10)
	public java.lang.Integer getUDT() {
		return this.uDT;
	}

	public void setUDT(java.lang.Integer uDT) {
		this.uDT = uDT;
	}

	@javax.persistence.Column(name = "META_DATA", precision = 10)
	public java.lang.Integer getMetaData_() {
		return this.metaData;
	}

	public void setMetaData_(java.lang.Integer metaData) {
		this.metaData = metaData;
	}

	@javax.persistence.Column(name = "TYPE0", precision = 10)
	public java.lang.Integer getType0_() {
		return this.type0;
	}

	public void setType0_(java.lang.Integer type0) {
		this.type0 = type0;
	}

	@javax.persistence.Column(name = "PRIMARY_KEY", precision = 10)
	public java.lang.Integer getPrimaryKey() {
		return this.primaryKey;
	}

	public void setPrimaryKey(java.lang.Integer primaryKey) {
		this.primaryKey = primaryKey;
	}

	@javax.persistence.Column(name = "PRIMARYKEY", precision = 10)
	public java.lang.Integer getPrimarykey() {
		return this.primarykey;
	}

	public void setPrimarykey(java.lang.Integer primarykey) {
		this.primarykey = primarykey;
	}

	@javax.persistence.Column(name = "FIELD 737", precision = 25, scale = 2)
	public java.math.BigDecimal getField_737() {
		return this.field_737;
	}

	public void setField_737(java.math.BigDecimal field_737) {
		this.field_737 = field_737;
	}
}

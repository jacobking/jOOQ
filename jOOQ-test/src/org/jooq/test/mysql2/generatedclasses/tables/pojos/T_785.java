/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_785", schema = "test2")
public class T_785 implements java.io.Serializable {

	private static final long serialVersionUID = -493055006;

	private java.lang.Integer id;
	private java.lang.String  name;
	private java.lang.String  value;

	@javax.persistence.Column(name = "ID", precision = 10)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "NAME", length = 50)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "VALUE", length = 50)
	public java.lang.String getValue() {
		return this.value;
	}

	public void setValue(java.lang.String value) {
		this.value = value;
	}
}

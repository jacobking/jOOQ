/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_725_lob_test", schema = "public")
public class T_725LobTest implements java.io.Serializable {

	private static final long serialVersionUID = 1656330056;

	private java.lang.Integer id;
	private byte[]            lob;

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "lob")
	public byte[] getLob() {
		return this.lob;
	}

	public void setLob(byte[] lob) {
		this.lob = lob;
	}
}

/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
public class TTriggers implements org.jooq.test.h2.generatedclasses.tables.interfaces.ITTriggers {

	private static final long serialVersionUID = -1490519169;

	private java.lang.Integer idGenerated;
	private java.lang.Integer id;
	private java.lang.Integer counter;

	@Override
	public java.lang.Integer getIdGenerated() {
		return this.idGenerated;
	}

	@Override
	public void setIdGenerated(java.lang.Integer idGenerated) {
		this.idGenerated = idGenerated;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@Override
	public java.lang.Integer getCounter() {
		return this.counter;
	}

	@Override
	public void setCounter(java.lang.Integer counter) {
		this.counter = counter;
	}
}
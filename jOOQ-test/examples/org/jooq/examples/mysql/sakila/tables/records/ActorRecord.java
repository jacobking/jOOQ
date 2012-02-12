/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class ActorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.ActorRecord> {

	private static final long serialVersionUID = 170144386;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setActorId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.ACTOR_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Short getActorId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.ACTOR_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> fetchFilmActorList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR)
			.where(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR.ACTOR_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.ACTOR_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.LAST_UPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.LAST_UPDATE);
	}

	/**
	 * Create a detached ActorRecord
	 */
	public ActorRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR);
	}
}

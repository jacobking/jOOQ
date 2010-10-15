/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.jooq.FieldProvider;
import org.jooq.SimpleSelectQuery;
import org.jooq.impl.Create;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.postgres.generatedclasses.tables.TAuthor;
import org.jooq.test.postgres.generatedclasses.tables.TBook;


/**
 * This class is generated by jOOQ.
 */
public class TBookRecord extends UpdatableRecordImpl<TBookRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(TBook.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(TBook.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [author_id] REFERENCES t_author [id]
	 */
	public void setAuthorId(Integer value) {
		setValue(TBook.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [author_id] REFERENCES t_author [id]
	 */
	public Integer getAuthorId() {
		return getValue(TBook.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [author_id] REFERENCES t_author [id]
	 */
	public TAuthorRecord getTAuthor(Connection connection) throws SQLException {
		SimpleSelectQuery<TAuthorRecord> q = Create.selectQuery(TAuthor.T_AUTHOR);
		q.addCompareCondition(TAuthor.ID, getValue(TBook.AUTHOR_ID));
		q.execute(connection);

		List<TAuthorRecord> result = q.getResult().getRecords();
		return result.size() == 1 ? result.get(0) : null;
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(String value) {
		setValue(TBook.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTitle() {
		return getValue(TBook.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(Integer value) {
		setValue(TBook.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getPublishedIn() {
		return getValue(TBook.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(String value) {
		setValue(TBook.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public String getContentText() {
		return getValue(TBook.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(TBook.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getContentPdf() {
		return getValue(TBook.CONTENT_PDF);
	}

	/**
	 * This constructor has no effect, as a {@link TableFieldImpl} will always
	 * use its underlying table as a FieldProvider descriptor
	 */
	public TBookRecord(FieldProvider fields) {
		this();
	}

	public TBookRecord() {
		super(TBook.T_BOOK);
	}
}

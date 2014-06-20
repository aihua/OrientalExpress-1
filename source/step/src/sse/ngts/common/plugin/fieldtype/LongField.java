package sse.ngts.common.plugin.fieldtype;

import sse.ngts.common.plugin.step.Field;

/**
 * A long message field.
 */
public class LongField extends Field<Long>{
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public LongField(int field){
		super(field, 0L);
	}

	public LongField(int field, Long data) {
		super(field, data);
	}

	public LongField(int field, long data) {
		super(field, data);
	}

	public void setValue(Long value) {
		setObject(value);
	}

	public void setValue(long value) {
		setObject(value);
	}

	public long getValue() {
		return getObject();
	}

	public boolean valueEquals(Long value) {
		return getObject().equals(value);
	}

	public boolean valueEquals(long value) {
		return getObject().equals(value);
	}
}

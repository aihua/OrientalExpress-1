package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.StringField;

public class CxlRejReason extends StringField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 102;

	public CxlRejReason() {
		super(FIELD);
	}

	public CxlRejReason(String data) {
		super(FIELD, data);
	}
}

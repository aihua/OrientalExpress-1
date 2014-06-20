package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.CharField;

public class CxlRejResponseTo extends CharField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 434;

	public CxlRejResponseTo() {
		super(FIELD);
	}

	public CxlRejResponseTo(char data) {
		super(FIELD, data);
	}
}

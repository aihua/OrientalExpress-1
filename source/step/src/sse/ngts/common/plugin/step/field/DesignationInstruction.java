package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.CharField;


public class DesignationInstruction extends CharField {
	static final long serialVersionUID = 200506174;
	public static final int FIELD = 8502;
	
	public static final int CUSTODY_TRANSFER = '3';

	public DesignationInstruction() {
		super(8502);
	}

	public DesignationInstruction(char data) {
		super(8502, data);
	}
}

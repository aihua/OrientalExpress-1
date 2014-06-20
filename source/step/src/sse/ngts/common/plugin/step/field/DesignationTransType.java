package sse.ngts.common.plugin.step.field;

import sse.ngts.common.plugin.fieldtype.CharField;


public class DesignationTransType extends CharField {
	static final long serialVersionUID = 20050617;
	public static final int FIELD = 8527;
	
	public static final int NEW = '1';
	public static final int CANCEL = '3';

	public DesignationTransType() {
		super(8527);
	}

	public DesignationTransType(char data) {
		super(8527, data);
	}

}

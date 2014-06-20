/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step;

/**
 * An exception thrown when a tags value is not valid according to the data dictionary.
 */
public class IncorrectTagValue extends Exception {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public IncorrectTagValue(int field) {
		super("Field [" + field + "] contains an incorrect tag value.");
		this.field = field;
	}

	public IncorrectTagValue(int field, String value) {
		super();
		this.field = field;
		this.value = value;
	}

	public IncorrectTagValue(String s) {
		super(s);
	}

	@Override
	public String toString() {
		String str = super.toString();
		if (field != 0)
			str += " field=" + field;
		if (value != null)
			str += " value=" + value;
		return str;
	}

	public int field;

	public String value;
}

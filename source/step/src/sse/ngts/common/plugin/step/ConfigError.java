/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step;

public class ConfigError extends Exception {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public ConfigError() {
		super();
	}

	public ConfigError(String message) {
		super(message);
	}

	public ConfigError(Throwable cause) {
		super(cause);
	}

	public ConfigError(String string, Throwable e) {
		super(string, e);
	}
}

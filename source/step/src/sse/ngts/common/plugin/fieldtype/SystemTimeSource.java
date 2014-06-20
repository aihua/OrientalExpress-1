/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.fieldtype;

/**
 * Interface for obtaining system time. A system time source should be used
 * instead of direct system time to facilitate unit testing.
 */
public interface SystemTimeSource {
	/**
	 * Obtain the current time.
	 * 
	 * @return current (possible simulated) time
	 */
	long getTime();
}
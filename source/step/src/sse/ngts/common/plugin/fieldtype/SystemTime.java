/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.fieldtype;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * A wrapper for the system time source, used primarily for unit testing.
 */
public class SystemTime {
	public static final TimeZone UTC_TIMEZONE = TimeZone.getTimeZone("UTC");

	private static SystemTimeSource DEFAULT_TIME_SOURCE = new SystemTimeSource() {
		public long getTime() {
			return System.currentTimeMillis();
		}
	};

	private static SystemTimeSource systemTimeSource = DEFAULT_TIME_SOURCE;

	public static synchronized long currentTimeMillis() {
		return systemTimeSource.getTime();
	}

	public static Date getDate() {
		return new Date(currentTimeMillis());
	}

	public static synchronized void setTimeSource(SystemTimeSource systemTimeSource) {
		SystemTime.systemTimeSource = systemTimeSource != null ? systemTimeSource : DEFAULT_TIME_SOURCE;
	}

	public static Calendar getUtcCalendar() {
		Calendar c = Calendar.getInstance(SystemTime.UTC_TIMEZONE);
		c.setTimeInMillis(currentTimeMillis());
		return c;
	}

	public static Calendar getUtcCalendar(Date date) {
		Calendar c = getUtcCalendar();
		c.setTime(date);
		return c;
	}

}
/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2011 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.ezexpress.util;

import java.util.Collection;
import java.util.Map;

/**
 * ≈–∂œ¿‡
 */
public class ValidityUtil {

	public static final String EMPTY_STRING = "";

	/**
	 * is valid string
	 * @param string
	 * @return
	 */
	public static boolean isValid(String string) {
		return null != string && !EMPTY_STRING.equals(string.trim());
	}

	/**
	 * is valid list
	 * @param list
	 * @return
	 */
	public static boolean isValid(Collection<?> list) {
		return null != list && !list.isEmpty();
	}

	/**
	 * isValid array
	 * @param array
	 * @return
	 */
	public static boolean isValid(String[] array) {
		return null != array && array.length > 0;
	}

	/**
	 * isValid array
	 * @param array
	 * @return
	 */
	public static boolean isValid(long[] array) {
		return null != array && array.length > 0;
	}

	/**
	 * isValid array
	 * @param array
	 * @return
	 */
	public static boolean isValid(int[] array) {
		return null != array && array.length > 0;
	}

	/**
	 * isValid array
	 * @param array
	 * @return
	 */
	public static boolean isValid(byte[] array) {
		return null != array && array.length > 0;
	}

	/**
	 * @param password
	 * @return
	 */
	public static boolean isValid(char[] array) {
		return null != array && array.length > 0;
	}

	/**
	 * isValid array
	 * @param links
	 * @return
	 */
	public static boolean isValid(String[][] array) {
		return null != array && array.length > 0;
	}

	/**
	 * isValid map
	 * @param map
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isValid(Map map) {
		return null != map && map.keySet().size() > 0;
	}
}

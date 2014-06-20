/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step;

public class MessageUtils {

	private static final char FIELD_SEPARATOR = '\001';

	/**
	 * NOTE: This method is intended for internal use.
	 * 
	 * @param session - the Session that will process the message
	 * @param messageString
	 * @return the parsed message
	 * @throws InvalidMessage
	 */
	public static Message parse(String messageString, DataDictionary applicationDataDictionary,
			MessageFactory messageFactory, boolean doValidation) throws InvalidMessage {
		final String msgType = getMessageType(messageString);
		final sse.ngts.common.plugin.step.Message message = messageFactory.create(msgType);
		message.fromString(messageString, applicationDataDictionary, doValidation);
		return message;
	}

	public static boolean isMessageType(String message, String msgType) {
		try {
			return msgType.equals(getMessageType(message));
		} catch (final InvalidMessage e) {
			return false;
		}
	}

	public static String getMessageType(String messageString) throws InvalidMessage {
		final String value = getStringField(messageString, 35);
		if (value == null) {
			throw new InvalidMessage("Missing or garbled message type in " + messageString);
		}
		return value;
	}

	public static String getStringField(String messageString, int tag) {
		String value = null;
		final String tagString = Integer.toString(tag);
		int start = messageString.indexOf(tagString, 0);
		while (start != -1 && value == null) {
			if ((start == 0 || messageString.charAt(start - 1) == FIELD_SEPARATOR)) {
				int end = start + tagString.length();
				if ((end + 1) < messageString.length() && messageString.charAt(end) == '=') {
					// found tag, get value
					start = end = (end + 1);
					for (; end < messageString.length() && messageString.charAt(end) != FIELD_SEPARATOR; end++) {
						;
					}
					if (end == messageString.length()) {
						return null;
					} else {
						value = messageString.substring(start, end);
					}
				}
			}
			start = messageString.indexOf(tagString, start + 1);
		}
		return value;
	}

}

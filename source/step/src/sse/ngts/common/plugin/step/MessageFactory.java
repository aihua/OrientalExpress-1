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
 *
 * 
 * 
 */
public interface MessageFactory {
	/**
	 * Creates a message for a specified type and FIX version
	 * 
	 * @param beginString
	 *            the FIX version (for example, "FIX.4.2")
	 * @param msgType
	 *            the FIX message type (for example, "D" for an order)
	 * @return a message instance
	 */
	Message create(String msgType);

	/**
	 * Creates a group for the specified parent message type and
	 * for the fields with the corresponding field ID
	 *
	 * Example: to create a {@link quickfix.fix42.MarketDataRequest.NoMDEntryTypes}
	 * you need to call
	 *       create({@link quickfix.field.MsgType#MARKET_DATA_REQUEST}, {@link quickfix.field.NoMDEntryTypes#FIELD}) 
	 *
	 * Function returns null if the group cannot be created.
	 * @param beginString
	 *            the FIX version (for example, "FIX.4.2")
	 * @param msgType   Message type of the enclosing message
	 * @param correspondingFieldID  the fieldID of the field in the group
	 * @return  group, or null if the group can't be created.
	 */
	public Group create(String msgType, int correspondingFieldID);
}

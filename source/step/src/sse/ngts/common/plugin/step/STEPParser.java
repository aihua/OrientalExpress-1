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
 * Convenience class with default implementation for application methods
 */
public class STEPParser {
	private DataDictionary dataDictionary = null;
	private static String DEFAULE_XML_PATH = "./cfg/ezstep.xml";
	private MessageFactory messageFactory = null;

	public STEPParser() throws ConfigError {
		init(null);
	}

	public STEPParser(String xmlPath) throws ConfigError {
		init(xmlPath);
	}

	private void init(String xmlPath) throws ConfigError {
		if (xmlPath == null || xmlPath.trim().length() == 0) {
			dataDictionary = new DataDictionary(DEFAULE_XML_PATH);
		} else {
			dataDictionary = new DataDictionary(xmlPath);
		}
		dataDictionary.setCheckFieldsHaveValues(false);
		messageFactory = new sse.ngts.common.plugin.step.business.MessageFactory();
	}

	public DataDictionary getDataDictionary() {
		return dataDictionary;
	}

	public void setDataDictionary(DataDictionary dataDictionary) {
		this.dataDictionary = dataDictionary;
	}

	public MessageFactory getMessageFactory() {
		return messageFactory;
	}

	public void setMessageFactory(MessageFactory messageFactory) {
		this.messageFactory = messageFactory;
	}

	public String toRawStr(Message message) throws IncorrectTagValue, FieldNotFound, IncorrectDataFormat {
		this.dataDictionary.validate(message, true);
		String messageString = message.toString();
		return messageString;
	}

	public Message parseMessage(String messageData) throws InvalidMessage, IncorrectTagValue, FieldNotFound,
			IncorrectDataFormat {
		Message message = MessageUtils.parse(messageData, dataDictionary, messageFactory, false);
		dataDictionary.validate(message, true);
		return message;

	}
}

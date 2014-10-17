package sse.ngts.ezexpress.app.codec;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openfast.FastMessage;
import org.openfast.codec.FastDecoder;

import sse.ngts.common.plugin.step.FieldNotFound;
import sse.ngts.common.plugin.step.IncorrectDataFormat;
import sse.ngts.common.plugin.step.IncorrectTagValue;
import sse.ngts.common.plugin.step.InvalidMessage;
import sse.ngts.common.plugin.step.Message;
import sse.ngts.common.plugin.step.STEPParser;
import sse.ngts.common.plugin.step.business.MarketStatus;
import sse.ngts.common.plugin.step.business.MktDataBody;
import sse.ngts.common.plugin.step.business.MktDataFull;
import sse.ngts.ezexpress.app.config.ParserConfig;
import sse.ngts.ezexpress.util.ByteArrayBuffer;

public class FastParser {
	private static Logger log = Logger.getLogger(FastParser.class);

	private static final String rawDataTag = "96=";
	private static final String totNoRelatedSymTag = "393=";
	private static final String checkSumTag = "10=";

	public static FastMessageExpress parseMarketData(byte[] inBytes) {
		int rawDataOffset = 0, checkSumOffset = 0;
		try {
			rawDataOffset = ByteArrayBuffer.fixByteOffset(inBytes, rawDataTag.getBytes("US-ASCII"));
			checkSumOffset = ByteArrayBuffer.fixByteLastOffset(inBytes, checkSumTag.getBytes("US-ASCII"));
		} catch (Exception e) {
			throw new IllegalArgumentException("UnSupport Charset");
		}

		if (checkSumOffset < 0 || rawDataOffset < 0) {
			throw new IllegalArgumentException("STEP Data Format Incorrect");
		}

		byte[] fixbyte = null;
		byte[] fixbody = ByteArrayBuffer.toByteArray(inBytes, 0, rawDataOffset);
		byte[] fixend = ByteArrayBuffer.toByteArray(inBytes, checkSumOffset, 8);
		fixbyte = new byte[fixbody.length + fixend.length];
		System.arraycopy(fixbody, 0, fixbyte, 0, fixbody.length);
		System.arraycopy(fixend, 0, fixbyte, fixbody.length, fixend.length);

		//加载Step头信息
		MktDataFull mktDataFull = (MktDataFull) parseFixMessage(fixbyte);

		if (mktDataFull != null) {
			try {
				//得到协议中内容的长度
				int fastDataLen = mktDataFull.getRawDataLength().getValue();
				byte[] fastbyte = ByteArrayBuffer.toByteArray(inBytes, rawDataOffset + 4, fastDataLen);
				//获取fastbyte包含的数据条数
				int mdCount = mktDataFull.getMDCount().getValue();
				String securityType = mktDataFull.getSecurityType().getValue();

				FastMessageExpress fastExpress = new FastMessageExpress(mktDataFull, 
						parseFastMessage(securityType, mdCount, fastbyte));
				return fastExpress;
			} catch (FieldNotFound e) {
				log.error(e.getMessage());
			}
		}
		return null;
	}
	
	public static MarketStatus parseMarketStatus(byte[] inBytes) {
		int totNoRelatedSymOffset = 0, checkSumOffset = 0;
		try {
			totNoRelatedSymOffset = ByteArrayBuffer.fixByteOffset(inBytes, totNoRelatedSymTag.getBytes("US-ASCII"));
			checkSumOffset = ByteArrayBuffer.fixByteLastOffset(inBytes, checkSumTag.getBytes("US-ASCII"));
		} catch (Exception e) {
			throw new IllegalArgumentException("UnSupport Charset");
		}
		
		if (checkSumOffset < 0 || totNoRelatedSymOffset < 0) {
			throw new IllegalArgumentException("STEP Data Format Incorrect");
		}
		
		//加载Step头信息
		MarketStatus marketStatus = (MarketStatus) parseFixMessage(inBytes);
			
		return marketStatus;
	}

	/**
	 * 用Step协议解析头信息 
	 * @param fixMessage
	 * @return
	 */
	private static Message parseFixMessage(byte[] fixMessage) {
		String fixMsg = new String(fixMessage);
		Message msg = null;
		STEPParser app = null;
		try {
			app = ParserConfig.getInstance().getStep();
			msg = app.parseMessage(fixMsg);
		} catch (InvalidMessage e) {
			throw new IllegalArgumentException(e.getMessage());
		} catch (IncorrectTagValue e) {
			throw new IllegalArgumentException(e.getMessage());
		} catch (FieldNotFound e) {
			throw new IllegalArgumentException(e.getMessage());
		} catch (IncorrectDataFormat e) {
			throw new IllegalArgumentException(e.getMessage());
		}
		return msg;
	}

	private static List<MktDataBody> parseFastMessage(String securityType, int mdCount, byte[] fastMessage) {
		FastDecoder decoder = null;

		ByteArrayInputStream bais = new ByteArrayInputStream(fastMessage);
		decoder = new FastDecoder(ParserConfig.getInstance().getMarketDataContext(securityType), bais);

		List<MktDataBody> messages = new ArrayList<MktDataBody>();
		for (int i = 0; i < mdCount; i++) {
			FastMessage message = decoder.readMessage();
			log.debug("message====>" + message.toString());
			if (message != null) {
				messages.add(new MktDataBody(message));
			}
		}

		decoder.reset();

		return messages;
	}

}

package sse.ngts.ezexpress.app.codec;

import java.nio.charset.Charset;

import org.apache.log4j.Logger;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

import sse.ngts.common.plugin.step.Message;
import sse.ngts.common.plugin.step.MessageUtils;
import sse.ngts.common.plugin.step.STEPParser;
import sse.ngts.common.plugin.step.business.MarketStatus;
import sse.ngts.ezexpress.app.ExpressConstant;
import sse.ngts.ezexpress.app.config.ParserConfig;
import sse.ngts.ezexpress.util.ExpressUtil;

/**
 * API定义数据解码器
 */
public class StepProtocalDecoder extends CumulativeProtocolDecoder {

	private static Logger log = Logger.getLogger(StepProtocalDecoder.class);
	private Charset charset;
	private int totalLengthWithoutBody;//没有body的总长度
	
	public StepProtocalDecoder(Charset charset) {
		this.charset = charset;
		totalLengthWithoutBody = ExpressConstant.BEGINSTRING_LENGTH_WITH_SPLIT + ExpressConstant.SPLIT_BYTE_LENGTH 
				+ ExpressConstant.CHECKSUM_LENGTH + ExpressConstant.SPLIT_BYTE_LENGTH;
	}

	@Override
	protected boolean doDecode(IoSession session, IoBuffer in, ProtocolDecoderOutput out) throws Exception {
		int position = ExpressConstant.BEGINSTRING_LENGTH_WITH_SPLIT;
		while (true) {//解析中缓存中所有的完整step消息
			
			if (in.remaining() < totalLengthWithoutBody) {
				break;
			}
			
			/**
			 * 例如此时缓存中的step消息：
			 * 8=FIXT.1.19=6935=A49=EzEI56=EzSR34=152=14281829347=GBK98=0108=20553=11111110=134
			 */
			byte[] beginLengthByte = new byte[ExpressConstant.BEGINSTRING_LENGTH_NOT_SPLIT];
			try {
				in.get(beginLengthByte);
				while (!(ExpressConstant.BEGINSTRING.equals(new String(beginLengthByte)))) {
					position = position + 1;
					in.position(position);
					in.get(beginLengthByte);
				}
			} catch (Exception e) {
				log.error("get beginLengthByte exception:", e);
			}			
			
			in.position(position);//移动position到"8=FIXT.1.1"之后
			
			int bodyLengthByteLen = 0;	//表示"消息体长度"这个字段所占的长度
			while (in.get() != 1 && bodyLengthByteLen <= ExpressConstant.MAX_BODYLENGTH) {//计算bodyLength占用的字节长度
				bodyLengthByteLen++;
			}
			
			//因为while循环中取出bodylength，此处重置position到"8=FIXT.1.1"之后
			in.position(position);
			byte[] bodyLengthByte = new byte[bodyLengthByteLen];
			in.get(bodyLengthByte);//取得消息体长度的byte
			int bodyLength;
			try {
				String bodyLenStr = new String(bodyLengthByte);//"9=69"
				String bodyLenArr[] = bodyLenStr.split(ExpressConstant.REGION_VALU_SPLIT_STRING);
				if (bodyLenArr.length == 2 && ExpressConstant.BODYLENGTH_REGION_STRING == Integer.parseInt(bodyLenArr[0])) {
					bodyLength = Integer.parseInt(bodyLenArr[1]);	//消息体长度：69
				} else {
					in.position(position);
					break;
				}
			} catch (Exception e) {
				in.position(position);
				log.error("get bodyLength exception:", e);
				break;
			}			
			
			/**
			 * 算出一条完整的step消息的总长度
			 * BEGINSTRING_LENGTH："8=FIXT.1.19="
			 * bodyLength："69"
			 * PARTITION_BYTE_LENGTH：""
			 * bodyLength："35=A49=EzEI56=EzSR34=152=14281829347=GBK98=0108=20553=111111"
			 * BODYEND_2_CHECKSUM_LENGTH："10=134"
			 */
			int totalLength = totalLengthWithoutBody + bodyLengthByteLen + + bodyLength;
			in.position(position - ExpressConstant.BEGINSTRING_LENGTH_WITH_SPLIT);
			if (in.remaining() < totalLength) {//当前缓存中的数据没有一条完整的step
				break;
			}
			byte[] totalLengthByte = new byte[totalLength];
			in.get(totalLengthByte);//取出一条完整的step消息
			
			String messageData = ExpressUtil.byteToString(charset, totalLengthByte);
			final String msgType = MessageUtils.getMessageType(messageData);
			if (ExpressConstant.STEP_MSGTYPE_MARKET_DATA.equals(msgType)) {
				FastMessageExpress messages = FastParser.parseMarketData(totalLengthByte);
				out.write(messages);
			} else if (ExpressConstant.STEP_MSGTYPE_MARKET_STATUS_DATA.equals(msgType)) {
				MarketStatus messages = FastParser.parseMarketStatus(totalLengthByte);
				out.write(messages);
			} else  {
				STEPParser app = ParserConfig.getInstance().getStep();
				Message message = app.parseMessage(messageData);
				out.write(message);
			}
			position = position + totalLength;
		}
		
		return false;
	}
	
}

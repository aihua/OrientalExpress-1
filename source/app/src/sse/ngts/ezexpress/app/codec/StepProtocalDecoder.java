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
 * API�������ݽ�����
 * @author kzhao
 */
public class StepProtocalDecoder extends CumulativeProtocolDecoder {

	private static Logger log = Logger.getLogger(StepProtocalDecoder.class);
	private Charset charset;
	private int totalLengthWithoutBody;//û��body���ܳ���
	private int afterBeginStrMinLength;//��"8=FIXT.1.1"֮����Ҫ����С���ȣ�������body
	
	public StepProtocalDecoder(Charset charset) {
		this.charset = charset;
		totalLengthWithoutBody = ExpressConstant.BEGINSTRING_LENGTH_WITH_SPLIT + ExpressConstant.SPLIT_BYTE_LENGTH 
				+ ExpressConstant.CHECKSUM_LENGTH + ExpressConstant.SPLIT_BYTE_LENGTH;
		afterBeginStrMinLength = ExpressConstant.BODYLENGTH_REGION_STRING + ExpressConstant.REGION_VALU_SPLIT_STRING.length() 
				+ ExpressConstant.CHECKSUM_LENGTH + ExpressConstant.SPLIT_BYTE_LENGTH * 2;
	}

	@Override
	protected boolean doDecode(IoSession session, IoBuffer in, ProtocolDecoderOutput out) throws Exception {
		int position = 0;
		while (true) {//�����л��������е�����step��Ϣ
			
			if (in.remaining() < totalLengthWithoutBody) {
				break;
			}
			
			/**
			 * �����ʱ�����е�step��Ϣ��
			 * 8=FIXT.1.19=6935=A49=EzEI56=EzSR34=152=14281829347=GBK98=0108=20553=11111110=134
			 */
			byte[] beginLengthByte = new byte[ExpressConstant.BEGINSTRING_LENGTH_NOT_SPLIT];
			in.get(beginLengthByte);
			
			while (!(ExpressConstant.BEGINSTRING.equals(new String(beginLengthByte)))) {
				position = position + 1;
				in.position(position);
				if (in.remaining() < totalLengthWithoutBody) {
					break;
				}
				in.get(beginLengthByte);
			}

			if (in.remaining() < afterBeginStrMinLength) {
				in.position(position);
				break;
			}
			
			in.position(position + ExpressConstant.BEGINSTRING_LENGTH_WITH_SPLIT);//�ƶ�position��"8=FIXT.1.1"֮��
			int bodyLengthByteLen = 0;	//��ʾ"��Ϣ�峤��"����ֶ���ռ�ĳ���
			while (in.get() != 1 && bodyLengthByteLen <= ExpressConstant.MAX_BODYLENGTH) {//����bodyLengthռ�õ��ֽڳ���
				bodyLengthByteLen++;
			}
			
			//��Ϊwhileѭ����ȡ��bodylength���˴�����position��"8=FIXT.1.1"֮��
			in.position(position + ExpressConstant.BEGINSTRING_LENGTH_WITH_SPLIT);
			byte[] bodyLengthByte = new byte[bodyLengthByteLen];
			in.get(bodyLengthByte);//ȡ����Ϣ�峤�ȵ�byte
			int bodyLength = 0;
			String bodyLenStr = new String(bodyLengthByte);//"9=69"
			String bodyLenArr[] = bodyLenStr.split(ExpressConstant.REGION_VALU_SPLIT_STRING);
			if (bodyLenArr.length == 2 && ExpressConstant.BODYLENGTH_REGION_STRING == Integer.parseInt(bodyLenArr[0])) {
				bodyLength = Integer.parseInt(bodyLenArr[1]);	//��Ϣ�峤�ȣ�69
			} else {
				log.info("bodyLenStr is error: " + bodyLenStr);
				break;
			}
			
			/**
			 * ���һ��������step��Ϣ���ܳ���
			 * BEGINSTRING_LENGTH��"8=FIXT.1.19="
			 * bodyLength��"69"
			 * PARTITION_BYTE_LENGTH��""
			 * bodyLength��"35=A49=EzEI56=EzSR34=152=14281829347=GBK98=0108=20553=111111"
			 * BODYEND_2_CHECKSUM_LENGTH��"10=134"
			 */
			int totalLength = totalLengthWithoutBody + bodyLengthByteLen + + bodyLength;
			in.position(position);
			if (in.remaining() < totalLength) {//��ǰ�����е�����û��һ��������step
				break;
			}
			byte[] totalLengthByte = new byte[totalLength];
			in.get(totalLengthByte);//ȡ��һ��������step��Ϣ
			
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

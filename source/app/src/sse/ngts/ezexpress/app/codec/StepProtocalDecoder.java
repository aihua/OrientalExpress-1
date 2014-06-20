package sse.ngts.ezexpress.app.codec;

import java.nio.charset.Charset;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

import sse.ngts.common.plugin.step.Message;
import sse.ngts.common.plugin.step.MessageUtils;
import sse.ngts.common.plugin.step.STEPParser;
import sse.ngts.ezexpress.app.ExpressConstant;
import sse.ngts.ezexpress.app.config.ParserConfig;
import sse.ngts.ezexpress.util.ExpressUtil;

/**
 * API�������ݽ�����
 */
public class StepProtocalDecoder extends CumulativeProtocolDecoder {

	private Charset charset;
	private int totalLengthWithoutBody;//û��body���ܳ���
	private int afterBeginStrMinLength;//��"8=STEP.1.0.0"֮����Ҫ����С���ȣ�������body
	
	public StepProtocalDecoder(Charset charset) {
		this.charset = charset;
		totalLengthWithoutBody = ExpressConstant.BEGINSTRING_LENGTH_WITH_SPLIT + ExpressConstant.SPLIT_BYTE_LENGTH 
				+ ExpressConstant.CHECKSUM_LENGTH + ExpressConstant.SPLIT_BYTE_LENGTH;
		afterBeginStrMinLength = ExpressConstant.BODYLENGTH_REGION_STRING + ExpressConstant.REGION_VALU_SPLIT_STRING.length() 
				+ ExpressConstant.CHECKSUM_LENGTH + ExpressConstant.SPLIT_BYTE_LENGTH;
	}

	@Override
	protected boolean doDecode(IoSession session, IoBuffer in, ProtocolDecoderOutput out) throws Exception {
		int position = ExpressConstant.BEGINSTRING_LENGTH_WITH_SPLIT;
		while (true) {//�����л��������е�����step��Ϣ
			
			if (in.remaining() < totalLengthWithoutBody) {
				break;
			}
			
			/**
			 * �����ʱ�����е�step��Ϣ��
			 * 8=STEP.1.0.09=6935=A49=EzEI56=EzSR34=152=14281829347=GBK98=0108=20553=11111110=134
			 */
			byte[] beginLengthByte = new byte[ExpressConstant.BEGINSTRING_LENGTH_NOT_SPLIT];
			try {
				in.get(beginLengthByte);
				while (!(new String(beginLengthByte).equals(ExpressConstant.BEGINSTRING))) {
					position = position + 1;
					in.position(position);
					in.get(beginLengthByte);
				}
			} catch (Exception e) {
				break;
			}			
			
			in.position(position);//�ƶ�position��"8=STEP.1.0.0"֮��
			if (in.remaining() < afterBeginStrMinLength) {
				break;
			}
			
			int bodyLengthByteLen = 0;	//��ʾ"��Ϣ�峤��"����ֶ���ռ�ĳ���
			while (in.get() != 1 && bodyLengthByteLen <= ExpressConstant.MAX_BODYLENGTH) {//����bodyLengthռ�õ��ֽڳ���
				bodyLengthByteLen++;
			}
			
			//��Ϊwhileѭ����ȡ��bodylength���˴�����position��"8=STEP.1.0.0"֮��
			in.position(position);
			byte[] bodyLengthByte = new byte[bodyLengthByteLen];
			in.get(bodyLengthByte);//ȡ����Ϣ�峤�ȵ�byte
			int bodyLength;
			try {
				String bodyLenStr = new String(bodyLengthByte);//"9=69"
				String bodyLenArr[] = bodyLenStr.split(ExpressConstant.REGION_VALU_SPLIT_STRING);
				if (bodyLenArr.length == 2 && ExpressConstant.BODYLENGTH_REGION_STRING == Integer.parseInt(bodyLenArr[0])) {
					bodyLength = Integer.parseInt(bodyLenArr[1]);	//��Ϣ�峤�ȣ�69
				} else {
					in.position(position);
					break;
				}
			} catch (Exception e) {
				in.position(position);
				break;
			}			
			
			/**
			 * ���һ��������step��Ϣ���ܳ���
			 * BEGINSTRING_LENGTH��"8=STEP.1.0.09="
			 * bodyLength��"69"
			 * PARTITION_BYTE_LENGTH��""
			 * bodyLength��"35=A49=EzEI56=EzSR34=152=14281829347=GBK98=0108=20553=111111"
			 * BODYEND_2_CHECKSUM_LENGTH��"10=134"
			 */
			int totalLength = totalLengthWithoutBody + bodyLengthByteLen + + bodyLength;
			in.position(position - ExpressConstant.BEGINSTRING_LENGTH_WITH_SPLIT);
			if (in.remaining() < totalLength) {//��ǰ�����е�����û��һ��������step
				break;
			}
			byte[] totalLengthByte = new byte[totalLength];
			in.get(totalLengthByte);//ȡ��һ��������step��Ϣ
			
			String messageData = ExpressUtil.byteToString(charset, totalLengthByte);
			final String msgType = MessageUtils.getMessageType(messageData);
			if (!ExpressConstant.STEP_MSGTYPE_MARKET_DATA.equals(msgType)) {
				STEPParser app = ParserConfig.getInstance().getStep();
				Message message = app.parseMessage(messageData);
				out.write(message);
			} else {
				FastMessageExpress messages = FastParser.parseHeader(totalLengthByte);
				out.write(messages);
			}
			position = position + totalLength;
		}
		
		return false;
	}
	
}

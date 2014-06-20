package sse.ngts.ezexpress.app.codec;

import java.nio.charset.Charset;

import org.apache.log4j.Logger;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoderAdapter;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

import sse.ngts.common.plugin.step.FieldNotFound;
import sse.ngts.common.plugin.step.IncorrectDataFormat;
import sse.ngts.common.plugin.step.IncorrectTagValue;
import sse.ngts.common.plugin.step.Message;
import sse.ngts.common.plugin.step.STEPParser;
import sse.ngts.ezexpress.app.config.ParserConfig;
import sse.ngts.ezexpress.util.ExpressUtil;

/**
 * API定义数据编码器
 */
public class StepProtocalEncoder extends ProtocolEncoderAdapter {
	private static Logger log = Logger.getLogger(StepProtocalEncoder.class);
	@SuppressWarnings("unused")
	private Charset charset;

	public StepProtocalEncoder(Charset charset) {
		this.charset = charset;
	}

	@Override
	public void encode(IoSession session, Object message, ProtocolEncoderOutput out) throws Exception {
		Message msg = (Message) message;
		STEPParser app = ParserConfig.getInstance().getStep();

		String step = null;
		try {
			step = app.toRawStr(msg);
			IoBuffer ioBuf = ExpressUtil.stringToIoBuffer(step);
			out.write(ioBuf);
		} catch (IncorrectTagValue e) {
			log.info(e.getMessage());
		} catch (FieldNotFound e) {
			log.info(e.getMessage());
		} catch (IncorrectDataFormat e) {
			log.info(e.getMessage());
		}
	}
}

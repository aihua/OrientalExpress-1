package sse.ngts.ezexpress.app.codec;

import java.nio.charset.Charset;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

/**
 * ±àÂë½âÂë¹ýÂËÆ÷Àà
 */
public class ExpressCodecFactory implements ProtocolCodecFactory {

	//±àÂëÆ÷
	private final ProtocolEncoder encoder;
	//½âÂëÆ÷
	private final ProtocolDecoder decoder;

	public ExpressCodecFactory(Charset charset) {
		encoder = new StepProtocalEncoder(charset);
		decoder = new StepProtocalDecoder(charset);
	}

	@Override
	public ProtocolEncoder getEncoder(IoSession session) throws Exception {
		return encoder;
	}

	@Override
	public ProtocolDecoder getDecoder(IoSession session) throws Exception {
		return decoder;
	}

}

package sse.ngts.ezexpress.util;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import org.apache.mina.core.buffer.IoBuffer;

/**
 * API������
 */
public class ExpressUtil {

	/**
	 * ��byte[]ת����string
	 * @param b
	 * @return
	 */
	public static String byteToString(Charset charset, byte[] data) {
		CharBuffer buffer = charset.decode(ByteBuffer.wrap(data));
		String str = new String(buffer.array());
		return str;
	}

	/**
	 * ��Stringת��ΪIoBuffer
	 * @param str
	 * @return
	 */
	public static IoBuffer stringToIoBuffer(String str) {
		byte[] bt = str.getBytes();
		return byteToIoBuffer(bt);
	}

	/**
	 * ��byte[]ת����IoBuffer
	 * @param bt
	 * @return
	 */
	public static IoBuffer byteToIoBuffer(byte[] bt) {
		IoBuffer ioBuffer = IoBuffer.allocate(bt.length);
		ioBuffer.put(bt, 0, bt.length);
		ioBuffer.flip();
		return ioBuffer;
	}

	/**
	 * ��IoBufferת����byte[]
	 * @param buf
	 * @return
	 */
	public static byte[] ioBufferToByte(IoBuffer buf) {
		return buf.array();
	}

	/**
	 * IoBufferת����String
	 * @param buf
	 * @return
	 */
	public static String ioBufferToString(Charset charset, IoBuffer buf) {
		return byteToString(charset, ioBufferToByte(buf));
	}

	/**
	 * IoBufferת����String
	 * @param buf
	 * @return
	 */
	public static String ioBufferToString(IoBuffer buf) {
		return new String(ioBufferToByte(buf));
	}

}

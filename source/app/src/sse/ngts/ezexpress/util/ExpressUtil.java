package sse.ngts.ezexpress.util;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import org.apache.mina.core.buffer.IoBuffer;

/**
 * API工具类
 */
public class ExpressUtil {

	/**
	 * 将byte[]转换成string
	 * @param b
	 * @return
	 */
	public static String byteToString(Charset charset, byte[] data) {
		CharBuffer buffer = charset.decode(ByteBuffer.wrap(data));
		String str = new String(buffer.array());
		return str;
	}

	/**
	 * 将String转化为IoBuffer
	 * @param str
	 * @return
	 */
	public static IoBuffer stringToIoBuffer(String str) {
		byte[] bt = str.getBytes();
		return byteToIoBuffer(bt);
	}

	/**
	 * 将byte[]转换成IoBuffer
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
	 * 将IoBuffer转化成byte[]
	 * @param buf
	 * @return
	 */
	public static byte[] ioBufferToByte(IoBuffer buf) {
		return buf.array();
	}

	/**
	 * IoBuffer转换成String
	 * @param buf
	 * @return
	 */
	public static String ioBufferToString(Charset charset, IoBuffer buf) {
		return byteToString(charset, ioBufferToByte(buf));
	}

	/**
	 * IoBuffer转换成String
	 * @param buf
	 * @return
	 */
	public static String ioBufferToString(IoBuffer buf) {
		return new String(ioBufferToByte(buf));
	}

}

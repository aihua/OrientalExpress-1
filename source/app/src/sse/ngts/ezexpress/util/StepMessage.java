package sse.ngts.ezexpress.util;

import sse.ngts.common.plugin.step.Message;
import sse.ngts.common.plugin.step.STEPParser;
import sse.ngts.common.plugin.step.business.Heartbeat;
import sse.ngts.common.plugin.step.business.MarketDataRequest;
import sse.ngts.common.plugin.step.business.TCPLogin;
import sse.ngts.common.plugin.step.business.TCPLogout;
import sse.ngts.common.plugin.step.field.EncryptMethod;
import sse.ngts.common.plugin.step.field.HeartBtInt;
import sse.ngts.common.plugin.step.field.Password;
import sse.ngts.common.plugin.step.field.SecurityType;
import sse.ngts.common.plugin.step.field.Text;
import sse.ngts.common.plugin.step.field.UserName;
import sse.ngts.ezexpress.app.ExpressConstant;

/**
 * ��Ϣ���װ��
 */
public class StepMessage {
	//	private static Logger log = Logger.getLogger(StepMessage.class);

	/**
	 * ��װ��¼��Ϣ
	 * @param app
	 * @param param
	 * @return
	 */
	public static Message getLoginMessage(STEPParser app, int heartbt, String userName, String password) {
		int[] orderField = app.getDataDictionary().getMessageFieldsByType(TCPLogin.MSGTYPE);
		TCPLogin login = new TCPLogin(orderField);
		login.set(new EncryptMethod(ExpressConstant.STRING_ZERO));
		login.set(new HeartBtInt(heartbt));
		login.set(new UserName(userName));
		login.set(new Password(password));
		return login;
	}

	/**
	 * ��װ���鶩����Ϣ
	 * @param app
	 * @param param
	 * @return
	 */
	public static Message getMarketSubscribeMessage(STEPParser app, String tcpMkdRequest) {
		int[] orderField = app.getDataDictionary().getMessageFieldsByType(MarketDataRequest.MSGTYPE);
		MarketDataRequest market = new MarketDataRequest(orderField);
		market.set(new SecurityType(tcpMkdRequest));
		return market;
	}

	/**
	 * ��װ������Ϣ
	 * @param app
	 * @return
	 */
	public static Message getSocketHeartbeatMessage(STEPParser app) {
		int[] orderField = app.getDataDictionary().getMessageFieldsByType(Heartbeat.MSGTYPE);
		return new Heartbeat(orderField);
	}

	/**
	 * ��װע����Ϣ
	 * @param app
	 * @return
	 */
	public static Message getLogoutMessage(STEPParser app) {
		int[] orderField = app.getDataDictionary().getMessageFieldsByType(TCPLogout.MSGTYPE);
		TCPLogout logout = new TCPLogout(orderField);
		logout.set(new Text(ExpressConstant.LOGOUT_TEXT));
		return logout;
	}
}

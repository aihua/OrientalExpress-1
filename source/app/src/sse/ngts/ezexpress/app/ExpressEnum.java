package sse.ngts.ezexpress.app;

/**
 * API枚举声明类
 */
public class ExpressEnum {

	/**
	 * 连接模式枚举
	 */
	public enum EpsConnMode {
		EPS_CONN_MODE_TCP(1), /* TCP连接模式 */
		EPS_CONN_MODE_UDP_UNICAST(2), /* UDP单播模式 */
		EPS_CONN_MODE_UDP_MULTICAST(3); /* UDP多播模式 */

		private int connMode;

		private EpsConnMode(int connMode) {
			this.connMode = connMode;
		}

		public int getConnMode() {
			return connMode;
		}
	}

	/**
	 * 市场类型枚举
	 */
	public enum MarketType {
		EPS_MKTTYPE_ALL(0, "00"), /* 所有市场 */
		EPS_MKTTYPE_STK(1, "01"), /* 股票市场(含指数) */
		EPS_MKTTYPE_DEV(2, "02"); /* 衍生品市场 */

		private int mktType;
		private String mkdRequest;

		private MarketType(int mktType, String mkdRequest) {
			this.mktType = mktType;
			this.mkdRequest = mkdRequest;
		}

		public int getMktType() {
			return mktType;
		}

		public String getMkdRequest() {
			return mkdRequest;
		}
	}

	/**
	 * 交易模式枚举
	 */
	public enum EpsTrdSesModeTag {
		EPS_TRDSES_MODE_TESTING(1), /* 系统测试模式 */
		EPS_TRDSES_MODE_SIMULATED(2), /* 模拟交易模式 */
		EPS_TRDSES_MODE_PRODUCTION(3); /* 生产模式 */

		private int trdsesMode;

		private EpsTrdSesModeTag(int trdsesMode) {
			this.trdsesMode = trdsesMode;
		}

		public int getTrdsesMode() {
			return trdsesMode;
		}
	}

	/**
	 * 事件类型枚举
	 */
	public enum EpsEventTypeTag {
		EPS_EVENTTYPE_INFORMATION(1), /* 提示信息类型 */
		EPS_EVENTTYPE_WARNING(2), /* 警告信息类型 */
		EPS_EVENTTYPE_ERROR(3), /* 错误信息类型 */
		EPS_EVENTTYPE_FATAL(4); /* 严重错误信息类型 */

		private int eventType;

		private EpsEventTypeTag(int eventType) {
			this.eventType = eventType;
		}

		public int getEventType() {
			return eventType;
		}
	}

}

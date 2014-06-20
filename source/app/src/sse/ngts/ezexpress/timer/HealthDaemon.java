/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2014 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
*/

package sse.ngts.ezexpress.timer;

import org.apache.log4j.Logger;
import org.apache.mina.core.session.IoSession;

import sse.ngts.common.plugin.step.Message;
import sse.ngts.common.plugin.step.STEPParser;
import sse.ngts.ezexpress.app.ExpressConstant;
import sse.ngts.ezexpress.app.config.ParserConfig;
import sse.ngts.ezexpress.util.StepMessage;

/**
 * 定时发送心跳
 */
public class HealthDaemon {
	private static final Logger log = Logger.getLogger(HealthDaemon.class);

	private SimpleTimer timer;
	private IoSession session;

	public HealthDaemon(IoSession session) {
		this.session = session;

		timer = new SimpleTimer("EzTimer-HealthDaemon");
		//心跳
		timer.schedule(new HeartBeatTask(), 0, ExpressConstant.HEARTBEATRATE * 1000);
	}

	public void stopHeartBeat() {
		timer.cancel();
		log.debug("停止心跳发送");
	}

	private class HeartBeatTask extends SimpleTimerTask {

		/* (non-Javadoc)
		 * @see sse.ngts.common.core.timer.SimpleTimerTask#run()
		 */
		@Override
		public void run() {
			if (session == null) {
				return;
			}
			log.debug("心跳发送数据开始");
			STEPParser app = ParserConfig.getInstance().getStep();
			Message heartbeat = StepMessage.getSocketHeartbeatMessage(app);
			session.write(heartbeat);
			log.debug("心跳发送数据结束");
		}
	}
}

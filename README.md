【项目简介】
================

OrientalExpress项目是由上海证券交易所技术人员主导的一个开源项目，提供接入所内各平台高速行情的客户端API。本项目的初衷是提供封装所内高速行情发布底层通讯协议的开发包（JAVA版），以帮助行情用户更快更方面地开发客户端程序，更好地向市场提供行情服务。

【运作模式】
================

本项目开源免费，由上海证券交易所负责维护，源代码将公布在Github代码托管网站上。同时欢迎感兴趣的技术开发人员加入我们的团队，或提供技术支持。 需要使用本项目代码进行商业项目开发的单位或个人，需要接受上海证券交易所的授权。

================

【接口使用说明】  
================

具体使用方法请参见接口文件：source/app/src/sse/ngts/ezexpress/app/ExpressApi.java 。<br>
客户端演示用例请参见文件： source/demo/src/sse/ngts/ezexpress/demo/tcp/TCPClient.java（TCP）、source/demo/src/sse/ngts/ezexpress/demo/udp/UDPMulticastClient.java（UDP多播）。

【注意事项】
================

客户端演示用例中有一个UDP单点接收行情的demo：source/demo/src/sse/ngts/ezexpress/demo/udp/UDPUnicastClient.java<br>
FAST行情不会通过UDP单点模式发送，新增此接口是为了利于将来扩展业务，例如通过SR协议接收show2003文件。


【联系方式】
================

上海证券交易所  章奕：yzhang@sse.com.cn;  赵凯： kzhao@sse.com.cn

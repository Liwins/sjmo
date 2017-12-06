package cn.riversky.bridge.e4;

import cn.riversky.bridge.e4.service.Message;
import cn.riversky.bridge.e4.service.impl.CommonMessageSMS;
import cn.riversky.bridge.e4.service.impl.SpecialMobile;
import cn.riversky.bridge.e4.service.impl.UrgencyMobile;

/**
 * 需求：发送方式添加手机的发送消息方式
 * 在e3的基础上使用手机的方式，对各种类型的通知方式进行实现
 *
 * Created by admin on 2017/12/5.
 */
public class Client {
    public static void main(String[] args) {
        Message m0=new SpecialMobile();
        m0.send("xiaomingnihao","xiaoming");
        Message m=new UrgencyMobile();
        m.send("你好小明","小明");
        Message m2=new CommonMessageSMS();
        m2.send("你好小明","小明");
    }
}

package cn.riversky.structtype.bridge.e3;

import cn.riversky.structtype.bridge.e3.service.Message;
import cn.riversky.structtype.bridge.e3.service.impl.CommonMessageSMS;
import cn.riversky.structtype.bridge.e3.service.impl.SpecialEmail;
import cn.riversky.structtype.bridge.e3.service.impl.UrgencyEmail;

/**
 * 需求：实现特急方法的邮件和SMs方式
 * 在e2的基础上添加个继承Message的特急的接口，并使用email和sms实现
 *
 * Created by admin on 2017/12/5.
 */
public class Client {
    public static void main(String[] args) {
        Message m0=new SpecialEmail();
        m0.send("xiaomingnihao","xiaoming");
        Message m=new UrgencyEmail();
        m.send("你好小明","小明");
        Message m2=new CommonMessageSMS();
        m2.send("你好小明","小明");
    }
}

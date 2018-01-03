package cn.riversky.yanmo.structtype.bridge.e2;

import cn.riversky.yanmo.structtype.bridge.e2.service.Message;
import cn.riversky.yanmo.structtype.bridge.e2.service.impl.CommonMessageSMS;
import cn.riversky.yanmo.structtype.bridge.e2.service.impl.UrgencyEmail;

/**
 * 需求：实现加急方法的邮件和SMs方式
 * 在e1的基础上添加几个继承Message的加急的接口，并使用email和sms实现
 *
 * Created by admin on 2017/12/5.
 */
public class Client {
    public static void main(String[] args) {
        Message m=new UrgencyEmail();
        m.send("你好小明","小明");
        Message m2=new CommonMessageSMS();
        m2.send("你好小明","小明");
    }
}

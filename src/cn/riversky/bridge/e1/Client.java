package cn.riversky.bridge.e1;

import cn.riversky.bridge.e1.service.Message;
import cn.riversky.bridge.e1.service.impl.CommonMessageEmail;
import cn.riversky.bridge.e1.service.impl.CommonMessageSMS;

/**
 * 其实就是面向接口编程
 * Created by admin on 2017/12/5.
 */
public class Client {
    public static void main(String[] args) {
        Message m=new CommonMessageEmail();
        m.send("你好小明","小明");
        Message m2=new CommonMessageSMS();
        m2.send("你好小明","小明");
    }
}

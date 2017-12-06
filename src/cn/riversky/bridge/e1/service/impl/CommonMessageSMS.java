package cn.riversky.bridge.e1.service.impl;

import cn.riversky.bridge.e1.service.Message;

/**
 * Created by admin on 2017/12/5.
 */
public class CommonMessageSMS implements Message {
    @Override
    public void send(String message, String toUser) {
        System.out.println("send by commonSMS,data:"+message+"->"+toUser);
    }
}

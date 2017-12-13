package cn.riversky.structtype.bridge.e3.service.impl;

import cn.riversky.structtype.bridge.e3.service.Message;

/**
 * Created by admin on 2017/12/5.
 */
public class CommonMessageSMS implements Message {
    @Override
    public void send(String message, String toUser) {
        System.out.println("send by commonSMS,data:"+message+"->"+toUser);
    }
}

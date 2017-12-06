package cn.riversky.bridge.e3.service.impl;

import cn.riversky.bridge.e3.service.SpecialUrgencyMessage;

/**
 * Created by admin on 2017/12/5.
 */
public class SpecialSMS implements SpecialUrgencyMessage {
    @Override
    public void send(String message, String toUser) {
        message = "特急："+message;
        System.out.println("send by SMS,data:"+message+"->"+toUser);
    }

    @Override
    public void hurry(String messageId) {

    }
}

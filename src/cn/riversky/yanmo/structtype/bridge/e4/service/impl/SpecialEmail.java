package cn.riversky.yanmo.structtype.bridge.e4.service.impl;

import cn.riversky.yanmo.structtype.bridge.e4.service.SpecialUrgencyMessage;

/**
 * Created by admin on 2017/12/5.
 */
public class SpecialEmail implements SpecialUrgencyMessage {
    @Override
    public void send(String message, String toUser) {
        message = "特急："+message;
        System.out.println("send by Email,data:"+message+"->"+toUser);
    }

    @Override
    public void hurry(String messageId) {

    }
}

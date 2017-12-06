package cn.riversky.bridge.e4.service.impl;

import cn.riversky.bridge.e4.service.UrgencyMessage;

/**
 * Created by admin on 2017/12/5.
 */
public class UrgencySMS implements UrgencyMessage {
    @Override
    public void send(String message, String toUser) {
        message = "加急："+message;
        System.out.println("send by SMS,data:"+message+"->"+toUser);
    }

    @Override
    public Object watch(String messageId) {
        return null;
    }
}

package cn.riversky.yanmo.structtype.bridge.e2.service.impl;

import cn.riversky.yanmo.structtype.bridge.e2.service.UrgencyMessage;

/**
 * Created by admin on 2017/12/5.
 */
public class UrgencyEmail implements UrgencyMessage {
    @Override
    public void send(String message, String toUser) {
        message = "加急："+message;
        System.out.println("send by Email,data:"+message+"->"+toUser);
    }

    @Override
    public Object watch(String messageId) {
        return null;
    }
}

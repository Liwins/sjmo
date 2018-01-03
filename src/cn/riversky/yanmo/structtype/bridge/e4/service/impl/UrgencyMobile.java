package cn.riversky.yanmo.structtype.bridge.e4.service.impl;

import cn.riversky.yanmo.structtype.bridge.e4.service.UrgencyMessage;

/**
 * Created by admin on 2017/12/5.
 */
public class UrgencyMobile implements UrgencyMessage {
    @Override
    public void send(String message, String toUser) {
        message = "加急："+message;
        System.out.println("send by Mobile,data:"+message+"->"+toUser);
    }

    @Override
    public Object watch(String messageId) {
        return null;
    }
}

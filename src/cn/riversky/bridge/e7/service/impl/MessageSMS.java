package cn.riversky.bridge.e7.service.impl;

import cn.riversky.bridge.e7.service.MessageImplementor;

/**
 * Created by admin on 2017/12/5.
 */
public class MessageSMS implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用SMS的方式，发送消息'"+message+"'给"+toUser);
    }
}

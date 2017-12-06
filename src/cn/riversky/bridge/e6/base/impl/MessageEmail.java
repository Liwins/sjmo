package cn.riversky.bridge.e6.base.impl;

import cn.riversky.bridge.e6.base.MessageImplementor;

/**
 * Created by admin on 2017/12/5.
 */
public class MessageEmail implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用Email的方式，发送消息'"+message+"'给"+toUser);
    }
}

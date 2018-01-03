package cn.riversky.yanmo.structtype.bridge.e6.base.impl;

import cn.riversky.yanmo.structtype.bridge.e6.base.MessageImplementor;

/**
 * Created by admin on 2017/12/5.
 */
public class MessageMobile implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用Mobile的方式，发送消息'"+message+"'给"+toUser);
    }
}

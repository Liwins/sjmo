package cn.riversky.yanmo.structtype.bridge.e6.service;

import cn.riversky.yanmo.structtype.bridge.e6.base.MessageImplementor;

/**
 * 这里是定义桥的抽象类
 * Created by admin on 2017/12/5.
 */
public class AbstractMessage {
    protected MessageImplementor impl;

    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }
    public void sendMessage(String message,String toUser){
        impl.send(message,toUser);
    }
}

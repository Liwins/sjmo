package cn.riversky.yanmo.structtype.bridge.e7.bridge;

import cn.riversky.yanmo.structtype.bridge.e7.service.MessageImplementor;
import cn.riversky.yanmo.structtype.bridge.e7.service.impl.MessageSMS;
import cn.riversky.yanmo.structtype.bridge.e7.service.impl.MessageMobile;
import cn.riversky.yanmo.structtype.bridge.e7.service.impl.MessageEmail;

/**
 * 通过指定类型来决定具体使用的通信工具
 * Created by admin on 2017/12/5.
 */
public abstract class AbstractMessage {
    protected MessageImplementor impl;

    /**
     * 通过该方式，不需要第一部的New impl了
     * @param type
     */
    public AbstractMessage(int type) {
        if(type==1){
            impl=new MessageMobile();
        }else if(type==2){
            impl=new MessageEmail();
        }else {
            impl=new MessageSMS();
        }
    }
    /**
     * 发送消息，转调实现部分的方法
     * @param message 要发送的消息内容
     * @param toUser 把消息发送的目的人员
     */
    public void sendMessage(String message,String toUser){
        this.impl.send(message, toUser);
    }
}

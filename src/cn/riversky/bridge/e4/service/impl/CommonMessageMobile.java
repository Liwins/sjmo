package cn.riversky.bridge.e4.service.impl;

import cn.riversky.bridge.e3.service.Message;

/**
 * Created by admin on 2017/12/5.
 */
public class CommonMessageMobile implements Message {
    @Override
    public void send(String message, String toUser) {
        System.out.println("send by commonMobile,data:"+message+"->"+toUser);
    }
}

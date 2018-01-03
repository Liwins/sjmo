package cn.riversky.yanmo.structtype.bridge.e7.bridge.type;

import cn.riversky.yanmo.structtype.bridge.e7.bridge.AbstractMessage;

/**
 * Created by admin on 2017/12/5.
 */
public class UrgencyMessag extends AbstractMessage{
    /**
     * 通过该方式，不需要第一部的New impl了
     *
     * @param type
     */
    public UrgencyMessag(int type) {
        super(type);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message="加急"+message;
        super.sendMessage(message, toUser);
    }
}

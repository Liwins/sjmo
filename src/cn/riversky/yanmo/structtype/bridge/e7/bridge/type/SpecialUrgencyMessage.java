package cn.riversky.yanmo.structtype.bridge.e7.bridge.type;

import cn.riversky.yanmo.structtype.bridge.e7.bridge.AbstractMessage;

/**
 * Created by admin on 2017/12/5.
 */
public class SpecialUrgencyMessage extends AbstractMessage {
    /**
     * 通过该方式，不需要第一部的New impl了
     *
     * @param type
     */
    public SpecialUrgencyMessage(int type) {
        super(type);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message="特急"+message;
        super.sendMessage(message, toUser);
    }
}

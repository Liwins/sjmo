package cn.riversky.yanmo.structtype.bridge.e6.service.create;

import cn.riversky.yanmo.structtype.bridge.e6.base.MessageImplementor;
import cn.riversky.yanmo.structtype.bridge.e6.service.AbstractMessage;

/**
 * 实现类使用super.的方法进行实现。
 * Created by admin on 2017/12/5.
 */
public class CommonMessage extends AbstractMessage {
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }
    @Override
    public void sendMessage(String message,String toUser){
        super.sendMessage(message,toUser);
    }
}

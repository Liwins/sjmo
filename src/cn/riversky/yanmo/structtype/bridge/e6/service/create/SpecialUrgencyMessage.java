package cn.riversky.yanmo.structtype.bridge.e6.service.create;

import cn.riversky.yanmo.structtype.bridge.e6.base.MessageImplementor;
import cn.riversky.yanmo.structtype.bridge.e6.service.AbstractMessage;

/**
 * 这个包中的就是需要扩展的发送类型，由于是传入的接口impl,所以直接不需要通信方式的这一维的应用。
 * Created by admin on 2017/12/5.
 */
public class SpecialUrgencyMessage extends AbstractMessage {
    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }
    public void hurry(String messageId) {
        //执行催促的业务，发出催促的信息
    }
@Override
    public void sendMessage(String message, String toUser) {
        message = "特急："+message;
        super.sendMessage(message, toUser);
        //还需要增加一条待催促的信息
    }
}

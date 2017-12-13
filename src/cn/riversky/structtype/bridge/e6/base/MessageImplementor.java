package cn.riversky.structtype.bridge.e6.base;

/**
 * 这里定义桥的抽象类的实现类的接口（没有必要跟抽象类的一样，因为在抽象类中会像适配器模式一样，对其进行改造）
 * Created by admin on 2017/12/5.
 */
public interface MessageImplementor {
    /**
     * 发送消息
     * @param message 要发送的消息内容
     * @param toUser 把消息发送的目的人员
     */
    void send(String message,String toUser);
}

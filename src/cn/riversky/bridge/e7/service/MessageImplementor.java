package cn.riversky.bridge.e7.service;

/**
 * Created by admin on 2017/12/5.
 */
public interface MessageImplementor {
    /**
     * 发送消息
     * @param message 要发送的消息内容
     * @param toUser 把消息发送的目的人员
     */
    public void send(String message,String toUser);
}

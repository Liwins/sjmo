package cn.riversky.bridge.e4.service;

/**
 * Created by admin on 2017/12/5.
 */
public interface UrgencyMessage extends Message {
    /**
     * 监控消息的处理过程
     * @param messageId 被监控到的消息编号
     * @return  包含监控到的数据对象
     */
     Object watch(String messageId);
}

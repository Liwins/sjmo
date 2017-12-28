package cn.riversky.actiontype.observer.e1;

/**
 * 观察者接口，定义一个更新的接口给哪些在目标发生改变的时候被通知的对象
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public interface Observer {
    /**
     * 更新的接口
     * @param subject  传入目标对象，好获取响应的目标对象的状态
     */
    public void update(Subject subject);
}

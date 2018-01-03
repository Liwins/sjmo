package cn.riversky.yanmo.actiontype.state.e6.state;

import cn.riversky.yanmo.actiontype.state.e6.context.StateMachine;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public interface State {
    /**
     * 执行状态对应的功能处理
     * @param ctx 上下文的实例对象
     */
    public void doWork(StateMachine ctx);
}

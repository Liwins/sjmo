package cn.riversky.yanmo.actiontype.state.e6.context;

import cn.riversky.yanmo.actiontype.state.e6.state.State;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class StateMachine {
    private State state=null;
    /**
     * 包含流程处理需要的业务数据对象，不知道具体类型,
     * 用Object，反正只是传递到具体的状态对象里面
     */
    private Object businessVO = null;
    public void doWork(){
        //转调相应的状态对象真正完成功能处理
        this.state.doWork(this);
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public Object getBusinessVO() {
        return businessVO;
    }
    public void setBusinessVO(Object businessVO) {
        this.businessVO = businessVO;
    }
}

package cn.riversky.actiontype.state.e6;

import cn.riversky.actiontype.state.e6.context.LeaveRequestContext;
import cn.riversky.actiontype.state.e6.dto.LeaveRequestModel;
import cn.riversky.actiontype.state.e6.state.ProjectManagerState;

/**
 * 工作流模型
 * 其实这里例子感觉就是一堆 state在根据day摆弄result
 * 注意业务流程
 * 特点，设置状态，重新执行dowork
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class Client {
    public static void main(String[] args) {
        //创建业务对象，并设置业务数据
        LeaveRequestModel lrm = new LeaveRequestModel();
        lrm.setUser("小李");
        lrm.setBeginDate("2010-02-08");
        lrm.setLeaveDays(9);

        //创建上下文对象
        LeaveRequestContext request = new LeaveRequestContext();
        //为上下文对象设置业务数据对象
        request.setBusinessVO(lrm);
        //配置上下文，作为开始的状态，以后就不管了
        request.setState(new ProjectManagerState());

        //请求上下文，让上下文开始处理工作
        request.doWork();
    }
}

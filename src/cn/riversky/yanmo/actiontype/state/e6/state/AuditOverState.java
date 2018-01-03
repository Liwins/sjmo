package cn.riversky.yanmo.actiontype.state.e6.state;

import cn.riversky.yanmo.actiontype.state.e6.context.StateMachine;
import cn.riversky.yanmo.actiontype.state.e6.dto.LeaveRequestModel;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class AuditOverState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine ctx) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel)ctx.getBusinessVO();

        //业务处理，在数据里面记录整个流程结束
        System.out.println(lrm.getUser()+"，你的请假申请已经审核结束，结果是："+lrm.getResult());
    }
}

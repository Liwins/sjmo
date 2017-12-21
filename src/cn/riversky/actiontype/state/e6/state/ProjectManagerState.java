package cn.riversky.actiontype.state.e6.state;

import cn.riversky.actiontype.state.e6.context.StateMachine;
import cn.riversky.actiontype.state.e6.dto.LeaveRequestModel;

import java.util.Scanner;

/**
 * 项目经理审核，
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class ProjectManagerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine ctx) {
        //先把业务对象造型回来
        LeaveRequestModel lrm= (LeaveRequestModel) ctx.getBusinessVO();
        System.out.println("项目经理审核中，请稍候......");

        //模拟用户处理界面，通过控制台来读取数据
        System.out.println(lrm.getUser()+"申请从"+lrm.getBeginDate()+
                "开始请假"+lrm.getLeaveDays()+"天,请项目经理审核(1为同意，2为不同意)：");
        //读取从控制台输入的数据
        Scanner scanner = new Scanner(System.in);

        //根据选择的结果和条件来设置下一步
        if(1==scanner.nextInt()){
            lrm.setResult("同意");
            if(lrm.getLeaveDays()>3){
                //部门经理处理
                ctx.setState(new DepManagerState());
                ctx.doWork();
            }else {
                ctx.setState(new AuditOverState());
                ctx.doWork();
            }
        }else {
            lrm.setResult("不同意");
            ctx.setState(new AuditOverState());
            ctx.doWork();
        }
    }
}

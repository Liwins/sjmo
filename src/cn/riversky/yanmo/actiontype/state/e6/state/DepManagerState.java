package cn.riversky.yanmo.actiontype.state.e6.state;

import cn.riversky.yanmo.actiontype.state.e6.context.StateMachine;
import cn.riversky.yanmo.actiontype.state.e6.dto.LeaveRequestModel;

import java.util.Scanner;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class DepManagerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine ctx) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel)ctx.getBusinessVO();


        //部门经理审核过后，直接转向审核结束状态了
        System.out.println("部门经理审核中，请稍候......");

        //模拟用户处理界面，通过控制台来读取数据
        System.out.println(lrm.getUser()+"申请从"+lrm.getBeginDate()+
                "开始请假"+lrm.getLeaveDays()+"天,请部门经理审核(1为同意，2为不同意)：");
        //读取从控制台输入的数据
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            int a = scanner.nextInt();
            //设置回到上下文中
            String result = "不同意";
            if(a==1){
                result = "同意";
            }
            lrm.setResult("部门经理审核结果："+result);
            //部门经理审核过后，直接转向审核结束状态了
            ctx.setState(new AuditOverState());
            //继续执行下一步工作
            ctx.doWork();
        }

        //给申请人增加一个工作，让他察看审核结果
    }
}

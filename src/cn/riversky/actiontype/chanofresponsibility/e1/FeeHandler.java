package cn.riversky.actiontype.chanofresponsibility.e1;

/**
 * 聚餐处理
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class FeeHandler {
    /**
     * 提交聚餐申请
     * @param user 申请人
     * @param fee   申请金额
     * @return
     */
    public String handleFee(String user,double fee){
        String str="";
        if(fee<500){
            str=projectHandle(user,fee);
        }else if (fee<1000){
            str=depManaegHandle(user,fee);
        }else {
            str=generalManaegHandle(user,fee);
        }
        return str;
    }

    /**
     * 项目经理处理
     * @param user
     * @param fee
     * @return
     */
    public  String projectHandle(String user,double fee){
        String str="";
        if("小李".equals(user)){
            str+="项目经理同意："+user+"--费用："+fee;
        }else {
            //其他人不同意
            str+="项目经理不同意："+user+"--费用："+fee;
        }
        return  str;
    }

    /**
     * 部门经理处理
     * @param user
     * @param fee
     * @return
     */
    public  String depManaegHandle(String user,double fee){
        String str="";
        if("小李".equals(user)){
            str+="部门经理同意："+user+"--费用："+fee;
        }else {
            //其他人不同意
            str+="部门经理不同意："+user+"--费用："+fee;
        }
        return  str;
    }

    /**
     * 总经理处理
     * @param user
     * @param fee
     * @return
     */
    public  String generalManaegHandle(String user,double fee){
        String str="";
        if("小李".equals(user)){
            str+="总经理同意："+user+"--费用："+fee;
        }else {
            //其他人不同意
            str+="总经理不同意："+user+"--费用："+fee;
        }
        return  str;
    }

}

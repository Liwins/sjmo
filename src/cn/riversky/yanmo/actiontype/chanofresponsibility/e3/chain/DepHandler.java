package cn.riversky.yanmo.actiontype.chanofresponsibility.e3.chain;

/**
 * 部门经理的责任链
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class DepHandler extends Handler {
    @Override
    public String handleFee(String user, double fee) {
        String str="";
        if(fee<1000&&fee>500){
            if("小李".equals(user)){
                str="部门经理同意"+user+"----费用："+fee;
            }else {
                str="部门经理不同意"+user+"----费用："+fee;
            }
        }else {
            if(handle!=null){
                str=handle.handleFee(user,fee);
            }
        }
        return str;

    }
}

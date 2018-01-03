package cn.riversky.yanmo.actiontype.chanofresponsibility.e4.chain;

/**
 * 责任链中的项目经理
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class ProjectHandler extends Handler {
    @Override
    public String handleFee(String user, double fee) {
        String str="";
        if(fee<500&&fee>0){
            if("小李".equals(user)){
                str="项目经理同意"+user+"----费用："+fee;
            }else {
                str="项目经理不同意"+user+"----费用："+fee;
            }
        }else {
            if(handle!=null){
                str=handle.handleFee(user,fee);
            }
        }
        return str;
    }

    @Override
    public boolean visitFee(String user, double fee) {
        if(fee<1000){
            System.out.println("项目经理统一"+user+"---差旅费:"+fee);
            return true;
        }else {
            if (handle!=null){
                handle.visitFee(user,fee);
            }
        }
        return false;

    }
}

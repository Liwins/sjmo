package cn.riversky.actiontype.chanofresponsibility.e5.chain;

import cn.riversky.actiontype.chanofresponsibility.e5.model.EatFeeRequestModel;
import cn.riversky.actiontype.chanofresponsibility.e5.model.RequestModel;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class Generalmanager extends Handler {
    @Override
    public Object handleRequest(RequestModel rm) {
        if(EatFeeRequestModel.FEE_TYPE.equals(rm.getType())){
            return eatHandler(rm);
        }else {
            return super.handleRequest(rm);
        }

    }

    private Object eatHandler(RequestModel rm) {
        EatFeeRequestModel efrm= (EatFeeRequestModel) rm;
        String str="";
        if(efrm.getFee()>1000){
            //为了测试，简单点，只同意小李的
            if("小李".equals(efrm.getUser())){
                str = "总经理同意"+efrm.getUser()+"聚餐费用"+efrm.getFee()+"元的请求";
            }else{
                //其他人一律不同意
                str = "总经理不同意"+efrm.getUser()+"聚餐费用"+efrm.getFee()+"元的请求";
            }
            return str;
        }else {
            if(handler!=null){

                return handler.handleRequest(rm);
            }
        }

        return str;
    }
}

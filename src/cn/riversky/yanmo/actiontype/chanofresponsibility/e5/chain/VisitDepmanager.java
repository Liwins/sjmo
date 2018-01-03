package cn.riversky.yanmo.actiontype.chanofresponsibility.e5.chain;

import cn.riversky.yanmo.actiontype.chanofresponsibility.e5.model.RequestModel;
import cn.riversky.yanmo.actiontype.chanofresponsibility.e5.model.VisitFeeRequestModel;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class VisitDepmanager extends Handler {
    @Override
    public Object handleRequest(RequestModel rm) {
        if(VisitFeeRequestModel.FEE_TYPE.equals(rm.getType())){
            //处理差旅类型
            return handlerEatRequest(rm);
        }else {
            //不处理
            return super.handleRequest(rm);
        }

    }

    private Object handlerEatRequest(RequestModel rm) {
        VisitFeeRequestModel erm= (VisitFeeRequestModel) rm;
        String str="";
        if(erm.getFee()<5000){
            //为了测试，简单点，只同意小李的
            if("小李".equals(erm.getUser())){
                str = "部门经理同意"+erm.getUser()+"差旅费用"+erm.getFee()+"元的请求";
            }else{
                //其他人一律不同意
                str = "部门经理不同意"+erm.getUser()+"差旅费用"+erm.getFee()+"元的请求";
            }
            return str;
        }else {
            if(handler!=null){
                //自己无权利，交给上机
                return handler.handleRequest(rm);
            }
        }
        return str;
    }
}

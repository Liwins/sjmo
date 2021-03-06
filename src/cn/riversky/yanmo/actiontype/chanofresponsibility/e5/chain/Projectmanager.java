package cn.riversky.yanmo.actiontype.chanofresponsibility.e5.chain;

import cn.riversky.yanmo.actiontype.chanofresponsibility.e5.model.EatFeeRequestModel;
import cn.riversky.yanmo.actiontype.chanofresponsibility.e5.model.RequestModel;

/**
 * 实现项目经理处理聚餐费用申请的对象
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class Projectmanager extends Handler {
    @Override
    public Object handleRequest(RequestModel rm) {
        if(EatFeeRequestModel.FEE_TYPE.equals(rm.getType())){
            //表示聚餐费用申请
            return handleFeeRequest(rm);
        }else {
            //其他项目经i了暂时不想处理
            return super.handleRequest(rm);
        }
    }

    private Object handleFeeRequest(RequestModel rm) {
        //构造通用对象
        EatFeeRequestModel frm= (EatFeeRequestModel) rm;
        String str="";
        //只能批复<500
        if(frm.getFee()<500){
            //为了测试，简单点，只同意小李的
            if("小李".equals(frm.getUser())){
                str = "项目经理同意"+frm.getUser()+"聚餐费用"+frm.getFee()+"元的请求";
            }else{
                //其他人一律不同意
                str = "项目经理不同意"+frm.getUser()+"聚餐费用"+frm.getFee()+"元的请求";
            }
            return str;
        }else {
            if(this.handler!=null){
                return handler.handleRequest(rm);
            }
        }
        return str;
    }

}

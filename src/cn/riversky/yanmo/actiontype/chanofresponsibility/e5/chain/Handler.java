package cn.riversky.yanmo.actiontype.chanofresponsibility.e5.chain;

import cn.riversky.yanmo.actiontype.chanofresponsibility.e5.model.RequestModel;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public abstract class Handler {
    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
    public Object handleRequest(RequestModel rm){
        if(handler!=null){
            return this.handler.handleRequest(rm);
        }else{
            System.out.println("无后续处理");
            return false;
        }
    }
}

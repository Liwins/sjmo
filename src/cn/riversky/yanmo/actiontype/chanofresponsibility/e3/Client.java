package cn.riversky.yanmo.actiontype.chanofresponsibility.e3;

import cn.riversky.yanmo.actiontype.chanofresponsibility.e3.chain.DepHandler;
import cn.riversky.yanmo.actiontype.chanofresponsibility.e3.chain.GeneralHandler;
import cn.riversky.yanmo.actiontype.chanofresponsibility.e3.chain.Handler;
import cn.riversky.yanmo.actiontype.chanofresponsibility.e3.chain.ProjectHandler;

/**
 * 采用组合链（外部链进行设计）
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class Client {
    public static void main(String[] args) {
        //组合链
        Handler handler=new ProjectHandler();
        Handler handler1=new DepHandler();
        Handler handler2=new GeneralHandler();
        handler.setHandle(handler1);
        handler1.setHandle(handler2);
        //处理业
        System.out.println(handler.handleFee("小李",300));
        System.out.println(handler.handleFee("小张",300));
        System.out.println(handler.handleFee("小李",800));
        System.out.println(handler.handleFee("小张",800));
        System.out.println(handler.handleFee("小李",9000));
        System.out.println(handler.handleFee("小张",9000));


    }
}

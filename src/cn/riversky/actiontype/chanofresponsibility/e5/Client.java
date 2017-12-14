package cn.riversky.actiontype.chanofresponsibility.e5;

import cn.riversky.actiontype.chanofresponsibility.e5.chain.*;
import cn.riversky.actiontype.chanofresponsibility.e5.model.EatFeeRequestModel;
import cn.riversky.actiontype.chanofresponsibility.e5.model.VisitFeeRequestModel;

/**
 * 这里采用细粒度的链模式，将不同的业务分开处理
 *
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class Client {
    public static void main(String[] args) {
        //先要组装职责链
        Handler handler=new VisitPromanager();
        Handler handler1=new VisitDepmanager();
        Handler handler2=new VisitGeneralmanager();
        handler.setHandler(handler1);
        handler1.setHandler(handler2);
        //测试差旅非
        VisitFeeRequestModel rm=new VisitFeeRequestModel();
        rm.setUser("小李");
        rm.setFee(9000);
        System.out.println(handler.handleRequest(rm));
        rm.setFee(100);
        System.out.println(handler.handleRequest(rm));
        rm.setFee(1000);
        System.out.println(handler.handleRequest(rm));

        //组装
        handler=new Projectmanager();
        handler1=new Depmanager();
        handler2=new Generalmanager();
        handler.setHandler(handler1);
        handler1.setHandler(handler2);
        EatFeeRequestModel rm1=new EatFeeRequestModel();
        rm1.setUser("小李");
        rm1.setFee(100);
        System.out.println(handler.handleRequest(rm1));
        rm1.setFee(600);
        System.out.println(handler.handleRequest(rm1));
        rm1.setFee(12000);
        System.out.println(handler.handleRequest(rm1));

    }
}

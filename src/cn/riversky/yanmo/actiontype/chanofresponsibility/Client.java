package cn.riversky.yanmo.actiontype.chanofresponsibility;

import cn.riversky.yanmo.actiontype.chanofresponsibility.e2.ConcreteHandle1;
import cn.riversky.yanmo.actiontype.chanofresponsibility.e2.ConcreteHandle2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 组装职责链
         */
        ConcreteHandle1 handle1=new ConcreteHandle1();
        ConcreteHandle2 handle2=new ConcreteHandle2();
        handle1.setHandle(handle2);
        /**
         * 真正的处理
         */
        handle1.handle();
    }
}

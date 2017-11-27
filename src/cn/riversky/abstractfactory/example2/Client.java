package cn.riversky.abstractfactory.example2;

import cn.riversky.abstractfactory.example2.factory.AbstractFactory;
import cn.riversky.abstractfactory.example2.factory.ConcreateFactory2;

/**
 * Created by admin on 2017/11/27.
 */
public class Client {
    /**
     * 这种方式主要是提供按照设计者的思想创建，该系列的对象
     * @param args
     */
    public static void main(String[] args) {
        AbstractFactory factory=new ConcreateFactory2();
        factory.createProductA();
        factory.createProductB();
    }
}

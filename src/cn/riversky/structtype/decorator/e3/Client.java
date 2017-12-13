package cn.riversky.structtype.decorator.e3;

import cn.riversky.structtype.decorator.e3.decor.Decorator;
import cn.riversky.structtype.decorator.e3.decor.DecoratorA;
import cn.riversky.structtype.decorator.e3.decor.DecoratorB;

/**
 * Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {
        //对A实现日志增强
        Component component=new ConcreateCompontA();
        Decorator decorator=new DecoratorA(component);
        decorator.operation();
        //对a实现数据库增强
        decorator=new DecoratorB(component);
        decorator.operation();
    }
}

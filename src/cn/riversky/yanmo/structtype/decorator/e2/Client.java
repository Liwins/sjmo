package cn.riversky.yanmo.structtype.decorator.e2;

/**
 * 装饰者模式，主要是借助类的组合实现继承效果，这也是设计模式中比较推荐的
 * Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {
        C1 c1=new C1();
        c1.a1();
        //组合方式实现继承
        C2 c2=new C2();
        c2.a1();
        //多继承效果
        C3 c3=new C3();
        c3.b1();
        //多继承效果中的类，构造方式是自定义的。
        C4 c4=new C4();
        c4.setB(new B());
        c4.b1();
    }
}

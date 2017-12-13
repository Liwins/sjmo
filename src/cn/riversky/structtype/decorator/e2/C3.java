package cn.riversky.structtype.decorator.e2;

/**
 * 通过组合实现多继承的效果
 * Created by admin on 2017/12/8.
 */
public class C3 {
    private A a=new A();
    private B b=new B();
    public void a1(){
        //转调A对象的功能
        a.a1();
    }
    public void b1(){
        //转调B对象的功能
        b.b1();
    }
    public void c(){
        System.out.println("c by c3");
    }
}

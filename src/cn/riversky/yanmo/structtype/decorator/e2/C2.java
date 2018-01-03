package cn.riversky.yanmo.structtype.decorator.e2;

/**
 * 通过组合方式，实现A功能的扩展
 * Created by admin on 2017/12/8.
 */
public class C2 {
    private A a=new A();
    public void a1(){
        a.a1();
    }
    public void c(){
        System.out.println("c功能by c2");
    }
}

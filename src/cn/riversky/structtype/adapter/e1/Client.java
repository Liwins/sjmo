package cn.riversky.structtype.adapter.e1;

/**
 * Created by admin on 2017/12/4.
 */
public class Client {
    public static void main(String[] args) {
//        创建老的对象
        Adaptee adaptee=new Adaptee();
//        使用新的接口对老的对象进行适配
        Target target=new Adapter(adaptee);
//        老对象的使用
        target.request();
    }
}

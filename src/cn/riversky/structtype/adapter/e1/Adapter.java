package cn.riversky.structtype.adapter.e1;

/**
 * 其实就是按照新的接口规范，将老的方法名称重新定义成新的类进行方法名重定义
 * Created by admin on 207/12/4.
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

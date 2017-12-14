package cn.riversky.actiontype.chanofresponsibility.e3.chain;


/**
 * 连模式的基础抽象类，定义处理接口，以及自身的传递set引用（在组合链中其联系上下的作用）
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public abstract class Handler {
    protected Handler handle;

    public void setHandle(Handler handle) {
        this.handle = handle;
    }
    public abstract String handleFee(String user,double fee);
}

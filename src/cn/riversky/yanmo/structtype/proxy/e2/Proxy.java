package cn.riversky.yanmo.structtype.proxy.e2;

/**
 * 代理对象
 *  @author Created by admin on 2017/12/12.
 */
public class Proxy implements Subject{
    /**
     * 被代理的目标对象
     */
    private ConcreterSubject realsubject=null;

    /**
     * 构造方法传入被代理的对象
     * @param realsubject
     */
    public Proxy(ConcreterSubject realsubject) {
        this.realsubject = realsubject;
    }

    /**
     * 屏蔽其他的接口实现，只能够使用request(接口中定义的)
     */
    @Override
    public void request() {
        //前置功能
        realsubject.request();
        //后置功能
    }
}

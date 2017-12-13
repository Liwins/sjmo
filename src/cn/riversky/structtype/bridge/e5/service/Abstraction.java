package cn.riversky.structtype.bridge.e5.service;

import cn.riversky.structtype.bridge.e5.service.interfac.Implementor;

/**
 * 有像抽象工厂，但是这里的实现是通过客户端传入的
 * Created by admin on 2017/12/5.
 */
public abstract class Abstraction {
    protected Implementor impl;

    public Abstraction(Implementor impl) {
        this.impl = impl;
    }
    public void operation(){
        impl.oprationImpl();
    }
}

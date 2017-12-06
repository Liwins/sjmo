package cn.riversky.bridge.e5.service;

import cn.riversky.bridge.e5.service.interfac.Implementor;

/**
 * Created by admin on 2017/12/5.
 */
public class AbsractionIm extends Abstraction {
    public AbsractionIm(Implementor impl) {
        super(impl);
    }
    public void operation(){
        super.operation();
    }
}

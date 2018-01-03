package cn.riversky.yanmo.structtype.bridge.e5.service;

import cn.riversky.yanmo.structtype.bridge.e5.service.interfac.Implementor;

/**
 * Created by admin on 2017/12/5.
 */
public class AbsractionIm extends Abstraction {
    public AbsractionIm(Implementor impl) {
        super(impl);
    }
    @Override
    public void operation(){
        super.operation();
    }
}

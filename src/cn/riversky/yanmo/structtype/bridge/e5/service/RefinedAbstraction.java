package cn.riversky.yanmo.structtype.bridge.e5.service;

import cn.riversky.yanmo.structtype.bridge.e5.service.interfac.Implementor;

/**
 * Created by admin on 2017/12/5.
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }
    /**
     * 示例操作，实现一定的功能，可能会使用具体实现部分的实现方法，
     * 但是本方法更大的可能是使用Abstraction中定义的方法，
     * 通过组合使用Abstraction中定义的方法来完成更多的功能
     */
    public void otherOperation(){
        //
    }
}

package cn.riversky.yanmo.structtype.decorator.e6.decorator;

import cn.riversky.yanmo.structtype.decorator.e6.base.Sail;

/**
 * Created by admin on 2017/12/13.
 */
public abstract class DecoratorAbstract implements Sail {
    protected  Sail sail=null;

    public DecoratorAbstract(Sail sail) {
        this.sail = sail;
    }
}

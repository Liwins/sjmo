package cn.riversky.actiontype.templatemethod.e3;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public abstract class AbstractClass {
    /**
     * 定义算法骨架
     */
    public final void templateMethod(){
        oneStep();
        twoStep();
    }

    /**
     * 原语操作2
     */
    protected abstract void twoStep();
    protected abstract void oneStep();
}

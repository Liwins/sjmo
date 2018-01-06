package cn.riversky.gitbook.action.responchain;

/**
 * 主任<3
 * 经理<10
 * 总经理<30
 * >30不批准
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/6.
 */
public abstract class ShenPi {
    protected ShenPi shenPi;

    public void setShenPi(ShenPi shenPi) {
        this.shenPi = shenPi;
    }
    abstract void dealShen(QingJiaModel model);
}

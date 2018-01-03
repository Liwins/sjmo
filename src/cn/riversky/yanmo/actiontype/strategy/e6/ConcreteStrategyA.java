package cn.riversky.yanmo.actiontype.strategy.e6;

/**
 * 实现模版方法中的特殊流程A
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class ConcreteStrategyA extends AbstractClass {
    @Override
    protected void stepOneOpe() {
        System.out.println("A       第一步骤");

    }

    @Override
    protected void stepTwoOpe() {
        System.out.println("A          第二步骤");

    }
}

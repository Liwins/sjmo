package cn.riversky.actiontype.strategy.e6;

/**
 * 实现模版方法中的特殊流程B
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class ConcreteStrategyB extends AbstractClass {
    @Override
    protected void stepOneOpe() {
        System.out.println("B           第一步骤");

    }

    @Override
    protected void stepTwoOpe() {
        System.out.println("B             第二步骤");
    }
}

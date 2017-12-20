package cn.riversky.actiontype.strategy.e3;

/**
 * 策略模式
 * Strategy：策略接口，定义不同的策略
 * StrategyImpl,ConcreteStrategyA：策略实现，定义不同的策略实现
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class Clent {
    public static void main(String[] args) {
        Strategy strategy=new ConcreteStrategyA();
        Context context=new Context(strategy);
        context.conteInterface();
    }
}

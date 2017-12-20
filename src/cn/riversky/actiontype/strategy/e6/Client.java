package cn.riversky.actiontype.strategy.e6;

import cn.riversky.actiontype.strategy.e6.context.Context;

/**
 * 使用模版方法和策略模式结合
 * strategy：策略结构
 * AbstractClass:策略实现+template抽象类
 * conA conB：template的具体细节
 * context：策略模式的上下文
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class Client {
    public static void main(String[] args) {
        Strategy a=new ConcreteStrategyB();
//        Strategy a=new ConcreteStrategyA();
        Context context=new Context(a);
        context.contextInterface();
    }
}

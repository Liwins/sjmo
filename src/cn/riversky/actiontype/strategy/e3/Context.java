package cn.riversky.actiontype.strategy.e3;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下问对客户端提供的操作接口，可以有参数和返回值
     */
    public void conteInterface(){
//        进行具体的策略
        strategy.algorithmInterface();
    }
}

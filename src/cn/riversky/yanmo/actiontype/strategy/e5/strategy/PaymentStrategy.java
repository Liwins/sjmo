package cn.riversky.yanmo.actiontype.strategy.e5.strategy;

import cn.riversky.yanmo.actiontype.strategy.e5.context.PaymentContext;

/**
 * 支付工资的策略的接口，公司有多种支付工资的算法
 * 比如：现金、银行卡、现金加股票、现金加期权、美元支付等等
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public interface PaymentStrategy {
    /**
     * 公司给某人真正支付工资
     * @param ctx 支付工资的上下文，里面包含算法需要的数据
     */
    public void pay(PaymentContext ctx);
}

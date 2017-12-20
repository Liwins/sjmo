package cn.riversky.actiontype.strategy.e5.strategy;

import cn.riversky.actiontype.strategy.e5.context.PaymentContext;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class RMBCash implements PaymentStrategy {
    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给"+ctx.getUserName()+"人民币现金支付"+ctx.getMoney()+"元");
    }
}

package cn.riversky.actiontype.strategy.e5.context;

import cn.riversky.actiontype.strategy.e5.strategy.PaymentStrategy;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class PaymentContext2 extends PaymentContext {
    /**
     * 银行帐号
     */
    private String account = null;
    /**
     * 构造方法，传入被支付工资的人员，应支付的金额和具体的支付策略
     *
     * @param userName 被支付工资的人员
     * @param money    应支付的金额
     * @param strategy 具体的支付策略
     */
    public PaymentContext2(String userName, double money,String account, PaymentStrategy strategy) {
        super(userName, money, strategy);
        this.account=account;
    }
    public String getAccount() {
        return account;
    }

}

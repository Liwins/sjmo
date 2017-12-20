package cn.riversky.actiontype.strategy.e5;

import cn.riversky.actiontype.strategy.e5.context.PaymentContext;
import cn.riversky.actiontype.strategy.e5.context.PaymentContext2;
import cn.riversky.actiontype.strategy.e5.strategy.*;

/**
 * 这种方式是将context的基本类，在strategy中需要调用（把自己的信息推过去）
 * strategy->paymentStrategy:支付接口
 * strategyImpl->card,card2,dollarcash,rmbcash：支付实现类
 *context-> paymentcontext,payentcontext2:定义是使用策略的对外提供的使用接口
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class Client {
    public static void main(String[] args) {
        //创建相应的支付策略
        PaymentStrategy strategyRMB = new RMBCash();
        PaymentStrategy strategyDollar = new DollarCash();

        //准备小李的支付工资上下文
        PaymentContext ctx1 = new PaymentContext("小李",5000,strategyRMB);
        //向小李支付工资
        ctx1.payNow();

        //切换一个人，给petter支付工资
        PaymentContext ctx2 = new PaymentContext("Petter",8000,strategyDollar);
        ctx2.payNow();

        //测试新添加的支付方式
        PaymentStrategy strategyCard = new Card();
        PaymentContext ctx3 = new PaymentContext2("小王",9000,"010998877656",strategyCard);
        ctx3.payNow();

        //测试新添加的支付方式
        PaymentStrategy strategyCard2 = new Card2("010998877656");
        PaymentContext ctx4 = new PaymentContext("小张",9000,strategyCard2);
        ctx4.payNow();
    }
}

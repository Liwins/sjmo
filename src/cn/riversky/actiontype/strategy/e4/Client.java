package cn.riversky.actiontype.strategy.e4;

/**
 * 该策略模式
 * stategy:策略接口
 * StategyImpl->CooperateCustormerStrage,Large,Normal,Old:策略实现类,代表四种策略
 * context->price:上下文，使用策略者（具有属性接口，构造传入策略接口）
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class Client {
    public static void main(String[] args) {
        //1：选择并创建需要使用的策略对象
        Strategy strategy = new OldCustomerStrategy();

        //2：创建上下文
        Price ctx = new Price(strategy);

        //3：计算报价
        double quote = ctx.quote(1000);
        System.out.println("向客户报价："+quote);

        Strategy strategy1 = new CooperateCustomerStrategy();
        ctx=new Price(strategy1);
        //3：计算报价
        double quote2 = ctx.quote(1000);
        System.out.println("向客户报价："+quote2);
    }
}

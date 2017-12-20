package cn.riversky.actiontype.strategy.e4;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class CooperateCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于战略合作客户，统一8折");
        return goodsPrice*0.8;
    }
}

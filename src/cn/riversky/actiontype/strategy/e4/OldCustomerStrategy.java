package cn.riversky.actiontype.strategy.e4;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class OldCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于老客户，统一折扣5%");
        return goodsPrice*(1-0.05);
    }
}

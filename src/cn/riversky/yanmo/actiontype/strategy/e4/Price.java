package cn.riversky.yanmo.actiontype.strategy.e4;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class Price {
    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }
    public double quote(double goodPrice){
      return   strategy.calcPrice(goodPrice);
    }
}

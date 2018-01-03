package cn.riversky.yanmo.actiontype.strategy.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class Price {
    private static final String PUTONG="普通客户";
    private static final String DA="大客户";
    private static final String LAO="老客户";

    public double quote(double goodsPrice,String customerType){
        if (DA.equals(customerType)) {
            System.out.println("老客户统一折扣5%");
            goodsPrice*=(1-0.05);
        }else if (LAO.equals(customerType)){
            System.out.println("大客户统一10%");
            goodsPrice*=(1-0.1);
        }else {
            System.out.println("普通客户");
        }
        return goodsPrice;
    }
}

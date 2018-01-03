package cn.riversky.yanmo.actiontype.strategy.e2;

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
            goodsPrice=calcPriceForLarge(goodsPrice);
        }else if (LAO.equals(customerType)){
            goodsPrice=calcPriceForOld(goodsPrice);
        }else {
            goodsPrice=calcPriceForNormal(goodsPrice);
        }
        return goodsPrice;
    }
    /**
     * 为新客户或者是普通客户计算应报的价格
     * @param goodsPrice 商品销售原价
     * @return 计算出来的，应该给客户报的价格
     */
    private double calcPriceForNormal(double goodsPrice){
        System.out.println("对于新客户或者是普通客户，没有折扣");
        return goodsPrice;
    }
    /**
     * 为老客户计算应报的价格
     * @param goodsPrice 商品销售原价
     * @return 计算出来的，应该给客户报的价格
     */
    private double calcPriceForOld(double goodsPrice){
        System.out.println("对于老客户，统一折扣5%");
        return goodsPrice*(1-0.05);
    }
    /**
     * 为大客户计算应报的价格
     * @param goodsPrice 商品销售原价
     * @return 计算出来的，应该给客户报的价格
     */
    private double calcPriceForLarge(double goodsPrice){
        System.out.println("对于大客户，统一折扣10%");
        return goodsPrice*(1-0.1);
    }
}

package cn.riversky.yanmo.actiontype.strategy.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class Clent {
    public static void main(String[] args) {
        Price price=new Price();
        System.out.println(price.quote(12.3,"普通客户"));
        System.out.println(price.quote(12.3,"大客户"));
        System.out.println(price.quote(12.3,"老客户"));
        System.out.println(price.quote(10,"普通客户"));
        System.out.println(price.quote(10,"老客户"));
        System.out.println(price.quote(10,"大客户"));
    }
}

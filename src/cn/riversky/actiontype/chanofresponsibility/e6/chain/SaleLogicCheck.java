package cn.riversky.actiontype.chanofresponsibility.e6.chain;

import cn.riversky.actiontype.chanofresponsibility.e6.model.SaleModel;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class SaleLogicCheck extends SaleHandler{
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //进行数据的逻辑检查，比如检查ID的唯一性，主外键的对应关系等等
        //这里应该检查这种主外键的对应关系，比如销售商品是否存在
        //为了演示简单，直接通过吧

        //如果通过了上面的检测，那就向下继续执行
        return successor.sale(user,customer,saleModel);
    }
}

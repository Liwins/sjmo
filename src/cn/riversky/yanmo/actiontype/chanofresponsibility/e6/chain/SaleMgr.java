package cn.riversky.yanmo.actiontype.chanofresponsibility.e6.chain;

import cn.riversky.yanmo.actiontype.chanofresponsibility.e6.model.SaleModel;

/**
 * 真正处理销售的业务功能的职责对象
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class SaleMgr extends SaleHandler{
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //进行真正的业务逻辑处理
        System.out.println(user+"保存了"+customer+"购买 "+saleModel+" 的销售数据");
        return true;
    }
}

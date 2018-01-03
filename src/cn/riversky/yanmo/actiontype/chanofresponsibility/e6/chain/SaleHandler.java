package cn.riversky.yanmo.actiontype.chanofresponsibility.e6.chain;

import cn.riversky.yanmo.actiontype.chanofresponsibility.e6.model.SaleModel;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public abstract class SaleHandler{
    /**
     * 持有下一个处理请求的对象
     */
    protected SaleHandler successor = null;
    /**
     * 设置下一个处理请求的对象
     * @param successor 下一个处理请求的对象
     */
    public void setSuccessor(SaleHandler successor){
        this.successor = successor;
    }
    /**
     * 处理保存销售信息的请求
     * @param user 操作人员
     * @param customer 客户
     * @param saleModel 销售数据
     * @return 是否处理成功
     */
    public abstract boolean sale(String user,String customer,SaleModel saleModel);
}

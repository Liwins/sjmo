package cn.riversky.structtype.decorator.e6.base;

import cn.riversky.structtype.decorator.e6.model.SailMode;

/**
 * 需要被修饰的类
 *@author  Created by admin on 2017/12/13.
 */
public class SailImpl implements Sail {
    /**
     * 基本操作
     * @param user 操作人员
     * @param customer 客户
     * @param saleModel 销售数据
     * @return
     */
    @Override
    public boolean sale(String user, String customer, SailMode saleModel) {
        System.out.println(user+"保存了"+customer+"购买 "+saleModel+" 的销售数据");
        return true;
    }
}

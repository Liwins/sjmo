package cn.riversky.structtype.decorator.e6.base;

import cn.riversky.structtype.decorator.e6.model.SailMode;

/**
 * 这里是基础的接口在修饰类中需要被组合进去引用
 *@author  Created by admin on 2017/12/13.
 */
public interface Sail {
    /**
     * 保存销售信息，本来销售数据应该是多条，太麻烦了，为了演示，简单点
     * @param user 操作人员
     * @param customer 客户
     * @param saleModel 销售数据
     * @return 是否保存成功
     */
    public boolean sale(String user,String customer,SailMode saleModel);
}

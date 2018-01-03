package cn.riversky.yanmo.createtype.abstractfactory.example5.factory;

import cn.riversky.yanmo.createtype.abstractfactory.example5.dao.OrderDetailDAO;
import cn.riversky.yanmo.createtype.abstractfactory.example5.dao.OrderMainDAO;

/**
 * 这里主要是对两个Dao提供工厂的方法的获取
 * Created by admin on 2017/11/28.
 */
public abstract class DaoFactory {
    /**
     * 创建订单主记录对应的DAO对象
     * @return 订单主记录对应的DAO对象
     */
    public abstract OrderMainDAO createOrderMainDAO();
    /**
     * 创建订单子记录对应的DAO对象
     * @return 订单子记录对应的DAO对象
     */
    public abstract OrderDetailDAO createOrderDetailDAO();
}

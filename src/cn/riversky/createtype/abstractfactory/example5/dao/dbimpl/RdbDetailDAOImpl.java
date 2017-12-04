package cn.riversky.createtype.abstractfactory.example5.dao.dbimpl;

import cn.riversky.createtype.abstractfactory.example5.dao.OrderDetailDAO;

/**
 * Created by admin on 2017/11/28.
 */
public class RdbDetailDAOImpl implements OrderDetailDAO {
    @Override
    public void saveOrderDetail() {
        System.out.println("db 订单详细信息存储-》mysql");
    }
}

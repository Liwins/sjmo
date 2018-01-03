package cn.riversky.yanmo.createtype.abstractfactory.example5.dao.dbimpl;

import cn.riversky.yanmo.createtype.abstractfactory.example5.dao.OrderMainDAO;

/**
 * Created by admin on 2017/11/28.
 */
public class RdbMainDAOImpl implements OrderMainDAO {
    @Override
    public void saveOrderMain() {
        System.out.println("db 订单主要信息存储-》mysql");
    }
}

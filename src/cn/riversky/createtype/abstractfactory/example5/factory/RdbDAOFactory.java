package cn.riversky.createtype.abstractfactory.example5.factory;

import cn.riversky.createtype.abstractfactory.example5.dao.OrderDetailDAO;
import cn.riversky.createtype.abstractfactory.example5.dao.OrderMainDAO;
import cn.riversky.createtype.abstractfactory.example5.dao.dbimpl.RdbDetailDAOImpl;
import cn.riversky.createtype.abstractfactory.example5.dao.dbimpl.RdbMainDAOImpl;

/**
 * Created by admin on 2017/11/28.
 */
public class RdbDAOFactory  extends DaoFactory {
    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new RdbMainDAOImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new RdbDetailDAOImpl();
    }
}

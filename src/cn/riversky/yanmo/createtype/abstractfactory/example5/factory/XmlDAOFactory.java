package cn.riversky.yanmo.createtype.abstractfactory.example5.factory;

import cn.riversky.yanmo.createtype.abstractfactory.example5.dao.OrderDetailDAO;
import cn.riversky.yanmo.createtype.abstractfactory.example5.dao.OrderMainDAO;
import cn.riversky.yanmo.createtype.abstractfactory.example5.dao.xmlimpl.XmlDetailDAOImpl;
import cn.riversky.yanmo.createtype.abstractfactory.example5.dao.xmlimpl.XmlMainlDAOImpl;

/**
 * Created by admin on 2017/11/28.
 */
public class XmlDAOFactory extends DaoFactory {
    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new XmlMainlDAOImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new XmlDetailDAOImpl();
    }
}

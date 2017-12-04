package cn.riversky.createtype.abstractfactory.example5.dao.xmlimpl;

import cn.riversky.createtype.abstractfactory.example5.dao.OrderDetailDAO;

/**
 * Created by admin on 2017/11/28.
 */
public class XmlDetailDAOImpl implements OrderDetailDAO {
    @Override
    public void saveOrderDetail() {
        System.out.println("xml  detail");
    }
}

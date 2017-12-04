package cn.riversky.createtype.abstractfactory.example5.dao.xmlimpl;

import cn.riversky.createtype.abstractfactory.example5.dao.OrderMainDAO;

/**
 * Created by admin on 2017/11/28.
 */
public class XmlMainlDAOImpl implements OrderMainDAO {
    @Override
    public void saveOrderMain() {
        System.out.println("xml main");
    }
}

package cn.riversky.abstractfactory.example5;

import cn.riversky.abstractfactory.example5.dao.OrderDetailDAO;
import cn.riversky.abstractfactory.example5.dao.OrderMainDAO;
import cn.riversky.abstractfactory.example5.factory.DaoFactory;
import cn.riversky.abstractfactory.example5.factory.XmlDAOFactory;

/**
 * Dao的抽象工厂，总结：感觉就是，在原先的基础上，对Dao接口进行了封装，对Dao包里面所有的接口，进行统一的工厂方法获取，
 * 工厂Factory里是接口提供各个Dao的创建接口，各个接口工厂实现工厂Factory
 */
public class Client {
    public static void main(String[] args) {
        DaoFactory df =new XmlDAOFactory();
//        DaoFactory df =new RdbDAOFactory();
        OrderMainDAO mandao=df.createOrderMainDAO();
        OrderDetailDAO detailDAO=df.createOrderDetailDAO();
        mandao.saveOrderMain();
        detailDAO.saveOrderDetail();
    }
}

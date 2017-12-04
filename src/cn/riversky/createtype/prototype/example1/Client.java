package cn.riversky.createtype.prototype.example1;

import cn.riversky.createtype.prototype.example1.base.PersonalOrder;
import cn.riversky.createtype.prototype.example1.server.Server;

/**
 * Created by admin on 2017/11/30.
 */
public class Client {
    public static void main(String[] args) {
        PersonalOrder op=new PersonalOrder();
        op.setCustomerName("张小凡");
        op.setProductId("ADCS123");
        op.setOrderProductNum(1239);
        Server server=new Server();
        server.saveOrder(op);
    }
}

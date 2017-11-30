package cn.riversky.prototype.example1.server;

import cn.riversky.prototype.example1.base.EnterpriseOrder;
import cn.riversky.prototype.example1.base.OrderApi;
import cn.riversky.prototype.example1.base.PersonalOrder;

/**
 * Created by admin on 2017/11/30.
 */
public class Server {
    public static final int MAX_ORDER_NUM=1000;
    public void saveOrder(OrderApi order){
        while (order.getOrderProductNum()>MAX_ORDER_NUM){
            OrderApi newOrder=null;
            if(order instanceof PersonalOrder){
                PersonalOrder oldOrder= (PersonalOrder) order;
               PersonalOrder newOrder2=new PersonalOrder();
                newOrder2.setOrderProductNum(MAX_ORDER_NUM);
                newOrder2.setCustomerName(oldOrder.getCustomerName());
                newOrder2.setProductId(oldOrder.getProductId());
                newOrder=newOrder2;
            }else if(order instanceof EnterpriseOrder){
                //创建相应的订单对象
                EnterpriseOrder e2 = new EnterpriseOrder();
                //然后进行赋值，但是产品数量为1000
                EnterpriseOrder e1 = (EnterpriseOrder)order;
                e2.setEnterpriseName(e1.getEnterpriseName());
                e2.setProductId(e1.getProductId());
                e2.setOrderProductNum(1000);
                //然后再设置给newOrder
                newOrder = e2;
            }
            order.setOrderProductNum(order.getOrderProductNum()-MAX_ORDER_NUM);
            System.out.println("拆分生成订单："+newOrder);
        }
        System.out.println("原始订单："+order);
    }
}

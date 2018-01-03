package cn.riversky.yanmo.createtype.prototype.example3;

import cn.riversky.yanmo.createtype.prototype.example3.clone.EnterpriseOrder;
import cn.riversky.yanmo.createtype.prototype.example3.clone.PersonalOrder;

/**
 * Created by admin on 2017/11/30.
 */
public class Client {
    public static void main(String[] args) {
//创建订单对象，这里为了演示简单，直接new了
        PersonalOrder op = new PersonalOrder();
        //设置订单数据
        op.setOrderProductNum(12925);
        op.setCustomerName("张三");
        op.setProductId("P0001");

        //这里获取业务处理的类，也直接new了，为了简单，连业务接口都没有做
        Server ob = new Server(op);
        //调用业务来保存订单对象
        ob.operate(op);
        EnterpriseOrder op1 = new EnterpriseOrder();
        //设置订单数据
        op1.setOrderProductNum(12925);
        op1.setEnterpriseName("张三");
        op1.setProductId("P0001");

        //这里获取业务处理的类，也直接new了，为了简单，连业务接口都没有做
        Server ob2 = new Server(op1);
        //调用业务来保存订单对象
        ob2.operate(op1);
    }
}

package cn.riversky.structtype.proxy.e6;

/**
 * 使用继承方式实现的代理，主要是通过覆盖set方法进行拦截（不推荐）
 * @author Created by admin on 2017/12/12.
 */
public class Client {
    public static void main(String[] args) {
        //张三先登录系统创建了一个订单
        Order order = new OrderProxy("设计模式",100,"张三");
        System.out.println(order.getOrderNum());
        order.setOrderNum(123,"lisi");
        System.out.println("lisi修改后"+order.getOrderNum());
        order.setOrderNum(123,"张三");
        System.out.println("张三修改后"+order.getOrderNum());
    }
}

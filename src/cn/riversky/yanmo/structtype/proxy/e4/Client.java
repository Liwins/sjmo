package cn.riversky.yanmo.structtype.proxy.e4;

/**
 * 实现权限的拦截（保护代理的实现）
 *  @author Created by lkj on 2017/12/12.
 */
public class Client {
    public static void main(String[] args) {
        OrderApi order=new OrderProxy(new Order("设计模式",100,"张三"));
        System.out.println(order.getOrderNum());
        order.setOrderNum(123,"lisi");
        System.out.println("lisi修改后"+order.getOrderNum());
        order.setOrderNum(123,"张三");
        System.out.println("张三修改后"+order.getOrderNum());
    }
}

package cn.riversky.proxy.e5;


/**
 * 实现权限的拦截（动态代理的实现）
 * 注意动态代理的关键部分
 * 1实现invokeHandler接口
 * 2内部具有被代理的类 ,并使用类似工厂方法的方式的生成 Proxy.newProxyInstance(classloader,interface,this)
 * 3接口实现（主要根据方法名进行拦截实现自己的操作）
 * Created by admin on 2017/12/12.
 */
public class Client {
    public static void main(String[] args) {
//        OrderApi order=new OrderProxy(new Order("设计模式",100,"张三"));
        Order orde1=new Order("shejimoshi",100,"张三");
        OrderApi order=new DynamicProxy().getInstance(orde1);
        System.out.println(order.getOrderNum());
        order.setOrderNum(123,"lisi");
        System.out.println("lisi修改后"+order.getOrderNum());
        order.setOrderNum(123,"张三");
        System.out.println("张三修改后"+order.getOrderNum());
    }
}

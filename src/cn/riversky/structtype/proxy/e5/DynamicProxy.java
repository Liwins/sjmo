package cn.riversky.structtype.proxy.e5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用动态代理需要实现InvocationHandler接口
 *  @author Created by admin on 2017/12/12.
 */
public class DynamicProxy implements InvocationHandler{
    private static final String LANJIE="set";
    private Order order;

    public OrderApi getInstance(Order order) {
        this.order = order;
        //把真正的订单对象和动态代理关联起来
        //使用Proxy，创建实现类，创建的时候需要传入classloader,接口，代理类
        OrderApi orderApi= (OrderApi) Proxy.newProxyInstance(order.getClass().getClassLoader(),order.getClass().getInterfaces(),this);
        return orderApi;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        这里仅仅对setter方法进行拦截检查
        if(method.getName().startsWith(LANJIE)){
            if(order.getOrderUser()!=null&&order.getOrderUser().equals(args[1])){
                return method.invoke(order,args);
            }else {
                System.out.println(args[1]+"无权操作"+order.getOrderUser()+"的数据");
            }
        }else{
            //其他的不拦截
            return method.invoke(order);
        }
        return null;
    }
}

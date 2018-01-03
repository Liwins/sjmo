package cn.riversky.yanmo.structtype.proxy.e7;

/**
 * cglib动态代理(创建成本比jdk高，性能比jdk的好，单例数量少的对象可以用该方式)
 * 这是一种字节码的动态代理生成技术，因此，一般用作aop时候比较方便，因为不需要接口的定义。
 * 使用要点
 * 1实现MethodInterceptor
 * 2工厂方法返回代理类，返回的是内部Enhancer.setSuperclass(clazz);.setCallback(this)的增前类，增前类为内部引用
 * 3覆盖的接口方法，一般基于方法名称，进行拦截返回 Object result=methodProxy.invokeSuper(o,objects);
 * Created by admin on 2017/12/12.
 * @author lkj
 */
public class Client {
    public static void main(String[] args) {
        Order order= (Order) new OrderCglib().getProxy(Order.class);
        order.setProductName("shang","lisi");
        System.out.println(order.getProductName());
        order.setOrderNum(123,"zhangsan");
    }
}

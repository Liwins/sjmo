package cn.riversky.gitbook.singleton.e1;

/**
 * 单例模式
 * 1懒汉式
 * 2饿汉式
 * 3IoDH(Initialization Demand Holder)技术
 * 单例模式缺点
 * 1没有抽象层，扩展比较难
 * 2违背单一职责原则
 * 3自动回收技术使得自动销毁并回收，导致共享的单例对象状态丢失。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class Client {
    public static void main(String[] args) {
        LoadBalancer loadBalancer,loadBalancer1,loadBalancer2,loadBalancer3;
        loadBalancer=LoadBalancer.getLoadBalancer();
        loadBalancer2=LoadBalancer.getLoadBalancer();
        loadBalancer1=LoadBalancer.getLoadBalancer();
        loadBalancer3=LoadBalancer.getLoadBalancer();
        if(loadBalancer==loadBalancer1&&loadBalancer2==loadBalancer3&&loadBalancer==loadBalancer2){
            System.out.println("服务器负载均衡具有唯一性");
        }
        loadBalancer.addServer("server 1");
        loadBalancer.addServer("server 2");
        loadBalancer.addServer("server 3");
        loadBalancer.addServer("server 4");
        for (int i=0;i<10;i++){
            String server=loadBalancer.getServer();
            System.out.println("分发请求->"+server);
        }
    }
}

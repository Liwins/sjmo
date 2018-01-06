package cn.riversky.gitbook.creatType.sigleton.e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class LoadBalancer {
    private static LoadBalancer loadBalancer;
    private List<String> servers;

    private LoadBalancer() {
       servers=new ArrayList<>();
    }

    /**
     * 双重判定防止构造多实例
     *     public synchronized  static LoadBalancer getLoadBalancer(){
     * @return
     */

    public   static LoadBalancer getLoadBalancer(){
        if(loadBalancer==null){
            synchronized (LoadBalancer.class){
                if(loadBalancer==null){
                    loadBalancer=new LoadBalancer();
                }
            }
        }
        return loadBalancer;
    }
    public void addServer(String server){
        servers.add(server);
    }
    public void removeServer(String server){
        servers.remove(server);
    }
    public String getServer(){
        Random random=new Random();
        int i=random.nextInt(servers.size());
        return servers.get(i);
    }

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

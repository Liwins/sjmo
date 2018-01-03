package cn.riversky.gitbook.singleton.e1;

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
}

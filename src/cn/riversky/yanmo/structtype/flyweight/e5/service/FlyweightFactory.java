package cn.riversky.yanmo.structtype.flyweight.e5.service;

import cn.riversky.yanmo.structtype.flyweight.e5.model.CacheConfModel;
import cn.riversky.yanmo.structtype.flyweight.e5.model.UserResource;

import java.util.*;

/**
 * Created by admin on 2017/12/11.
 */
public class FlyweightFactory {
    private static final FlyweightFactory FACTORY=new FlyweightFactory();
    private FlyweightFactory(){
//启动清除缓存值的线程

        Thread t = new Thread(new  ClearCache());
        t.start();
    }
    public static FlyweightFactory getInstance(){
        return FACTORY;
    }
    //缓存
    private Map<String,Flyweight> flymap=new HashMap<>();
    /**
     * 配置map中的缓存配置
     */
    private Map<String,CacheConfModel> cacheConfModelMap=new HashMap<String,CacheConfModel>();
    /**
     *  采用引用技术的方式对map中的key进行计数
     */
    private Map<String ,Integer> countMap=new HashMap<String,Integer>();
    /**
     * 默认保存6秒钟，主要为了测试方便，这个时间可以根据应用的要求设置，比如30分钟
     */
    private final  long DURABLE_TIME = 6*1000L;
    public synchronized int getUseTimes(String key){
        Integer res=countMap.get(key);
        if(res==null){
            res=0;
        }
        return res;
    }
    //生成认证的类（享元类---只存放可缓存的）
    public synchronized Flyweight getFlyweight(UserResource user){
        Flyweight f=flymap.get(user.toString());
        if(f==null){
            f=new AuthorzationFlyweight(user);
            countMap.put(user.toString(),1);
            CacheConfModel conf=new CacheConfModel();
            conf.setBeginTime(System.currentTimeMillis());
            conf.setDurableTime(DURABLE_TIME);
            conf.setForever(false);
            cacheConfModelMap.put(user.toString(),conf);
            flymap.put(user.getName(),f);
        }else{
            CacheConfModel ccm=cacheConfModelMap.get(user.toString());
            ccm.setBeginTime(System.currentTimeMillis());
            cacheConfModelMap.put(user.toString(),ccm);
            Integer coun=countMap.get(user.toString());
            countMap.put(user.toString(),coun++);
        }
        return f;
    }
    /**
     * 删除key对应的享元对象，连带清除对应的缓存配置和引用次数的记录，不对外
     * @param key 要删除的享元对象的key
     */
    private synchronized void removeFlyweight(String key){
        flymap.remove(key);
        cacheConfModelMap.remove(key);
        countMap.remove(key);
    }
    /**
     * 维护清除缓存的线程，内部使用
     */
    private class ClearCache implements Runnable{

        @Override
        public void run() {
            while(true){
                Set<String> tempSet=new HashSet<String>();
                Set<String> confs=cacheConfModelMap.keySet();
                for(String conf:confs){
                    CacheConfModel ccm=cacheConfModelMap.get(conf);
                    //标记可以被删除的
                    if((System.currentTimeMillis()-ccm.getBeginTime())>=ccm.getDurableTime()){
                        tempSet.add(conf);
                    }
                }
                for(String key:tempSet){
                    FlyweightFactory.getInstance().removeFlyweight(key);
                }
                System.out.println("now thread="+flymap.size()+",fsMap=="+flymap.keySet());
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

}

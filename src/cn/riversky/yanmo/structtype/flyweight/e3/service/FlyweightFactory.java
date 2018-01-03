package cn.riversky.yanmo.structtype.flyweight.e3.service;

import cn.riversky.yanmo.structtype.flyweight.e3.entity.UserResource;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂模式中，利用该模式做缓存
 * Created by admin on 2017/12/11.
 */
public class FlyweightFactory {
    private static final FlyweightFactory FACTORY=new FlyweightFactory();
    private Map<String,Flyweight> map=new HashMap<String,Flyweight>();
    private FlyweightFactory() {
    }
    public static FlyweightFactory getInstance(){
        return FACTORY;
    }

    /**
     * 缓存中进行查询，如果没有就进行创建
     * @param key
     * @return
     */
    public  Flyweight getMap(UserResource key) {
        Flyweight f=map.get(key);
        if(f==null){
            f=new AuthorzationFlywight(key);
           map.put(key.getName(),f);
        }
        return f;
    }
}

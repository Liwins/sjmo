package cn.riversky.structtype.flyweight.e4.service;

import cn.riversky.structtype.flyweight.e4.model.UserResource;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/12/11.
 */
public class FlyweightFactory {
    private static final FlyweightFactory FACTORY=new FlyweightFactory();
    private FlyweightFactory(){

    }
    public static FlyweightFactory getInstance(){
        return FACTORY;
    }
    //缓存
    private Map<String,Flyweight> flymap=new HashMap<>();
    //生成认证的类（享元类---只存放可缓存的）
    public Flyweight getFlyweight(UserResource user){
        Flyweight f=flymap.get(user.toString());
        if(f==null){
            f=new AuthorzationFlyweight(user);
            flymap.put(user.getName(),f);
        }
        return f;
    }

}

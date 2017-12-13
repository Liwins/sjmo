package cn.riversky.structtype.flyweight.e2;

import cn.riversky.structtype.flyweight.e2.fw.ConcreteFlyweight;
import cn.riversky.structtype.flyweight.e2.fw.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 可以把这里的maps作为缓存来进行对待
 * Created by admin on 2017/12/11.
 */
public class FlyweightFactory {
    private Map<String,Flyweight> maps=new HashMap<String ,Flyweight>();
    public Flyweight getFlyweight(String key){
        Flyweight f=maps.get(key);
        if(f==null){
            //创建共享的享元对象
            f=new ConcreteFlyweight(key);
            maps.put(key,f);
        }
        return f;
    }
}

package cn.riversky.yanmo.createtype.singleton.cache;

import java.util.HashMap;
import java.util.Map;

/**
 *  Java中缓存的基本实现示例
 * Created by admin on 2017/12/1.
 */
public class Jcache {
    private Map<String ,Object> cache=new HashMap<String ,Object>();

    public Object getValue(String key) {
        Object obj=cache.get(key);
        if("".equals(obj)||null==obj){
            cache.put(key,key+":value");
        }
        return cache;
    }

    public static void main(String[] args) {
        Jcache jcache=new Jcache();
        Object object=jcache.getValue("hello");
        System.out.println(object);
    }
}

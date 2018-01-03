package cn.riversky.yanmo.createtype.singleton.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用缓存来实现单例，主要是借助map
 * Created by admin on 2017/12/1.
 */
public class SingCache {
    private final static String DEFAULT_KEY="hello";
    private static Map<String,SingCache> map=new HashMap<String ,SingCache>();

    private SingCache() {
    }
    public static SingCache getInsance(){
        SingCache singCache=map.get(DEFAULT_KEY);
        if(singCache==null){
            map.put(DEFAULT_KEY,new SingCache());
        }
        return map.get(DEFAULT_KEY);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(SingCache.getInsance());
        }
    }
}

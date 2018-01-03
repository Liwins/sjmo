package cn.riversky.yanmo.createtype.singleton.cache.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/12/1.
 */
public class TriCacheSingle {
    private final static String DEFAULT_KEY="hello";
    private static Map<String,TriCacheSingle> map=new HashMap<String ,TriCacheSingle>();
    private static Integer num=3;

    private TriCacheSingle() {
    }
    public static TriCacheSingle getInstance(){
        TriCacheSingle instance=map.get(DEFAULT_KEY+num);
        if(instance==null){
            instance=new TriCacheSingle();
            map.put(DEFAULT_KEY+num,instance);
            if(num>0){
                num--;
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println(TriCacheSingle.getInstance());
        }
    }
}

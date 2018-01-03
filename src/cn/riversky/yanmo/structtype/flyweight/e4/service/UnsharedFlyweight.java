package cn.riversky.yanmo.structtype.flyweight.e4.service;

import cn.riversky.yanmo.structtype.flyweight.e4.model.UserResource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/12/11.
 */
public class UnsharedFlyweight implements Flyweight {
    private  List<Flyweight> list=new ArrayList<Flyweight>();

    /**
     * 递归验证
     * @param user
     * @return
     */
    @Override
    public boolean match(UserResource user) {
        for(Flyweight f:list){
            if(f.match(user)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Flyweight resource) {
        list.add(resource);
    }
}

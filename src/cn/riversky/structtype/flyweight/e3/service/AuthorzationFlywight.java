package cn.riversky.structtype.flyweight.e3.service;

import cn.riversky.structtype.flyweight.e3.entity.UserResource;

/**
 * Created by admin on 2017/12/11.
 */
public class AuthorzationFlywight implements Flyweight {
    private UserResource user;

    public AuthorzationFlywight(UserResource user) {
        this.user = user;
    }

    public UserResource getUser() {
        return user;
    }

    @Override
    public boolean match(UserResource userWai) {
        if(user.getName().equals(userWai.getName())&&user.getPower().equals(userWai.getPower())){
            return true;
        }
        return false;
    }
}

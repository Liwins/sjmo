package cn.riversky.flyweight.e5.service;

import cn.riversky.flyweight.e5.model.UserResource;

/**
 * Created by admin on 2017/12/11.
 */
public class AuthorzationFlyweight implements Flyweight {

    private UserResource user;

    public AuthorzationFlyweight(UserResource user) {
        this.user = user;
    }

    public UserResource getUser() {
        return user;
    }

    @Override
    public boolean match(UserResource user2) {
        if(user.getPower().equals(user2.getPower())&&user.getModel().equals(user2.getModel())){
            return true;
        }
        return false;
    }

    @Override
    public void add(Flyweight resource) {
      throw    new UnsupportedOperationException("不支持该操作");
    }
}

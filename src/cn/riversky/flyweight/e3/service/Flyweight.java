package cn.riversky.flyweight.e3.service;

import cn.riversky.flyweight.e3.entity.UserResource;

/**
 * Created by admin on 2017/12/11.
 */
public interface Flyweight {
    public boolean match(UserResource user);
}

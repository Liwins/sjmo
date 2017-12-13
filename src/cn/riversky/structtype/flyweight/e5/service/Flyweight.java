package cn.riversky.structtype.flyweight.e5.service;

import cn.riversky.structtype.flyweight.e5.model.UserResource;

/**
 * 接口分别指定两中（可共享的，组合性的）实现类
 * Created by admin on 2017/12/11.
 */
public interface Flyweight {
    boolean match(UserResource user);
    void add(Flyweight resource);
}

package cn.riversky.flyweight.e1.dao;

import cn.riversky.flyweight.e1.entity.UserResource;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by admin on 2017/12/11.
 */
public class UserResourceDao {
    public static Collection<UserResource> userResources=new ArrayList<UserResource>();
    static {
        userResources.add(new UserResource("張三","人员列表","查看"));
        userResources.add(new UserResource("李四","人员列表","查看"));
        userResources.add(new UserResource("李四","薪资数据","查看"));
        userResources.add(new UserResource("李四","薪资数据","修改"));
        for (int i = 0; i < 3; i++) {
            userResources.add(new UserResource("张三"+i,"人员列表","查看"));
        }
    }
}

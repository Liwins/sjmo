package cn.riversky.flyweight.e4.dao;

import cn.riversky.flyweight.e4.model.UserResource;
import cn.riversky.flyweight.e4.model.Resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/12/11.
 */
public class UserResourceDao {
    public static Collection<UserResource> userResources=new ArrayList<UserResource>();
    public static Map<String,Resource[]> role=new HashMap<String,Resource[]>();
    static {
        UserResource usermanager=new UserResource("張三","人员列表","查看");
        usermanager.setRole("manager");
        userResources.add(usermanager);

        userResources.add(new UserResource("李四","人员列表","查看"));
        userResources.add(new UserResource("李四","薪资数据","查看"));
        userResources.add(new UserResource("李四","薪资数据","修改"));
        role.put("manager",new Resource[]{new Resource("人员列表","查看"),new Resource("薪资数据","查看"),new Resource("薪资数据","修改")});
        for (int i = 0; i < 3; i++) {
            userResources.add(new UserResource("张三"+i,"人员列表","查看"));
        }
    }
}

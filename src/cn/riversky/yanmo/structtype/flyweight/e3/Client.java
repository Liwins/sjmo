package cn.riversky.yanmo.structtype.flyweight.e3;

import cn.riversky.yanmo.structtype.flyweight.e3.entity.UserResource;

/**
 * Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {
        SecurityMgr mgr=SecurityMgr.getInstance();
        mgr.login("张三");
        mgr.login("李四");
        String chakan="查看";
        String xiugai="修改";
        String model1="薪资数据";
        String model2="人员列表";
        UserResource user=new UserResource("李四",model1,chakan);
        System.out.println(mgr.isPermission(user));
    }
}

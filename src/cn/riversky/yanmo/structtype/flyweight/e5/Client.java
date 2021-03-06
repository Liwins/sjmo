package cn.riversky.yanmo.structtype.flyweight.e5;

import cn.riversky.yanmo.structtype.flyweight.e5.model.UserResource;
import cn.riversky.yanmo.structtype.flyweight.e5.service.FlyweightFactory;

/**
 * 这里是构建一个统一的认证模型，并且支持权限组合，可以认为是角色，基于角色的资源管理。
 * Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        SecurityMgr mgr= SecurityMgr.getInstance();
        mgr.login("張三");
        mgr.login("李四");
        String chakan="查看";
        String xiugai="修改";
        String model1="薪资数据";
        String model2="人员列表";
        UserResource user=new UserResource("張三",model1,chakan);
        System.out.println(mgr.hasPermit(user));
        System.out.println(user.toString()+"引用了"+FlyweightFactory.getInstance().getUseTimes(user.toString())+"次数");
        Thread.sleep(10000L);
    }
}

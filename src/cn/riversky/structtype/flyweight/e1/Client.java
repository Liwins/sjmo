package cn.riversky.structtype.flyweight.e1;

import cn.riversky.structtype.flyweight.e1.entity.UserResource;
import cn.riversky.structtype.flyweight.e1.service.SecurityMgr;

/**
 * 非设计模式的验证授权的权限管理
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
        System.out.println(mgr.hasPermit(user));
    }
}

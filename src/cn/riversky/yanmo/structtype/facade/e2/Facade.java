package cn.riversky.yanmo.structtype.facade.e2;

import cn.riversky.yanmo.structtype.facade.e2.service.*;

/**
 * 外观对象
 * Created by admin on 2017/12/8.
 */
public class Facade {
    /**
     * 示意方法，满足客户需要的功能
     */
    public void test(){
        //在内部实现的时候，可能会调用到内部的多个模块
        ServiceA a=new ServiceAimpl();
        ServiceB b=new ServiceBimpl();
        ServiceC c=new ServiceCimpl();
        a.testA();b.testB();c.testC();
    }
}

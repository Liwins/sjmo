package cn.riversky.yanmo.structtype.decorator.e6.decorator;

import cn.riversky.yanmo.structtype.decorator.e6.base.Sail;
import cn.riversky.yanmo.structtype.decorator.e6.model.SailMode;

/**
 * 做校验修饰（权限控制）
 * @author Created by admin on 2017/12/13.
 */
public class CheckDecorator extends DecoratorAbstract {
    public CheckDecorator(Sail sail) {
        super(sail);
    }


    @Override
    public boolean sale(String user, String customer, SailMode saleModel) {
        if("张三".equals(user)){
            return sail.sale(user,customer,saleModel);
        }else {
            System.out.println(user+"没有该权限");
            return false;
        }
    }

}

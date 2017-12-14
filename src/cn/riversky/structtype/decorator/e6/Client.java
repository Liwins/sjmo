package cn.riversky.structtype.decorator.e6;

import cn.riversky.structtype.decorator.e6.base.Sail;
import cn.riversky.structtype.decorator.e6.base.SailImpl;
import cn.riversky.structtype.decorator.e6.decorator.CheckDecorator;
import cn.riversky.structtype.decorator.e6.decorator.LogSailDecoreator;
import cn.riversky.structtype.decorator.e6.model.SailMode;

/**
 * @author Created by admin on 2017/12/13.
 */
public class Client {
    public static void main(String[] args) {
//得到业务接口,组合装饰器
        Sail ebi = new LogSailDecoreator(new CheckDecorator(new SailImpl()));
        //准备测试数据
        SailMode sailMode=new SailMode();
        sailMode.setGoods("moto手机");
        sailMode.setSaleNum(2);
        ebi.sale("张三","张三峰",sailMode);
        ebi.sale("张","张峰",sailMode);
    }
}

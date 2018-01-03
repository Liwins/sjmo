package cn.riversky.yanmo.createtype.factorymethod.example2.creator;

import cn.riversky.yanmo.createtype.factorymethod.example2.pruduct.ConcreteProduct;
import cn.riversky.yanmo.createtype.factorymethod.example2.pruduct.Product;

/**
 * 创建器的实现类
 * Created by admin on 2017/11/29.
 */
public class ConcreteCreator extends Creator {
    @Override
    protected Product facotryMethod() {
        return new ConcreteProduct();
    }
}

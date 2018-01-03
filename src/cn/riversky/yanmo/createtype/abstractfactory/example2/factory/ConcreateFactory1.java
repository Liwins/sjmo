package cn.riversky.yanmo.createtype.abstractfactory.example2.factory;

import cn.riversky.yanmo.createtype.abstractfactory.example2.product.AbstractProductA;
import cn.riversky.yanmo.createtype.abstractfactory.example2.product.AbstractProductB;
import cn.riversky.yanmo.createtype.abstractfactory.example2.product.ProductA1;
import cn.riversky.yanmo.createtype.abstractfactory.example2.product.ProductB1;

/**
 * Created by admin on 2017/11/27.
 */
public class ConcreateFactory1 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}

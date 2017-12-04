package cn.riversky.createtype.abstractfactory.example2.factory;

import cn.riversky.createtype.abstractfactory.example2.product.AbstractProductA;
import cn.riversky.createtype.abstractfactory.example2.product.AbstractProductB;
import cn.riversky.createtype.abstractfactory.example2.product.ProductA2;
import cn.riversky.createtype.abstractfactory.example2.product.ProductB2;

/**
 * Created by admin on 2017/11/27.
 */
public class ConcreateFactory2 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}

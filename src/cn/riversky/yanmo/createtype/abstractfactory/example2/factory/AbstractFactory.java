package cn.riversky.yanmo.createtype.abstractfactory.example2.factory;

import cn.riversky.yanmo.createtype.abstractfactory.example2.product.AbstractProductA;
import cn.riversky.yanmo.createtype.abstractfactory.example2.product.AbstractProductB;

/**
 * Created by admin on 2017/11/27.
 */
public interface AbstractFactory {
    public AbstractProductA createProductA();
    public AbstractProductB createProductB();
}

package cn.riversky.yanmo.createtype.factorymethod.example2.creator;

import cn.riversky.yanmo.createtype.factorymethod.example2.pruduct.Product;

/**
 * 创建器
 * Created by admin on 2017/11/29.
 */
public abstract class Creator {
    /**
     * 创建工厂方法
     * @return
     */
    protected abstract Product facotryMethod();
    public void someOpertion(){
        //通过，子类对抽象类进行实例化
        Product product=facotryMethod();
    }
}

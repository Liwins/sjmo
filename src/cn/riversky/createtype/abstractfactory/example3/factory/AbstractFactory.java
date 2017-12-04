package cn.riversky.createtype.abstractfactory.example3.factory;

import cn.riversky.createtype.abstractfactory.example3.product.CPUApi;
import cn.riversky.createtype.abstractfactory.example3.product.MainboardApi;

/**
 * Created by admin on 2017/11/27.
 */
public interface AbstractFactory {
    public CPUApi createCpuAPI();
    public MainboardApi createMainboardAPI();
}

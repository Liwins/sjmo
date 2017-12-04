package cn.riversky.createtype.abstractfactory.example3.factory;

import cn.riversky.createtype.abstractfactory.example3.product.AmdCPU;
import cn.riversky.createtype.abstractfactory.example3.product.CPUApi;
import cn.riversky.createtype.abstractfactory.example3.product.MSIMainboard;
import cn.riversky.createtype.abstractfactory.example3.product.MainboardApi;

/**
 * Created by admin on 2017/11/27.
 */
public class Type2 implements AbstractFactory {
    @Override
    public CPUApi createCpuAPI() {
        return new AmdCPU(123);
    }

    @Override
    public MainboardApi createMainboardAPI() {
        return new MSIMainboard(123);
    }
}

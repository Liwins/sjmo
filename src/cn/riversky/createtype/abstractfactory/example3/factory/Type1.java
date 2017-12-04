package cn.riversky.createtype.abstractfactory.example3.factory;

import cn.riversky.createtype.abstractfactory.example3.product.CPUApi;
import cn.riversky.createtype.abstractfactory.example3.product.GAMainboard;
import cn.riversky.createtype.abstractfactory.example3.product.IntelCPU;
import cn.riversky.createtype.abstractfactory.example3.product.MainboardApi;

/**
 * Created by admin on 2017/11/27.
 */
public class Type1 implements AbstractFactory {
    @Override
    public CPUApi createCpuAPI() {
        return new IntelCPU(1156);
    }
    @Override
    public MainboardApi createMainboardAPI() {
        return new GAMainboard(1156);
    }
}

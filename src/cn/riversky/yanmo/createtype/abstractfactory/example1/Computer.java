package cn.riversky.yanmo.createtype.abstractfactory.example1;

import cn.riversky.yanmo.createtype.abstractfactory.example1.factory.CPUFactory;
import cn.riversky.yanmo.createtype.abstractfactory.example1.factory.MainboardFactory;
import cn.riversky.yanmo.createtype.abstractfactory.example1.product.CPUApi;
import cn.riversky.yanmo.createtype.abstractfactory.example1.product.MainboardApi;

/**
 * Created by admin on 2017/11/27.
 */
public class Computer {
    private CPUApi cpu;
    private MainboardApi mainboard;
    public void makeComputer(String cpuType,String mainboardType){
        prepareHardwares(cpuType,mainboardType);
        System.out.println("cpu测试");
        cpu.calculate();
        System.out.println("主板测试");
        mainboard.installCPU();
    }

    private void prepareHardwares(String cpuType, String mainboardType) {
        cpu= CPUFactory.createCPUApi(cpuType);
        mainboard= MainboardFactory.createMainboardApi(mainboardType);
    }
}

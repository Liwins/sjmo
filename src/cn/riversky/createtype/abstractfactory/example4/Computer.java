package cn.riversky.createtype.abstractfactory.example4;

import cn.riversky.createtype.abstractfactory.example4.factory.AbstractFactory;
import cn.riversky.createtype.abstractfactory.example4.factory.Type3;
import cn.riversky.createtype.abstractfactory.example4.product.CPUApi;
import cn.riversky.createtype.abstractfactory.example4.product.MainboardApi;
import cn.riversky.createtype.abstractfactory.example4.product.MemoryApi;

/**
 * 这种方式巧妙的使用了传入参数，进行产品中的组合进行生成。当进行增量式添加产品的时候，就不需要改动太多
 */
public class Computer {
    private CPUApi cpu;
    private MainboardApi mainboard;
    private MemoryApi memory;

    public void makeAcomputer(AbstractFactory type){
        prepareHardSoft(type);
        cpu.calculate();
        mainboard.installCPU();
        if (type instanceof Type3){
            memory.cacheData();
        }
    }

    private void prepareHardSoft(AbstractFactory type) {
        cpu= (CPUApi) type.createProduct(1);
        mainboard= (MainboardApi) type.createProduct(2);
        if(type instanceof Type3){
            memory= (MemoryApi) type.createProduct(3);
        }
    }
}

package cn.riversky.abstractfactory.example1.factory;

import cn.riversky.abstractfactory.example1.product.AmdCPU;
import cn.riversky.abstractfactory.example1.product.CPUApi;
import cn.riversky.abstractfactory.example1.product.IntelCPU;

/**
 * Created by admin on 2017/11/27.
 */
public class CPUFactory {
    /**
     * 创建CPU接口对象的方法
     * @param type 选择CPU类型的参数
     * @return CPU接口对象的方法
     */
    public static CPUApi createCPUApi(String  type){
        CPUApi cpu = null;
        //根据参数来选择并创建相应的CPU对象
        if("AMD".equals(type)){
            cpu = new AmdCPU(939);
        }else {
            cpu = new IntelCPU(1156);

        }
        return cpu;
    }
}

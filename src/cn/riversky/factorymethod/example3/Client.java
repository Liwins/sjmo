package cn.riversky.factorymethod.example3;

import cn.riversky.factorymethod.example3.creator.ABC;
import cn.riversky.factorymethod.example3.creator.ExportDBOperate;

/**
 * 这里表示的是平行结构的，创建延迟，操作在先
 * 实例化时候，直接采用面向接口编程即可
 * Created by admin on 2017/11/29.
 */
public class Client {
    public static void main(String[] args) {

//        ExportOperate operate=new ExportTxtOperate();
//        operate.export("ceshi");
        ABC abc=new ExportDBOperate().createABC("cc");
        abc.test();
    }
}

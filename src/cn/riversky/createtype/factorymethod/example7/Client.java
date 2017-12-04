package cn.riversky.createtype.factorymethod.example7;

import cn.riversky.createtype.factorymethod.example7.operator.ExportOperate;

/**
 * 个人理解工厂方法设计模式，
 * 其实就是将操作和创建分开。
 * Created by admin on 2017/11/29.
 */
public class Client {
    public static void main(String[] args) {
        ExportOperate operate=new ExportOperate();
        operate.export(2,"dh");
    }
}

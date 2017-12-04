package cn.riversky.createtype.factorymethod.example1;

import cn.riversky.createtype.factorymethod.example1.export.ExportOperate;

/**
 *
 * Created by admin on 2017/11/29.
 */
public class Client {
    public static void main(String[] args) {
        ExportOperate operate=new ExportOperate();
        operate.export(2,"hello");
    }
}

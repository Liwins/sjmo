package cn.riversky.factorymethod.example3.creator;

import cn.riversky.factorymethod.example3.product.ExportDB;

/**
 * Created by admin on 2017/11/29.
 */
public class ExportDBOperate extends ExportOperate {
    @Override
    protected ExportDB factoryMethod() {
        return new ExportDB();
    }
}

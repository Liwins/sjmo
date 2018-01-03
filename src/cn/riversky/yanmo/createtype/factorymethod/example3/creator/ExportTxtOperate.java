package cn.riversky.yanmo.createtype.factorymethod.example3.creator;

import cn.riversky.yanmo.createtype.factorymethod.example3.product.ExportFileApi;
import cn.riversky.yanmo.createtype.factorymethod.example3.product.ExportTxtFile;

/**
 * Created by admin on 2017/11/29.
 */
public class ExportTxtOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}

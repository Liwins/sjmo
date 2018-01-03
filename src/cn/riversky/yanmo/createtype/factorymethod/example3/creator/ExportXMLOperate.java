package cn.riversky.yanmo.createtype.factorymethod.example3.creator;

import cn.riversky.yanmo.createtype.factorymethod.example3.product.ExportFileApi;
import cn.riversky.yanmo.createtype.factorymethod.example3.product.ExportXmlFile;

/**
 * Created by admin on 2017/11/29.
 */
public class ExportXMLOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportXmlFile();
    }
}

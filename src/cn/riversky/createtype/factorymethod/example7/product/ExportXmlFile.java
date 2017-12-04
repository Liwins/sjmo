package cn.riversky.createtype.factorymethod.example7.product;

/**
 * Created by admin on 2017/11/29.
 */
public class ExportXmlFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("ExportXmlFile:"+data);
        return true;
    }
}

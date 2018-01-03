package cn.riversky.yanmo.createtype.factorymethod.example1.export;

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

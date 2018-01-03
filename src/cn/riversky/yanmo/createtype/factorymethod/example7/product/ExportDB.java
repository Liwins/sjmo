package cn.riversky.yanmo.createtype.factorymethod.example7.product;

/**
 * Created by admin on 2017/11/29.
 */
public class ExportDB implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("ExportDB:"+data);
        return true;
    }
}

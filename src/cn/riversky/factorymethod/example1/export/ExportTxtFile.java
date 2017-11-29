package cn.riversky.factorymethod.example1.export;

/**
 * Created by admin on 2017/11/29.
 */
public class ExportTxtFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("ExportTxtFile:"+data);
        return true;
    }
}

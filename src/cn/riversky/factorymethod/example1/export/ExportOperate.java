package cn.riversky.factorymethod.example1.export;

/**
 * Created by admin on 2017/11/29.
 */
public class ExportOperate {
    /**
     * 导出文件
     * @param type 导出类型
     * @param data  导出数据
     * @return 是否成功
     */
    public boolean export(int type,String data){
        System.out.println("数据校验");
        System.out.println("数据转换");
        System.out.println("数据封装");
        //进行导出
        ExportFileApi api=null;
        if(type==1){
            api=new ExportDB();
        }else if(type==2){
            api=new ExportTxtFile();
        }else if(type==3){
            api=new ExportXmlFile();
        }
        return api.export(data);
    }
}

package cn.riversky.builder.example1.expType;

import cn.riversky.builder.example1.struct.ExportDataModel;
import cn.riversky.builder.example1.struct.ExportFooterModel;
import cn.riversky.builder.example1.struct.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * Created by admin on 2017/11/28.
 */
public class ExportToTxt {
    /**
     * 导出数据到文本
     * @param header
     * @param mapData
     * @param footer
     */
    public void export(ExportHeaderModel header , Map<String,Collection<ExportDataModel>> mapData, ExportFooterModel footer){
        StringBuffer sb=new StringBuffer();
        //文件头
        sb.append(header.getDepId()+","+header.getExportDate()+"\n");
        //文件体
        for(String tblName:mapData.keySet()){
            //表名称
            sb.append(tblName+"\n");
            //循环拼接具体数据
            for (ExportDataModel data:mapData.get(tblName)){
                sb.append(data.getProductId()+","+data.getPrice()+","+data.getAmount()+"\n");
            }
        }
        //拼接文件尾部
        sb.append(footer.getExportUser());
        System.out.println("输出文本内容：\n"+sb);
    }
}

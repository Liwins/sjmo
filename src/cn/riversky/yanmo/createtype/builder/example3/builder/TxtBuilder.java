package cn.riversky.yanmo.createtype.builder.example3.builder;

import cn.riversky.yanmo.createtype.builder.example3.struct.ExportDataModel;
import cn.riversky.yanmo.createtype.builder.example3.struct.ExportFooterModel;
import cn.riversky.yanmo.createtype.builder.example3.struct.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * Created by admin on 2017/11/28.
 */
public class TxtBuilder implements Builder{
    private  StringBuffer sb=new StringBuffer();
    @Override
    public void heardBuild(ExportHeaderModel headerModel) {
        sb.append(headerModel.getDepId()+","+headerModel.getExportDate()+"\n");
    }

    @Override
    public void footerBuild(ExportFooterModel footerModel) {
        sb.append(footerModel.getExportUser());
    }

    @Override
    public void bodyBuild(Map<String, Collection<ExportDataModel>> mapData) {
        for(String tblName : mapData.keySet()){
            //先拼接表名称
            sb.append(tblName+"\n");
            //然后循环拼接具体数据
            for(ExportDataModel edm : mapData.get(tblName)){
                sb.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");
            }
        }
    }
    public StringBuffer getResult(){
        return sb;
    }
}

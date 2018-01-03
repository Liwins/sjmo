package cn.riversky.yanmo.createtype.builder.example3.builder;

import cn.riversky.yanmo.createtype.builder.example3.struct.ExportDataModel;
import cn.riversky.yanmo.createtype.builder.example3.struct.ExportFooterModel;
import cn.riversky.yanmo.createtype.builder.example3.struct.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * Created by admin on 2017/11/28.
 */
public class XmlBuilder implements Builder {
    private  StringBuffer sb=new StringBuffer();
    @Override
    public void heardBuild(ExportHeaderModel ehm) {
        sb.append("<?xml version='1.0' encoding='gb2312'?>\n");
        sb.append("<Report>\n");
        sb.append("  <Header>\n");
        sb.append("    <DepId>"+ehm.getDepId()+"</DepId>\n");
        sb.append("    <ExportDate>"+ehm.getExportDate()+"</ExportDate>\n");
        sb.append("  </Header>\n");
    }

    @Override
    public void footerBuild(ExportFooterModel efm) {
        String str = "  <Footer>\n";
        str+="    <ExportUser>"+efm.getExportUser()+"</ExportUser>\n";
        str+="  </Footer>\n";
        str+="</Report>\n";
        sb.append(str);
    }

    @Override
    public void bodyBuild(Map<String, Collection<ExportDataModel>> mapData) {
        sb.append("  <Body>\n");
        for(String tblName : mapData.keySet()){
            //先拼接表名称
            sb.append("    <Datas TableName=\""+tblName+"\">\n");
            //然后循环拼接具体数据
            for(ExportDataModel edm : mapData.get(tblName)){
                sb.append("      <Data>\n");
                sb.append("        <ProductId>"+edm.getProductId()+"</ProductId>\n");
                sb.append("        <Price>"+edm.getPrice()+"</Price>\n");
                sb.append("        <Amount>"+edm.getAmount()+"</Amount>\n");
                sb.append("      </Data>\n");
            }
            sb.append("    </Datas>\n");
        }
        sb.append("  </Body>\n");
    }
    public StringBuffer getResult(){
        return sb;
    }
}

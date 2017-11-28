package cn.riversky.builder.example1.expType;

import cn.riversky.builder.example1.struct.ExportDataModel;
import cn.riversky.builder.example1.struct.ExportFooterModel;
import cn.riversky.builder.example1.struct.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * 一般的开发方式
 * Created by admin on 2017/11/28.
 */
public class ExportToxml {
    /**
     * 输出文件到xml
     *
     * @param header
     * @param mapData
     * @param footer
     */
    public void export(ExportHeaderModel header, Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel footer) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version='1.0' encoding='utf8'?>\n");
        sb.append("<Report>\n");
        sb.append("   <Header>\n");
        sb.append("      <DepId>"+header.getDepId()+"</DepId>\n");
        sb.append("      <ExportDate>"+header.getExportDate()+"</ExportDate>\n");
        sb.append("   </Header>\n");
        //拼接文件体
        sb.append("   <Body>\n");
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
        //拼接文件尾部
        sb.append("  <Footer>\n");
        sb.append("    <ExportUser>"+footer.getExportUser()+"</ExportUser>\n");
        sb.append("  </Footer>\n");
        sb.append("</Report>\n");
        //为了演示简洁性，这里就不去写输出文件的代码了
        //把要输出的内容输出到控制台看看
        System.out.println("输出到XML文件的内容：\n"+sb);
    }
}

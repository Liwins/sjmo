package cn.riversky.builder.example3;

import cn.riversky.builder.example3.builder.TxtBuilder;
import cn.riversky.builder.example3.builder.XmlBuilder;
import cn.riversky.builder.example3.directot.Director;
import cn.riversky.builder.example3.struct.ExportDataModel;
import cn.riversky.builder.example3.struct.ExportFooterModel;
import cn.riversky.builder.example3.struct.ExportHeaderModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 这种方式的实现
 *
 * Created by admin on 2017/11/28.
 */
public class Client {
    public static void main(String[] args) {
        //测试数据
        ExportHeaderModel head=new ExportHeaderModel();
        head.setDepId("计算机学院");
        DateFormat df=new SimpleDateFormat();
        head.setExportDate(df.format(new Date()).toUpperCase());
        Map<String,Collection<ExportDataModel>> mapData=new HashMap<>();
        Collection<ExportDataModel> col=new ArrayList<>();
        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("计算机网络");
        edm1.setPrice(100);
        edm1.setAmount(80);

        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductId("软件工程");
        edm2.setPrice(99);
        edm2.setAmount(55);
        //把数据组装起来
        col.add(edm1);
        col.add(edm2);
        mapData.put("招生收费表", col);
        ExportFooterModel footer=new ExportFooterModel();
        footer.setExportUser("小明");
        TxtBuilder txtBuilder=new TxtBuilder();
        XmlBuilder xmlBuilder=new XmlBuilder();
        Director director=new Director(xmlBuilder);
        //中间引导过程
        director.construct(head,mapData,footer);
        //获取结果
        System.out.println(xmlBuilder.getResult());
    }
}

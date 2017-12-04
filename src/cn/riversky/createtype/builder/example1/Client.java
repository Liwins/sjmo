package cn.riversky.createtype.builder.example1;

import cn.riversky.createtype.builder.example1.expType.ExportToTxt;
import cn.riversky.createtype.builder.example1.struct.ExportDataModel;
import cn.riversky.createtype.builder.example1.struct.ExportFooterModel;
import cn.riversky.createtype.builder.example1.struct.ExportHeaderModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
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
        //测试到xml
//        ExportToxml toxml=new ExportToxml();
//        toxml.export(head,mapData,footer);
        //测试到txt
        ExportToTxt toTxt=new ExportToTxt();
        toTxt.export(head,mapData,footer);
    }
}

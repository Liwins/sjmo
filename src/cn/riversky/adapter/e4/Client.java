package cn.riversky.adapter.e4;

import cn.riversky.adapter.e4.dao.*;
import cn.riversky.adapter.e4.model.LogModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用双向适配器，一般用于解决向上支持和向下兼容的类设计。
 * Created by admin on 2017/12/4.
 */
public class Client {
    public static void main(String[] args) {
//准备日志内容，也就是测试的数据
        LogModel lm1 = new LogModel();
        lm1.setLogId("001");
        lm1.setOperateUser("admin");
        lm1.setOperateTime("2010-03-02 10:08:18");
        lm1.setLogContent("这是一个测试");
        List<LogModel> list = new ArrayList<>();
        list.add(lm1);
        //创建操作日志文件的对象
        LogFileDao fileLogApi = new LogFileImpl("F:\\设计模式\\私塾java设计模式\\源码\\javadesignpattern\\src\\cn\\javass\\dp\\adapter\\example2\\file.txt");
        LogDbDao dbLogApi = new LogDbImpl();
        //创建经过双向适配后的操作日志的接口对象
        LogFileDao fileLogApi2 = new TwoDirectAdapter(dbLogApi,fileLogApi);
        LogDbDao dbLogApi2 = new TwoDirectAdapter(dbLogApi,fileLogApi);
        //先测试从文件操作适配到第二版，虽然调用的是第二版的接口，其实是文件操作在实现
        dbLogApi2.createLog(lm1);
        List<LogModel> allLog = dbLogApi2.getAllLog();
        System.out.println("allLog555="+allLog);
        //再测试从数据库存储适配成第一版的接口，也就是调用第一版的接口，其实是数据实现
        System.out.println("--------------------------->File Api  ");
        fileLogApi2.writeLogFile(list);
        fileLogApi2.readLogFile();
    }
}

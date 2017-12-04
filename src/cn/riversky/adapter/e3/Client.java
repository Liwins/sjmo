package cn.riversky.adapter.e3;

import cn.riversky.adapter.e3.LogDao.Adapter;
import cn.riversky.adapter.e3.LogDao.LogFileDao;
import cn.riversky.adapter.e3.LogDao.LogFileImpl;
import cn.riversky.adapter.e3.defadapter.Myadaptor;
import cn.riversky.adapter.e3.model.LogModel;
import cn.riversky.adapter.e3.utils.TimeUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/12/4.
 */
public class Client {
    public static void main(String[] args) {
//        writeLog();
//        readlog();
        readDefault();
    }

    private static void readDefault() {
        LogFileDao lofd = new LogFileImpl("F:\\设计模式\\私塾java设计模式\\源码\\javadesignpattern\\src\\cn\\javass\\dp\\adapter\\example2\\file.txt");
        Myadaptor m=new Myadaptor(lofd,new TimeUtil());
        List<LogModel> list = m.getAllLog();
        System.out.println(list);
    }

    private static void readlog() {
        LogFileDao logDao = new LogFileImpl("F:\\设计模式\\私塾java设计模式\\源码\\javadesignpattern\\src\\cn\\javass\\dp\\adapter\\example2\\file.txt");
        Adapter adapter = new Adapter(logDao, new TimeUtil());
        List<LogModel> list = adapter.getAllLog();
        System.out.println(list);
    }

    private static void writeLog() {
        LogModel logEntity = new LogModel();
        logEntity.setLogId("002");
        logEntity.setOperateUser("susan");
        logEntity.setOperateTime(new SimpleDateFormat().format(new Date()));
        logEntity.setLogContent("这事测试");
        LogFileDao logDao = new LogFileImpl("F:\\设计模式\\私塾java设计模式\\源码\\javadesignpattern\\src\\cn\\javass\\dp\\adapter\\example2\\file.txt");
        Adapter adapter = new Adapter(logDao, new TimeUtil());
        adapter.createLog(logEntity);
    }
}

package cn.riversky.adapter.e2;

import cn.riversky.adapter.e2.dao.LogDao;
import cn.riversky.adapter.e2.dao.LogFileImpl;
import cn.riversky.adapter.e2.entity.LogEntity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/12/4.
 */
public class Client {
    public static void main(String[] args) {
//        writeLog();
        readlog();
    }

    private static void readlog() {
        LogDao logDao=new LogFileImpl("F:\\设计模式\\私塾java设计模式\\源码\\javadesignpattern\\src\\cn\\javass\\dp\\adapter\\example2\\file.txt");
        List<LogEntity> list=logDao.readLogFile();
        System.out.println(list);
    }

    private static void writeLog() {
        LogEntity logEntity=new LogEntity();
        logEntity.setLogId("001");
        logEntity.setOperateUser("李开");
        logEntity.setOperateTime(new SimpleDateFormat().format(new Date()));
        logEntity.setLogContent("这事测试");
        List<LogEntity> list=new ArrayList<>();
        list.add(logEntity);
        LogDao logDao=new LogFileImpl("F:\\设计模式\\私塾java设计模式\\源码\\javadesignpattern\\src\\cn\\javass\\dp\\adapter\\example2\\file.txt");
        logDao.writeLogFile(list);
    }

}

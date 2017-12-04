package cn.riversky.adapter.e5.dao.impl;

import cn.riversky.adapter.e5.dao.LogFileOperateApi;
import cn.riversky.adapter.e5.domain.LogModel;

import java.io.*;
import java.util.List;

/**
 * Created by admin on 2017/12/4.
 */
public class LogFileOperate  implements LogFileOperateApi{
    /**
     * 日志文件的路径和文件名称，默认是当前classpath下的AdapterLog.log
     */
    private String logFilePathName = "AdapterLog.log";
    /**
     * 构造方法，传入文件的路径和名称
     * @param logFilePathName 文件的路径和名称
     */
    public LogFileOperate(String logFilePathName) {
        //先判断是否传入了文件的路径和名称，如果是，
        //就重新设置操作的日志文件的路径和名称
        if(logFilePathName!=null && logFilePathName.trim().length()>0){
            this.logFilePathName = logFilePathName;
        }
    }
    public  List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;
        try {
            File f = new File(logFilePathName);
            if(f.exists()){
                oin = new ObjectInputStream(
                        new BufferedInputStream(new FileInputStream(f))
                );
                list = (List<LogModel>)oin.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(oin!=null){
                    oin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public void writeLogFile(List<LogModel> list){
        File f = new File(logFilePathName);
        ObjectOutputStream oout = null;
        try {
            oout = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(f))
            );
            oout.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                oout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package cn.riversky.yanmo.structtype.adapter.e2.dao;

import cn.riversky.yanmo.structtype.adapter.e2.entity.LogEntity;

import java.io.*;
import java.util.List;

/**
 * Created by admin on 2017/12/4.
 */
public class LogFileImpl implements LogDao {
    private String logFilePathName="adapter.log";

    public LogFileImpl(String logFilePathName) {
        if(logFilePathName!=null&&logFilePathName.trim().length()>0){
            this.logFilePathName = logFilePathName;
        }
    }

    @Override
    public List<LogEntity> readLogFile() {
        List<LogEntity> list=null;
        ObjectInputStream oin=null;
        try {
            File f=new File(logFilePathName);
            if(f.exists()){
                oin=new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
                list= (List<LogEntity>) oin.readObject();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
                try {
                    if(oin!=null) {
                        oin.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return list;
    }

    @Override
    public void writeLogFile(List<LogEntity> list) {
        File file=new File(this.logFilePathName);
        ObjectOutputStream oos = null;
        try {
             oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            oos.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package cn.riversky.adapter.e4.dao;


import cn.riversky.adapter.e4.model.LogModel;

import java.util.List;

/**
 * Created by admin on 2017/12/4.
 */
public class TwoDirectAdapter implements LogDbDao, LogFileDao {
    private LogDbDao dblog;
    private LogFileDao filelog;

    public TwoDirectAdapter(LogDbDao dblog, LogFileDao filelog) {
        this.dblog = dblog;
        this.filelog = filelog;
    }

    /*-----以下是把文件操作的方式适配成为DB实现方式的接口-----*/
    @Override
    public void createLog(LogModel lm) {

//1：先读取文件的内容
        List<LogModel> list = filelog.readLogFile();
        //2：加入新的日志对象
        list.add(lm);
        //3：重新写入文件
        filelog.writeLogFile(list);

    }

    @Override
    public void updateLog(LogModel lm) {
//1：先读取文件的内容
        List<LogModel> list = filelog.readLogFile();
        //2：修改相应的日志对象
        for(int i=0;i<list.size();i++){
            if(list.get(i).getLogId().equals(lm.getLogId())){
                list.set(i, lm);
                break;
            }
        }
        //3：重新写入文件
        filelog.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel lm) {
        //1：先读取文件的内容
        List<LogModel> list = filelog.readLogFile();
        //2：删除相应的日志对象
        list.remove(lm);
        //3：重新写入文件
        filelog.writeLogFile(list);
    }

    @Override
    public List<cn.riversky.adapter.e4.model.LogModel> getAllLog() {
        return filelog.readLogFile();
    }

    @Override
    public void removeall() {
        System.out.println("remove all");
    }

    /*-----以下是把DB操作的方式适配成为文件实现方式的接口-----*/
    @Override
    public List<LogModel> readLogFile() {
        return dblog.getAllLog();
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        dblog.removeall();
        for (LogModel li : list) {
            dblog.createLog(li);
        }
    }
}

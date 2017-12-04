package cn.riversky.adapter.e3.LogDao;

import cn.riversky.adapter.e3.model.LogModel;
import cn.riversky.adapter.e3.utils.TimeUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 主要是用在适配器中，利用旧的类，按照新的接口实现一遍（在旧类的基础上）
 * Created by admin on 2017/12/4.
 */
public class Adapter implements LogDbDao {
    private  LogFileDao adaptee;
    private TimeUtil timeUtil;

    public Adapter(LogFileDao adaptee, TimeUtil timeUtil) {
        this.adaptee = adaptee;
        this.timeUtil = timeUtil;
    }

    @Override
    public void createLog(LogModel lm) {
        timeUtil.begin();
//        先读再写

        List<LogModel> list= adaptee.readLogFile();
        if(list==null){
            list=new ArrayList<>();
        }
            list.add(lm);
        adaptee.writeLogFile(list);
        timeUtil.end();
        timeUtil.show();
    }

    @Override
    public void updateLog(LogModel lm) {
//1：先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        //2：修改相应的日志对象
        for(int i=0;i<list.size();i++){
            if(list.get(i).getLogId().equals(lm.getLogId())){
                list.set(i, lm);
                break;
            }
        }
        //3：重新写入文件
        adaptee.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel lm) {
//1：先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        //2：删除相应的日志对象
        list.remove(lm);
        //3：重新写入文件
        adaptee.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}

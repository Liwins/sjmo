package cn.riversky.structtype.adapter.e3.defadapter;

import cn.riversky.structtype.adapter.e3.LogDao.LogFileDao;
import cn.riversky.structtype.adapter.e3.model.LogModel;
import cn.riversky.structtype.adapter.e3.utils.TimeUtil;

import java.util.List;

/**
 * Created by admin on 2017/12/4.
 */
public class Myadaptor extends DefaultAdaptor {
    private LogFileDao adaptee;
    private TimeUtil timeUtil;

    public Myadaptor(LogFileDao adaptee, TimeUtil timeUtil) {
        this.adaptee = adaptee;
        this.timeUtil = timeUtil;
    }

    /**
     * 默认的适配器没有的功能
     * 覆盖掉，然后用新的实现书写
     * @param lm
     */
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

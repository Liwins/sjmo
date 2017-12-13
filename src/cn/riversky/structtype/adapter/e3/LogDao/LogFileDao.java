package cn.riversky.structtype.adapter.e3.LogDao;


import cn.riversky.structtype.adapter.e3.model.LogModel;

import java.util.List;

/**
 * 第一代产品的旧的接口
 * Created by admin on 2017/12/4.
 */
public interface LogFileDao {
    /**
     * 读取日志文件，从文件里面获取存储的日志列表对象
     * @return 存储的日志列表对象
     */
    public List<LogModel> readLogFile();
    /**
     * 写日志文件，把日志列表写出到日志文件中去
     * @param list 要写到日志文件的日志列表
     */
    public void writeLogFile(List<LogModel> list);
}

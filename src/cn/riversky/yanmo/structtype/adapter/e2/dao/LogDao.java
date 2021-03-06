package cn.riversky.yanmo.structtype.adapter.e2.dao;

import cn.riversky.yanmo.structtype.adapter.e2.entity.LogEntity;

import java.util.List;

/**
 * Created by admin on 2017/12/4.
 */
public interface LogDao {
    /**
     * 读取日志文件，从文件里面获取存储的日志列表对象
     * @return 存储的日志列表对象
     */
    public List<LogEntity> readLogFile();
    /**
     * 写日志文件，把日志列表写出到日志文件中去
     * @param list 要写到日志文件的日志列表
     */
    public void writeLogFile(List<LogEntity> list);
}

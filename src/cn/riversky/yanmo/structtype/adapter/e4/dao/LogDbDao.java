package cn.riversky.yanmo.structtype.adapter.e4.dao;

import cn.riversky.yanmo.structtype.adapter.e4.model.LogModel;

import java.util.List;

/**
 * Created by admin on 2017/12/4.
 */
public interface LogDbDao {
    /**
     * 新增日志
     * @param lm 需要新增的日志对象
     */
    public void createLog(LogModel lm);
    /**
     * 修改日志
     * @param lm 需要修改的日志对象
     */

    public void updateLog(LogModel lm);
    /**
     * 删除日志
     * @param lm 需要删除的日志对象
     */
    public void removeLog(LogModel lm);
    /**
     * 获取所有的日志
     * @return 所有的日志对象
     */
    public List<LogModel> getAllLog();

    void removeall();
}

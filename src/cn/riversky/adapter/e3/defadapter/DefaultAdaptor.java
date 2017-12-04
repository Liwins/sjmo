package cn.riversky.adapter.e3.defadapter;

import cn.riversky.adapter.e3.LogDao.LogDbDao;
import cn.riversky.adapter.e3.model.LogModel;

import java.util.List;

/**
 * Created by admin on 2017/12/4.
 */
public class DefaultAdaptor implements LogDbDao {
    @Override
    public void createLog(LogModel lm) {
        System.out.println("DefaultAdaptor createLog");
    }

    @Override
    public void updateLog(LogModel lm) {
        System.out.println("DefaultAdaptor updateLog");
    }

    @Override
    public void removeLog(LogModel lm) {
        System.out.println("DefaultAdaptor removeLog");
    }

    @Override
    public List<LogModel> getAllLog() {
        System.out.println("DefaultAdaptor getAllLog");
        return null;
    }
}

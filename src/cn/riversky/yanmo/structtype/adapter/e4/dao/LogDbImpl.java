package cn.riversky.yanmo.structtype.adapter.e4.dao;


import cn.riversky.yanmo.structtype.adapter.e4.model.LogModel;

import java.util.List;



/**
 * Created by admin on 2017/12/4.
 */
public class LogDbImpl implements LogDbDao{

    @Override
    public void createLog(LogModel lm) {
        System.out.println(" db  createLog");
    }

    @Override
    public void updateLog(LogModel lm) {
        System.out.println(" db  updateLog");
    }

    @Override
    public void removeLog(LogModel lm) {
        System.out.println(" db  removeLog");
    }

    @Override
    public List<LogModel> getAllLog() {
        System.out.println(" db  getAllLog");
        return null;
    }


    @Override
    public void removeall() {
        List<LogModel> list=getAllLog();
        if(list!=null){

            list.clear();
        }
    }
}

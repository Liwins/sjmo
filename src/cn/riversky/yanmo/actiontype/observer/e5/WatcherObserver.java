package cn.riversky.yanmo.actiontype.observer.e5;

import java.util.Observable;
import java.util.Observer;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class WatcherObserver implements Observer {
    private String job;

    public WatcherObserver(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void update(Observable o, Object arg) {
        int polluteLevel= (int) arg;
        //开始根据污染级别判断是否需要通知，由这里总控
        if(polluteLevel >= 0){
            //通知监测员做记录
            if("监测人员".equals(getJob())){
                //这里采用的是拉的方式
                System.out.println(job+"获取到通知，当前污染级别为："+polluteLevel);
            }
        }
        if(polluteLevel >= 1){
            //通知预警人员
            if("预警人员".equals(getJob())){
                System.out.println(job+"获取到通知，当前污染级别为："+polluteLevel);
            }
        }
        if(polluteLevel >= 2){
            //通知监测部门领导
            if("监测部门领导".equals(getJob())){
                System.out.println(job+"获取到通知，当前污染级别为："+polluteLevel);
            }
        }
    }
}

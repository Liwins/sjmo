package cn.riversky.actiontype.observer.e4;

import java.util.Observable;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class NewsPaper extends Observable {
    private String context;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
        this.setChanged();
        //推模型
        this.notifyObservers(context);
        //拉模型
//        this.notifyObservers();
    }
}

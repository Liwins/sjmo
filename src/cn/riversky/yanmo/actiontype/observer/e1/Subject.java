package cn.riversky.yanmo.actiontype.observer.e1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class Subject  {
    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> observers=new ArrayList<>();

    /**
     * 注册观察者对象
     * @param observer
     */
    public  void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除观察者对象
     * @param observer
     */
    public void deTach(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    protected  void notifyObservers(){
        for(Observer observer:observers){
            observer.update(this);
        }
    }
}

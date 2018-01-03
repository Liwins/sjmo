package cn.riversky.yanmo.actiontype.observer.e3;

import java.util.ArrayList;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class Subject {
    private ArrayList<Observer> readers=new ArrayList<>();
    public void attach(Observer observer){
        readers.add(observer);
    }
    public void detach(Observer observer){
        readers.remove(observer);
    }

    /**
     * 这里通过具体主体的setter中进行调用，并且传入context
     * 推模型---》这里是直接发送内容
     * @param context
     */
    public void notifyAllReader(String context){
        for(Observer reader:readers){
            reader.update(context);
        }
    }
}

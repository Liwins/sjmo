package cn.riversky.yanmo.actiontype.observer.e1;

/**
 * 具体的目标对象，负责把有关状态存入到响应的观察者对象，
 * 并在自己状态发生改变时，通知各个观察者
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class ConcreteSubject extends Subject {
    /**
     * 目标对象的状态
     */
    private String subjectState;
    public String getSubjectState(){
        return subjectState;
    }

    /**
     * 通过setter方法中对主题改变进行广播
     * @param subjectState
     */
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        //在set方法中实现状态改变的通知
        this.notifyObservers();
    }
}

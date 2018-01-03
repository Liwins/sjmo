package cn.riversky.yanmo.actiontype.observer.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class ObserverImpl implements Observer {
    /**
     * 观察者的状态
     */
    private String obseverState;
    @Override
    public void update(Subject subject) {
        //具体的观察者的更新状态，保持与目标状态保持一致
        obseverState=((ConcreteSubject) subject).getSubjectState();
        System.out.println("当前观察者的收到更新，更新状态为："+obseverState);
    }

}

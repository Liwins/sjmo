package cn.riversky.yanmo.actiontype.observer.e1;

/**
 * Observer observer接口，定义观察者的update接口
 * ObserverImpl ，具体的观察者，观察者通过update方法的参数subject,进行订阅后的处理
 * Subject,主题父类，包含观察者集合容器，以及对观察者集合的增删，并通过notifyAll中对所有观察者遍历调用update
 * ConcreteSubject,具体的主体，包含一种业务需要维护的状态，当状态改变时（setter）调用notifyAll进行通知。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();
        Observer observer1=new ObserverImpl();
        Observer observer2=new ObserverImpl();
        subject.attach(observer1);
        subject.attach(observer2);
        ((ConcreteSubject) subject).setSubjectState("状态1");
        ((ConcreteSubject) subject).setSubjectState("状态2");
    }
}

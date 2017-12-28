package cn.riversky.actiontype.observer.e2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 订报纸业务中的观察者模式--拉模型（特征，观察者的控制能力比较强，可以有选择的处理）
 * Subject 维护观察者对象，包含注册和退订（集合），(notifyObservers(0))拉模型的实现
 * Subject extends  ->newPaper报纸内容：通过setter对状态进行改变通知观察者
 * Observer 观察者接口：定义update接口，接口中包含主体
 * ObserverImpl ->reader 观察者实现类，在update中对报纸的内容进行处理（改变的时候）
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class Client {
    public static void main(String[] args) {
        Observer reader=new Reader("zhangsan");
        Observer reader2=new Reader("wangming");
        Subject subject=new NewsPaper();
        subject.attach(reader);
        subject.attach(reader2);
        ((NewsPaper)subject).setContext(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"俄罗斯总统访华");
    }
}

package cn.riversky.actiontype.observer.e5;

/**
 *
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class Client {
    public static void main(String[] args) {
        //创建主体
        WaterQuality subject=new WaterQuality();
        //创建观察者
        WatcherObserver watcher1=new WatcherObserver("监测人员");
        WatcherObserver watcher2=new WatcherObserver("预警人员");
        WatcherObserver watcher3=new WatcherObserver("监测部门领导");
        //注册观察者
        subject.addObserver(watcher1);
        subject.addObserver(watcher2);
        subject.addObserver(watcher3);

        //填写水质报告
        System.out.println("当水质为正常的时候------------------〉");
        subject.setPolluteLevel(0);
        System.out.println("当水质为轻度污染的时候---------------〉");
        subject.setPolluteLevel(1);
        System.out.println("当水质为中度污染的时候---------------〉");
        subject.setPolluteLevel(2);
    }

}

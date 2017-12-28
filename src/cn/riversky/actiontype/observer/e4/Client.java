package cn.riversky.actiontype.observer.e4;

/**
 * 观察者模式的java工具的实现
 * newspaper，继承observable 同时具有推模型拉模型两种
 * reader实现observer，同时具有推模型和拉模型
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class Client {
    public static void main(String[] args) {
        NewsPaper subject=new NewsPaper();
        Reader reader1=new Reader("zhangsan");
        Reader reader2=new Reader("zhangsan1");
        Reader reader3=new Reader("zhangsan2");
        subject.addObserver(reader1);
        subject.addObserver(reader2);
        subject.addObserver(reader3);
        subject.setContext("俄罗斯总统访华");
    }
}

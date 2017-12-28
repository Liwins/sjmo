package cn.riversky.actiontype.observer.e3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 读报纸的推模型实现，推模型跟拉模型的区别（主题通过update调用时一个传入的是主题父类this，一个是传的子类的被订阅的内容）
 * 推模型使用比较方便，因为处理的都是数据部分(也可以是经过处理后的json达到拉模型的效果)
 * 拉模型使用可以增强控制，因为传过来的是整个对象（subject）
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class Client {
    public static void main(String[] args) {
        Observer reader=new Reader("zhangs");
        Observer reader2=new Reader("zhangs2");
        NewsPaper subject=new NewsPaper();
        subject.attach(reader);
        subject.attach(reader2);
        subject.setContext(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"俄罗斯总统访华");
    }
}

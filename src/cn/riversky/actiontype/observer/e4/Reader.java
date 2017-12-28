package cn.riversky.actiontype.observer.e4;

import java.util.Observable;
import java.util.Observer;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class Reader implements Observer {
    private  String user;

    public Reader(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public void update(Observable o, Object arg) {
        //这里同时具有推模型和拉模型的两种调用方式
        //推模型
        System.out.println("用户："+user+"，内容："+arg);
        //拉模型
//        System.out.println("用户："+user+"，内容"+((NewsPaper)o).getContext());
    }
}

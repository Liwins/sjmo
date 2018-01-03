package cn.riversky.yanmo.actiontype.mediator.e2;

/**
 * 这里模拟主板（中介者），其他组件（同事）进行模拟
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/2.
 */
public class Client {
    public static void main(String[] args) {
        //创建中介者
        MainBoard mediator=new MainBoard();
        //创建同事类
        CDDriver cd=new CDDriver(mediator);
        CPU cpu=new CPU(mediator);
        VideoCard vc=new VideoCard(mediator);
        SoundCard sc=new SoundCard(mediator);
        //让中介者知道所有的同时
        mediator.setCdDriver(cd);
        mediator.setVideoCard(vc);
        mediator.setSoundCard(sc);
        mediator.setCpu(cpu);
        //开始看电影
        cd.readCD("");
    }
}

package cn.riversky.gitbook.action.observer.e1;

/**
 * Sunny软件公司欲开发一款实时在线股票软件，该软件需提供如下功能：当股票购买者所购买的某支股票价格变化浮动达到5%时，
 * 系统将自动发送通知（包含新价格）给购买该股票的所有股民。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/10.
 */
public class Client {
    public static void main(String[] args) {
        GuMin guMin=new GuMinImpl("张三");
        GuMin guMin2=new GuMinImpl("小强");
        GuMin guMin3=new GuMinImpl("尹光花");
        GuPiao guPiao=new GuPiaoImpl("中原工学院涨停板",10);
        guPiao.attach(guMin);
        guPiao.attach(guMin2);
        guPiao.attach(guMin3);
        guPiao.setPrice(12);
        guPiao.setPrice(14);
        guPiao.setPrice(14);
        guPiao.setPrice(30);
        guPiao.setPrice(60);
        guPiao.setPrice(61);
    }
}

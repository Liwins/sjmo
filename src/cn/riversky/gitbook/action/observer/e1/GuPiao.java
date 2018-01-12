package cn.riversky.gitbook.action.observer.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/10.
 */
public interface GuPiao {
    void update();
     void setPrice(int price);

    public void attach(GuMin guMin);
    public void deTach(GuMin guMin);
}

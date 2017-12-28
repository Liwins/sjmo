package cn.riversky.actiontype.observer.e5;

import java.util.Observable;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class WaterQuality extends Observable {
    private int polluteLevel=0;

    public int getPolluteLevel() {
        return polluteLevel;
    }

    /**
     * 其实根据拦截发送的订阅者在这里比较方便，因为不会过多的发送信息
     * @param polluteLevel
     */
    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        this.setChanged();
        //用推模型
        this.notifyObservers(polluteLevel);
    }


}

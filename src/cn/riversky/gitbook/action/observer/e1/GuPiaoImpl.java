package cn.riversky.gitbook.action.observer.e1;

import java.util.ArrayList;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/10.
 */
public class GuPiaoImpl implements GuPiao {
    public String name;
    public int price;
    public ArrayList<GuMin> guMins;


    public GuPiaoImpl(String name,int price) {
        this.name = name;
        this.price=price;
        guMins=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
@Override
    public void setPrice(int price) {
        if((Math.abs(price-this.price)/this.price)>=0.1){
            this.price = price;
            update();
        }else {
            this.price=price;
        }
    }
    @Override
    public void attach(GuMin guMin){
        guMins.add(guMin);
    }
    @Override
    public void deTach(GuMin guMin){
        guMins.remove(guMin);
    }

    /**
     * 拉模型
     */
    @Override
    public void update() {
        for (GuMin guMin:guMins){
            guMin.jihui(this);
        }
    }
}

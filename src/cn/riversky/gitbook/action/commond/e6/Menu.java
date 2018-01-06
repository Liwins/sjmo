package cn.riversky.gitbook.action.commond.e6;

import java.util.ArrayList;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/6.
 */
public  class Menu {
    protected ArrayList<MeanItem> meanItems;

    public Menu() {
        this.meanItems = new ArrayList<>();
    }
    public void addMeanItem(MeanItem item){
        meanItems.add(item);
    }
    public void removeMeanItem(MeanItem item){
        meanItems.remove(item);
    }

}

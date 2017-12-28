package cn.riversky.actiontype.observer.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class NewsPaper extends Subject {
    /**
     * 报纸内容
     */
    private String context;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
        nitifyObserver();
    }
}

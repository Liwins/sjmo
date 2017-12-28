package cn.riversky.actiontype.observer.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/28.
 */
public class Reader implements Observer {
    private String readName;
    public Reader(String readName) {
        this.readName = readName;
    }
    public String getReadName() {
        return readName;
    }
    @Override
    public void update(Subject subject) {
        System.out.println("读者："+readName+"读报纸:"+((NewsPaper)subject).getContext());
    }
}

package cn.riversky.yanmo.actiontype.observer.e3;

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

    /**
     * 推模型的方式类似广播，传过来的只有数据
     * @param context
     */
    @Override
    public void update(String context) {
        System.out.println("读者："+readName+"读报纸:"+context);
    }
}

package cn.riversky.gitbook.action.observer.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/10.
 */
public class GuMinImpl implements GuMin {
    private String name;

    public GuMinImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void jihui(GuPiao guPiao) {
        GuPiaoImpl guPiao1= (GuPiaoImpl) guPiao;
        System.out.println("股民朋友"+getName()+"当前价格浮动过大，请注意股票："+guPiao1.getName()+",当前价格更新为:"+guPiao1.getPrice());
    }
}

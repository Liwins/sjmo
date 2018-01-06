package cn.riversky.gitbook.Structtype.flyweight.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/5.
 */
public abstract class IgoChessman {
    /**
     * 外部状态通过设置进去进行访问
     * @param coo
     */
    public void display(Coordinates coo){
        System.out.println("棋子颜色："+getColor()+"位置：x"+coo.getX()+",y:"+coo.getY());
    }

    abstract public String getColor();
}

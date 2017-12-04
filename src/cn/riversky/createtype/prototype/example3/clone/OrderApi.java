package cn.riversky.createtype.prototype.example3.clone;

/**
 * Created by admin on 2017/11/30.
 */
public interface OrderApi {
    public static final int MAXNUM=1000;
    /**
     * 获取订单产品数量
     * @return 订单中产品数量
     */
    public int getOrderProductNum();
    /**
     * 设置订单产品数量
     * @param num 订单产品数量
     */
    public void setOrderProductNum(int num);
    /**
     * 克隆方法
     * @return 订单原型的实例
     */
    public OrderApi clone();
}

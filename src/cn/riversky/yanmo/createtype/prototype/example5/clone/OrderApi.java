package cn.riversky.yanmo.createtype.prototype.example5.clone;

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
}

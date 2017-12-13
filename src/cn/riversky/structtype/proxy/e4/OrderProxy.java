package cn.riversky.structtype.proxy.e4;

/**
 * 通过代理对其中的方法进行操作人的限制
 *  @author Created by admin on 2017/12/12.
 */
public class OrderProxy implements OrderApi {
    private Order order;

    public OrderProxy(Order order) {
        this.order = order;
    }

    @Override
    public String getProductName() {
        return order.getProductName();
    }

    @Override
    public void setProductName(String productName, String user) {
        if(user.equals(getOrderUser())){
            order.setProductName(productName,user);
        }else {
            System.out.println(user+"无权操作"+getOrderUser()+"的数据");
        }
    }

    @Override
    public int getOrderNum() {
        return order.getOrderNum();
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        if(user.equals(getOrderUser())){
            order.setOrderNum(orderNum,user);
        }else {
            System.out.println(user+"无权操作"+getOrderUser()+"的数据");
        }
    }

    @Override
    public String getOrderUser() {
        return order.getOrderUser();
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if(user.equals(getOrderUser())){
            order.setOrderUser(orderUser,user);
        }else {
            System.out.println(user+"无权操作"+getOrderUser()+"的数据");
        }
    }
}

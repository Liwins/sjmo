package cn.riversky.proxy.e6;

/**
 * Created by admin on 2017/12/12.
 */
public class OrderProxy extends Order {
    public OrderProxy(String productName, int orderNum, String orderUser) {
        super(productName, orderNum, orderUser);
    }

    @Override
    public void setProductName(String productName, String user) {
        if(user.equals(getOrderUser())){

            super.setProductName(productName, user);
        }else{
            System.out.println(user+"无权操作"+getOrderUser()+"的数据");
        }
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        if(user.equals(getOrderUser())){
            super.setOrderNum(orderNum, user);
        }else{
            System.out.println(user+"无权操作"+getOrderUser()+"的数据");
        }

    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if(user.equals(getOrderUser())){
            super.setOrderUser(orderUser, user);
        }else{
            System.out.println(user+"无权操作"+getOrderUser()+"的数据");
        }

    }
}

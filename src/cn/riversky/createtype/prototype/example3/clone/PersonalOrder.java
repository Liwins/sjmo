package cn.riversky.createtype.prototype.example3.clone;


/**
 * Created by admin on 2017/11/30.
 */
public class PersonalOrder implements OrderApi {
    /**
     * 订购人员姓名
     */
    private String customerName;
    /**
     * 产品编号
     */
    private String productId;
    /**
     * 订单产品数量
     */
    private int orderProductNum = 0;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum=num;
    }

    @Override
    public OrderApi clone() {
        setOrderProductNum(getOrderProductNum()-MAXNUM);
        PersonalOrder neworder=new PersonalOrder();
        neworder.setOrderProductNum(MAXNUM);
        neworder.setCustomerName(getCustomerName());
        neworder.setProductId(getProductId());
        return neworder;
    }

    public String toString(){
        return "本个人订单的订购人是="+this.customerName+"，订购产品是="+this.productId+"，订购数量为="+this.orderProductNum;
    }
}

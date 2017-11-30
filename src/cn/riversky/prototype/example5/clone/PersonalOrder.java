package cn.riversky.prototype.example5.clone;



/**
 * Created by admin on 2017/11/30.
 */
public class PersonalOrder implements  OrderApi,Cloneable{
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

    public PersonalOrder() {
    }

    public PersonalOrder(String customerName, String productId, int orderProductNum) {
        this.customerName = customerName;
        this.productId = productId;
        this.orderProductNum = orderProductNum;
    }

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
    public Object clone() {
        //克隆方法的真正实现，直接调用父类的克隆方法就可以了
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public String toString(){
        return "本个人订单的订购人是="+this.customerName+"，订购产品是="+this.productId+"，订购数量为="+this.orderProductNum;
    }
}

package cn.riversky.createtype.prototype.example4.clone;


/**
 * Created by admin on 2017/11/30.
 */
public class EnterpriseOrder implements OrderApi {
    private String enterpriseName;
    private String productId;
    private int orderProductNum=0;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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
        EnterpriseOrder newOrder=new EnterpriseOrder();
        newOrder.setOrderProductNum(MAXNUM);
        this.setOrderProductNum(this.getOrderProductNum()-MAXNUM);
        newOrder.setEnterpriseName(getEnterpriseName());
        newOrder.setProductId(getProductId());

        return newOrder;
    }

    @Override
    public String toString() {
        return "本企业订单的订购企业是="+this.enterpriseName+"，订购产品是="+this.productId+"，订购数量为="+this.orderProductNum;
    }
}

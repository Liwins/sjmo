package cn.riversky.actiontype.chanofresponsibility.e5.model;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class VisitFeeRequestModel extends RequestModel {
    public final static String FEE_TYPE="visitFee";
    /**
     * 通过构造方法把具体的业务类型传递进来
     */
    public VisitFeeRequestModel() {
        super(FEE_TYPE);
    }

    /**
     * 申请人
     */
    private String user;
    /**
     * 申请金额
     */
    private double fee;



    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}

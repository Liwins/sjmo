package cn.riversky.actiontype.visitor.e2;

/**
 * 客户抽象父类：联系人，联系电话，企业注册地址
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public abstract class Customer {
    /**
     * 客户编号
     */
    private String customerId;

    /**
     * 客户名称
     */
    private String name;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 客户提出服务请求的方法
     */
    public abstract void serviceRequest();

    /**
     * 客户的偏好分析
     */
    public abstract void predilectionAnalyze();

    /**
     * 客户价值分析
     */
    public abstract void worthAnalyze();
}

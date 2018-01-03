package cn.riversky.yanmo.actiontype.visitor.e1;

/**
 * 企业子类：联系人，电话，企业注册地址
 * functions：企业的业务请求
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class EnterpriseCustomer extends Customer {
    private String linkPerson;
    private String linkPersonMobile;
    private String enterpriseAddress;

    public String getLinkPerson() {
        return linkPerson;
    }

    public void setLinkPerson(String linkPerson) {
        this.linkPerson = linkPerson;
    }

    public String getLinkPersonMobile() {
        return linkPersonMobile;
    }

    public void setLinkPersonMobile(String linkPersonMobile) {
        this.linkPersonMobile = linkPersonMobile;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    @Override
    public void serviceRequest() {
        System.out.println("企业用户");
    }
}

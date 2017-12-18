package cn.riversky.actiontype.visitor.e4.visitor;


import cn.riversky.actiontype.visitor.e4.element.EnterpriseCustomer;
import cn.riversky.actiontype.visitor.e4.element.PersonalCustomer;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public interface Visitor {
    /**
     * 定义个人客户的访问
     * @param customer
     */
    void visitPersonCustomer(PersonalCustomer customer);

    /**
     * 定义企业用户的访问
     * @param customer
     */
    void visitEnterpriseCustomer(EnterpriseCustomer customer);
}

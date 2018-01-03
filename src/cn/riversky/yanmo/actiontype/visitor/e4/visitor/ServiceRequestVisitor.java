package cn.riversky.yanmo.actiontype.visitor.e4.visitor;

import cn.riversky.yanmo.actiontype.visitor.e4.element.EnterpriseCustomer;
import cn.riversky.yanmo.actiontype.visitor.e4.element.PersonalCustomer;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class ServiceRequestVisitor implements Visitor {
    @Override
    public void visitPersonCustomer(PersonalCustomer customer) {
        System.out.println(customer.getName()+"提出服务请求");
    }

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer customer) {
        System.out.println(customer.getName()+"提出企业级服务请求");
    }
}

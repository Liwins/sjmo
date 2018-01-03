package cn.riversky.yanmo.actiontype.visitor.e4.visitor;

import cn.riversky.yanmo.actiontype.visitor.e4.element.EnterpriseCustomer;
import cn.riversky.yanmo.actiontype.visitor.e4.element.PersonalCustomer;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class WorthAnalyzeVisitor implements Visitor{
    @Override
    public void visitPersonCustomer(PersonalCustomer customer) {
        System.out.println(customer.getName()+"价值评估");
    }

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer customer) {
        System.out.println(customer.getName()+"企业级别的价值评估");
    }
}

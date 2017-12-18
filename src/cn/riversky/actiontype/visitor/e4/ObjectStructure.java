package cn.riversky.actiontype.visitor.e4;

import cn.riversky.actiontype.visitor.e4.element.Customer;
import cn.riversky.actiontype.visitor.e4.visitor.Visitor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class ObjectStructure {
    private Collection<Customer> cols=new ArrayList<>();
    public void handle(Visitor visitor){
        for(Customer customer:cols){
            customer.accept(visitor);
        }
    }
    public void addCustomer(Customer customer){
        cols.add(customer);
    }
}

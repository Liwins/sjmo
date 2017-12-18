package cn.riversky.actiontype.visitor.e2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 不使用设计模式：对企业用户，和个人用户进行基本的类设计
 * Customer:基本抽象类，提供基本的属性，和对外的抽象方法
 * CustomerImpl：个人和企业用户的实现类。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class Client {
    private static Collection<Customer> customers=new ArrayList<>();
    static {
        Customer c1=new EnterpriseCustomer();
        c1.setName("ABC集团");
        Customer c2=new EnterpriseCustomer();
        c2.setName("CDE公司");
        Customer c3=new PersonalCustomer();
        c3.setName("张三");
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
    }
    public static void main(String[] args) {
        for (Customer customer:customers){
            customer.predilectionAnalyze();
            customer.worthAnalyze();
        }
    }
}

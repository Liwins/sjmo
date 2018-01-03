package cn.riversky.yanmo.actiontype.visitor.e4.element;

import cn.riversky.yanmo.actiontype.visitor.e4.visitor.Visitor;

/**
 * 个人客户：电话，年龄
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class PersonalCustomer extends Customer {
    private String mobile;
    private int age;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitPersonCustomer(this);
    }
}

package cn.riversky.yanmo.actiontype.visitor.e2;

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
    public void serviceRequest() {
        System.out.println("个人客"+getName()+"户请求");
    }

    @Override
    public void predilectionAnalyze() {
        System.out.println("个人用户"+getName()+"偏好分析");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("个人用户"+getName()+"价值分析");
    }
}

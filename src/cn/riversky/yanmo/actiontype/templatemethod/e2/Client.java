package cn.riversky.yanmo.actiontype.templatemethod.e2;

/**
 * 与e1区别是验证总加了加密模块
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public class Client {
    public static void main(String[] args) {
        LoginModel loginModel=new LoginModel();
        loginModel.setUserId("test");
        loginModel.setPwd("test");
        System.out.println(new NormalLogin().login(loginModel));
    }
}

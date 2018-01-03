package cn.riversky.yanmo.actiontype.templatemethod.e1;

/**
 * 包含用户模型，登录模型
 * 包含一般的登录
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

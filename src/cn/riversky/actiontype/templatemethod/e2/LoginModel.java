package cn.riversky.actiontype.templatemethod.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public class LoginModel {
    /**
     * 登录：用户id
     */
    private String userId;
    /**
     * 登录：密码
     */
    private String pwd;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}

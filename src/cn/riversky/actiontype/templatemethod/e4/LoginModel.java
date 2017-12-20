package cn.riversky.actiontype.templatemethod.e4;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public class LoginModel {
    /**
     * 用户Id和密码
     */
    private String UserId,pwd;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}

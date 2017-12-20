package cn.riversky.actiontype.templatemethod.e4;

/**
 * 普通用户的
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public class OneLogin extends LoginTemplate {
    @Override
    protected LoginModel findLoginUser(String userId) {
        LoginModel lm=new LoginModel();
        lm.setUserId(userId);
        lm.setPwd("test");
        return lm;
    }
}

package cn.riversky.actiontype.templatemethod.e4;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * worker的
 * 使用加密功能
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public class TwoLogin extends LoginTemplate {
    @Override
    protected LoginModel findLoginUser(String userId) {
        LoginModel lm=new LoginModel();
        lm.setUserId(userId);
        lm.setPwd(encryptPwd("test"));
        return lm;
    }

    @Override
    protected String encryptPwd(String pwd) {
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            md.update(pwd.getBytes());
            return new BigInteger(1,md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

    }
}

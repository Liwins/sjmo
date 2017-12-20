package cn.riversky.actiontype.templatemethod.e4;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public abstract class LoginTemplate {
    /**
     * 模版方法
     * 1获取数据
     * 2加密
     * 3匹配验证
     * @param lm
     * @return
     */
    public final boolean login(LoginModel lm){
//        1
        LoginModel dbLm=findLoginUser(lm.getUserId());
        if (dbLm!=null){
//            2
            String encryptPwd=encryptPwd(lm.getPwd());
            lm.setPwd(encryptPwd);
//            3
            return this.match(lm,dbLm);
        }
        return false;
    }

    protected abstract LoginModel findLoginUser(String userId);

    protected boolean match(LoginModel lm, LoginModel dbLm) {
        if(lm.getUserId().equals(dbLm.getUserId())
                && lm.getPwd().equals(dbLm.getPwd())){
            return true;
        }
        return false;
    }

    protected String encryptPwd(String pwd) {
        return pwd;
    }
}

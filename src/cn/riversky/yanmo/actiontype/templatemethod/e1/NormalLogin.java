package cn.riversky.yanmo.actiontype.templatemethod.e1;

import java.util.UUID;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public class NormalLogin {
    public boolean login(LoginModel lm){
        UserModel um=this.findUserByUserId(lm.getUserId());
        if(um!=null){
            if(um.getUserId().equals(lm.getUserId())&&lm.getPwd().equals(um.getPwd())){
                return true;
            }
        }
        return false;
    }

    private UserModel findUserByUserId(String userId) {
        UserModel um=new UserModel();
        um.setUserId(userId);
        um.setName("test");
        um.setPwd("test");
        um.setUuid(String.valueOf(UUID.randomUUID()));
        return um;
    }
}

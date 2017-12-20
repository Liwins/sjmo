package cn.riversky.actiontype.templatemethod.e4;

/**
 * 使用match加强逻辑的
 * 充分利用了里氏替换原则
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public class ThreeLogin extends LoginTemplate {
    @Override
    protected LoginModel findLoginUser(String userId) {
        EnhenceLoginModel elm=new EnhenceLoginModel();
        elm.setUserId(userId);
        elm.setPwd("test");
        elm.setQuestion("testquestion");
        elm.setAnswer("testanswer");
        return elm;
    }

    @Override
    protected boolean match(LoginModel lm, LoginModel dbLm) {
        boolean f1=super.match(lm,dbLm);
        if(f1){
            EnhenceLoginModel elm= (EnhenceLoginModel) lm;
            EnhenceLoginModel el2= (EnhenceLoginModel) dbLm;
            if(el2.getQuestion().equals(elm.getQuestion())&&elm.getAnswer().equals(el2.getAnswer())){
                return true;
            }
        }
        return false;
    }
}

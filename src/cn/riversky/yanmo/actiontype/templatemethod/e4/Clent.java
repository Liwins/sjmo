package cn.riversky.yanmo.actiontype.templatemethod.e4;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public class Clent {
    public static void main(String[] args) {
        LoginModel lm=new LoginModel();
        lm.setUserId("test");
        lm.setPwd("test");

        LoginTemplate lt1=new OneLogin();
        LoginTemplate lt2=new TwoLogin();
        //进行登录测试
        boolean flag=lt1.login(lm);
        boolean flag2=lt2.login(lm);

//        增强登录
        EnhenceLoginModel elm=new EnhenceLoginModel();
        elm.setUserId("test");
        elm.setPwd("test");
        elm.setQuestion("testquestion");
        elm.setAnswer("testanswer");
        LoginTemplate lt3=new ThreeLogin();
        boolean flag3=lt3.login(elm);

        System.out.println("1:"+flag);
        System.out.println("2:"+flag2);
        System.out.println("3:"+flag3);
    }
}

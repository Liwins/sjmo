package cn.riversky.singleton.e1;

/**
 * Created by admin on 2017/12/1.
 */
public class Client {
    public static void main(String[] args) {
        AppConfig appConfig=new AppConfig();
        System.out.println(appConfig.getParameterA());
        System.out.println(appConfig.getParameterB());
    }
}

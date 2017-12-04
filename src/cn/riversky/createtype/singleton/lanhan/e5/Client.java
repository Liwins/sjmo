package cn.riversky.createtype.singleton.lanhan.e5;

/**
 * Created by admin on 2017/12/1.
 */
public class Client {
    public static void main(String[] args) {
        Appconfig singleton= Appconfig.getInstance();
        System.out.println(singleton.getUser());
        System.out.println(singleton.getPassword());
    }
}

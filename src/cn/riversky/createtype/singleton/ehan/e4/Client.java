package cn.riversky.createtype.singleton.ehan.e4;

/**
 * Created by admin on 2017/12/1.
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton= Singleton.getUniqueInstance();
        System.out.println(singleton.getParamA());
        System.out.println(singleton.getParamB());
    }
}

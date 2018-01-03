package cn.riversky.yanmo.createtype.singleton.ehan.e7;

/**
 * Created by admin on 2017/12/1.
 */
public class Singleton {
    private  static Singleton singleton=new Singleton();

    private Singleton() {
    }
    public static Singleton getInstance(){
        return singleton;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(Singleton.getInstance());
        }
    }
}

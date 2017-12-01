package cn.riversky.singleton.ehan.e3;

/**
 * 饿汉式单例模式，在静态
 * Created by admin on 2017/12/1.
 */
public class Singleton {
    private static Singleton unqueInstance=new Singleton();

    private Singleton() {
    }
    public static Singleton getInstance(){
        return unqueInstance;
    }
    /**
     * 示意方法，单例可以有自己的操作
     */
    public void singletonOperation(){
        //功能处理
    }
    /**
     * 示意属性，单例可以有自己的属性
     */
    private String singletonData;
    /**
     * 示意方法，让外部通过这些方法来访问属性的值
     * @return 属性的值
     */
    public String getSingletonData(){
        return singletonData;
    }
}

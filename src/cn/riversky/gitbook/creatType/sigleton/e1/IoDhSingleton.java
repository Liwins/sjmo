package cn.riversky.gitbook.creatType.sigleton.e1;

/**
 * 使用静态内部类（中静态实例化属性的方式）
 * 这种方式仅支持Java语言，因为线程安全是由JVM提供保证的。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class IoDhSingleton {
    private IoDhSingleton() {
    }
    private static class HolderClass{
        private final static IoDhSingleton instance=new IoDhSingleton();
    }
    public static IoDhSingleton getInstance(){
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        IoDhSingleton s1,s2;
        s1=getInstance();
        s2=getInstance();
        System.out.println(s1==s2);
    }
}

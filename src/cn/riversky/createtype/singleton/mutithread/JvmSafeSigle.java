package cn.riversky.createtype.singleton.mutithread;

/**
 * Created by admin on 2017/12/1.
 */
public class JvmSafeSigle {

    /**
     * 私有化构造方法
     */
    private JvmSafeSigle(){
    }
    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例没有绑定关系，
     * 而且只有被调用到才会装载，从而实现了延迟加载
     */
    private static class SingleHolder{
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static JvmSafeSigle instance=new JvmSafeSigle();
    }
    public static JvmSafeSigle getInstance(){
        return SingleHolder.instance;
    }
}

package cn.riversky.createtype.singleton.mutithread;

/**
 * 使用枚举来实现单例模式的示例
 * Created by admin on 2017/12/1.
 */
public enum  EnumSingle {
    /**
     * 定义一个枚举的元素,它就代表了Singleton的一个实例
     */
    uniqueInstance;
    public void singletonOperation(){
        System.out.println("aa=="+EnumSingle.uniqueInstance.hashCode());
    }
}

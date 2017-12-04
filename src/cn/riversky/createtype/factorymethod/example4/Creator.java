package cn.riversky.createtype.factorymethod.example4;

/**
 * Created by admin on 2017/11/29.
 */
public abstract class Creator {
    /**
     * 工厂方法
     * @return
     */
    protected abstract Product factoryMethod();
    public void someOperator(){
        //进行操作
    }
}

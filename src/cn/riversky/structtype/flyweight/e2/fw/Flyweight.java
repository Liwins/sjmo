package cn.riversky.structtype.flyweight.e2.fw;

/**
 * 享元模式接口，通过这个接口享元可以接受并作用于外部状态
 * Created by admin on 2017/12/11.
 */
public interface Flyweight {
    /**
     * 实例操作，传入外部状态
     * @param extrinsicState
     */
    public void operation(String extrinsicState);
}

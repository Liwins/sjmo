package cn.riversky.yanmo.structtype.flyweight.e2.fw;

/**
 * 享元对象
 * Created by admin on 2017/12/11.
 */
public class ConcreteFlyweight implements Flyweight {
    /**
     * 描述内部状态
     */
    private String intrinsicState;

    /**
     * 构造方法，传入享元对象的内部状态的数据
     * @param intrinsicState 享元对象的内部状态数据
     */
    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        //具体的功能处理，可能会用到享元内部、外部的状态
    }
}

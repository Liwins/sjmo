package cn.riversky.abstractfactory.example4.factory;

/**
 * Created by admin on 2017/11/27.
 */
public interface AbstractFactory {
    /**
     * 一个通用的创建产品对象的方法，为了简单，直接返回Object
     * 也可以为所有被创建的产品定义一个公共的接口
     * 1cpu
     * 2主板
     * 3只有方案3具有的参数，内存
     * @param type 具体创建的产品类型标识
     * @return 创建出的产品对象
     */
    public Object createProduct(int type);
}

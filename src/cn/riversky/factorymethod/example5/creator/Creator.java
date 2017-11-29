package cn.riversky.factorymethod.example5.creator;

import cn.riversky.factorymethod.example5.product.ConreteProduct;
import cn.riversky.factorymethod.example5.product.Product;
import cn.riversky.factorymethod.example5.product.Product1;
import cn.riversky.factorymethod.example5.product.Product2;

/**
 * 该工厂方法，主要是通过组合部件对产品进行创建
 * Created by admin on 2017/11/29.
 */
public abstract class Creator {
    /**
     * 创建一个部件，一般不对外提供
     * @return
     */
    protected abstract Product1 factoryMethod1();
    protected abstract Product2 factoryMethod2();

    /**
     * 创建客户端需要的对象，客户端主要使用产品对象完成需要的功能
     * @return
     */
    public Product createProduct(){
        Product product=new ConreteProduct();
        product.setProduct1(factoryMethod1());
        product.setProduct2(factoryMethod2());
        return product;
    }
}

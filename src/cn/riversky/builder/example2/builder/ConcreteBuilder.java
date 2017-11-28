package cn.riversky.builder.example2.builder;

import cn.riversky.builder.example2.product.Product;

/**
 * 具体的构建器实现对象
 * Created by admin on 2017/11/28.
 */
public class ConcreteBuilder implements Builder {

    /**
     * 最终build的产品
     */
    private Product resultProduct;
    public Product getResult(){
        return resultProduct;
    }
    /**
     * 构建某个部件的功能处理
     */
    @Override
    public void buildPart() {

    }
}

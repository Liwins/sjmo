package cn.riversky.createtype.builder.example2.director;

import cn.riversky.createtype.builder.example2.builder.Builder;

/**
 * 指导者，指导使用构建器的接口来构建产品的对象
 * Created by admin on 2017/11/28.
 */
public class Director {
    /**
     * 持有当前需要使用的构建器对象
     */
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 示意方法，指导构建器构建最终的产品对象
     */
    public void construct(){
        //
        builder.buildPart();
    }
}
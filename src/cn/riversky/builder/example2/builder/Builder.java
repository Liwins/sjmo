package cn.riversky.builder.example2.builder;

/**
 * 构建器接口，定义一个产品所需要的各个部件的操作
 * Created by admin on 2017/11/28.
 */
public interface Builder {
    /**
     * 构建某个部件
     */
    public void buildPart();
}

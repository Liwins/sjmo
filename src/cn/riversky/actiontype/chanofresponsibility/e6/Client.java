package cn.riversky.actiontype.chanofresponsibility.e6;

import cn.riversky.actiontype.chanofresponsibility.e6.model.SaleModel;

/**
 * 这里使用类似门面模式，将链在内部进行组件，对外提供统一的方式
 *感觉strust和spring mvc的拦截器应该是采用类似的方式进行
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class Client {
    public static void main(String[] args) {
    //创建业务对象
        GoodsSaleEbo ebo = new GoodsSaleEbo();
        //准备测试数据
        SaleModel saleModel = new SaleModel();
        saleModel.setGoods("张学友怀旧经典");
        saleModel.setSaleNum(10);

        //调用业务功能
        ebo.sale("小李", "张三", saleModel);
        ebo.sale("小张", "李四", saleModel);
    }
}

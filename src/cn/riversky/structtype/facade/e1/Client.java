package cn.riversky.structtype.facade.e1;

import cn.riversky.structtype.facade.e1.gener.Bussiness;
import cn.riversky.structtype.facade.e1.gener.Dao;
import cn.riversky.structtype.facade.e1.gener.Service;

/**
 * 门面模式/外观模式 的范例（非设计模式实现）
 * 需求：生成逻辑层代码
 * 设计思想
 * 通过ConfigManage对生成代码类提供单例的ConfigModel.
 * 代码生成类根据配置信息选择性生成
 * 客户端直接使用代码生成类
 * Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {
        new Bussiness().generate();
        new Dao().generate();
        new Service().generate();
    }
}

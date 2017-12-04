package cn.riversky.createtype.factorymethod.example7.operator;

import cn.riversky.createtype.factorymethod.example7.creator.MyFactory;
import cn.riversky.createtype.factorymethod.example7.product.ExportFileApi;

/**
 * Created by admin on 2017/11/29.
 */
public class ExportOperate {
    /**
     * 导出文件
     * @param type 用户选择的导出类型
     * @param data 需要保存的数据
     * @return 是否成功导出文件
     */
    public boolean export(int type,String data){
        //使用工厂方法
        ExportFileApi api = MyFactory.factoryMethod(type);
        return api.export(data);
    }
    /**
     * 工厂方法，创建导出的文件对象的接口对象
     * @param type 用户选择的导出类型
     * @return 导出的文件对象的接口对象
     */
}

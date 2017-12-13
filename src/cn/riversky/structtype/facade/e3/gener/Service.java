package cn.riversky.structtype.facade.e3.gener;

import cn.riversky.structtype.facade.e3.ConfigManage;
import cn.riversky.structtype.facade.e3.ConfigModel;

/**
 * Created by admin on 2017/12/8.
 */
public class Service {
    public  void generate(){
        ConfigModel configModel= ConfigManage.getInstance().getConfigData();
        if(configModel.isGenerService()){
            System.out.println("生成服务层代码");
        }
    }
}

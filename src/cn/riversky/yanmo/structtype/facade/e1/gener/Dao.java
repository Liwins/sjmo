package cn.riversky.yanmo.structtype.facade.e1.gener;

import cn.riversky.yanmo.structtype.facade.e1.ConfigManage;
import cn.riversky.yanmo.structtype.facade.e1.ConfigModel;

/**
 * Created by admin on 2017/12/8.
 */
public class Dao {
    public void generate(){
        ConfigModel configModel= ConfigManage.getInstance().getConfigData();
        if(configModel.isGenerDao()){
            System.out.println("生成Dao代码");
        }
    }
}

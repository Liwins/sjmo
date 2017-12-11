package cn.riversky.facade.e5.gener;

import cn.riversky.facade.e5.ConfigManage;
import cn.riversky.facade.e5.ConfigModel;

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

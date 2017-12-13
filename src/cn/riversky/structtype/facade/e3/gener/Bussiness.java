package cn.riversky.structtype.facade.e3.gener;

import cn.riversky.structtype.facade.e3.ConfigManage;
import cn.riversky.structtype.facade.e3.ConfigModel;

/**
 * Created by admin on 2017/12/8.
 */
public class Bussiness {
    public void generate(){
        ConfigModel configModel= ConfigManage.getInstance().getConfigData();
        if(configModel.isGenerBessiness()){
            System.out.println("生成业务层代码");
        }
    }

}

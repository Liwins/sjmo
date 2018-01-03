package cn.riversky.yanmo.structtype.facade.e5;

/**
 * Created by admin on 2017/12/8.
 */
public class ConfigManage {
    private static ConfigManage configManage=null;
    private static ConfigModel configModel=null;

    private ConfigManage() {
    }
    public static ConfigManage getInstance(){
        if(configManage==null){
            configManage=new ConfigManage();
            configModel=new ConfigModel();
        }
        return configManage;
    }
    public ConfigModel getConfigData(){
        return configModel;
    }
}

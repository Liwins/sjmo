package cn.riversky.facade.e5;

/**
 * Created by admin on 2017/12/8.
 */
public class ConfigModel {
    private boolean isGenerDao=true;
    private boolean isGenerService=true;
    private boolean isGenerBessiness=true;

    public boolean isGenerDao() {
        return isGenerDao;
    }

    public void setGenerDao(boolean generDao) {
        isGenerDao = generDao;
    }

    public boolean isGenerService() {
        return isGenerService;
    }

    public void setGenerService(boolean generService) {
        isGenerService = generService;
    }

    public boolean isGenerBessiness() {
        return isGenerBessiness;
    }

    public void setGenerBessiness(boolean generBessiness) {
        isGenerBessiness = generBessiness;
    }
}

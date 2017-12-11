package cn.riversky.flyweight.e3;

import cn.riversky.flyweight.e3.dao.UserResourceDao;
import cn.riversky.flyweight.e3.entity.UserResource;
import cn.riversky.flyweight.e3.service.Flyweight;
import cn.riversky.flyweight.e3.service.FlyweightFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 该模块实现授权（login）和验证（haspermit）
 * Created by admin on 2017/12/11.
 */
public class SecurityMgr {
    private static SecurityMgr secur=new SecurityMgr();

    private SecurityMgr() {
    }
    public static SecurityMgr getInstance(){
        return secur;
    }
    Map<String,Collection<Flyweight>> session=new HashMap<String,Collection<Flyweight>>();
    public void login(String user){
        //授权阶段，放入session
        Collection<Flyweight> col=queryByUser(user);
        session.put(user,col);
    }

    /**
     * 验证
     * @param user
     * @return
     */
    public boolean isPermission(UserResource user){
        Collection<Flyweight>  fms=session.get(user.getName());
        if(fms!=null){
            for(Flyweight f:fms){
                if(f.match(user)){
                    return true;
                }
            }
        }

        return false;
    }
    /**
     * 从数据库中获取某人所拥有的权限，授权阶段
     * @param user
     * @return
     */
    private Collection<Flyweight> queryByUser(String user) {
        Collection<Flyweight> col=new ArrayList<>();
        for(UserResource f: UserResourceDao.userResources){
            if(f.getName().equals(user)){
                //采用工厂进行实例化
               Flyweight fm= FlyweightFactory.getInstance().getMap(f);
                col.add(fm);
            }
        }
        return col;
    }
}

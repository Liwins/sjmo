package cn.riversky.flyweight.e5;

import cn.riversky.flyweight.e5.dao.UserResourceDao;
import cn.riversky.flyweight.e5.model.Resource;
import cn.riversky.flyweight.e5.model.UserResource;
import cn.riversky.flyweight.e5.service.Flyweight;
import cn.riversky.flyweight.e5.service.FlyweightFactory;
import cn.riversky.flyweight.e5.service.UnsharedFlyweight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/12/11.
 */
public class SecurityMgr {
    private static SecurityMgr securityMgr=new SecurityMgr();

    public SecurityMgr() {
    }
    public static SecurityMgr getInstance(){
        return securityMgr;
    }
    //session
    private Map<String,Collection<Flyweight>> session=new HashMap<String,Collection<Flyweight>>();

    //登录授权
    public void login(String userResourc){
        Collection<Flyweight> col=queryByUser(userResourc);
        session.put(userResourc,col);
    }

    public boolean hasPermit(UserResource userResource){
        Collection<Flyweight> col=session.get(userResource.getName());
        if(col==null||col.size()==0){
            System.out.println("没有权限");
        return false;
        }
        for(Flyweight f:col){
            if(f.match(userResource)){
            return true;
            }
        }
        return false;
    }

    /**
     * 登录授权实现
     * @param userName
     * @return
     */
    private Collection<Flyweight> queryByUser(String userName) {
        Collection<Flyweight> permission=new ArrayList<Flyweight>();
        for(UserResource user: UserResourceDao.userResources){
            if(user.getName().equals(userName)){
                Flyweight f=null;
                if(user.getRole()!=null){
                    f=new UnsharedFlyweight();
                    Resource[] resources= UserResourceDao.role.get(user.getRole());
                    if(resources.length>0){
                        for(Resource resource:resources){
//                            这里建议将userresource与Resource建立称为组合实现的继承方式（has 的关系）
                            Flyweight tmp= FlyweightFactory.getInstance().getFlyweight(new UserResource(userName,resource.getMode(),resource.getPermission()));
                            f.add(tmp);
                        }
                    }
                }else {

                    f= FlyweightFactory.getInstance().getFlyweight(user);
                }
                permission.add(f);
            }
        }
        return permission;
    }


}

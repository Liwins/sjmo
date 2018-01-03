package cn.riversky.yanmo.structtype.flyweight.e1.service;

import cn.riversky.yanmo.structtype.flyweight.e1.dao.UserResourceDao;
import cn.riversky.yanmo.structtype.flyweight.e1.entity.Authorization;
import cn.riversky.yanmo.structtype.flyweight.e1.entity.UserResource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 安全管理类，实现成单例
 * Created by admin on 2017/12/11.
 */
public class SecurityMgr {
    private static SecurityMgr securityMgr=new SecurityMgr();

    private SecurityMgr() {
    }
    public static SecurityMgr getInstance(){
        return securityMgr;
    }

    /**
     * 模拟session
     */
    private Map<String,Collection<Authorization>> map=new HashMap<String,Collection<Authorization>>();

    /**
     * 登录
     * @param user
     */
    public void login(String user){
        Collection<Authorization> col=queryByUser(user);
        map.put(user,col);
    }

    /**
     * 认证阶段
     * @param userResource
     * @return
     */
    public boolean hasPermit(UserResource userResource){
        Collection<Authorization> col=map.get(userResource.getName());
        if(col==null||col.size()==0){
            System.out.println(userResource.getName()+"没有登录：未经过授权阶段");
            return false;
        }
        for(Authorization am:col){
            System.out.println("authrization:"+am);
            if(am.getSecurityEntity().equals(userResource.getModel())&&am.getPermit().equals(userResource.getPower())){
                return true;
            }
        }
        return false;

    }
    /**
     * 数据库查询
     * @param user
     * @return
     */
    private Collection<Authorization> queryByUser(String user) {
        Collection<Authorization> col=new ArrayList<Authorization>();
        for(UserResource ur: UserResourceDao.userResources){
            if(user.equals(ur.getName())){
                Authorization am=new Authorization();
                am.setUser(ur.getName());
                am.setPermit(ur.getPower());
                am.setSecurityEntity(ur.getModel());
                col.add(am);
            }
        }
        return col;
    }
}

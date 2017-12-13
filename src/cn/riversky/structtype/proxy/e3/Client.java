package cn.riversky.structtype.proxy.e3;

import cn.riversky.structtype.proxy.e3.model.UserApi;
import cn.riversky.structtype.proxy.e3.service.UserService;

import java.util.Collection;

/**
 * 这里实现的是懒加载，通过代理模式（虚代理的实现）
 *  @author Created by riversky on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {
        UserService userService=new UserService();
        Collection<UserApi> col=userService.getUserByDepId("010101");

        for (UserApi user:col){
            System.out.println(user.getUserId()+":"+user.getName());
        }
        System.out.println(col);
        //这部分是延迟加载的部分，如果不妨问盖子段
        for (UserApi user:col){
            System.out.println(user.getName()+":"+user.getDepId()+"----"+user.getSex());
        }
        System.out.println(col);

    }
}

package cn.riversky.structtype.proxy.e1;

import cn.riversky.structtype.proxy.e1.service.UserService;

/**
 *  @author Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {
        UserService userService=new UserService();
        System.out.println(userService.getUserByDepId("01"));
    }
}

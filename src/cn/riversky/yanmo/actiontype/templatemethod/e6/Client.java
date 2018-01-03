package cn.riversky.yanmo.actiontype.templatemethod.e6;

import cn.riversky.yanmo.actiontype.templatemethod.e6.template.UserJdbc;
import cn.riversky.yanmo.actiontype.templatemethod.e6.vo.UserModel;
import cn.riversky.yanmo.actiontype.templatemethod.e6.vo.UserQueryModel;

import java.util.Collection;
import java.util.UUID;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public class Client {
    public static void main(String[] args) {
        UserJdbc uj=new UserJdbc();
        UserModel um1=new UserModel();
        um1.setUuid(String.valueOf(UUID.randomUUID()).substring(1,4));
        um1.setName("riversky");
        um1.setAge(27);
        //测试添加数据
//        uj.create(um1);
        UserModel um3 = new UserModel();
        um3.setUuid("00229");
        um3.setName("张三9被修改");
        um3.setAge(32);
//        uj.update(um3);
//        uj.delete(um3);
        //测试查询
        UserQueryModel uqm = new UserQueryModel();
        uqm.setName("张");
        uqm.setAge(25);
        uqm.setAge2(36);
        Collection<UserModel> col = uj.getByCondition(uqm);
        for(UserModel tempUm : col){
            System.out.println(tempUm);
        }
    }
}

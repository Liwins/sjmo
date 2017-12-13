package cn.riversky.structtype.proxy.e3.service;

import cn.riversky.structtype.proxy.e3.model.User;
import cn.riversky.structtype.proxy.e3.model.UserApi;
import cn.riversky.structtype.proxy.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author  Created by admin on 2017/12/12.
 */
public class UserService {
    public Collection<UserApi> getUserByDepId(String depId){
        Collection<UserApi> users=new ArrayList<>();
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            conn= JdbcUtils.getConncect();
            String sql="select * from tbl_user u,tbl_dep d where u.depId=d.depId and d.depId like ?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,depId+"%");
            rs=pstmt.executeQuery();
            while (rs.next()){
                //这里延迟加载，只加载这两个字段用来节省内存
               Proxy proxy=new Proxy(new User());
                proxy.setUserId(rs.getString("userId"));
                proxy.setName(rs.getString("name"));
                users.add(proxy);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return users;
    }
}

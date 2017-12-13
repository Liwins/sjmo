package cn.riversky.structtype.proxy.e1.service;

import cn.riversky.structtype.proxy.e1.model.User;
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
    public Collection<User> getUserByDepId(String depId){
        Collection<User> col=new ArrayList<User>();
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
                //String userId, String name, String depId, String sex
                User user=new User(rs.getString("userId"),rs.getString("name"),rs.getString("depId"),rs.getString("sex"));
                col.add(user);
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
        return col;
    }
}

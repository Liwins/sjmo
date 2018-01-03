package cn.riversky.yanmo.structtype.bridge.e8;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 体现jdbc中的桥模式
 * Created by admin on 2017/12/5.
 */
public class Client {
    public static void main(String[] args)  {
        String sql="select * from user";
        Connection conn=null;
        PreparedStatement psts=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///cms","root","riversky");
             psts=conn.prepareStatement(sql);
             rs=psts.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(2));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(psts!=null){
                try {
                    psts.close();
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

    }
}

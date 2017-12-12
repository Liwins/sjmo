package cn.riversky.proxy.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by admin on 2017/12/12.
 */
public class JdbcUtils {
    public static Connection getConncect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql:///test","root","riversky");
    }

//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        System.out.println(getConncect());
//    }
}

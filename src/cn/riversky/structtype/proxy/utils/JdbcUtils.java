package cn.riversky.structtype.proxy.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *  @author Created by admin on 2017/12/12.
 */
public class JdbcUtils {
    public static Connection getConncect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Properties properties=new Properties();
        FileInputStream in=null;
        try{
           in =new FileInputStream("jdbc.properties");
            properties.load(in);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(in!=null){

                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return DriverManager.getConnection("jdbc:mysql:///test",properties.getProperty("jdbc.user"),properties.getProperty("jdbc.password"));
    }

//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        System.out.println(getConncect());
//    }
}

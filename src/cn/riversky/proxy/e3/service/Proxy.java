package cn.riversky.proxy.e3.service;

import cn.riversky.proxy.e3.model.User;
import cn.riversky.proxy.e3.model.UserApi;
import cn.riversky.proxy.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by admin on 2017/12/12.
 */
public class Proxy implements UserApi {
    /**
     * 持有被代理的具体的目标对象
     */
    private User realSubject=null;

    /**
     * 构造方法，传入被代理的具体的目标对象
     */
    public Proxy(User user) {
        this.realSubject = user;
    }
    //表示是否被装载过
    private boolean load=false;
    public String getUserId() {
        return realSubject.getUserId();
    }
    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }
    public String getName() {
        return realSubject.getName();
    }
    public void setName(String name) {
        realSubject.setName(name);
    }



    @Override
    public String getSex() {
        if(!load){
            reload();
            this.load=true;
        }
        return realSubject.getSex();
    }

    public void setSex(String sex) {
        realSubject.setSex(sex);
    }
    @Override
    public String getDepId() {
        if(!load){
            reload();
            this.load=true;
        }
        return realSubject.getDepId();
    }



    public void setDepId(String depId) {

        realSubject.setDepId(depId);
    }
    private void reload() {
        System.out.println("查询数据库，userId"+realSubject.getUserId());
        Connection conn=null;
        try {
            conn= JdbcUtils.getConncect();
            PreparedStatement pstm=conn.prepareStatement("select * from tbl_user where userId=?");
            pstm.setString(1,realSubject.getUserId());
            ResultSet rs=pstm.executeQuery();
            if(rs.next()){
                realSubject.setDepId(rs.getString("depId"));
                realSubject.setSex(rs.getString("sex"));
            }
            rs.close();
            pstm.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public String toString() {
        return  realSubject.toString();
    }
}

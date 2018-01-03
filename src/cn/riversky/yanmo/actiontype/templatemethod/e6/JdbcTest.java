package cn.riversky.yanmo.actiontype.templatemethod.e6;

import cn.riversky.yanmo.actiontype.templatemethod.e6.vo.UserModel;
import cn.riversky.yanmo.actiontype.templatemethod.e6.vo.UserQueryModel;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public class JdbcTest {
    private static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("resources/jdbc.properties"));
        String classNa = (String) prop.get("jdbc.class");
        String url = (String) prop.get("jdbc.url");
        String user = (String) prop.get("jdbc.username");
        String pwd = (String) prop.get("jdbc.pwd");
        Class.forName(classNa);
        return DriverManager.getConnection(url,user,pwd);
    }
    public void Create(UserModel um){
        Connection conn=null;
        PreparedStatement pstm=null;
        try {
            conn=getConnection();
            String sql="insert into user values(?,?,?)";
            pstm=conn.prepareStatement(sql);
            pstm.setString(1,um.getUuid());
            pstm.setString(2,um.getName());
            pstm.setInt(3,um.getAge());
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(pstm!=null){
                try {
                    pstm.close();
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

    public Collection getByCondition(UserQueryModel uqm){
        Collection col=new ArrayList();
        Connection conn=null;
        PreparedStatement psmt=null;
        ResultSet rs=null;
        try {
            conn=getConnection();
            String sql="select * from user where 1=1";
            sql=prepareSql(sql,uqm);
            psmt=conn.prepareStatement(sql);
            setValue(psmt,uqm);
            rs=psmt.executeQuery();
            while (rs.next()){
                col.add(rs2Object(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(psmt!=null){
                try {
                    psmt.close();
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
    /**
     * 为通用查询动态的拼接sql的条件部分，基本思路是：
     * 如果用户填写了相应的条件，那么才在sql中添加对应的条件
     * @param sql sql的主干部分
     * @param uqm 封装查询条件的数据模型
     * @return 拼接好的sql语句
     */
    private String prepareSql(String sql,UserQueryModel uqm){
        StringBuilder sb=new StringBuilder();
        sb.append(sql);
        //绝对匹配
        if(uqm.getUuid()!=null && uqm.getUuid().trim().length()>0){
            sb.append(" and uuid=? ");
        }
        //模糊匹配
        if(uqm.getName()!=null && uqm.getName().trim().length()>0){
            sb.append(" and name like ? ");
        }
        //区间匹配
        if(uqm.getAge() > 0){
            sb.append(" and age >=? ");
        }
        if(uqm.getAge2() > 0){
            sb.append(" and age <=? ");
        }
        return sb.toString();
    }
    private void setValue(PreparedStatement psmt,UserQueryModel uqm) throws SQLException {
        int count=1;
        if(uqm.getUuid()!=null&&uqm.getUuid().trim().length()>0){
            psmt.setString(count,uqm.getUuid());
            count++;
        }
        if(uqm.getName()!=null&&uqm.getName().trim().length()>0){
            psmt.setString(count,"%"+uqm.getName()+"%");
            count++;
        }
        if (uqm.getAge()>0){
            psmt.setInt(count,uqm.getAge());
            count++;
        }
        if (uqm.getAge2()>0){
            psmt.setInt(count,uqm.getAge2());
            count++;
        }
    }
    private UserModel rs2Object(ResultSet rs) throws SQLException {
        UserModel um=new UserModel();
        String uuid=rs.getString("uuid");
        String name=rs.getString("name");
        int age=rs.getInt("age");
        um.setAge(age);
        um.setName(name);
        um.setUuid(uuid);
        return um;
    }

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        JdbcTest uj = new JdbcTest();
        //先新增几条
        UserModel um1 = new UserModel();
        um1.setUuid("u1");
        um1.setName("张翹楚");
        um1.setAge(22);
//        uj.Create(um1);
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

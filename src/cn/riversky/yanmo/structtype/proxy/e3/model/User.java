package cn.riversky.yanmo.structtype.proxy.e3.model;

/**
 *  @author Created by admin on 2017/12/12.
 */
public class User {
    /**
     * 用户编号
     */
    private String userId;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 部门编号
     */
    private String depId;
    /**
     * 性别
     */
    private String sex;

    public User() {
    }

    public User(String userId, String name, String depId, String sex) {
        this.userId = userId;
        this.name = name;
        this.depId = depId;
        this.sex = sex;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", depId='" + depId + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

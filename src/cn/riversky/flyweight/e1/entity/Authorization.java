package cn.riversky.flyweight.e1.entity;

/**
 * 授权模块
 * Created by admin on 2017/12/11.
 */
public class Authorization {
    /**
     * 人员
     */
    private String user;
    /**
     * 安全实体
     */
    private String securityEntity;
    /**
     * 权限
     */
    private String permit;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public void setSecurityEntity(String securityEntity) {
        this.securityEntity = securityEntity;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    @Override
    public String toString() {
        return "Authorization{" +
                "user='" + user + '\'' +
                ", securityEntity='" + securityEntity + '\'' +
                ", permit='" + permit + '\'' +
                '}';
    }
}

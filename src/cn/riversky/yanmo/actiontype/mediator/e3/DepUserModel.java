package cn.riversky.yanmo.actiontype.mediator.e3;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/2.
 */
public class DepUserModel {
    /**
     * 用于部门和人员关系的编号，用做主键
     */
    private String depUserId;
    /**
     * 部门的编号
     */
    private String depId;
    /**
     * 人员的编号
     */
    private String userId;

    public DepUserModel() {
    }

    public DepUserModel(String depUserId, String depId, String userId) {
        this.depUserId = depUserId;
        this.depId = depId;
        this.userId = userId;
    }

    public String getDepUserId() {
        return depUserId;
    }

    public void setDepUserId(String depUserId) {
        this.depUserId = depUserId;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

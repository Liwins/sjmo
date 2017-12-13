package cn.riversky.structtype.proxy.e3.model;

/**
 * @author  Created by admin on 2017/12/12.
 */
public interface UserApi {
    /**
     * 获取用户名称
     * @return
     */
    public String getUserId();

    /**
     * 设置用户名称
     * @param userId
     */
    public void setUserId(String userId);

    /**
     * 获取用户名
     * @return
     */
    public String getName();

    /**
     * 设置用户名
     * @param name
     */
    public void setName(String name);

    /**
     * 获取部门ID
     * @return
     */
    public String getDepId();

    /**
     * 设置部门ID
     * @param depId
     */
    public void setDepId(String depId);

    /**
     * 获取性别
     * @return
     */
    public String getSex();

    /**
     * 设置性别
     * @param sex
     */
    public void setSex(String sex);
}

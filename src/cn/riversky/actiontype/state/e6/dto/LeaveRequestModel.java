package cn.riversky.actiontype.state.e6.dto;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class LeaveRequestModel {
    /**
     * 请假人，请假开始时间，审核结果
     */
    private String user,beginDate,result;
    /**
     * 请假天数
     */
    private int leaveDays;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
}

package cn.riversky.actiontype.chanofresponsibility.e5.model;

/**
 * 通用的请求对象
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class RequestModel {
    /**
     * 表示具体的请求业务类型
     */
    private String type;

    /**
     * 通过构造方法把具体的业务类型传递进来
     * @param type 业务类型
     */
    public RequestModel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

package cn.riversky.actiontype.command.e4;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public interface OperationApi {
    /**
     * 获取计算完成后的结果
     * @return 计算完成后的结果
     */
    public int getResult();
    /**
     * 设置计算开始的初始值
     * @param result 计算开始的初始值
     */
    public void setResult(int result);
    public void add(int num);
    public void substract(int num);
}

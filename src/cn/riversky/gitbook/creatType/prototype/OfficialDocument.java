package cn.riversky.gitbook.creatType.prototype;

/**
 * 提供克隆抽象接口
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public interface OfficialDocument extends Cloneable{
    /**
     * 克隆方法
     * @return
     */
    public OfficialDocument clone();

    /**
     * 展示数据
     */
    public void display();
}

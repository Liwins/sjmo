package cn.riversky.gitbook.prototype;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class FAR implements OfficialDocument{
    @Override
    public OfficialDocument clone() {
        OfficialDocument far=null;
        try{
            far= (OfficialDocument) super.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("不支持克隆");
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("可行性分析报告");
    }
}

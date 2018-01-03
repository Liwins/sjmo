package cn.riversky.gitbook.prototype;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class SRS implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument officialDocument=null;
        try{
            officialDocument= (OfficialDocument) super.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("不支持克隆");
        }
        return officialDocument;
    }

    @Override
    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}

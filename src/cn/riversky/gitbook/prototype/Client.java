package cn.riversky.gitbook.prototype;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class Client {
    public static void main(String[] args) {
        PrototypeManage pm=PrototypeManage.getInstance();
        OfficialDocument doc1,doc2,doc3,doc4;
        doc1=pm.getOfficialDocumetn("far");
        doc2=pm.getOfficialDocumetn("far");
        doc1.display();
        doc2.display();
        System.out.println(doc1==doc2);
    }
}

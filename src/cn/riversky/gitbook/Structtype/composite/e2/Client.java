package cn.riversky.gitbook.Structtype.composite.e2;

/**
 * 安全组合模式
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class Client {
    public static void main(String[] args) {
        Kongjian chuanti=new Chuangti("主面板");
        Kongjian mianbian=new Pannel("中间面板1");
        Kongjian mianbian2=new Pannel("中间面板2");
        ((Pannel)mianbian).add(new ButtonLeaf("注册"));
        ((Pannel)mianbian).add(new ButtonLeaf("提交"));
        ((Pannel)mianbian).add(new TxtLeaf("username"));
        ((Pannel)mianbian).add(new TxtLeaf("passwrod"));
        ((Pannel)mianbian2).add(new ButtonLeaf("确认"));
        ((Chuangti)chuanti).add(mianbian);
        ((Chuangti)chuanti).add(mianbian2);
        chuanti.visit();
//        mianbian.visit();
    }
}

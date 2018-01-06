package cn.riversky.gitbook.creatType.prototype;

import java.util.Hashtable;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class PrototypeManage {

    private Hashtable ht=new Hashtable();
    private   PrototypeManage() {
        ht.put("far",new FAR());
        ht.put("srs",new SRS());
    }
    private static class ClassHolder{
        private static PrototypeManage prototypeManage=new PrototypeManage();
    }
    public void addOfficeDocument(String key,OfficialDocument document){
        ht.put(key,document);
    }
    public OfficialDocument getOfficialDocumetn(String key){
        return ((OfficialDocument) ht.get(key)).clone();
    }
    public static PrototypeManage getInstance(){
        return ClassHolder.prototypeManage;
    }
}

package cn.riversky.gitbook.Structtype.bridge.example;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public abstract class FileType {
    DataBase dataBase;

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    abstract String changeTo();
}

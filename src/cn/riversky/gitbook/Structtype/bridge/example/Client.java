package cn.riversky.gitbook.Structtype.bridge.example;

/**
 * 设计一个支持多个数据库中数据转换成多个数据格式的工具
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class Client {
    public static void main(String[] args) {
        FileType fileType= (FileType) XMLUtils.getBean(6);
        DataBase dataBase= (DataBase) XMLUtils.getBean(7);
//        FileType fileType= (FileType) XMLUtils.getBean(4);
//        DataBase dataBase= (DataBase) XMLUtils.getBean(5);
        fileType.setDataBase(dataBase);
        System.out.println(fileType.changeTo());
    }
}

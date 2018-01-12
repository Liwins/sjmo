package cn.riversky.gitbook.action.iterator;

import java.util.*;

/**
 * 迭代器模式：
 * 在软件开发中我们经常需要使用聚合对象来存储一系列数据。聚合对象拥有两个职责：1存储数据2遍历数据，前者是聚合对象的基本职责；
 * 而后者即是可变的又是可分离的。因此，可以将遍历数据的行为从聚合对象中分离出来，封装在一个被称为迭代器的对象中，由迭代器来提供
 * 遍历聚合对象内部数据的行为，这将简化聚合对象的设计，更符合单一职责原则的要求。
 * 定义：提供一种方法来访问聚合对象，而不暴漏这个对象的内部表示，其别名为游标cursor.迭代器模式是一种对象行为型模式
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/9.
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList();
        students.add(new Student("张三",23));
        students.add(new Student("张是",223));
        students.add(new Student("张型",232));
        students.add(new Student("张不",213));
        students.add(new Student("张秒",293));
        students.add(new Student("张哈",29));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        Iterator iterator=students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

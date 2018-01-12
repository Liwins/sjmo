package cn.riversky.gitbook.action.iterator.e1;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页迭代器
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/9.
 */
public class Client {
    public static void main(String[] args) {
        List pages=new ArrayList();
        pages.add("ha");
        pages.add("saf");
        pages.add("safasd");
        pages.add("safw");
        pages.add("sasf");
        pages.add("sqaf");
        pages.add("saef");
        pages.add("safaafv");
        AbstractObjectList list=new PageList(pages);
        AbstractIteractor iterors=list.createrator();
        System.out.println("正向");
        while (!iterors.isLast()){
            System.out.print(iterors.getNext()+",");
            iterors.next();
        }
        System.out.println();
        System.out.println("-------反向--------");
        while (!iterors.isFirst()){
            System.out.print(iterors.getPreviousItem()+",");
            iterors.previous();
        }

        System.out.println();
//        AbstractIteractor iteractor2=list.createrator1();
//        while (!iteractor2.isLast()){
//            iteractor2.getNext();
//            System.out.println();
//        }
    }
}

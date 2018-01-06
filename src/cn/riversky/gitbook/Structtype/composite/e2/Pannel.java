package cn.riversky.gitbook.Structtype.composite.e2;

import java.util.ArrayList;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class Pannel extends Kongjian {
    private String name;
    private ArrayList<Kongjian> pannels;

    public Pannel(String name) {
        this.name = name;
        pannels=new ArrayList<>();
    }

    void add(Kongjian kongjian) {
        pannels.add(kongjian);
    }

    void remove(Kongjian kongjian) {
        pannels.remove(kongjian);
    }

    Kongjian get(int i) {
        return pannels.get(i);
    }

    @Override
    void visit() {
        System.out.println("中间面板："+name);
        for (Kongjian pannel:pannels){
            pannel.visit();
        }
    }
}

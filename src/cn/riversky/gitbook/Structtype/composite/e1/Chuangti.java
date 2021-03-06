package cn.riversky.gitbook.Structtype.composite.e1;

import java.util.ArrayList;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class Chuangti extends Kongjian {
     private String name;
     private ArrayList<Kongjian> chuangtis;

    public Chuangti(String name) {
        this.name = name;
        chuangtis=new ArrayList<>();
    }

    @Override
    void add(Kongjian kongjian) {
        chuangtis.add(kongjian);
    }

    @Override
    void remove(Kongjian kongjian) {
       chuangtis.remove(kongjian);
    }

    @Override
    Kongjian get(int i) {
        return chuangtis.get(i);
    }

    @Override
    void visit() {
        System.out.println("窗体："+name);
        for (Kongjian chuangti:chuangtis){
            chuangti.visit();
        }
    }
}

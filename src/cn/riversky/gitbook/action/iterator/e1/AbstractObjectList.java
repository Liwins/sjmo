package cn.riversky.gitbook.action.iterator.e1;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象聚合类
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/9.
 */
public abstract class  AbstractObjectList {
    List<Object> objects=new ArrayList();

    public AbstractObjectList(List objects) {
        this.objects = objects;
    }
    void addObject(Object o){
        objects.add(o);
    }
    void removeObject(Object o){
        objects.remove(o);
    }

    /**
     * 工厂方法
     * @return
     */
    abstract AbstractIteractor createrator();
    abstract AbstractIteractor createrator1();
    public  List getObjects(){
        return objects;
    }

}

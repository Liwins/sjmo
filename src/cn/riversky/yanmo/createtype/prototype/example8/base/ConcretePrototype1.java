package cn.riversky.yanmo.createtype.prototype.example8.base;

/**
 * Created by admin on 2017/11/30.
 */
public class ConcretePrototype1 implements Prototype {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype1 prototype = new ConcretePrototype1();
        prototype.setName(this.name);
        return prototype;
    }
    public String toString(){
        return "Now in Prototype1，name="+name;
    }

}

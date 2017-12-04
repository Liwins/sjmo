package cn.riversky.createtype.prototype.example8.base;

/**
 * Created by admin on 2017/11/30.
 */
public interface Prototype {
    public Prototype clone();
    public String getName();
    public void setName(String name);
}

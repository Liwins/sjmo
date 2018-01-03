package cn.riversky.yanmo.structtype.composite.e7;

/**
 * Created by admin on 2017/12/6.
 */
public class Leaf extends BaseNode{
    private String name="";

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr+"-"+name);
    }
}

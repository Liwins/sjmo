package cn.riversky.composite.e1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 组合对象，可以包含其他的组合对象或者叶子对象
 * Created by admin on 2017/12/6.
 */
public class Composite {
    /**
     * 包含的其他组合对象
     */
    private Collection<Composite> childs=new ArrayList<>();
    /**
     * 用来记录包含的其他叶子对象
     */
    private Collection<Leaf>  childLeaf=new ArrayList<>();
    /**
     * 组合名称
     */
    private String name="";

    public Composite(String name) {
        this.name = name;
    }
    /**
     * 向组合对象加入被它包含的其它组合对象
     * @param c 被它包含的其它组合对象
     */
    public Composite addComposite(Composite c){
        this.childs.add(c);
        return this;
    }
    /**
     * 向组合对象加入被它包含的叶子对象
     * @param leaf 被它包含的叶子对象
     */
    public Composite addLeaf(Leaf leaf){
        this.childLeaf.add(leaf);
        return this;
    }
    /**
     * 输出组合对象自身的结构
     * @param preStr 前缀，主要是按照层级拼接的空格，实现向后缩进
     */
    public void printStruct(String preStr){
        System.out.println(preStr+"+"+this.name);

        preStr+="   ";
        for (Leaf leaf:childLeaf){
            leaf.printStruct(preStr);
        }
        for(Composite composite:childs){
            composite.printStruct(preStr);
        }
    }
}

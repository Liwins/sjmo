package cn.riversky.structtype.composite.e7;

import java.util.ArrayList;

/**
 * Created by admin on 2017/12/6.
 */
public class Node  extends BaseNode{
    private ArrayList<BaseNode> nodes=new ArrayList<BaseNode>();
    private String name="";

    public Node(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printStruct(String preStr) {
        //先把自己输出去
        System.out.println(preStr+"+"+this.name);
        //如果还包含有子组件，那么就输出这些子组件对象
        if(this.nodes!=null){
            //然后添加一个空格，表示向后缩进一个空格
            preStr+=" ";
            //输出当前对象的子对象了
            for(BaseNode c : nodes){
                //递归输出每个子对象
                c.printStruct(preStr);
            }
        }
    }

    @Override
    public void addChild(BaseNode child) {
        if(nodes==null){
            nodes=new ArrayList<>();
        }
        if(this.getCompontPath()==null||this.getCompontPath().trim().length()==0){
            this.setCompontPath(name);
        }
        String pathline=this.getCompontPath();
        String[]word= pathline.split("->");
        ArrayList<String> arrayList=new ArrayList<String>();
        for(String w:word){
            arrayList.add(w);
        }
        if(arrayList.contains(child.getName())){
            throw new java.lang.IllegalArgumentException("在本通路上，组件 '"+child.getName()+"' 已被添加过了");
        }else{
            child.setCompontPath(this.getCompontPath()+"->"+child.getName());
            nodes.add(child);
        }

    }
}

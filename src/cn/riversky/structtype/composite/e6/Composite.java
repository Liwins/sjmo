package cn.riversky.composite.e6;

import java.util.ArrayList;
import java.util.List;

/**
 * 这里在组合模式中的节点添加了父节点的引用
 * Created by admin on 2017/12/6.
 */
public class Composite extends Component {
    /**
     * 用来存储组合对象中包含的子组件对象
     */
    private List<Component> childComponts=null;
    private String name="";
    public Composite(String name) {
        this.name = name;
    }
    public  void addChild(Component c1){
        if(childComponts==null){
            childComponts=new ArrayList<Component>();
            childComponts.add(c1);
        }else {
            c1.setParent(this);
            childComponts.add(c1);
        }
    }
    /**
     * 递归操作放在这里
     * @param prefix
     */
    @Override
    public void printStruct(String prefix) {
        System.out.println(prefix+"+"+name);
        if(childComponts!=null){
            prefix+="  ";
            for (Component c:childComponts){
                c.printStruct(prefix);
            }
        }
    }
}

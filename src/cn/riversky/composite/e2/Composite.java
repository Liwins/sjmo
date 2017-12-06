package cn.riversky.composite.e2;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合对象，通常需要存储子对象，定义有子部件的部件行为，
 * 并实现在Component里面定义的与自不见有关的操作
 * Created by admin on 2017/12/6.
 */
public class Composite extends Component{
    /**
     * 用来存储组合对象中包含的子组件对象
     */
    private List<Component> childComponts=null;

    /**
     * 通常需要进行递归调用
     */
    @Override
    public void someOperation() {
        if(childComponts!=null){
            for(Component c:childComponts){
                c.someOperation();
            }
        }
    }

    @Override
    public void addChild(Component child) {
        //延迟初始化
        if(childComponts==null){
            childComponts=new ArrayList<Component>();
        }
        childComponts.add(child);

    }

    @Override
    public void removeChild(Component child) {
        if(childComponts!=null){
            childComponts.remove(child);
        }
    }

    @Override
    public Component getChildren(int index) {
        if(childComponts!=null){
            if(index>=0&& index<childComponts.size()){
                return  childComponts.get(index);
            }
        }
        return  null;
    }
}
